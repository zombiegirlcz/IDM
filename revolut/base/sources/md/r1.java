package md;

/* JADX INFO: loaded from: classes17.dex */
public final class r1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final r1 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        r1 r1Var = new r1();
        DEFAULT_INSTANCE = r1Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(r1.class, r1Var);
    }

    public static q1 A() {
        return (q1) DEFAULT_INSTANCE.g();
    }

    public static void v(r1 r1Var, i1 i1Var) {
        r1Var.getClass();
        r1Var.hash_ = i1Var.getNumber();
    }

    public static void w(r1 r1Var, int i) {
        r1Var.tagSize_ = i;
    }

    public static r1 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (p1.f204448a[a0Var.ordinal()]) {
            case 1:
                return new r1();
            case 2:
                return new q1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (r1.class) {
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

    public final i1 y() {
        int i = this.hash_;
        i1 i1Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : i1.SHA224 : i1.SHA512 : i1.SHA256 : i1.SHA384 : i1.SHA1 : i1.UNKNOWN_HASH;
        return i1Var == null ? i1.UNRECOGNIZED : i1Var;
    }

    public final int z() {
        return this.tagSize_;
    }
}
