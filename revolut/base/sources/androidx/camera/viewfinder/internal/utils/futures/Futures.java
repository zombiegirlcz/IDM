package androidx.camera.viewfinder.internal.utils.futures;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.camera.viewfinder.internal.utils.executor.CameraExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import b1.a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Futures {
    private static final Function<?, ?> IDENTITY_FUNCTION = new Function<Object, Object>() { // from class: androidx.camera.viewfinder.internal.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj2) {
            return obj2;
        }
    };

    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e) {
                e = e;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e4) {
                this.mCallback.onFailure(e4.getCause());
            }
        }

        @NonNull
        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    public static <V> void addCallback(@NonNull ListenableFuture<V> listenableFuture, @NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    public static <V> V getDone(@NonNull Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(@NonNull Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th10) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th10;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$nonCancellationPropagating$0(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer) throws Exception {
        propagateTransform(false, listenableFuture, IDENTITY_FUNCTION, completer, CameraExecutors.directExecutor());
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }

    @NonNull
    public static <V> ListenableFuture<V> nonCancellationPropagating(@NonNull ListenableFuture<V> listenableFuture) {
        Preconditions.checkNotNull(listenableFuture);
        return listenableFuture.isDone() ? listenableFuture : CallbackToFutureAdapter.getFuture(new a(0, listenableFuture));
    }

    public static <V> void propagate(@NonNull ListenableFuture<V> listenableFuture, @NonNull CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(listenableFuture, IDENTITY_FUNCTION, completer, CameraExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(@NonNull ListenableFuture<I> listenableFuture, @NonNull Function<? super I, ? extends O> function, @NonNull CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        propagateTransform(true, listenableFuture, function, completer, executor);
    }

    private static <I, O> void propagateTransform(boolean z, @NonNull final ListenableFuture<I> listenableFuture, @NonNull final Function<? super I, ? extends O> function, @NonNull final CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        Preconditions.checkNotNull(listenableFuture);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(completer);
        Preconditions.checkNotNull(executor);
        addCallback(listenableFuture, new FutureCallback<I>() { // from class: androidx.camera.viewfinder.internal.utils.futures.Futures.3
            @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
            public void onFailure(Throwable th10) {
                completer.setException(th10);
            }

            @Override // androidx.camera.viewfinder.internal.utils.futures.FutureCallback
            public void onSuccess(I i) {
                try {
                    completer.set(function.apply(i));
                } catch (Throwable th10) {
                    completer.setException(th10);
                }
            }
        }, executor);
        if (z) {
            completer.addCancellationListener(new Runnable() { // from class: androidx.camera.viewfinder.internal.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    listenableFuture.cancel(true);
                }
            }, CameraExecutors.directExecutor());
        }
    }
}
