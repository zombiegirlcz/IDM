package androidx.camera.viewfinder;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.camera.viewfinder.ViewfinderSurfaceRequest;
import androidx.camera.viewfinder.internal.utils.Logger;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
final class SurfaceViewImplementation extends ViewfinderImplementation {

    @NonNull
    final SurfaceRequestCallback mSurfaceRequestCallback;
    SurfaceView mSurfaceView;

    public static class Api24Impl {
        public static void pixelCopyRequest(@NonNull SurfaceView surfaceView, @NonNull Bitmap bitmap, @NonNull PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, @NonNull Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    public class SurfaceRequestCallback implements SurfaceHolder.Callback {
        private Size mCurrentSurfaceSize;
        private ViewfinderSurfaceRequest mSurfaceRequest;
        private Size mTargetSize;
        private boolean mWasSurfaceProvided = false;

        public SurfaceRequestCallback() {
        }

        private boolean canProvideSurface() {
            Size size;
            return (this.mWasSurfaceProvided || this.mSurfaceRequest == null || (size = this.mTargetSize) == null || !size.equals(this.mCurrentSurfaceSize)) ? false : true;
        }

        private void cancelPreviousRequest() {
            if (this.mSurfaceRequest != null) {
                Logger.d("SurfaceViewImpl", "Request canceled: " + this.mSurfaceRequest);
                this.mSurfaceRequest.willNotProvideSurface();
            }
        }

        private void invalidateSurface() {
            if (this.mSurfaceRequest != null) {
                Logger.d("SurfaceViewImpl", "Surface invalidated " + this.mSurfaceRequest);
                this.mSurfaceRequest.getViewfinderSurface().close();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$tryToComplete$0(ViewfinderSurfaceRequest.Result result) {
            Logger.d("SurfaceViewImpl", "provide surface result = " + result);
        }

        private boolean tryToComplete() {
            SurfaceView surfaceView = SurfaceViewImplementation.this.mSurfaceView;
            if (surfaceView != null && this.mSurfaceRequest != null) {
                Surface surface = surfaceView.getHolder().getSurface();
                if (canProvideSurface()) {
                    Logger.d("SurfaceViewImpl", "Surface set on viewfinder.");
                    this.mSurfaceRequest.provideSurface(surface, ContextCompat.getMainExecutor(SurfaceViewImplementation.this.mSurfaceView.getContext()), new e());
                    this.mWasSurfaceProvided = true;
                    SurfaceViewImplementation.this.onSurfaceProvided();
                    return true;
                }
            }
            return false;
        }

        public void setSurfaceRequest(@NonNull ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
            cancelPreviousRequest();
            this.mSurfaceRequest = viewfinderSurfaceRequest;
            Size resolution = viewfinderSurfaceRequest.getResolution();
            this.mTargetSize = resolution;
            this.mWasSurfaceProvided = false;
            if (tryToComplete()) {
                return;
            }
            Logger.d("SurfaceViewImpl", "Wait for new Surface creation.");
            SurfaceViewImplementation.this.mSurfaceView.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Logger.d("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.mCurrentSurfaceSize = new Size(i2, i3);
            tryToComplete();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            Logger.d("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            Logger.d("SurfaceViewImpl", "Surface destroyed.");
            if (this.mWasSurfaceProvided) {
                invalidateSurface();
            } else {
                cancelPreviousRequest();
            }
            this.mWasSurfaceProvided = false;
            this.mSurfaceRequest = null;
            this.mCurrentSurfaceSize = null;
            this.mTargetSize = null;
        }
    }

    public SurfaceViewImplementation(@NonNull FrameLayout frameLayout, @NonNull ViewfinderTransformation viewfinderTransformation) {
        super(frameLayout, viewfinderTransformation);
        this.mSurfaceRequestCallback = new SurfaceRequestCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getViewfinderBitmap$2(int i) {
        if (i == 0) {
            Logger.d("SurfaceViewImpl", "CameraViewfinder.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        Logger.e("SurfaceViewImpl", "CameraViewfinder.SurfaceViewImplementation.getBitmap() failed with error " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onSurfaceRequested$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceRequested$1(ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        this.mSurfaceRequestCallback.setSurfaceRequest(viewfinderSurfaceRequest);
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public View getViewfinder() {
        return this.mSurfaceView;
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public Bitmap getViewfinderBitmap() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.mSurfaceView.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.mSurfaceView.getWidth(), this.mSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.mSurfaceView;
        Api24Impl.pixelCopyRequest(surfaceView2, bitmapCreateBitmap, new b(), surfaceView2.getHandler());
        return bitmapCreateBitmap;
    }

    public void initializeViewfinder() {
        Preconditions.checkNotNull(this.mParent);
        Preconditions.checkNotNull(this.mResolution);
        SurfaceView surfaceView = new SurfaceView(this.mParent.getContext());
        this.mSurfaceView = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mParent.removeAllViews();
        this.mParent.addView(this.mSurfaceView);
        this.mSurfaceView.getHolder().addCallback(this.mSurfaceRequestCallback);
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public void onAttachedToWindow() {
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public void onDetachedFromWindow() {
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public void onSurfaceRequested(@NonNull ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        this.mResolution = viewfinderSurfaceRequest.getResolution();
        initializeViewfinder();
        viewfinderSurfaceRequest.addRequestCancellationListener(ContextCompat.getMainExecutor(this.mSurfaceView.getContext()), new c());
        this.mSurfaceView.post(new d(this, viewfinderSurfaceRequest, 0));
    }
}
