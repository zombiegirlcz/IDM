package g1m;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import ulm.c0;

/* JADX INFO: loaded from: classes23.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f139728a;

    public b(c0 cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        this.f139728a = cookie;
    }

    public final String a() {
        StringBuilder sb6 = new StringBuilder();
        c0 c0Var = this.f139728a;
        sb6.append(c0Var.f ? "https" : "http");
        sb6.append("://");
        sb6.append(c0Var.d);
        sb6.append(c0Var.e);
        sb6.append('|');
        sb6.append(c0Var.f281072a);
        return sb6.toString();
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof b)) {
            return false;
        }
        c0 c0Var = ((b) obj2).f139728a;
        String str = c0Var.f281072a;
        c0 c0Var2 = this.f139728a;
        return Intrinsics.f(str, c0Var2.f281072a) && Intrinsics.f(c0Var.d, c0Var2.d) && Intrinsics.f(c0Var.e, c0Var2.e);
    }

    public final int hashCode() {
        c0 c0Var = this.f139728a;
        return ((((527 + c0Var.f281072a.hashCode()) * 31) + c0Var.d.hashCode()) * 31) + c0Var.e.hashCode();
    }

    public b(String serialized) throws JSONException {
        Intrinsics.checkNotNullParameter(serialized, "serialized");
        JSONObject jSONObject = new JSONObject(serialized);
        String name = jSONObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(name, "`object`.getString(\"name\")");
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.f(d0.F0(name).toString(), name)) {
            String value = jSONObject.getString("value");
            Intrinsics.checkNotNullExpressionValue(value, "`object`.getString(\"value\")");
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.f(d0.F0(value).toString(), value)) {
                long j2 = jSONObject.getLong("expiresAt");
                j2 = j2 <= 0 ? Long.MIN_VALUE : j2;
                j2 = j2 > 253402300799999L ? 253402300799999L : j2;
                String domain = jSONObject.getString("domain");
                Intrinsics.checkNotNullExpressionValue(domain, "`object`.getString(\"domain\")");
                Intrinsics.checkNotNullParameter(domain, "domain");
                String strC = vlm.g.c(domain);
                if (strC != null) {
                    String path = jSONObject.getString("path");
                    Intrinsics.checkNotNullExpressionValue(path, "`object`.getString(\"path\")");
                    Intrinsics.checkNotNullParameter(path, "path");
                    if (a0.H(path, "/", false)) {
                        this.f139728a = new c0(name, value, j2, strC, path, false, false, true, false, null);
                        return;
                    }
                    throw new IllegalArgumentException("path must start with '/'");
                }
                throw new IllegalArgumentException("unexpected domain: ".concat(domain));
            }
            throw new IllegalArgumentException("value is not trimmed");
        }
        throw new IllegalArgumentException("name is not trimmed");
    }
}
