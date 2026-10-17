package md;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final a0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.j keyValue_ = com.google.crypto.tink.shaded.protobuf.j.f49370b;
    private g0 params_;
    private int version_;

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(a0.class, a0Var);
    }

    public static z B() {
        return (z) DEFAULT_INSTANCE.g();
    }

    public static a0 C(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (a0) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(a0 a0Var) {
        a0Var.version_ = 0;
    }

    public static void w(a0 a0Var, g0 g0Var) {
        a0Var.getClass();
        g0Var.getClass();
        a0Var.params_ = g0Var;
    }

    public static void x(a0 a0Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        a0Var.getClass();
        a0Var.keyValue_ = iVar;
    }

    public final int A() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (y.f204460a[a0Var.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new z(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (a0.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.j y() {
        return this.keyValue_;
    }

    public final g0 z() {
        g0 g0Var = this.params_;
        return g0Var == null ? g0.w() : g0Var;
    }
}
