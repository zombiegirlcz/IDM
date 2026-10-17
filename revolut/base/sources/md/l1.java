package md;

/* JADX INFO: loaded from: classes17.dex */
public final class l1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final l1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.j keyValue_ = com.google.crypto.tink.shaded.protobuf.j.f49370b;
    private r1 params_;
    private int version_;

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(l1.class, l1Var);
    }

    public static k1 C() {
        return (k1) DEFAULT_INSTANCE.g();
    }

    public static l1 D(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (l1) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(l1 l1Var) {
        l1Var.version_ = 0;
    }

    public static void w(l1 l1Var, r1 r1Var) {
        l1Var.getClass();
        r1Var.getClass();
        l1Var.params_ = r1Var;
    }

    public static void x(l1 l1Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        l1Var.getClass();
        l1Var.keyValue_ = iVar;
    }

    public static l1 y() {
        return DEFAULT_INSTANCE;
    }

    public final r1 A() {
        r1 r1Var = this.params_;
        return r1Var == null ? r1.x() : r1Var;
    }

    public final int B() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (j1.f204441a[a0Var.ordinal()]) {
            case 1:
                return new l1();
            case 2:
                return new k1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (l1.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.j z() {
        return this.keyValue_;
    }
}
