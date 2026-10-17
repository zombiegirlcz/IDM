package gkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 {
    private t0() {
    }

    public static u0 a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        u0 u0Var = u0.ACCESS_RECOVERY;
        if (value.equals(u0Var.a())) {
            return u0Var;
        }
        u0 u0Var2 = u0.EXTERNAL_CLIENT;
        if (value.equals(u0Var2.a())) {
            return u0Var2;
        }
        u0 u0Var3 = u0.OPERATION_BOUND_AUTHENTICATION;
        if (value.equals(u0Var3.a())) {
            return u0Var3;
        }
        u0 u0Var4 = u0.SIGN_IN;
        if (value.equals(u0Var4.a())) {
            return u0Var4;
        }
        u0 u0Var5 = u0.SIGN_IN_WITH_REVOLUT_ID;
        if (value.equals(u0Var5.a())) {
            return u0Var5;
        }
        throw new IllegalStateException(value.concat(" is not supported").toString());
    }
}
