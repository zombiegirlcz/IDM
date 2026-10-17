package ulm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes14.dex */
public final class e1 {
    public static MultipartBody$Part a(u0 u0Var, RequestBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        if ((u0Var != null ? u0Var.a("Content-Type") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if ((u0Var != null ? u0Var.a("Content-Length") : null) == null) {
            return new MultipartBody$Part(u0Var, body);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    public static MultipartBody$Part b(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        RequestBody.Companion.getClass();
        return c(name, null, p1.b(value, null));
    }

    public static MultipartBody$Part c(String name, String str, RequestBody body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("form-data; name=");
        okhttp3.c.Companion.getClass();
        d1.a(name, sb6);
        if (str != null) {
            sb6.append("; filename=");
            d1.a(str, sb6);
        }
        String string = sb6.toString();
        s0 s0Var = new s0();
        s0Var.d("Content-Disposition", string);
        return a(ue8.c.e(s0Var), body);
    }
}
