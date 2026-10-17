package md;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends com.google.crypto.tink.shaded.protobuf.b0 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final l DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private r aesCtrKey_;
    private l1 hmacKey_;
    private int version_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.crypto.tink.shaded.protobuf.b0.s(l.class, lVar);
    }

    public static k B() {
        return (k) DEFAULT_INSTANCE.g();
    }

    public static l C(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (l) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(l lVar) {
        lVar.version_ = 0;
    }

    public static void w(l lVar, r rVar) {
        lVar.getClass();
        rVar.getClass();
        lVar.aesCtrKey_ = rVar;
    }

    public static void x(l lVar, l1 l1Var) {
        lVar.getClass();
        l1Var.getClass();
        lVar.hmacKey_ = l1Var;
    }

    public final int A() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (j.f204440a[a0Var.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new k(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (l.class) {
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

    public final r y() {
        r rVar = this.aesCtrKey_;
        return rVar == null ? r.y() : rVar;
    }

    public final l1 z() {
        l1 l1Var = this.hmacKey_;
        return l1Var == null ? l1.y() : l1Var;
    }
}
