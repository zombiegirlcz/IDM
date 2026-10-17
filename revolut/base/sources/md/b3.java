package md;

/* JADX INFO: loaded from: classes17.dex */
public final class b3 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final b3 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.j keyValue_ = com.google.crypto.tink.shaded.protobuf.j.f49370b;
    private int version_;

    static {
        b3 b3Var = new b3();
        DEFAULT_INSTANCE = b3Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(b3.class, b3Var);
    }

    public static b3 A(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (b3) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(b3 b3Var) {
        b3Var.version_ = 0;
    }

    public static void w(b3 b3Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        b3Var.getClass();
        b3Var.keyValue_ = iVar;
    }

    public static a3 z() {
        return (a3) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (z2.f204462a[a0Var.ordinal()]) {
            case 1:
                return new b3();
            case 2:
                return new a3(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (b3.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.j x() {
        return this.keyValue_;
    }

    public final int y() {
        return this.version_;
    }
}
