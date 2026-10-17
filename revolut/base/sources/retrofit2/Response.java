package retrofit2;

import a0.d;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.OkHttpCall;
import ulm.h1;
import ulm.i1;
import ulm.j1;
import ulm.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class Response<T> {
    private final T body;
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    private Response(okhttp3.Response response, T t2, ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t2;
        this.errorBody = responseBody;
    }

    public static <T> Response<T> error(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i < 400) {
            throw new IllegalArgumentException(d.n("code < 400: ", i));
        }
        Response.a aVar = new Response.a();
        OkHttpCall.NoContentResponseBody body = new OkHttpCall.NoContentResponseBody(responseBody.contentType(), responseBody.contentLength());
        Intrinsics.checkNotNullParameter(body, "body");
        aVar.f226102g = body;
        aVar.f226101c = i;
        Intrinsics.checkNotNullParameter("Response.error()", "message");
        aVar.d = "Response.error()";
        aVar.d(h1.HTTP_1_1);
        i1 i1Var = new i1();
        i1Var.e("http://localhost/");
        j1 request = new j1(i1Var);
        Intrinsics.checkNotNullParameter(request, "request");
        aVar.f226099a = request;
        return error(responseBody, aVar.a());
    }

    public static <T> Response<T> success(T t2) {
        Response.a aVar = new Response.a();
        aVar.f226101c = 200;
        Intrinsics.checkNotNullParameter("OK", "message");
        aVar.d = "OK";
        aVar.d(h1.HTTP_1_1);
        i1 i1Var = new i1();
        i1Var.e("http://localhost/");
        j1 request = new j1(i1Var);
        Intrinsics.checkNotNullParameter(request, "request");
        aVar.f226099a = request;
        return success(t2, aVar.a());
    }

    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.d;
    }

    public ResponseBody errorBody() {
        return this.errorBody;
    }

    public u0 headers() {
        return this.rawResponse.f;
    }

    public boolean isSuccessful() {
        return this.rawResponse.f226097q;
    }

    public String message() {
        return this.rawResponse.f226089c;
    }

    public okhttp3.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i, T t2) {
        if (i >= 200 && i < 300) {
            Response.a aVar = new Response.a();
            aVar.f226101c = i;
            Intrinsics.checkNotNullParameter("Response.success()", "message");
            aVar.d = "Response.success()";
            aVar.d(h1.HTTP_1_1);
            i1 i1Var = new i1();
            i1Var.e("http://localhost/");
            j1 request = new j1(i1Var);
            Intrinsics.checkNotNullParameter(request, "request");
            aVar.f226099a = request;
            return success(t2, aVar.a());
        }
        throw new IllegalArgumentException(d.n("code < 200 or >= 300: ", i));
    }

    public static <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.f226097q) {
            return new Response<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(T t2, u0 u0Var) {
        Objects.requireNonNull(u0Var, "headers == null");
        Response.a aVar = new Response.a();
        aVar.f226101c = 200;
        Intrinsics.checkNotNullParameter("OK", "message");
        aVar.d = "OK";
        aVar.d(h1.HTTP_1_1);
        aVar.c(u0Var);
        i1 i1Var = new i1();
        i1Var.e("http://localhost/");
        j1 request = new j1(i1Var);
        Intrinsics.checkNotNullParameter(request, "request");
        aVar.f226099a = request;
        return success(t2, aVar.a());
    }

    public static <T> Response<T> success(T t2, okhttp3.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.f226097q) {
            return new Response<>(response, t2, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
