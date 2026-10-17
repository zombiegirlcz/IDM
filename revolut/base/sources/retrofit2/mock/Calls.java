package retrofit2.mock;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import mmm.v0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ulm.i1;
import ulm.j1;

/* JADX INFO: loaded from: classes14.dex */
public final class Calls {

    public static final class DeferredCall<T> implements Call<T> {
        private final Callable<Call<T>> callable;
        private Call<T> delegate;

        public DeferredCall(Callable<Call<T>> callable) {
            this.callable = callable;
        }

        private synchronized Call<T> getDelegate() {
            Call<T> callFailure;
            callFailure = this.delegate;
            if (callFailure == null) {
                try {
                    callFailure = this.callable.call();
                } catch (Exception e) {
                    callFailure = Calls.failure(e);
                }
                this.delegate = callFailure;
            }
            return callFailure;
        }

        @Override // retrofit2.Call
        public void cancel() {
            getDelegate().cancel();
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            getDelegate().enqueue(callback);
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            return getDelegate().execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return getDelegate().isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return getDelegate().isExecuted();
        }

        @Override // retrofit2.Call
        public j1 request() {
            return getDelegate().request();
        }

        @Override // retrofit2.Call
        public v0 timeout() {
            return getDelegate().timeout();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new DeferredCall(this.callable);
        }
    }

    public static final class FakeCall<T> implements Call<T> {
        private final Throwable error;
        private final Response<T> response;
        private final AtomicBoolean canceled = new AtomicBoolean();
        private final AtomicBoolean executed = new AtomicBoolean();

        public FakeCall(Response<T> response, Throwable th10) {
            if ((response == null) == (th10 == null)) {
                throw new AssertionError("Only one of response or error can be set.");
            }
            this.response = response;
            this.error = th10;
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Throwable;>(Ljava/lang/Throwable;)TT;^TT; */
        private static Throwable sneakyThrow(Throwable th10) throws Throwable {
            throw th10;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.canceled.set(true);
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            if (callback == null) {
                throw new NullPointerException("callback == null");
            }
            if (!this.executed.compareAndSet(false, true)) {
                throw new IllegalStateException("Already executed");
            }
            if (this.canceled.get()) {
                callback.onFailure(this, new IOException("canceled"));
                return;
            }
            Response<T> response = this.response;
            if (response != null) {
                callback.onResponse(this, response);
            } else {
                callback.onFailure(this, this.error);
            }
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            if (!this.executed.compareAndSet(false, true)) {
                throw new IllegalStateException("Already executed");
            }
            if (this.canceled.get()) {
                throw new IOException("canceled");
            }
            Response<T> response = this.response;
            if (response != null) {
                return response;
            }
            throw ((Error) sneakyThrow(this.error));
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.canceled.get();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.executed.get();
        }

        @Override // retrofit2.Call
        public j1 request() {
            Response<T> response = this.response;
            if (response != null) {
                return response.raw().f226087a;
            }
            i1 i1Var = new i1();
            i1Var.e("http://localhost");
            return new j1(i1Var);
        }

        @Override // retrofit2.Call
        public v0 timeout() {
            return v0.d;
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new FakeCall(this.response, this.error);
        }
    }

    private Calls() {
        throw new AssertionError("No instances.");
    }

    public static <T> Call<T> defer(Callable<Call<T>> callable) {
        return new DeferredCall(callable);
    }

    public static <T> Call<T> failure(IOException iOException) {
        return new FakeCall(null, iOException);
    }

    public static <T> Call<T> response(T t2) {
        return new FakeCall(Response.success(t2), null);
    }

    public static <T> Call<T> failure(Throwable th10) {
        return new FakeCall(null, th10);
    }

    public static <T> Call<T> response(Response<T> response) {
        return new FakeCall(response, null);
    }
}
