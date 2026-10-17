package rlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import qlm.h1;
import qlm.j0;
import qlm.v1;
import slm.h0;
import slm.i0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f255110a;

    static {
        nlm.a.d(t0.f186434a);
        f255110a = h1.a("kotlinx.serialization.json.JsonUnquotedLiteral", v1.f247718a);
    }

    public static final kotlinx.serialization.json.b a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new p(bool, false, null);
    }

    public static final kotlinx.serialization.json.b b(Number number) {
        return number == null ? JsonNull.INSTANCE : new p(number, false, null);
    }

    public static final kotlinx.serialization.json.b c(String str) {
        return str == null ? JsonNull.INSTANCE : new p(str, true, null);
    }

    public static final kotlinx.serialization.json.b d(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        JsonNull.INSTANCE.getClass();
        if (!str.equals("null")) {
            return new p(str, false, f255110a);
        }
        Intrinsics.checkNotNullParameter("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive", "message");
        Intrinsics.checkNotNullParameter("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive", "message");
        throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
    }

    public static final void e(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + o0.f186429a.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean f(kotlinx.serialization.json.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strA = bVar.a();
        String[] strArr = i0.f264265a;
        Intrinsics.checkNotNullParameter(strA, "<this>");
        if (a0.z(strA, "true", true)) {
            return Boolean.TRUE;
        }
        if (a0.z(strA, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String g(kotlinx.serialization.json.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof JsonNull) {
            return null;
        }
        return bVar.a();
    }

    public static final int h(kotlinx.serialization.json.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        try {
            long jM = m(bVar);
            if (-2147483648L <= jM && jM <= 2147483647L) {
                return (int) jM;
            }
            throw new NumberFormatException(bVar.a() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer i(kotlinx.serialization.json.b bVar) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        try {
            lValueOf = Long.valueOf(m(bVar));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final kotlinx.serialization.json.a j(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        kotlinx.serialization.json.a aVar = jsonElement instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) jsonElement : null;
        if (aVar != null) {
            return aVar;
        }
        e(jsonElement, "JsonArray");
        throw null;
    }

    public static final JsonObject k(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        e(jsonElement, "JsonObject");
        throw null;
    }

    public static final kotlinx.serialization.json.b l(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        kotlinx.serialization.json.b bVar = jsonElement instanceof kotlinx.serialization.json.b ? (kotlinx.serialization.json.b) jsonElement : null;
        if (bVar != null) {
            return bVar;
        }
        e(jsonElement, "JsonPrimitive");
        throw null;
    }

    public static final long m(kotlinx.serialization.json.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        h0 h0Var = new h0(bVar.a());
        long jI = h0Var.i();
        if (h0Var.f() == 10) {
            return jI;
        }
        int i = h0Var.f264232a;
        int i2 = i - 1;
        String str = h0Var.e;
        slm.a.r(h0Var, p.a.p("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
