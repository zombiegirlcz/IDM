package md;

/* JADX INFO: loaded from: classes17.dex */
public final class q2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final q2 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER;
    private String keyUri_ = "";

    static {
        q2 q2Var = new q2();
        DEFAULT_INSTANCE = q2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(q2.class, q2Var);
    }

    public static q2 v() {
        return DEFAULT_INSTANCE;
    }

    public static q2 x(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (q2) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (p2.f204449a[a0Var.ordinal()]) {
            case 1:
                return new q2();
            case 2:
                return new d1(DEFAULT_INSTANCE, 2);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (q2.class) {
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

    public final String w() {
        return this.keyUri_;
    }
}
