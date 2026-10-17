package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u6 {
    private u6() {
    }

    public static v6 a(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        for (v6 v6Var : v6.values()) {
            if (kotlin.text.a0.z(v6Var.name(), state, true)) {
                return v6Var;
            }
        }
        return null;
    }
}
