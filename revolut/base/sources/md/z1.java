package md;

/* JADX INFO: loaded from: classes17.dex */
public final class z1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final z1 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.j value_ = com.google.crypto.tink.shaded.protobuf.j.f49370b;

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(z1.class, z1Var);
    }

    public static y1 C() {
        return (y1) DEFAULT_INSTANCE.g();
    }

    public static void v(z1 z1Var, String str) {
        z1Var.getClass();
        str.getClass();
        z1Var.typeUrl_ = str;
    }

    public static void w(z1 z1Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        z1Var.getClass();
        z1Var.value_ = iVar;
    }

    public static void x(z1 z1Var, w2 w2Var) {
        z1Var.getClass();
        z1Var.outputPrefixType_ = w2Var.getNumber();
    }

    public static z1 y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.j B() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (x1.f204458a[a0Var.ordinal()]) {
            case 1:
                return new z1();
            case 2:
                return new y1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (z1.class) {
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

    public final w2 z() {
        w2 w2VarA = w2.a(this.outputPrefixType_);
        return w2VarA == null ? w2.UNRECOGNIZED : w2VarA;
    }
}
