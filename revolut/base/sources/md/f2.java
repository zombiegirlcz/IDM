package md;

/* JADX INFO: loaded from: classes17.dex */
public final class f2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final f2 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private v1 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        f2 f2Var = new f2();
        DEFAULT_INSTANCE = f2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(f2.class, f2Var);
    }

    public static e2 E() {
        return (e2) DEFAULT_INSTANCE.g();
    }

    public static void v(f2 f2Var, v1 v1Var) {
        f2Var.getClass();
        f2Var.keyData_ = v1Var;
    }

    public static void w(f2 f2Var, w2 w2Var) {
        f2Var.getClass();
        f2Var.outputPrefixType_ = w2Var.getNumber();
    }

    public static void x(f2 f2Var, w1 w1Var) {
        f2Var.getClass();
        f2Var.status_ = w1Var.getNumber();
    }

    public static void y(f2 f2Var, int i) {
        f2Var.keyId_ = i;
    }

    public final int A() {
        return this.keyId_;
    }

    public final w2 B() {
        w2 w2VarA = w2.a(this.outputPrefixType_);
        return w2VarA == null ? w2.UNRECOGNIZED : w2VarA;
    }

    public final w1 C() {
        int i = this.status_;
        w1 w1Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : w1.DESTROYED : w1.DISABLED : w1.ENABLED : w1.UNKNOWN_STATUS;
        return w1Var == null ? w1.UNRECOGNIZED : w1Var;
    }

    public final boolean D() {
        return this.keyData_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (c2.f204431a[a0Var.ordinal()]) {
            case 1:
                return new f2();
            case 2:
                return new e2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (f2.class) {
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

    public final v1 z() {
        v1 v1Var = this.keyData_;
        return v1Var == null ? v1.y() : v1Var;
    }
}
