package com.onfido.android.sdk.capture.ui.camera.view;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.onfido.android.sdk.capture.internal.util.Dimension;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider;
import com.onfido.android.sdk.capture.ui.camera.FrameCallback;
import com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class CameraSource implements MediaRecorder.OnInfoListener {
    private static final float ASPECT_RATIO_TOLERANCE = 0.01f;
    private static final long AUTO_FOCUS_TRY_TIMEOUT_IN_SECONDS = 5;
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    private static final int DUMMY_TEXTURE_NAME = 100;
    private static final int MAX_JPEG_QUALITY = 100;
    private static final int SIZE_NOT_SET = -1;
    private static final String TAG = "OpenCameraSource";
    private Disposable compressingDisposable;
    private boolean hasAudio;
    private boolean hasVideo;
    private boolean isPortrait;
    private Camera mCamera;
    private final Object mCameraLock;
    private CameraResolutionProvider mCameraResolutionProvider;
    private Context mContext;
    private SurfaceTexture mDummySurfaceTexture;
    private SurfaceView mDummySurfaceView;
    private int mFacing;
    private String mFlashMode;
    private String mFocusMode;
    private FrameCallback mFrameCallback;
    private boolean mIsCameraPreviewStarted;
    private boolean mIsRecording;
    private MediaCaptureCallback mMediaCaptureCallback;
    private MediaRecorder mMediaRecorder;
    private String mOutputVideoFilePath;
    private Dimension mPreviewDimension;
    private String mPreviousFocusMode;
    private float mRequestedFps;
    private int mRequestedPictureHeight;
    private int mRequestedPictureWidth;
    public int mRequestedPreviewHeight;
    public int mRequestedPreviewWidth;
    private int mRotation;
    Camera.Parameters mTemporaryParameters;
    private Dimension mVideoDimension;
    private int videoMaxDurationMs;
    private int videoQuality;
    private int videoRecordingBitRate;
    private Surface videoSurface;

    public interface AutoFocusCallback {
        void onAutoFocus(boolean z);
    }

    public interface AutoFocusMoveCallback {
        void onAutoFocusMoving(boolean z);
    }

    public static class Builder {
        private final CameraSource mCameraSource;

        public Builder(Context context) {
            CameraSource cameraSource = new CameraSource(0);
            this.mCameraSource = cameraSource;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            cameraSource.mContext = context;
        }

        public CameraSource build() {
            return this.mCameraSource;
        }

        public Builder setCameraResolutionProvider(CameraResolutionProvider cameraResolutionProvider) {
            this.mCameraSource.mCameraResolutionProvider = cameraResolutionProvider;
            return this;
        }

        public Builder setFacing(int i) {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException(a0.d.n("Invalid camera: ", i));
            }
            this.mCameraSource.mFacing = i;
            return this;
        }

        public Builder setFlashMode(String str) {
            this.mCameraSource.mFlashMode = str;
            return this;
        }

        public Builder setFocusMode(String str) {
            this.mCameraSource.mFocusMode = str;
            return this;
        }

        public Builder setIsPortrait(boolean z) {
            this.mCameraSource.isPortrait = z;
            return this;
        }

        public Builder setRequestedFps(float f) {
            if (f > BitmapDescriptorFactory.HUE_RED) {
                this.mCameraSource.mRequestedFps = f;
                return this;
            }
            throw new IllegalArgumentException("Invalid fps: " + f);
        }

        public Builder setupRecording(int i, int i2, int i3, int i5, Surface surface, boolean z) {
            CameraSource cameraSource = this.mCameraSource;
            cameraSource.videoQuality = i;
            cameraSource.videoRecordingBitRate = i2;
            cameraSource.mRequestedFps = i5;
            cameraSource.videoMaxDurationMs = i3;
            cameraSource.videoSurface = surface;
            cameraSource.hasVideo = true;
            cameraSource.hasAudio = z;
            return this;
        }
    }

    public class CameraAutoFocusCallback implements Camera.AutoFocusCallback {
        private AutoFocusCallback mDelegate;

        private CameraAutoFocusCallback() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            AutoFocusCallback autoFocusCallback = this.mDelegate;
            if (autoFocusCallback != null) {
                autoFocusCallback.onAutoFocus(z);
            }
        }

        public /* synthetic */ CameraAutoFocusCallback(CameraSource cameraSource, int i) {
            this();
        }
    }

    public class CameraAutoFocusMoveCallback implements Camera.AutoFocusMoveCallback {
        private AutoFocusMoveCallback mDelegate;

        private CameraAutoFocusMoveCallback() {
        }

        @Override // android.hardware.Camera.AutoFocusMoveCallback
        public void onAutoFocusMoving(boolean z, Camera camera) {
            AutoFocusMoveCallback autoFocusMoveCallback = this.mDelegate;
            if (autoFocusMoveCallback != null) {
                autoFocusMoveCallback.onAutoFocusMoving(z);
            }
        }

        public /* synthetic */ CameraAutoFocusMoveCallback(CameraSource cameraSource, int i) {
            this();
        }
    }

    public static class CameraNotAvailable extends Exception {
        public CameraNotAvailable(String str) {
            super(str);
        }
    }

    public static class CameraNotFound extends Exception {
        public CameraNotFound(String str) {
            super(str);
        }
    }

    public class CameraPreviewCallback implements Camera.PreviewCallback {
        private CameraPreviewCallback() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (CameraSource.this.mFrameCallback == null || bArr == null) {
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                int i = parameters.getPreviewSize().width;
                int i2 = parameters.getPreviewSize().height;
                CameraSource cameraSource = CameraSource.this;
                cameraSource.mFrameCallback.onNextFrame(bArr, i, i2, cameraSource.mRotation);
            } catch (RuntimeException e) {
                Timber.e(e, "Error occured on CameraPreviewCallback", new Object[0]);
                MediaCaptureCallback mediaCaptureCallback = CameraSource.this.mMediaCaptureCallback;
                if (mediaCaptureCallback != null) {
                    mediaCaptureCallback.onErrorTakingPicture(new TakePictureException("Error occured on CameraPreviewCallback", e));
                }
            }
        }

        public /* synthetic */ CameraPreviewCallback(CameraSource cameraSource, int i) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusMode {
    }

    public interface IteratorSizeList<T> {
        int getLength();

        T getObject(int i);

        Camera.Size getSize(int i);
    }

    public interface PictureCallback {
        void onPictureTaken(byte[] bArr, int i, int i2);
    }

    public class PictureDoneCallback implements Camera.PictureCallback {
        private PictureCallback mDelegate;

        private PictureDoneCallback() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.mDelegate;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr, camera.getParameters().getPictureSize().width, camera.getParameters().getPictureSize().height);
            }
        }

        public /* synthetic */ PictureDoneCallback(CameraSource cameraSource, int i) {
            this();
        }
    }

    public class PictureStartCallback implements Camera.ShutterCallback {
        private ShutterCallback mDelegate;

        private PictureStartCallback() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public void onShutter() {
            ShutterCallback shutterCallback = this.mDelegate;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }

        public /* synthetic */ PictureStartCallback(CameraSource cameraSource, int i) {
            this();
        }
    }

    public interface SetParametersCallback {
        Camera.Parameters call(Camera.Parameters parameters, Camera camera);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    public static class SizePair {
        private Dimension mPicture;
        private final Dimension mPreview;

        public SizePair(Camera.Size size, Camera.Size size2) {
            this.mPreview = new Dimension(size.width, size.height);
            if (size2 != null) {
                this.mPicture = new Dimension(size2.width, size2.height);
            }
        }

        public Dimension pictureSize() {
            return this.mPicture;
        }

        public Dimension previewSize() {
            return this.mPreview;
        }
    }

    public static class TakePictureException extends Exception {
        public TakePictureException() {
            super("Error taking picture");
        }

        public TakePictureException(String str) {
            super(str);
        }

        public TakePictureException(String str, Throwable th10) {
            super(str, th10);
        }
    }

    private CameraSource() {
        this.mCameraLock = new Object();
        this.mFacing = 0;
        this.mRequestedFps = 30.0f;
        this.mRequestedPreviewWidth = 1024;
        this.mRequestedPreviewHeight = ViewUtils.EDGE_TO_EDGE_FLAGS;
        this.compressingDisposable = null;
        this.mRequestedPictureWidth = -1;
        this.mRequestedPictureHeight = -1;
        this.mFocusMode = null;
        this.mPreviousFocusMode = null;
        this.mFlashMode = null;
        this.mIsCameraPreviewStarted = false;
        this.hasVideo = false;
        this.hasAudio = false;
        this.isPortrait = false;
        this.mMediaCaptureCallback = null;
        this.mCameraResolutionProvider = null;
        this.mTemporaryParameters = null;
    }

    private void addToTemporaryParameters(Camera.Parameters parameters) {
        Camera.Parameters parameters2 = this.mTemporaryParameters;
        if (parameters2 == null) {
            this.mTemporaryParameters = parameters;
            return;
        }
        parameters2.unflatten(this.mTemporaryParameters.flatten() + parameters.flatten());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.hardware.Camera createCamera() throws com.onfido.android.sdk.capture.ui.camera.view.CameraSource.CameraNotAvailable, com.onfido.android.sdk.capture.ui.camera.view.CameraSource.CameraNotFound {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.view.CameraSource.createCamera():android.hardware.Camera");
    }

    private byte[] createPreviewBuffer(Dimension dimension) {
        byte[] bArr = new byte[((int) Math.ceil(((((long) dimension.getHeight()) * ((long) dimension.getWidth())) * ((long) ImageFormat.getBitsPerPixel(17))) / 8.0d)) + 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap.hasArray() && byteBufferWrap.array() == bArr) {
            return bArr;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }

    private static Map<Camera.Size, List<Camera.Size>> generateValidSizeList(Camera.Parameters parameters, List<Camera.Size> list) {
        int i;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        HashMap map = new HashMap();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = size.width / size.height;
            ArrayList arrayList = new ArrayList();
            map.put(size, arrayList);
            float f4 = 2.1474836E9f;
            Camera.Size size2 = null;
            for (Camera.Size size3 : list) {
                float fAbs = Math.abs(f - (size3.width / size3.height));
                if (fAbs < f4 && (i = size3.width) <= 1920 && i >= 940) {
                    size2 = size3;
                    f4 = fAbs;
                }
                if (fAbs < ASPECT_RATIO_TOLERANCE) {
                    arrayList.add(size3);
                }
            }
            if (arrayList.size() == 0 && size2 != null) {
                arrayList.add(size2);
            }
        }
        return map;
    }

    private static int getIdForRequestedCamera(int i, boolean z) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            try {
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == i) {
                    return i2;
                }
            } catch (RuntimeException unused) {
            }
        }
        if (z) {
            return getIdForRequestedCamera(i == 0 ? 1 : 0, false);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.onfido.android.sdk.capture.internal.util.Dimension getVideoDimension() throws com.onfido.android.sdk.capture.ui.camera.view.CameraSource.CameraNotAvailable {
        /*
            r8 = this;
            com.onfido.android.sdk.capture.ui.camera.view.CameraSource$CameraNotAvailable r0 = new com.onfido.android.sdk.capture.ui.camera.view.CameraSource$CameraNotAvailable
            java.lang.String r1 = "Could not open requested camera."
            r0.<init>(r1)
            android.hardware.Camera r1 = r8.getCamera()     // Catch: java.lang.RuntimeException -> L59
            android.hardware.Camera$Parameters r2 = r1.getParameters()     // Catch: java.lang.RuntimeException -> L59
            java.util.List r0 = r2.getSupportedVideoSizes()
            r1 = 0
            if (r0 == 0) goto L58
            int r3 = r8.mRequestedPreviewWidth
            int r4 = r8.mRequestedPreviewHeight
            int r5 = r8.mRequestedPictureWidth
            int r6 = r8.mRequestedPictureHeight
            java.util.List r7 = r2.getSupportedVideoSizes()
            com.onfido.android.sdk.capture.ui.camera.view.CameraSource$SizePair r0 = selectSizePair(r2, r3, r4, r5, r6, r7)
            r2 = 0
            if (r0 == 0) goto L51
            com.onfido.android.sdk.capture.internal.util.Dimension r1 = r0.pictureSize()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "initMediaRecorder selected sizePair - previewSize: "
            r3.<init>(r4)
            com.onfido.android.sdk.capture.internal.util.Dimension r4 = r0.previewSize()
            r3.append(r4)
            java.lang.String r4 = ", pictureSize: "
            r3.append(r4)
            com.onfido.android.sdk.capture.internal.util.Dimension r0 = r0.pictureSize()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.onfido.android.sdk.capture.internal.util.logging.Timber.d(r0, r2)
            return r1
        L51:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "initMediaRecorder selected sizePair = null"
            com.onfido.android.sdk.capture.internal.util.logging.Timber.d(r2, r0)
        L58:
            return r1
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.view.CameraSource.getVideoDimension():com.onfido.android.sdk.capture.internal.util.Dimension");
    }

    private void initMediaRecorder(MediaCaptureCallback mediaCaptureCallback, String str, boolean z) throws IOException {
        if (this.mMediaRecorder == null) {
            if (this.mVideoDimension == null) {
                this.mVideoDimension = getVideoDimension();
            }
            setupVideoCapture(getCamera(), this.mVideoDimension, this.hasAudio, z);
        }
        this.mMediaRecorder.setOutputFile(str);
        this.mMediaRecorder.prepare();
        this.mMediaRecorder.start();
        this.mMediaCaptureCallback = mediaCaptureCallback;
    }

    private boolean isCameraPreviewRunning() {
        boolean z;
        synchronized (this.mCameraLock) {
            try {
                z = getCamera() != null && this.mIsCameraPreviewStarted;
            } finally {
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Camera.Parameters lambda$autoFocusOnce$7(List list, Camera.Parameters parameters, Camera camera) {
        parameters.setFocusAreas(list);
        return parameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$autoFocusOnce$8(AutoFocusCallback autoFocusCallback, boolean z, boolean z3) {
        if (autoFocusCallback != null) {
            autoFocusCallback.onAutoFocus(z3);
        }
        if (z) {
            revertAutoFocusMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Camera.Parameters lambda$revertAutoFocusMode$6(Camera.Parameters parameters, Camera camera) {
        Timber.d("Reverting focus mode from:" + parameters.getFocusMode() + " to:" + this.mPreviousFocusMode, new Object[0]);
        if ("auto".equals(parameters.getFocusMode()) && !"auto".equals(this.mPreviousFocusMode)) {
            parameters.setFocusAreas(null);
            cancelAutoFocus();
            Timber.d("canceledAutoFocus and set focus areas to null", new Object[0]);
        }
        setFocusMode(parameters, this.mPreviousFocusMode);
        return parameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$takePicture$0(int i, ShutterCallback shutterCallback) {
        setJpegQuality(i);
        if (shutterCallback != null) {
            shutterCallback.onShutter();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$takePictureWithAutoFocus$4(PictureCallback pictureCallback, boolean z, byte[] bArr, int i, int i2) {
        Timber.d("onPictureTaken", new Object[0]);
        pictureCallback.onPictureTaken(bArr, i, i2);
        if (z) {
            revertAutoFocusMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$takePictureWithAutoFocus$5(ShutterCallback shutterCallback, PictureCallback pictureCallback, boolean z, boolean z3, boolean z4) {
        try {
            Timber.d("onAutoFocus:" + z4, new Object[0]);
            takePicture(shutterCallback, new f(this, pictureCallback, z4, 1), z, z3);
        } catch (TakePictureException unused) {
            Timber.d("Error taking picture after autofocus", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryTakePictureWithAutoFocus$1(AtomicBoolean atomicBoolean, ShutterCallback shutterCallback, PictureCallback pictureCallback, boolean z, boolean z3, Long l2) throws TakePictureException {
        if (atomicBoolean.compareAndSet(false, true)) {
            Timber.d("Auto focus timeout! Taking picture without auto focus", new Object[0]);
            takePicture(shutterCallback, pictureCallback, z, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryTakePictureWithAutoFocus$2(PictureCallback pictureCallback, boolean z, byte[] bArr, int i, int i2) {
        Timber.d("Picture taken.", new Object[0]);
        pictureCallback.onPictureTaken(bArr, i, i2);
        if (z) {
            revertAutoFocusMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryTakePictureWithAutoFocus$3(AtomicBoolean atomicBoolean, Disposable disposable, ShutterCallback shutterCallback, PictureCallback pictureCallback, boolean z, boolean z3, boolean z4) {
        Timber.d("Auto focus result: %s", Boolean.valueOf(z4));
        if (!atomicBoolean.compareAndSet(false, true)) {
            Timber.d("Auto focus callback received after timeout. Skipping.", new Object[0]);
            return;
        }
        try {
            disposable.dispose();
            Timber.d("Taking picture after auto focus callback received.", new Object[0]);
            takePicture(shutterCallback, new f(this, pictureCallback, z4, 0), z, z3);
        } catch (TakePictureException unused) {
            Timber.d("Error taking picture after autofocus.", new Object[0]);
        }
    }

    private void resetTemporaryParameters() {
        this.mTemporaryParameters = null;
    }

    private void revertAutoFocusMode() {
        try {
            synchronized (this.mCameraLock) {
                try {
                    if (this.mPreviousFocusMode != null) {
                        Timber.d("Reverting focus mode from:" + this.mFocusMode + " to:" + this.mPreviousFocusMode, new Object[0]);
                        setParameters(new cmc.d(this, 25));
                        cancelAutoFocus();
                        Timber.d("mFocusMode:" + this.mFocusMode + " mPreviousFocusMode:" + this.mPreviousFocusMode, new Object[0]);
                        this.mPreviousFocusMode = null;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } catch (RuntimeException e) {
            Timber.e(e, "Reverting auto focus failed", new Object[0]);
        }
    }

    private static Camera.Size selectBestSize(final List<Camera.Size> list, int i, int i2) {
        return (Camera.Size) selectBestSize(new IteratorSizeList<Camera.Size>() { // from class: com.onfido.android.sdk.capture.ui.camera.view.CameraSource.2
            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.IteratorSizeList
            public int getLength() {
                return list.size();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.IteratorSizeList
            public Camera.Size getObject(int i3) {
                return getSize(i3);
            }

            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.IteratorSizeList
            public Camera.Size getSize(int i3) {
                return (Camera.Size) list.get(i3);
            }
        }, i, i2);
    }

    private int[] selectPreviewFpsRange(Camera.Parameters parameters, float f) {
        int i = (int) (f * 1000.0f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : parameters.getSupportedPreviewFpsRange()) {
            int iAbs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (iAbs < i2) {
                iArr = iArr2;
                i2 = iAbs;
            }
        }
        return iArr;
    }

    private static SizePair selectSizePair(Camera.Parameters parameters, int i, int i2, final int i3, final int i5, List<Camera.Size> list) {
        final Map<Camera.Size, List<Camera.Size>> mapGenerateValidSizeList = generateValidSizeList(parameters, list);
        final Camera.Size[] sizeArr = (Camera.Size[]) mapGenerateValidSizeList.keySet().toArray(new Camera.Size[mapGenerateValidSizeList.size()]);
        for (Map.Entry<Camera.Size, List<Camera.Size>> entry : mapGenerateValidSizeList.entrySet()) {
            Camera.Size key = entry.getKey();
            List<Camera.Size> value = entry.getValue();
            Timber.d("previewSize: width=" + key.width + ", height=" + key.height, new Object[0]);
            for (Camera.Size size : value) {
                Timber.d("--- pictureSize: width=" + size.width + ", height=" + size.height, new Object[0]);
            }
        }
        return (SizePair) selectBestSize(new IteratorSizeList<SizePair>() { // from class: com.onfido.android.sdk.capture.ui.camera.view.CameraSource.1
            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.IteratorSizeList
            public int getLength() {
                return mapGenerateValidSizeList.size();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.IteratorSizeList
            public SizePair getObject(int i6) {
                int i21;
                Camera.Size size2 = getSize(i6);
                List list2 = (List) mapGenerateValidSizeList.get(size2);
                int i22 = i3;
                return new SizePair(size2, (i22 == -1 || (i21 = i5) == -1) ? list2.size() > 0 ? (Camera.Size) list2.get(0) : null : CameraSource.z(i22, i21, list2));
            }

            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.IteratorSizeList
            public Camera.Size getSize(int i6) {
                return sizeArr[i6];
            }
        }, i, i2);
    }

    private static boolean setFlashMode(Camera.Parameters parameters, String str) {
        if (str != null) {
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(str)) {
                parameters.setFlashMode(str);
                return true;
            }
            Timber.i(p.a.p("Camera flash mode: ", str, " is not supported on this device."), new Object[0]);
        }
        return false;
    }

    private static boolean setFocusMode(Camera.Parameters parameters, String str) {
        Timber.d(j6.a.q("setFocusMode:", str), new Object[0]);
        if (str != null) {
            if (parameters.getSupportedFocusModes().contains(str)) {
                parameters.setFocusMode(str);
                return true;
            }
            Timber.i(p.a.p("Camera focus mode: ", str, " is not supported on this device."), new Object[0]);
        }
        return false;
    }

    private void setJpegQuality(int i) {
        Camera.Parameters parameters = getCamera().getParameters();
        parameters.setJpegQuality(i);
        getCamera().setParameters(parameters);
    }

    private boolean setParameters(Camera.Parameters parameters) {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() == null || parameters == null) {
                    return false;
                }
                if (!isCameraPreviewRunning()) {
                    addToTemporaryParameters(parameters);
                    return false;
                }
                try {
                    getCamera().setParameters(parameters);
                    this.mFlashMode = parameters.getFlashMode();
                    updateFocusMode(parameters.getFocusMode());
                    return true;
                } catch (Exception e) {
                    Timber.e(e, "Error: failed to set parameters", new Object[0]);
                    return false;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private void setRotation(Camera camera, Camera.Parameters parameters, int i) {
        int i2;
        int i3;
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        int i5 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i5 = 90;
            } else if (rotation == 2) {
                i5 = 180;
            } else if (rotation != 3) {
                Timber.e(a0.d.n("Bad rotation value: ", rotation), new Object[0]);
            } else {
                i5 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = (cameraInfo.orientation + i5) % 360;
            i3 = (360 - i2) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i5) + 360) % 360;
            i3 = i2;
        }
        this.mRotation = i2 / 90;
        camera.setDisplayOrientation(i3);
        parameters.setRotation(i2);
    }

    private void setTemporaryParametersIntoCamera() {
        Camera.Parameters parameters = this.mTemporaryParameters;
        if (parameters != null) {
            setParameters(parameters);
            this.mTemporaryParameters = null;
        }
    }

    private void setupVideoCapture(Camera camera, Dimension dimension, boolean z, boolean z3) {
        Camera.Parameters parameters;
        int[] iArrSelectPreviewFpsRange;
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        mediaRecorder.setCamera(camera);
        if (z) {
            this.mMediaRecorder.setAudioSource(5);
        }
        this.mMediaRecorder.setVideoSource(1);
        this.mMediaRecorder.setMaxDuration(this.videoMaxDurationMs);
        this.mMediaRecorder.setOnInfoListener(this);
        CamcorderProfile camcorderProfile = CamcorderProfile.get(this.mFacing, CamcorderProfile.hasProfile(this.mFacing, this.videoQuality) ? this.videoQuality : 0);
        this.mMediaRecorder.setOutputFormat(camcorderProfile.fileFormat);
        int i = camcorderProfile.videoFrameRate;
        try {
            parameters = camera.getParameters();
        } catch (RuntimeException unused) {
            parameters = null;
        }
        float f = this.mRequestedFps;
        if (f > BitmapDescriptorFactory.HUE_RED && parameters != null && (iArrSelectPreviewFpsRange = selectPreviewFpsRange(parameters, f)) != null && iArrSelectPreviewFpsRange.length > 0) {
            i = iArrSelectPreviewFpsRange[1] / 1000;
        }
        try {
            this.mMediaRecorder.setVideoFrameRate(i);
        } catch (RuntimeException e) {
            Timber.e(e, "Exception while trying to setVideoFrameRate", new Object[0]);
        }
        if (dimension != null && !z3) {
            int height = dimension.getHeight();
            int width = dimension.getWidth();
            if (height > width) {
                width = dimension.getHeight();
                height = dimension.getWidth();
            }
            this.mMediaRecorder.setVideoSize(width, height);
        }
        this.mMediaRecorder.setVideoEncodingBitRate(this.videoRecordingBitRate);
        this.mMediaRecorder.setVideoEncoder(camcorderProfile.videoCodec);
        if (z) {
            this.mMediaRecorder.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.mMediaRecorder.setAudioChannels(camcorderProfile.audioChannels);
            this.mMediaRecorder.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.mMediaRecorder.setAudioEncoder(camcorderProfile.audioCodec);
        }
        this.mMediaRecorder.setPreviewDisplay(this.videoSurface);
        this.mMediaRecorder.setOrientationHint(this.mRotation * 90);
    }

    private void startPreview() {
        synchronized (this.mCameraLock) {
            try {
                try {
                    getCamera().startPreview();
                    this.mIsCameraPreviewStarted = true;
                    setTemporaryParametersIntoCamera();
                } catch (RuntimeException e) {
                    String message = e.getMessage();
                    Objects.requireNonNull(message);
                    throw new UnknownCameraException(message);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private void stopPreview() {
        synchronized (this.mCameraLock) {
            try {
                if (this.mIsRecording) {
                    stopVideo();
                    notifyCancelRecording();
                }
                getCamera().stopPreview();
                this.mIsCameraPreviewStarted = false;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private static Dimension toSize(Camera.Size size) {
        return new Dimension(size.width, size.height);
    }

    private void updateFocusMode(String str) {
        boolean z = (str == null || str.equals(this.mFocusMode)) ? false : true;
        Timber.d("focus mode updated:" + z + " newFocusMode:" + str + " mFocusMode:" + this.mFocusMode, new Object[0]);
        this.mPreviousFocusMode = z ? this.mFocusMode : this.mPreviousFocusMode;
        this.mFocusMode = str;
    }

    public static /* bridge */ /* synthetic */ Camera.Size z(int i, int i2, List list) {
        return selectBestSize((List<Camera.Size>) list, i, i2);
    }

    public void autoFocus(AutoFocusCallback autoFocusCallback) {
        CameraAutoFocusCallback cameraAutoFocusCallback;
        synchronized (this.mCameraLock) {
            if (getCamera() != null) {
                int i = 0;
                if (autoFocusCallback != null) {
                    cameraAutoFocusCallback = new CameraAutoFocusCallback(this, i);
                    cameraAutoFocusCallback.mDelegate = autoFocusCallback;
                } else {
                    cameraAutoFocusCallback = null;
                }
                try {
                    getCamera().autoFocus(cameraAutoFocusCallback);
                } catch (Exception e) {
                    Timber.e(e, "Handled exception: Auto focus failed", new Object[0]);
                    if (autoFocusCallback != null) {
                        autoFocusCallback.onAutoFocus(false);
                    }
                }
            }
        }
    }

    public void autoFocusOnce(List<Camera.Area> list, AutoFocusCallback autoFocusCallback) {
        autoFocusOnce(list, autoFocusCallback, true);
    }

    public void cancelAutoFocus() {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() != null) {
                    getCamera().cancelAutoFocus();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public int doZoom(float f) {
        int i;
        synchronized (this.mCameraLock) {
            try {
                i = 0;
                if (getCamera() != null) {
                    Camera.Parameters parameters = getCamera().getParameters();
                    if (parameters.isZoomSupported()) {
                        int maxZoom = parameters.getMaxZoom();
                        float zoom = parameters.getZoom() + 1;
                        int iRound = Math.round(f > 1.0f ? ((maxZoom / 10.0f) * f) + zoom : zoom * f) - 1;
                        if (iRound >= 0) {
                            i = iRound > maxZoom ? maxZoom : iRound;
                        }
                        parameters.setZoom(i);
                        getCamera().setParameters(parameters);
                    } else {
                        Timber.w("Zoom is not supported on this device", new Object[0]);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return i;
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public int getCameraFacing() {
        return this.mFacing;
    }

    public String getFlashMode() {
        return this.mFlashMode;
    }

    public String getFocusMode() {
        return this.mFocusMode;
    }

    public Camera.Parameters getParameters() {
        Camera.Parameters parameters;
        synchronized (this.mCameraLock) {
            try {
                parameters = getCamera() != null ? getCamera().getParameters() : null;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return parameters;
    }

    public Dimension getPictureDimension() {
        Camera.Size pictureSize = getPictureSize();
        return new Dimension(pictureSize.width, pictureSize.height);
    }

    public Camera.Size getPictureSize() {
        return getCamera().getParameters().getPictureSize();
    }

    public Dimension getPreviewSize() {
        return this.mPreviewDimension;
    }

    public boolean isRecording() {
        return this.mIsRecording;
    }

    public void notifyCancelRecording() {
        synchronized (this.mCameraLock) {
            try {
                MediaCaptureCallback mediaCaptureCallback = this.mMediaCaptureCallback;
                if (mediaCaptureCallback != null) {
                    mediaCaptureCallback.onVideoCanceled();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void notifyFinishRecording(boolean z) {
        synchronized (this.mCameraLock) {
            try {
                MediaCaptureCallback mediaCaptureCallback = this.mMediaCaptureCallback;
                if (mediaCaptureCallback != null) {
                    mediaCaptureCallback.onVideoCaptured(z, this.mOutputVideoFilePath);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        synchronized (this.mCameraLock) {
            if (i == 800) {
                try {
                    if (this.mMediaCaptureCallback != null) {
                        stopVideo();
                        this.mMediaCaptureCallback.onVideoTimeoutExceeded();
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }

    public void release() {
        synchronized (this.mCameraLock) {
            stop();
        }
    }

    public boolean setAutoFocusMoveCallback(AutoFocusMoveCallback autoFocusMoveCallback) {
        CameraAutoFocusMoveCallback cameraAutoFocusMoveCallback;
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() != null) {
                    if (autoFocusMoveCallback != null) {
                        cameraAutoFocusMoveCallback = new CameraAutoFocusMoveCallback(this, 0);
                        cameraAutoFocusMoveCallback.mDelegate = autoFocusMoveCallback;
                    } else {
                        cameraAutoFocusMoveCallback = null;
                    }
                    getCamera().setAutoFocusMoveCallback(cameraAutoFocusMoveCallback);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return true;
    }

    public void setFrameCallback(FrameCallback frameCallback) {
        this.mFrameCallback = frameCallback;
    }

    public CameraSource start() {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() == null) {
                    this.mCamera = createCamera();
                    this.mVideoDimension = getVideoDimension();
                    this.mDummySurfaceTexture = new SurfaceTexture(100);
                    getCamera().setPreviewTexture(this.mDummySurfaceTexture);
                }
                startPreview();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return this;
    }

    public void startVideo(MediaCaptureCallback mediaCaptureCallback, String str, int i, int i2, int i3, int i5, boolean z) throws TakePictureException {
        this.videoQuality = i;
        this.videoRecordingBitRate = i2;
        this.mRequestedFps = i5;
        this.videoMaxDurationMs = i3;
        this.hasVideo = true;
        this.hasAudio = z;
        try {
            startVideo(mediaCaptureCallback, str, false);
        } catch (Exception unused) {
            this.mMediaRecorder = null;
            getCamera().lock();
            startVideo(mediaCaptureCallback, str, true);
        }
    }

    public void stop() {
        synchronized (this.mCameraLock) {
            try {
                Disposable disposable = this.compressingDisposable;
                if (disposable != null && !disposable.isDisposed()) {
                    this.compressingDisposable.dispose();
                }
                if (getCamera() != null) {
                    stopPreview();
                    getCamera().setPreviewCallbackWithBuffer(null);
                    try {
                        getCamera().setPreviewTexture(null);
                    } catch (Exception e) {
                        Timber.e(e, "Failed to clear camera preview", new Object[0]);
                    }
                    getCamera().release();
                    this.mCamera = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void stopVideo() {
        synchronized (this.mCameraLock) {
            try {
                try {
                    this.mMediaRecorder.stop();
                    this.mMediaRecorder.reset();
                    this.mMediaRecorder.release();
                } catch (RuntimeException unused) {
                } catch (Throwable th10) {
                    this.mIsRecording = false;
                    throw th10;
                }
                this.mIsRecording = false;
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    public void takePicture(ShutterCallback shutterCallback, PictureCallback pictureCallback) throws TakePictureException {
        takePicture(shutterCallback, pictureCallback, true, true);
    }

    public void takePictureWithAutoFocus(ShutterCallback shutterCallback, PictureCallback pictureCallback, List<Camera.Area> list, boolean z, boolean z3) {
        autoFocusOnce(list, new com.onfido.android.sdk.capture.ui.camera.rx.b(this, shutterCallback, pictureCallback, z, z3), false);
    }

    public void tryTakePictureWithAutoFocus(final ShutterCallback shutterCallback, final PictureCallback pictureCallback, List<Camera.Area> list, final boolean z, final boolean z3) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Disposable disposableSubscribe = Observable.timer(AUTO_FOCUS_TRY_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.view.d
            @Override // igm.g
            public final void accept(Object obj2) throws CameraSource.TakePictureException {
                this.f50043a.lambda$tryTakePictureWithAutoFocus$1(atomicBoolean, shutterCallback, pictureCallback, z, z3, (Long) obj2);
            }
        });
        autoFocusOnce(list, new AutoFocusCallback() { // from class: com.onfido.android.sdk.capture.ui.camera.view.e
            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.AutoFocusCallback
            public final void onAutoFocus(boolean z4) {
                this.f50046a.lambda$tryTakePictureWithAutoFocus$3(atomicBoolean, disposableSubscribe, shutterCallback, pictureCallback, z, z3, z4);
            }
        }, false);
    }

    public /* synthetic */ CameraSource(int i) {
        this();
    }

    private void autoFocusOnce(List<Camera.Area> list, AutoFocusCallback autoFocusCallback, boolean z) {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() != null) {
                    if (setFocusMode("auto")) {
                        setParameters(new cmc.d(list, 26));
                        autoFocus(new com.onfido.android.sdk.capture.detector.barcode.a(this, autoFocusCallback, z));
                    } else if (autoFocusCallback != null) {
                        autoFocusCallback.onAutoFocus(false);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private static Dimension selectBestSize(Camera.Parameters parameters, int i, int i2) {
        Camera.Size sizeSelectBestSize = selectBestSize(parameters.getSupportedPictureSizes(), i, i2);
        if (sizeSelectBestSize == null) {
            return null;
        }
        return toSize(sizeSelectBestSize);
    }

    private static SizePair selectSizePair(Camera.Parameters parameters, int i, int i2, List<Camera.Size> list) {
        return selectSizePair(parameters, i, i2, -1, -1, list);
    }

    public boolean setParameters(SetParametersCallback setParametersCallback) {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() != null) {
                    try {
                        Camera.Parameters parametersCall = setParametersCallback.call(getCamera().getParameters(), this.mCamera);
                        if (parametersCall != null) {
                            setParameters(parametersCall);
                            return true;
                        }
                    } catch (Exception e) {
                        Timber.e(e, "setParameters Error: ", new Object[0]);
                    }
                }
                return false;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public CameraSource start(SurfaceTexture surfaceTexture) {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() != null) {
                    getCamera().setPreviewTexture(surfaceTexture);
                } else {
                    this.mCamera = createCamera();
                    this.mVideoDimension = getVideoDimension();
                    getCamera().setPreviewTexture(surfaceTexture);
                }
                startPreview();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return this;
    }

    public void startVideo(MediaCaptureCallback mediaCaptureCallback, String str, boolean z) throws TakePictureException {
        try {
            synchronized (this.mCameraLock) {
                try {
                    if (getCamera() != null) {
                        this.mOutputVideoFilePath = str;
                        getCamera().unlock();
                        initMediaRecorder(mediaCaptureCallback, str, z);
                        this.mIsRecording = true;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } catch (Exception unused) {
            throw new TakePictureException();
        }
    }

    public void takePicture(ShutterCallback shutterCallback, PictureCallback pictureCallback, boolean z, boolean z3) throws TakePictureException {
        try {
            synchronized (this.mCameraLock) {
                try {
                    if (getCamera() != null) {
                        int i = 0;
                        this.mIsCameraPreviewStarted = false;
                        int jpegQuality = getCamera().getParameters().getJpegQuality();
                        PictureStartCallback pictureStartCallback = new PictureStartCallback(this, i);
                        pictureStartCallback.mDelegate = new com.onfido.android.sdk.capture.detector.face.a(this, jpegQuality, shutterCallback);
                        PictureDoneCallback pictureDoneCallback = new PictureDoneCallback(this, i);
                        pictureDoneCallback.mDelegate = pictureCallback;
                        if (!z3) {
                            setJpegQuality(100);
                        }
                        getCamera().takePicture(pictureStartCallback, null, null, pictureDoneCallback);
                    }
                } finally {
                }
            }
        } catch (RuntimeException e) {
            throw new TakePictureException("Error when Camera.takePicture got called", e);
        }
    }

    private static <T> T selectBestSize(IteratorSizeList<T> iteratorSizeList, int i, int i2) {
        return (T) selectBestSize(iteratorSizeList, i, i2, false);
    }

    private static <T> T selectBestSize(IteratorSizeList<T> iteratorSizeList, int i, int i2, boolean z) {
        int i3 = Integer.MAX_VALUE;
        int i5 = -1;
        int i6 = -1;
        int i21 = Integer.MAX_VALUE;
        for (int i22 = 0; i22 < iteratorSizeList.getLength(); i22++) {
            Camera.Size size = iteratorSizeList.getSize(i22);
            int i32 = size.width;
            int i33 = i32 - i;
            int i43 = size.height - i2;
            int iAbs = Math.abs(i43) + Math.abs(i33);
            if (iAbs < i3) {
                i6 = i22;
                i3 = iAbs;
            }
            int i59 = i33 + i43;
            if (z && i33 > 0 && i43 > 0 && i59 < i21) {
                i5 = i22;
                i21 = i59;
            }
        }
        if (i5 <= -1) {
            i5 = i6;
        }
        if (i5 > -1) {
            return iteratorSizeList.getObject(i5);
        }
        return null;
    }

    public boolean setFlashMode(String str) {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() != null && str != null) {
                    Camera.Parameters parameters = getCamera().getParameters();
                    if (setFlashMode(parameters, str)) {
                        getCamera().setParameters(parameters);
                        this.mFlashMode = str;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public boolean setFocusMode(String str) {
        synchronized (this.mCameraLock) {
            try {
                if (getCamera() != null && str != null) {
                    try {
                        Camera.Parameters parameters = getCamera().getParameters();
                        Timber.d("setFocusMode:" + this.mFocusMode + " mPreviousFocusMode:" + this.mPreviousFocusMode, new Object[0]);
                        if (setFocusMode(parameters, str)) {
                            setParameters(parameters);
                            Timber.d("after setting setFocusMode:" + this.mFocusMode + " mPreviousFocusMode:" + this.mPreviousFocusMode, new Object[0]);
                            return true;
                        }
                    } catch (RuntimeException unused) {
                        return false;
                    }
                }
                return false;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
