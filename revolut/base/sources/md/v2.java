package md;

/* JADX INFO: loaded from: classes17.dex */
public final class v2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final v2 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER;
    private z1 dekTemplate_;
    private String kekUri_ = "";

    static {
        v2 v2Var = new v2();
        DEFAULT_INSTANCE = v2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(v2.class, v2Var);
    }

    public static v2 v() {
        return DEFAULT_INSTANCE;
    }

    public static v2 z(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (v2) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (u2.f204455a[a0Var.ordinal()]) {
            case 1:
                return new v2();
            case 2:
                return new d1(DEFAULT_INSTANCE, 3);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (v2.class) {
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

    public final z1 w() {
        z1 z1Var = this.dekTemplate_;
        return z1Var == null ? z1.y() : z1Var;
    }

    public final String x() {
        return this.kekUri_;
    }

    public final boolean y() {
        return this.dekTemplate_ != null;
    }
}
