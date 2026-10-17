package androidx.camera.viewfinder;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.viewfinder.CameraViewfinder;
import androidx.camera.viewfinder.internal.surface.ViewfinderSurface;
import androidx.camera.viewfinder.internal.utils.Logger;
import androidx.camera.viewfinder.internal.utils.executor.CameraExecutors;
import androidx.camera.viewfinder.internal.utils.futures.FutureCallback;
import androidx.camera.viewfinder.internal.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
public class ViewfinderSurfaceRequest {
    private CameraViewfinder.ImplementationMode mImplementationMode;

    @NonNull
    private final ViewfinderSurface mInternalViewfinderSurface;
    private int mLensFacing;

    @NonNull
    private final CallbackToFutureAdapter.Completer<Void> mRequestCancellationCompleter;

    @NonNull
    private final Size mResolution;
    private int mSensorOrientation;

    @NonNull
    private final ListenableFuture<Void> mSessionStatusFuture;

    @NonNull
    private final CallbackToFutureAdapter.Completer<Surface> mSurfaceCompleter;

    @NonNull
    final ListenableFuture<Surface> mSurfaceFuture;

    public static final class Builder {
        private CameraViewfinder.ImplementationMode mImplementationMode;

        @NonNull
        private final Size mResolution;
        private int mLensFacing = 1;
        private int mSensorOrientation = 0;

        public Builder(@NonNull Size size) {
            this.mResolution = size;
        }

        @NonNull
        public ViewfinderSurfaceRequest build() {
            int i = this.mLensFacing;
            if (i != 0 && i != 1 && i != 2) {
                throw new IllegalArgumentException(j6.a.v(new StringBuilder("Lens facing value: "), " is invalid", this.mLensFacing));
            }
            int i2 = this.mSensorOrientation;
            if (i2 == 0 || i2 == 90 || i2 == 180 || i2 == 270) {
                return new ViewfinderSurfaceRequest(this.mResolution, i, i2, this.mImplementationMode);
            }
            throw new IllegalArgumentException(j6.a.v(new StringBuilder("Sensor orientation value: "), " is invalid", this.mSensorOrientation));
        }

        @NonNull
        public Builder setImplementationMode(CameraViewfinder.ImplementationMode implementationMode) {
            this.mImplementationMode = implementationMode;
            return this;
        }

        @NonNull
        public Builder setLensFacing(int i) {
            this.mLensFacing = i;
            return this;
        }

        @NonNull
        public Builder setSensorOrientation(int i) {
            this.mSensorOrientation = i;
            return this;
        }
    }

    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(@NonNull String str, @NonNull Throwable th10) {
            super(str, th10);
        }
    }

    public static abstract class Result {
        @NonNull
        public static Result of(int i, @NonNull Surface surface) {
            return new AutoValue_ViewfinderSurfaceRequest_Result(i, surface);
        }

        public abstract int getResultCode();

        @NonNull
        public abstract Surface getSurface();
    }

    public ViewfinderSurfaceRequest(@NonNull Size size, int i, int i2, CameraViewfinder.ImplementationMode implementationMode) {
        this.mResolution = size;
        this.mLensFacing = i;
        this.mSensorOrientation = i2;
        this.mImplementationMode = implementationMode;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        final ListenableFuture future = CallbackToFutureAdapter.getFuture(new g(atomicReference, str, 0));
        final CallbackToFutureAdapter.Completer<Void> completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
        this.mRequestCancellationCompleter = completer;
        AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture<Void> future2 = CallbackToFutureAdapter.getFuture(new g(atomicReference2, str, 1));
        this.mSessionStatusFuture = future2;
        Futures.addCallback(future2, new FutureCallback<Void>() { // from class: androidx.camera.viewfinder.ViewfinderSurfaceRequest.1
            @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th10) {
                if (th10 instanceof RequestCancelledException) {
                    Preconditions.checkState(future.cancel(false));
                } else {
                    Preconditions.checkState(completer.set(null));
                }
            }

            @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
            public void onSuccess(Void r2) {
                Preconditions.checkState(completer.set(null));
            }
        }, CameraExecutors.directExecutor());
        final CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference2.get());
        AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture<Surface> future3 = CallbackToFutureAdapter.getFuture(new g(atomicReference3, str, 2));
        this.mSurfaceFuture = future3;
        this.mSurfaceCompleter = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference3.get());
        ViewfinderSurface viewfinderSurface = new ViewfinderSurface() { // from class: androidx.camera.viewfinder.ViewfinderSurfaceRequest.2
            @Override // androidx.camera.viewfinder.internal.surface.ViewfinderSurface
            @NonNull
            public ListenableFuture<Surface> provideSurfaceAsync() {
                Logger.d("ViewfinderSurfaceRequest", "mInternalViewfinderSurface + " + ViewfinderSurfaceRequest.this.mInternalViewfinderSurface + " provideSurface");
                return ViewfinderSurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalViewfinderSurface = viewfinderSurface;
        final ListenableFuture<Void> terminationFuture = viewfinderSurface.getTerminationFuture();
        Futures.addCallback(future3, new FutureCallback<Surface>() { // from class: androidx.camera.viewfinder.ViewfinderSurfaceRequest.3
            @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th10) {
                if (th10 instanceof CancellationException) {
                    Preconditions.checkState(completer2.setException(new RequestCancelledException(v0.a.i(new StringBuilder(), str, " cancelled."), th10)));
                } else {
                    completer2.set(null);
                }
            }

            @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
            public void onSuccess(Surface surface) {
                Futures.propagate(terminationFuture, completer2);
            }
        }, CameraExecutors.directExecutor());
        terminationFuture.addListener(new a0.a(this, 2), CameraExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$1(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$2(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        Logger.d("ViewfinderSurfaceRequest", "mInternalViewfinderSurface + " + this.mInternalViewfinderSurface + " terminateFuture triggered");
        this.mSurfaceFuture.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$4(Consumer consumer, Surface surface) {
        consumer.accept(Result.of(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$5(Consumer consumer, Surface surface) {
        consumer.accept(Result.of(4, surface));
    }

    public void addRequestCancellationListener(@NonNull Executor executor, @NonNull Runnable runnable) {
        this.mRequestCancellationCompleter.addCancellationListener(runnable, executor);
    }

    public void finalize() throws Throwable {
        this.mInternalViewfinderSurface.close();
        super.finalize();
    }

    public CameraViewfinder.ImplementationMode getImplementationMode() {
        return this.mImplementationMode;
    }

    public int getLensFacing() {
        return this.mLensFacing;
    }

    @NonNull
    public Size getResolution() {
        return this.mResolution;
    }

    public int getSensorOrientation() {
        return this.mSensorOrientation;
    }

    @NonNull
    public ViewfinderSurface getViewfinderSurface() {
        return this.mInternalViewfinderSurface;
    }

    public void markSurfaceSafeToRelease() {
        this.mInternalViewfinderSurface.close();
    }

    public void provideSurface(@NonNull final Surface surface, @NonNull Executor executor, @NonNull final Consumer<Result> consumer) {
        if (this.mSurfaceCompleter.set(surface) || this.mSurfaceFuture.isCancelled()) {
            Futures.addCallback(this.mSessionStatusFuture, new FutureCallback<Void>() { // from class: androidx.camera.viewfinder.ViewfinderSurfaceRequest.4
                @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
                public void onFailure(@NonNull Throwable th10) {
                    Preconditions.checkState(th10 instanceof RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th10);
                    consumer.accept(Result.of(1, surface));
                }

                @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
                public void onSuccess(Void r3) {
                    consumer.accept(Result.of(0, surface));
                }
            }, executor);
            return;
        }
        Preconditions.checkState(this.mSurfaceFuture.isDone());
        try {
            this.mSurfaceFuture.get();
            final int i = 0;
            executor.execute(new Runnable() { // from class: androidx.camera.viewfinder.h
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            ViewfinderSurfaceRequest.lambda$provideSurface$4(consumer, surface);
                            break;
                        default:
                            ViewfinderSurfaceRequest.lambda$provideSurface$5(consumer, surface);
                            break;
                    }
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            final int i2 = 1;
            executor.execute(new Runnable() { // from class: androidx.camera.viewfinder.h
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            ViewfinderSurfaceRequest.lambda$provideSurface$4(consumer, surface);
                            break;
                        default:
                            ViewfinderSurfaceRequest.lambda$provideSurface$5(consumer, surface);
                            break;
                    }
                }
            });
        }
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.setException(new ViewfinderSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}
