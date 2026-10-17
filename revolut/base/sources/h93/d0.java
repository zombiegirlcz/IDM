package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 {
    private d0() {
    }

    public static e0 a(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        for (e0 e0Var : e0.values()) {
            if (Intrinsics.f(e0Var.name(), type)) {
                return e0Var;
            }
        }
        return null;
    }
}
