package akl;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {
    private j0() {
    }

    public static k0 a(String str) {
        if (str == null) {
            return null;
        }
        k0 k0Var = k0.INITIATED;
        if (str.equals(k0Var.a())) {
            return k0Var;
        }
        k0 k0Var2 = k0.AWAITING_REVIEW;
        if (str.equals(k0Var2.a())) {
            return k0Var2;
        }
        k0 k0Var3 = k0.SIGN_IN_WITH_ACCOUNT;
        if (str.equals(k0Var3.a())) {
            return k0Var3;
        }
        throw new IllegalStateException("Unexpected value: ".concat(str).toString());
    }
}
