package md;

/* JADX INFO: loaded from: classes17.dex */
public final class k2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final k2 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        k2 k2Var = new k2();
        DEFAULT_INSTANCE = k2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(k2.class, k2Var);
    }

    public static j2 A() {
        return (j2) DEFAULT_INSTANCE.g();
    }

    public static void v(k2 k2Var, String str) {
        k2Var.getClass();
        str.getClass();
        k2Var.typeUrl_ = str;
    }

    public static void w(k2 k2Var, w2 w2Var) {
        k2Var.getClass();
        k2Var.outputPrefixType_ = w2Var.getNumber();
    }

    public static void x(k2 k2Var, w1 w1Var) {
        k2Var.getClass();
        k2Var.status_ = w1Var.getNumber();
    }

    public static void y(k2 k2Var, int i) {
        k2Var.keyId_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (h2.f204439a[a0Var.ordinal()]) {
            case 1:
                return new k2();
            case 2:
                return new j2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (k2.class) {
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

    public final int z() {
        return this.keyId_;
    }
}
