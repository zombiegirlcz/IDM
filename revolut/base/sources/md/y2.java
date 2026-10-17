package md;

/* JADX INFO: loaded from: classes17.dex */
public final class y2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final y2 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER;
    private String configName_ = "";
    private com.google.crypto.tink.shaded.protobuf.f0 entry_ = com.google.crypto.tink.shaded.protobuf.e1.d;

    static {
        y2 y2Var = new y2();
        DEFAULT_INSTANCE = y2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(y2.class, y2Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (x2.f204459a[a0Var.ordinal()]) {
            case 1:
                return new y2();
            case 2:
                return new d1(DEFAULT_INSTANCE, 4);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", b2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (y2.class) {
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
}
