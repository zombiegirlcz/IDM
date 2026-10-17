package md;

/* JADX INFO: loaded from: classes17.dex */
public final class o2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final o2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private q2 params_;
    private int version_;

    static {
        o2 o2Var = new o2();
        DEFAULT_INSTANCE = o2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(o2.class, o2Var);
    }

    public static o2 A(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (o2) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(o2 o2Var) {
        o2Var.version_ = 0;
    }

    public static void w(o2 o2Var, q2 q2Var) {
        o2Var.getClass();
        q2Var.getClass();
        o2Var.params_ = q2Var;
    }

    public static n2 z() {
        return (n2) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (m2.f204445a[a0Var.ordinal()]) {
            case 1:
                return new o2();
            case 2:
                return new n2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (o2.class) {
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

    public final q2 x() {
        q2 q2Var = this.params_;
        return q2Var == null ? q2.v() : q2Var;
    }

    public final int y() {
        return this.version_;
    }
}
