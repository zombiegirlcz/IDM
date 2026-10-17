package md;

/* JADX INFO: loaded from: classes17.dex */
public final class o1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final o1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private r1 params_;
    private int version_;

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(o1.class, o1Var);
    }

    public static n1 A() {
        return (n1) DEFAULT_INSTANCE.g();
    }

    public static o1 B(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (o1) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(o1 o1Var, r1 r1Var) {
        o1Var.getClass();
        o1Var.params_ = r1Var;
    }

    public static void w(o1 o1Var, int i) {
        o1Var.keySize_ = i;
    }

    public static o1 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (m1.f204444a[a0Var.ordinal()]) {
            case 1:
                return new o1();
            case 2:
                return new n1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (o1.class) {
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

    public final int y() {
        return this.keySize_;
    }

    public final r1 z() {
        r1 r1Var = this.params_;
        return r1Var == null ? r1.x() : r1Var;
    }
}
