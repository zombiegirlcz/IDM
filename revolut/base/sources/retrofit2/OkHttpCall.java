package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.h;
import mmm.k;
import mmm.v;
import mmm.v0;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ulm.b1;
import ulm.j1;
import ulm.o;
import ulm.p;

/* JADX INFO: loaded from: classes13.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final o callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private final Object instance;
    private okhttp3.Call rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final k delegateSource;
        IOException thrownException;

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = u1.c(new v(responseBody.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // mmm.v, mmm.s0
                public long read(h hVar, long j2) throws IOException {
                    try {
                        return super.read(hVar, j2);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public b1 contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public k source() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final b1 contentType;

        public NoContentResponseBody(b1 b1Var, long j2) {
            this.contentType = b1Var;
            this.contentLength = j2;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public b1 contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public k source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object obj2, Object[] objArr, o oVar, Converter<ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.instance = obj2;
        this.args = objArr;
        this.callFactory = oVar;
        this.responseConverter = converter;
    }

    private okhttp3.Call createRawCall() throws IOException {
        return ((OkHttpClient) this.callFactory).b(this.requestFactory.create(this.instance, this.args));
    }

    private okhttp3.Call getRawCall() throws IOException {
        okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call;
        }
        Throwable th10 = this.creationFailure;
        if (th10 != null) {
            if (th10 instanceof IOException) {
                throw ((IOException) th10);
            }
            if (th10 instanceof RuntimeException) {
                throw ((RuntimeException) th10);
            }
            throw ((Error) th10);
        }
        try {
            okhttp3.Call callCreateRawCall = createRawCall();
            this.rawCall = callCreateRawCall;
            return callCreateRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        okhttp3.Call call;
        Throwable th10;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                call = this.rawCall;
                th10 = this.creationFailure;
                if (call == null && th10 == null) {
                    try {
                        okhttp3.Call callCreateRawCall = createRawCall();
                        this.rawCall = callCreateRawCall;
                        call = callCreateRawCall;
                    } catch (Throwable th11) {
                        th10 = th11;
                        Utils.throwIfFatal(th10);
                        this.creationFailure = th10;
                    }
                }
            } catch (Throwable th12) {
                throw th12;
            }
        }
        if (th10 != null) {
            callback.onFailure(this, th10);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new p() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th13) {
                try {
                    callback.onFailure(OkHttpCall.this, th13);
                } catch (Throwable th14) {
                    Utils.throwIfFatal(th14);
                    th14.printStackTrace();
                }
            }

            @Override // ulm.p
            public void onFailure(okhttp3.Call call2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // ulm.p
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response));
                    } catch (Throwable th13) {
                        Utils.throwIfFatal(th13);
                        th13.printStackTrace();
                    }
                } catch (Throwable th14) {
                    Utils.throwIfFatal(th14);
                    callFailure(th14);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(FirebasePerfOkHttpClient.execute(rawCall));
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.Call call = this.rawCall;
                if (call == null || !call.isCanceled()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(okhttp3.Response response) throws IOException {
        ResponseBody responseBody = response.f226090g;
        Response.a aVarG = response.g();
        NoContentResponseBody body = new NoContentResponseBody(responseBody.contentType(), responseBody.contentLength());
        Intrinsics.checkNotNullParameter(body, "body");
        aVarG.f226102g = body;
        okhttp3.Response responseA = aVarG.a();
        int i = responseA.d;
        if (i < 200 || i >= 300) {
            try {
                return Response.error(Utils.buffer(responseBody), responseA);
            } finally {
                responseBody.close();
            }
        }
        if (i == 204 || i == 205) {
            responseBody.close();
            return Response.success((Object) null, responseA);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(responseBody);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), responseA);
        } catch (RuntimeException e) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public synchronized j1 request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized v0 timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }
}
