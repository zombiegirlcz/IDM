package md;

/* JADX INFO: loaded from: classes17.dex */
public final class t2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final t2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private v2 params_;
    private int version_;

    static {
        t2 t2Var = new t2();
        DEFAULT_INSTANCE = t2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(t2.class, t2Var);
    }

    public static t2 A(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (t2) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(t2 t2Var) {
        t2Var.version_ = 0;
    }

    public static void w(t2 t2Var, v2 v2Var) {
        t2Var.getClass();
        v2Var.getClass();
        t2Var.params_ = v2Var;
    }

    public static s2 z() {
        return (s2) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (r2.f204451a[a0Var.ordinal()]) {
            case 1:
                return new t2();
            case 2:
                return new s2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (t2.class) {
                    try {
                        zVar = PARSER;
                        if (zVar == null) {
                            zVar = new com.google.crypto.tink.shaded.protobuf.z();
                            PARSER = zVar;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return zVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final v2 x() {
        v2 v2Var = this.params_;
        return v2Var == null ? v2.v() : v2Var;
    }

    public final int y() {
        return this.version_;
    }
}
