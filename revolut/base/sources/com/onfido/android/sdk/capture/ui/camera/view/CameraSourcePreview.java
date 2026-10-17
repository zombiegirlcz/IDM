package com.onfido.android.sdk.capture.ui.camera.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import au0.b2;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.usecase.GetDefaultPictureResolutionUseCase;
import com.onfido.android.sdk.capture.internal.util.Dimension;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider;
import com.onfido.android.sdk.capture.ui.camera.FaceDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.FrameCallback;
import com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback;
import com.onfido.android.sdk.capture.ui.camera.TorchMode;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class CameraSourcePreview extends ViewGroup {
    private CameraResolutionProvider.Companion.Factory cameraResolutionProviderFactory;
    private CameraSource cameraSource;
    CameraSourceFactory cameraSourceFactory;
    private final Context context;
    private int desiredFaceTrackingFrameHeight;
    private int desiredFaceTrackingFrameWidth;
    private RectF documentOverlayRect;
    private boolean focusImprovementsEnabled;
    private final ImageUtils imageUtils;
    private boolean isFront;
    private List<Camera.Area> mCameraAreaList;
    private CameraPreviewListener mCameraPreviewListener;
    private double mVerticalWeight;
    private int pictureHeight;
    private int pictureWidth;
    private int previewHeight;
    private int previewHorizontalOffset;
    private int previewVerticalOffset;
    private int previewWidth;
    private float previewZoomFactor;
    private SurfaceCallback surfaceCallback;
    private TextureView textureView;
    private int verticalPositionOffset;
    private Surface videoSurface;
    private static final String MP4 = "mp4";
    private static final String DOT = ".";

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$onfido$android$sdk$capture$ui$camera$TorchMode;

        static {
            int[] iArr = new int[TorchMode.values().length];
            $SwitchMap$com$onfido$android$sdk$capture$ui$camera$TorchMode = iArr;
            try {
                iArr[TorchMode.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$onfido$android$sdk$capture$ui$camera$TorchMode[TorchMode.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$onfido$android$sdk$capture$ui$camera$TorchMode[TorchMode.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface CameraPreviewListener {
        void onCameraNotFound();

        void onCameraPreviewAvailable();

        void onCameraUnavailable();

        void onUnknownCameraError(@NonNull UnknownCameraException unknownCameraException);
    }

    public class SurfaceCallback implements TextureView.SurfaceTextureListener {
        boolean surfaceAvailable;

        private SurfaceCallback() {
            this.surfaceAvailable = false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.surfaceAvailable = true;
            CameraSourcePreview.this.mCameraPreviewListener.onCameraPreviewAvailable();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.surfaceAvailable = false;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public /* synthetic */ SurfaceCallback(CameraSourcePreview cameraSourcePreview, int i) {
            this();
        }
    }

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCameraAreaList = null;
        this.isFront = false;
        this.mVerticalWeight = 1.0d;
        this.previewHorizontalOffset = 0;
        this.previewVerticalOffset = 0;
        this.pictureWidth = 0;
        this.pictureHeight = 0;
        this.previewHeight = 0;
        this.previewWidth = 0;
        this.verticalPositionOffset = 0;
        this.previewZoomFactor = 1.0f;
        this.desiredFaceTrackingFrameWidth = -1;
        this.desiredFaceTrackingFrameHeight = -1;
        this.focusImprovementsEnabled = false;
        this.cameraResolutionProviderFactory = new GetDefaultPictureResolutionUseCase.Companion.Factory();
        this.documentOverlayRect = null;
        this.context = context;
        setOnClickListener(new b2(this, 12));
        this.imageUtils = new ImageUtils();
        this.cameraSourceFactory = CameraSourceFactory.newInstance();
    }

    private File getOutputVideoMediaFile(File file) {
        return new File(file.getPath() + File.separator + "ONFIDO_VID_" + new Date().getTime() + ".mp4");
    }

    private boolean isPortraitMode() {
        int i = this.context.getResources().getConfiguration().orientation;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        Timber.d("isPortraitMode returning false by default", new Object[0]);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            cameraSource.autoFocusOnce(this.mCameraAreaList, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Camera.Parameters lambda$setTorchMode$2(TorchMode torchMode, Camera.Parameters parameters, Camera camera) {
        String str;
        Iterator<String> it8 = parameters.getSupportedFlashModes().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            if (it8.next().equalsIgnoreCase(torchMode.name())) {
                int i = AnonymousClass2.$SwitchMap$com$onfido$android$sdk$capture$ui$camera$TorchMode[torchMode.ordinal()];
                if (i == 1) {
                    str = "torch";
                } else if (i == 2) {
                    str = "off";
                } else if (i == 3) {
                    str = "auto";
                }
                parameters.setFlashMode(str);
                return parameters;
            }
        }
        return parameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$takePicture$1(MediaCaptureCallback mediaCaptureCallback, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            mediaCaptureCallback.onPictureCaptured(bArr, i, i2);
        } else {
            mediaCaptureCallback.onErrorTakingPicture(new CameraSource.TakePictureException("pictureData == null"));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void createCameraSource(boolean z, boolean z3, VideoCaptureConfig videoCaptureConfig) {
        stop();
        release();
        SurfaceTexture surfaceTexture = this.textureView.getSurfaceTexture();
        SurfaceCallback surfaceCallback = this.surfaceCallback;
        if (surfaceCallback == null || !surfaceCallback.surfaceAvailable || surfaceTexture == null) {
            throw new UnknownCameraException("SurfaceView is not ready");
        }
        boolean z4 = this.isFront;
        Dimension dimension = new Dimension(getWidth(), getHeight());
        this.videoSurface = new Surface(surfaceTexture);
        try {
            this.cameraSource = this.cameraSourceFactory.createCameraSource(getContext(), z4 ? 1 : 0, z, isPortraitMode(), z3, videoCaptureConfig.getHasAudio(), videoCaptureConfig.getQualityProfile(), videoCaptureConfig.getBitrate(), videoCaptureConfig.getMaxFps(), videoCaptureConfig.getMaxDuration(), this.videoSurface, this.cameraResolutionProviderFactory.create(this.mVerticalWeight, dimension));
        } catch (RuntimeException e) {
            throw new UnknownCameraException("Couldn't create camera source: " + e.getMessage());
        }
    }

    public void finishRecording(boolean z) {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource == null) {
            Timber.e("Camera Source is null", new Object[0]);
        } else {
            cameraSource.stopVideo();
            this.cameraSource.notifyFinishRecording(z);
        }
    }

    public int getActualPreviewHeight() {
        return getChildCount() > 0 ? getChildAt(0).getHeight() : getHeight();
    }

    public int getActualPreviewWidth() {
        return getChildCount() > 0 ? getChildAt(0).getWidth() : getWidth();
    }

    @NonNull
    public FaceDetectionFrame getFaceDetectionFrame(int i) {
        if (this.desiredFaceTrackingFrameWidth < 0 || this.desiredFaceTrackingFrameHeight < 0) {
            this.desiredFaceTrackingFrameWidth = i;
            this.desiredFaceTrackingFrameHeight = Math.round(((this.pictureHeight / this.pictureWidth) * i) / 2.0f) * 2;
        }
        Bitmap bitmap = this.textureView.getBitmap(this.desiredFaceTrackingFrameWidth, this.desiredFaceTrackingFrameHeight);
        return new FaceDetectionFrame(this.imageUtils.getNV21(this.desiredFaceTrackingFrameWidth, this.desiredFaceTrackingFrameHeight, bitmap), this.desiredFaceTrackingFrameWidth, this.desiredFaceTrackingFrameHeight, 0, new OnfidoImage.CropRect(1.0f, 0, 0, getWidth(), getHeight()), bitmap);
    }

    public int getHorizontalOffset(int i, int i2) {
        float f = i;
        float height = getHeight() / i2;
        if (getWidth() / f > height) {
            return 0;
        }
        return (((int) (f * height)) - getWidth()) / 2;
    }

    public boolean getIsFront() {
        return this.isFront;
    }

    public int getPictureHeight() {
        return this.pictureHeight;
    }

    public int getPictureWidth() {
        return this.pictureWidth;
    }

    public int getPreviewHorizontalOffset() {
        return this.previewHorizontalOffset;
    }

    public int getPreviewVerticalOffset() {
        return this.previewVerticalOffset;
    }

    public float getPreviewZoomFactor() {
        return this.previewZoomFactor;
    }

    public int getVerticalOffset(int i, int i2) {
        float width = getWidth() / i;
        float f = i2;
        if (width > getHeight() / f) {
            return (((int) (f * width)) - getHeight()) / 2;
        }
        return 0;
    }

    public int getVerticalPositionOffset() {
        return this.verticalPositionOffset;
    }

    public float getZoomFactor(int i, int i2, boolean z) {
        float width = getWidth() / i;
        return z ? width : Math.max(width, getHeight() / i2);
    }

    public boolean hasCameraSource() {
        return this.cameraSource != null;
    }

    public boolean isReady() {
        return this.surfaceCallback.surfaceAvailable;
    }

    public boolean isRecording() {
        CameraSource cameraSource = this.cameraSource;
        return cameraSource != null && cameraSource.isRecording();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int i6;
        int i21;
        int i22 = i3 - i;
        int i32 = i5 - i2;
        this.pictureWidth = 320;
        this.pictureHeight = 240;
        this.previewWidth = 320;
        this.previewHeight = 240;
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            try {
                Dimension pictureDimension = cameraSource.getPictureDimension();
                Dimension previewSize = this.cameraSource.getPreviewSize();
                if (pictureDimension != null) {
                    this.pictureWidth = pictureDimension.getWidth();
                    this.pictureHeight = pictureDimension.getHeight();
                }
                if (previewSize != null) {
                    this.previewHeight = previewSize.getHeight();
                    this.previewWidth = previewSize.getWidth();
                }
            } catch (RuntimeException e) {
                Timber.e(e.getCause(), "Couldn't get camera parameters", new Object[0]);
            }
        }
        if (isPortraitMode()) {
            int i33 = this.pictureWidth;
            this.pictureWidth = this.pictureHeight;
            this.pictureHeight = i33;
            int i43 = this.previewWidth;
            this.previewWidth = this.previewHeight;
            this.previewHeight = i43;
        }
        int i59 = this.pictureWidth;
        float f = i22 / i59;
        int i66 = this.pictureHeight;
        float f4 = i32 / i66;
        boolean z3 = this.documentOverlayRect != null;
        this.previewZoomFactor = getZoomFactor(i59, i66, z3);
        if (f > f4 || z3) {
            int i74 = (int) (this.pictureHeight * f);
            int i92 = (i74 - i32) / 2;
            i32 = i74;
            i6 = i92;
            i21 = 0;
        } else {
            int i96 = (int) (this.pictureWidth * f4);
            i21 = (i96 - i22) / 2;
            i22 = i96;
            i6 = 0;
        }
        this.previewHorizontalOffset = i21;
        this.previewVerticalOffset = i6;
        if (!z3) {
            for (int i99 = 0; i99 < getChildCount(); i99++) {
                getChildAt(i99).layout(i21 * (-1), i6 * (-1), i22 - i21, i32 - i6);
            }
            return;
        }
        int i100 = i6 * (-1);
        int i101 = i32 - i6;
        int iRound = Math.round((((i101 - i100) / 2.0f) + i100) - this.documentOverlayRect.centerY()) * (-1);
        this.verticalPositionOffset = iRound;
        this.previewVerticalOffset -= iRound;
        for (int i102 = 0; i102 < getChildCount(); i102++) {
            View childAt = getChildAt(i102);
            int i103 = this.verticalPositionOffset;
            childAt.layout(0, i100 + i103, i22 - i21, i103 + i101);
        }
    }

    public void release() {
        Surface surface = this.videoSurface;
        if (surface != null) {
            surface.release();
        }
        if (this.cameraSource != null) {
            setTorchMode(TorchMode.AUTO);
            this.cameraSource.release();
            this.cameraSource = null;
        }
    }

    public void setCameraResolutionProviderFactory(CameraResolutionProvider.Companion.Factory factory) {
        this.cameraResolutionProviderFactory = factory;
    }

    public void setDocumentOverlayRect(@NotNull RectF rectF) {
        this.documentOverlayRect = rectF;
        requestLayout();
        invalidate();
    }

    public void setFocusImprovementsEnabled(boolean z) {
        this.focusImprovementsEnabled = z;
    }

    public void setFocusMeterAreaWeight(float f, float f4) {
        int i = (int) (f4 * 1000.0f);
        int i2 = (int) (f * 1000.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(new Rect(-i2, -i, i2, i), 800));
        this.mCameraAreaList = arrayList;
    }

    public void setFrameCallback(FrameCallback frameCallback) {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            cameraSource.setFrameCallback(frameCallback);
        } else {
            Timber.d("Couldn't set FrameCallback because cameraSource is null", new Object[0]);
        }
    }

    public void setIsFront(boolean z) {
        if (!CameraSourceFactory.isFrontCameraSupported()) {
            z = false;
        }
        if (this.isFront != z) {
            this.isFront = z;
        }
    }

    public void setListener(CameraPreviewListener cameraPreviewListener) {
        this.mCameraPreviewListener = cameraPreviewListener;
    }

    public void setPictureWeightSize(float f, float f4) {
        this.mVerticalWeight = f4;
    }

    public void setTorchMode(TorchMode torchMode) {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource == null) {
            Timber.e("setTorchMode camera source is null", new Object[0]);
            return;
        }
        String flashMode = cameraSource.getFlashMode();
        if (flashMode == null) {
            return;
        }
        if (flashMode.equals("torch") && torchMode == TorchMode.ON) {
            return;
        }
        if (flashMode.equals("auto") && torchMode == TorchMode.AUTO) {
            return;
        }
        if (flashMode.equals("off") && torchMode == TorchMode.OFF) {
            return;
        }
        this.cameraSource.setParameters(new cmc.d(torchMode, 27));
    }

    public void setupTextureView() {
        this.textureView = new TextureView(this.context);
        this.textureView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        SurfaceCallback surfaceCallback = new SurfaceCallback(this, 0);
        this.surfaceCallback = surfaceCallback;
        this.textureView.setSurfaceTextureListener(surfaceCallback);
        removeAllViews();
        addView(this.textureView);
    }

    public void start(boolean z, boolean z3, VideoCaptureConfig videoCaptureConfig) {
        try {
            startWithException(z, z3, videoCaptureConfig);
        } catch (UnknownCameraException e) {
            Timber.e(e, "Camera UnknownCameraException", new Object[0]);
            if (this.mCameraPreviewListener != null) {
                this.mCameraPreviewListener.onUnknownCameraError(e);
            }
        } catch (CameraSource.CameraNotAvailable e2) {
            Timber.e(e2, "Camera unavailable", new Object[0]);
            if (this.mCameraPreviewListener != null) {
                this.mCameraPreviewListener.onCameraUnavailable();
            }
        } catch (CameraSource.CameraNotFound e4) {
            Timber.e(e4, "Camera not found", new Object[0]);
            if (this.mCameraPreviewListener != null) {
                this.mCameraPreviewListener.onCameraNotFound();
            }
        } catch (IOException e5) {
            Timber.e(e5, "Unable to startWithException camera source.", new Object[0]);
            release();
        }
    }

    public void startVideo(boolean z, MediaCaptureCallback mediaCaptureCallback, VideoCaptureConfig videoCaptureConfig) {
        startVideo(z, mediaCaptureCallback, null, videoCaptureConfig);
    }

    public void startWithException(boolean z, boolean z3, VideoCaptureConfig videoCaptureConfig) {
        if (this.cameraSource == null) {
            createCameraSource(z, z3, videoCaptureConfig);
        }
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource == null || !this.surfaceCallback.surfaceAvailable) {
            return;
        }
        cameraSource.start(this.textureView.getSurfaceTexture());
        this.cameraSource.setParameters(new CameraSource.SetParametersCallback() { // from class: com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview.1
            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.SetParametersCallback
            public Camera.Parameters call(Camera.Parameters parameters, Camera camera) {
                if (CameraSourcePreview.this.mCameraAreaList.size() <= parameters.getMaxNumMeteringAreas()) {
                    parameters.setMeteringAreas(CameraSourcePreview.this.mCameraAreaList);
                }
                return parameters;
            }
        });
        requestLayout();
        invalidate();
    }

    public void stop() {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            cameraSource.stop();
        }
    }

    public void stopRecording() {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource == null) {
            Timber.e("Camera Source is null", new Object[0]);
        } else {
            cameraSource.stopVideo();
            this.cameraSource.notifyCancelRecording();
        }
    }

    public void takePicture(CameraSource.ShutterCallback shutterCallback, MediaCaptureCallback mediaCaptureCallback, boolean z) {
        try {
            CameraSource cameraSource = this.cameraSource;
            if (cameraSource == null) {
                mediaCaptureCallback.onErrorTakingPicture(new CameraSource.TakePictureException("Camera Source has not been initialized"));
                return;
            }
            cmc.d dVar = new cmc.d(mediaCaptureCallback, 28);
            if (this.focusImprovementsEnabled) {
                cameraSource.tryTakePictureWithAutoFocus(shutterCallback, dVar, this.mCameraAreaList, false, z);
            } else {
                cameraSource.takePicture(shutterCallback, dVar, false, z);
            }
        } catch (Exception e) {
            mediaCaptureCallback.onErrorTakingPicture(new CameraSource.TakePictureException(e.getMessage()));
        }
    }

    public void startVideo(boolean z, MediaCaptureCallback mediaCaptureCallback, String str, VideoCaptureConfig videoCaptureConfig) {
        MediaCaptureCallback mediaCaptureCallback2;
        CameraSource.TakePictureException takePictureException;
        Throwable th10;
        try {
            if (this.cameraSource == null) {
                try {
                    createCameraSource(z, true, videoCaptureConfig);
                    Timber.i("#startVideo cameraSource is null. Creating a new instance.", new Object[0]);
                } catch (UnknownCameraException e) {
                    e = e;
                    th10 = e;
                    mediaCaptureCallback2 = mediaCaptureCallback;
                    Timber.e(th10, "Exception during start video", new Object[0]);
                    mediaCaptureCallback2.onErrorTakingPicture(new CameraSource.TakePictureException(th10.getMessage()));
                } catch (CameraSource.CameraNotAvailable e2) {
                    e = e2;
                    th10 = e;
                    mediaCaptureCallback2 = mediaCaptureCallback;
                    Timber.e(th10, "Exception during start video", new Object[0]);
                    mediaCaptureCallback2.onErrorTakingPicture(new CameraSource.TakePictureException(th10.getMessage()));
                } catch (CameraSource.TakePictureException e4) {
                    takePictureException = e4;
                    mediaCaptureCallback2 = mediaCaptureCallback;
                    mediaCaptureCallback2.onErrorTakingPicture(takePictureException);
                }
            }
            if (str == null) {
                str = getOutputVideoMediaFile(this.context.getFilesDir()).getAbsolutePath();
            }
            mediaCaptureCallback2 = mediaCaptureCallback;
            try {
                this.cameraSource.startVideo(mediaCaptureCallback2, str, videoCaptureConfig.getQualityProfile(), videoCaptureConfig.getBitrate(), videoCaptureConfig.getMaxDuration(), videoCaptureConfig.getMaxFps(), videoCaptureConfig.getHasAudio());
            } catch (UnknownCameraException e5) {
                e = e5;
                th10 = e;
                Timber.e(th10, "Exception during start video", new Object[0]);
                mediaCaptureCallback2.onErrorTakingPicture(new CameraSource.TakePictureException(th10.getMessage()));
            } catch (CameraSource.CameraNotAvailable e6) {
                e = e6;
                th10 = e;
                Timber.e(th10, "Exception during start video", new Object[0]);
                mediaCaptureCallback2.onErrorTakingPicture(new CameraSource.TakePictureException(th10.getMessage()));
            } catch (CameraSource.TakePictureException e22) {
                e = e22;
                takePictureException = e;
                mediaCaptureCallback2.onErrorTakingPicture(takePictureException);
            }
        } catch (UnknownCameraException e33) {
            e = e33;
            mediaCaptureCallback2 = mediaCaptureCallback;
            th10 = e;
            Timber.e(th10, "Exception during start video", new Object[0]);
            mediaCaptureCallback2.onErrorTakingPicture(new CameraSource.TakePictureException(th10.getMessage()));
        } catch (CameraSource.CameraNotAvailable e35) {
            e = e35;
            mediaCaptureCallback2 = mediaCaptureCallback;
            th10 = e;
            Timber.e(th10, "Exception during start video", new Object[0]);
            mediaCaptureCallback2.onErrorTakingPicture(new CameraSource.TakePictureException(th10.getMessage()));
        } catch (CameraSource.TakePictureException e41) {
            e = e41;
            mediaCaptureCallback2 = mediaCaptureCallback;
        }
    }
}
