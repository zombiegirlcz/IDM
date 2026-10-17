package md;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.j keyValue_ = com.google.crypto.tink.shaded.protobuf.j.f49370b;
    private x params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.crypto.tink.shaded.protobuf.b0.s(r.class, rVar);
    }

    public static q C() {
        return (q) DEFAULT_INSTANCE.g();
    }

    public static void v(r rVar) {
        rVar.version_ = 0;
    }

    public static void w(r rVar, x xVar) {
        rVar.getClass();
        xVar.getClass();
        rVar.params_ = xVar;
    }

    public static void x(r rVar, com.google.crypto.tink.shaded.protobuf.i iVar) {
        rVar.getClass();
        rVar.keyValue_ = iVar;
    }

    public static r y() {
        return DEFAULT_INSTANCE;
    }

    public final x A() {
        x xVar = this.params_;
        return xVar == null ? x.w() : xVar;
    }

    public final int B() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (p.f204447a[a0Var.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new q(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (r.class) {
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
