package retrofit2.mock;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mmm.v0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ulm.j1;

/* JADX INFO: loaded from: classes14.dex */
final class BehaviorCall<T> implements Call<T> {
    final ExecutorService backgroundExecutor;
    final NetworkBehavior behavior;
    volatile boolean canceled;
    final Call<T> delegate;
    private boolean executed;
    private volatile Future<?> task;

    /* JADX INFO: renamed from: retrofit2.mock.BehaviorCall$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Callback val$callback;

        public AnonymousClass1(Callback callback) {
            this.val$callback = callback;
        }

        public boolean delaySleep() {
            long jCalculateDelay = BehaviorCall.this.behavior.calculateDelay(TimeUnit.MILLISECONDS);
            if (jCalculateDelay <= 0) {
                return true;
            }
            try {
                Thread.sleep(jCalculateDelay);
                return true;
            } catch (InterruptedException e) {
                this.val$callback.onFailure(BehaviorCall.this, new IOException("canceled", e));
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BehaviorCall.this.canceled) {
                this.val$callback.onFailure(BehaviorCall.this, new IOException("canceled"));
                return;
            }
            if (BehaviorCall.this.behavior.calculateIsFailure()) {
                if (delaySleep()) {
                    Callback callback = this.val$callback;
                    BehaviorCall behaviorCall = BehaviorCall.this;
                    callback.onFailure(behaviorCall, behaviorCall.behavior.failureException());
                    return;
                }
                return;
            }
            if (!BehaviorCall.this.behavior.calculateIsError()) {
                BehaviorCall.this.delegate.enqueue(new Callback<T>() { // from class: retrofit2.mock.BehaviorCall.1.1
                    @Override // retrofit2.Callback
                    public void onFailure(Call<T> call, Throwable th10) {
                        if (AnonymousClass1.this.delaySleep()) {
                            AnonymousClass1.this.val$callback.onFailure(call, th10);
                        }
                    }

                    @Override // retrofit2.Callback
                    public void onResponse(Call<T> call, Response<T> response) {
                        if (AnonymousClass1.this.delaySleep()) {
                            AnonymousClass1.this.val$callback.onResponse(call, response);
                        }
                    }
                });
            } else if (delaySleep()) {
                Callback callback2 = this.val$callback;
                BehaviorCall behaviorCall2 = BehaviorCall.this;
                callback2.onResponse(behaviorCall2, behaviorCall2.behavior.createErrorResponse());
            }
        }
    }

    public BehaviorCall(NetworkBehavior networkBehavior, ExecutorService executorService, Call<T> call) {
        this.behavior = networkBehavior;
        this.backgroundExecutor = executorService;
        this.delegate = call;
    }

    @Override // retrofit2.Call
    public void cancel() {
        this.canceled = true;
        Future<?> future = this.task;
        if (future != null) {
            future.cancel(true);
        }
    }

    @Override // retrofit2.Call
    public void enqueue(Callback<T> callback) {
        if (callback == null) {
            throw new NullPointerException("callback == null");
        }
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed");
            }
            this.executed = true;
        }
        this.task = this.backgroundExecutor.submit(new AnonymousClass1(callback));
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        enqueue(new Callback<T>() { // from class: retrofit2.mock.BehaviorCall.2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, Throwable th10) {
                atomicReference2.set(th10);
                countDownLatch.countDown();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, Response<T> response) {
                atomicReference.set(response);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            Response<T> response = (Response) atomicReference.get();
            if (response != null) {
                return response;
            }
            Throwable th10 = (Throwable) atomicReference2.get();
            if (th10 instanceof RuntimeException) {
                throw ((RuntimeException) th10);
            }
            if (th10 instanceof IOException) {
                throw ((IOException) th10);
            }
            throw new RuntimeException(th10);
        } catch (InterruptedException e) {
            throw new IOException("canceled", e);
        }
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    @Override // retrofit2.Call
    public j1 request() {
        return this.delegate.request();
    }

    @Override // retrofit2.Call
    public v0 timeout() {
        return this.delegate.timeout();
    }

    @Override // retrofit2.Call
    public Call<T> clone() {
        return new BehaviorCall(this.behavior, this.backgroundExecutor, this.delegate.clone());
    }
}
