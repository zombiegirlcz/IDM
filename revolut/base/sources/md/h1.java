package md;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes17.dex */
public final class h1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final h1 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER;
    private com.google.crypto.tink.shaded.protobuf.j encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.j.f49370b;
    private l2 keysetInfo_;

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(h1.class, h1Var);
    }

    public static void v(h1 h1Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        h1Var.getClass();
        h1Var.encryptedKeyset_ = iVar;
    }

    public static void w(h1 h1Var, l2 l2Var) {
        h1Var.getClass();
        h1Var.keysetInfo_ = l2Var;
    }

    public static g1 y() {
        return (g1) DEFAULT_INSTANCE.g();
    }

    public static h1 z(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.q qVar) throws InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.b0 b0VarR = com.google.crypto.tink.shaded.protobuf.b0.r(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.l(byteArrayInputStream), qVar);
        com.google.crypto.tink.shaded.protobuf.b0.f(b0VarR);
        return (h1) b0VarR;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (f1.f204436a[a0Var.ordinal()]) {
            case 1:
                return new h1();
            case 2:
                return new g1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (h1.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.j x() {
        return this.encryptedKeyset_;
    }
}
