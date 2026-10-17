package md;

/* JADX INFO: loaded from: classes17.dex */
public final class o extends com.google.crypto.tink.shaded.protobuf.b0 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final o DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER;
    private u aesCtrKeyFormat_;
    private o1 hmacKeyFormat_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.crypto.tink.shaded.protobuf.b0.s(o.class, oVar);
    }

    public static o A(com.google.crypto.tink.shaded.protobuf.j jVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (o) com.google.crypto.tink.shaded.protobuf.b0.q(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static void v(o oVar, u uVar) {
        oVar.getClass();
        oVar.aesCtrKeyFormat_ = uVar;
    }

    public static void w(o oVar, o1 o1Var) {
        oVar.getClass();
        oVar.hmacKeyFormat_ = o1Var;
    }

    public static n z() {
        return (n) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (m.f204443a[a0Var.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new n(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (o.class) {
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

    public final u x() {
        u uVar = this.aesCtrKeyFormat_;
        return uVar == null ? u.x() : uVar;
    }

    public final o1 y() {
        o1 o1Var = this.hmacKeyFormat_;
        return o1Var == null ? o1.x() : o1Var;
    }
}
