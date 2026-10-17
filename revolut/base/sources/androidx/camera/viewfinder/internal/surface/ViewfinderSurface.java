package androidx.camera.viewfinder.internal.surface;

import a05.a;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.viewfinder.internal.utils.Logger;
import androidx.camera.viewfinder.internal.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ViewfinderSurface {
    private CallbackToFutureAdapter.Completer<Void> mTerminationCompleter;

    @NonNull
    private final Object mLock = new Object();
    private boolean mClosed = false;

    @NonNull
    private final ListenableFuture<Void> mTerminationFuture = CallbackToFutureAdapter.getFuture(new a(this, 18));

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(@NonNull String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            this.mTerminationCompleter = completer;
        }
        return "ViewfinderSurface-termination(" + this + ")";
    }

    public void close() {
        CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    completer = null;
                } else {
                    this.mClosed = true;
                    completer = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                    Logger.d("ViewfinderSurface", "surface closed,  closed=true " + this);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    @NonNull
    public final ListenableFuture<Surface> getSurface() {
        return provideSurfaceAsync();
    }

    @NonNull
    public ListenableFuture<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    @NonNull
    public abstract ListenableFuture<Surface> provideSurfaceAsync();
}
