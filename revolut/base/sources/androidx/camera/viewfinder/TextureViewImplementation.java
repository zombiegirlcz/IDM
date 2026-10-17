package androidx.camera.viewfinder;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.camera.viewfinder.ViewfinderSurfaceRequest;
import androidx.camera.viewfinder.internal.utils.Logger;
import androidx.camera.viewfinder.internal.utils.executor.CameraExecutors;
import androidx.camera.viewfinder.internal.utils.futures.FutureCallback;
import androidx.camera.viewfinder.internal.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes15.dex */
final class TextureViewImplementation extends ViewfinderImplementation {
    SurfaceTexture mDetachedSurfaceTexture;
    boolean mIsSurfaceTextureDetachedFromView;
    ListenableFuture<ViewfinderSurfaceRequest.Result> mSurfaceReleaseFuture;
    ViewfinderSurfaceRequest mSurfaceRequest;
    SurfaceTexture mSurfaceTexture;
    TextureView mTextureView;

    public TextureViewImplementation(@NonNull FrameLayout frameLayout, @NonNull ViewfinderTransformation viewfinderTransformation) {
        super(frameLayout, viewfinderTransformation);
        this.mIsSurfaceTextureDetachedFromView = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceRequested$0(ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        ViewfinderSurfaceRequest viewfinderSurfaceRequest2 = this.mSurfaceRequest;
        if (viewfinderSurfaceRequest2 == null || viewfinderSurfaceRequest2 != viewfinderSurfaceRequest) {
            return;
        }
        this.mSurfaceRequest = null;
        this.mSurfaceReleaseFuture = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$tryToProvideViewfinderSurface$1(Surface surface, final CallbackToFutureAdapter.Completer completer) throws Exception {
        Logger.d("TextureViewImpl", "Surface set on viewfinder.");
        this.mSurfaceRequest.provideSurface(surface, CameraExecutors.directExecutor(), new Consumer<ViewfinderSurfaceRequest.Result>() { // from class: androidx.camera.viewfinder.TextureViewImplementation.2
            @Override // androidx.core.util.Consumer
            public void accept(ViewfinderSurfaceRequest.Result result) {
                Logger.d("TextureViewImpl", "provide surface result = " + result);
                completer.set(result);
            }
        });
        return "provideSurface[request=" + this.mSurfaceRequest + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryToProvideViewfinderSurface$2(Surface surface, ListenableFuture listenableFuture, ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        Logger.d("TextureViewImpl", "Safe to release surface.");
        surface.release();
        if (this.mSurfaceReleaseFuture == listenableFuture) {
            this.mSurfaceReleaseFuture = null;
        }
        if (this.mSurfaceRequest == viewfinderSurfaceRequest) {
            this.mSurfaceRequest = null;
        }
    }

    private void reattachSurfaceTexture() {
        if (!this.mIsSurfaceTextureDetachedFromView || this.mDetachedSurfaceTexture == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.mTextureView.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.mDetachedSurfaceTexture;
        if (surfaceTexture != surfaceTexture2) {
            this.mTextureView.setSurfaceTexture(surfaceTexture2);
            this.mDetachedSurfaceTexture = null;
            this.mIsSurfaceTextureDetachedFromView = false;
        }
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public View getViewfinder() {
        return this.mTextureView;
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public Bitmap getViewfinderBitmap() {
        TextureView textureView = this.mTextureView;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.mTextureView.getBitmap();
    }

    public void initializeViewfinder() {
        Preconditions.checkNotNull(this.mParent);
        Preconditions.checkNotNull(this.mResolution);
        TextureView textureView = new TextureView(this.mParent.getContext());
        this.mTextureView = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: androidx.camera.viewfinder.TextureViewImplementation.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
                ViewfinderSurfaceRequest viewfinderSurfaceRequest;
                Logger.d("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
                TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
                textureViewImplementation.mSurfaceTexture = surfaceTexture;
                if (textureViewImplementation.mSurfaceReleaseFuture == null || (viewfinderSurfaceRequest = textureViewImplementation.mSurfaceRequest) == null) {
                    textureViewImplementation.tryToProvideViewfinderSurface();
                    return;
                }
                Preconditions.checkNotNull(viewfinderSurfaceRequest);
                Logger.d("TextureViewImpl", "Surface invalidated " + TextureViewImplementation.this.mSurfaceRequest);
                TextureViewImplementation.this.mSurfaceRequest.getViewfinderSurface().close();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(@NonNull final SurfaceTexture surfaceTexture) {
                TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
                textureViewImplementation.mSurfaceTexture = null;
                ListenableFuture<ViewfinderSurfaceRequest.Result> listenableFuture = textureViewImplementation.mSurfaceReleaseFuture;
                if (listenableFuture == null || textureViewImplementation.mTextureView == null) {
                    return true;
                }
                Futures.addCallback(listenableFuture, new FutureCallback<ViewfinderSurfaceRequest.Result>() { // from class: androidx.camera.viewfinder.TextureViewImplementation.1.1
                    @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
                    public void onFailure(Throwable th10) {
                        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th10);
                    }

                    @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
                    public void onSuccess(ViewfinderSurfaceRequest.Result result) {
                        Preconditions.checkState(result.getResultCode() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                        Logger.d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                        surfaceTexture.release();
                        TextureViewImplementation textureViewImplementation2 = TextureViewImplementation.this;
                        if (textureViewImplementation2.mDetachedSurfaceTexture != null) {
                            textureViewImplementation2.mDetachedSurfaceTexture = null;
                        }
                    }
                }, ContextCompat.getMainExecutor(TextureViewImplementation.this.mTextureView.getContext()));
                TextureViewImplementation.this.mDetachedSurfaceTexture = surfaceTexture;
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
                Logger.d("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
            }
        });
        this.mParent.removeAllViews();
        this.mParent.addView(this.mTextureView);
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public void onAttachedToWindow() {
        reattachSurfaceTexture();
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public void onDetachedFromWindow() {
        this.mIsSurfaceTextureDetachedFromView = true;
    }

    @Override // androidx.camera.viewfinder.ViewfinderImplementation
    public void onSurfaceRequested(@NonNull ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        this.mResolution = viewfinderSurfaceRequest.getResolution();
        initializeViewfinder();
        ViewfinderSurfaceRequest viewfinderSurfaceRequest2 = this.mSurfaceRequest;
        if (viewfinderSurfaceRequest2 != null) {
            viewfinderSurfaceRequest2.willNotProvideSurface();
        }
        this.mSurfaceRequest = viewfinderSurfaceRequest;
        viewfinderSurfaceRequest.addRequestCancellationListener(ContextCompat.getMainExecutor(this.mTextureView.getContext()), new d(this, viewfinderSurfaceRequest, 1));
        tryToProvideViewfinderSurface();
    }

    public void tryToProvideViewfinderSurface() {
        SurfaceTexture surfaceTexture;
        Size size = this.mResolution;
        if (size == null || (surfaceTexture = this.mSurfaceTexture) == null || this.mSurfaceRequest == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.mResolution.getHeight());
        final Surface surface = new Surface(this.mSurfaceTexture);
        final ViewfinderSurfaceRequest viewfinderSurfaceRequest = this.mSurfaceRequest;
        final ListenableFuture<ViewfinderSurfaceRequest.Result> future = CallbackToFutureAdapter.getFuture(new g(this, surface, 3));
        this.mSurfaceReleaseFuture = future;
        future.addListener(new Runnable() { // from class: androidx.camera.viewfinder.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f6963a.lambda$tryToProvideViewfinderSurface$2(surface, future, viewfinderSurfaceRequest);
            }
        }, ContextCompat.getMainExecutor(this.mTextureView.getContext()));
        onSurfaceProvided();
    }
}
