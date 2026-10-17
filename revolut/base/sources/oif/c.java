package oif;

import kotlinx.serialization.json.Json;
import nif.h4;
import nif.k2;
import nif.k3;
import nif.k4;
import nif.u0;
import nif.v3;
import nif.x2;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static String a(u0 u0Var) {
        if (u0Var == null || u0Var.a().isEmpty()) {
            return null;
        }
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return jsonA.c(u0.Companion.serializer(), u0Var);
    }

    public static String b(v3 v3Var) {
        if (v3Var == null) {
            return null;
        }
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return jsonA.c(v3.Companion.serializer(), v3Var);
    }

    public static String c(k2 k2Var) {
        if (k2Var == null) {
            return null;
        }
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return jsonA.c(k2.Companion.serializer(), k2Var);
    }

    public static String d(h4 h4Var) {
        if (h4Var == null || h4Var.a().isEmpty()) {
            return null;
        }
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return jsonA.c(h4.Companion.serializer(), h4Var);
    }

    public static String e(k4 k4Var) {
        if (k4Var == null || k4Var.a().isEmpty()) {
            return null;
        }
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return jsonA.c(k4.Companion.serializer(), k4Var);
    }

    public static String f(x2 x2Var) {
        if (x2Var == null || x2Var.a().isEmpty()) {
            return null;
        }
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return jsonA.c(x2.Companion.serializer(), x2Var);
    }

    public static String g(k3 k3Var) {
        if (k3Var == null) {
            return null;
        }
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return jsonA.c(k3.Companion.serializer(), k3Var);
    }
}
