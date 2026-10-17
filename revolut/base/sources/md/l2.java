package md;

/* JADX INFO: loaded from: classes17.dex */
public final class l2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final l2 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.f0 keyInfo_ = com.google.crypto.tink.shaded.protobuf.e1.d;
    private int primaryKeyId_;

    static {
        l2 l2Var = new l2();
        DEFAULT_INSTANCE = l2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(l2.class, l2Var);
    }

    public static void v(l2 l2Var, int i) {
        l2Var.primaryKeyId_ = i;
    }

    public static void w(l2 l2Var, k2 k2Var) {
        l2Var.getClass();
        com.google.crypto.tink.shaded.protobuf.f0 f0Var = l2Var.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.b) f0Var).f49346a) {
            int size = f0Var.size();
            l2Var.keyInfo_ = f0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        l2Var.keyInfo_.add(k2Var);
    }

    public static i2 y() {
        return (i2) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (h2.f204439a[a0Var.ordinal()]) {
            case 1:
                return new l2();
            case 2:
                return new i2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", k2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (l2.class) {
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

    public final k2 x() {
        return (k2) this.keyInfo_.get(0);
    }
}
