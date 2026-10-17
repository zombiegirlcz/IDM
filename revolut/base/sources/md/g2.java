package md;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class g2 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final g2 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.f0 key_ = com.google.crypto.tink.shaded.protobuf.e1.d;
    private int primaryKeyId_;

    static {
        g2 g2Var = new g2();
        DEFAULT_INSTANCE = g2Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(g2.class, g2Var);
    }

    public static d2 B() {
        return (d2) DEFAULT_INSTANCE.g();
    }

    public static g2 C(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.q qVar) throws InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.b0 b0VarR = com.google.crypto.tink.shaded.protobuf.b0.r(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.l(byteArrayInputStream), qVar);
        com.google.crypto.tink.shaded.protobuf.b0.f(b0VarR);
        return (g2) b0VarR;
    }

    public static g2 D(byte[] bArr, com.google.crypto.tink.shaded.protobuf.q qVar) {
        g2 g2Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        com.google.crypto.tink.shaded.protobuf.b0 b0VarP = g2Var.p();
        try {
            com.google.crypto.tink.shaded.protobuf.d1 d1Var = com.google.crypto.tink.shaded.protobuf.d1.f49352c;
            d1Var.getClass();
            com.google.crypto.tink.shaded.protobuf.g1 g1VarA = d1Var.a(b0VarP.getClass());
            com.google.crypto.tink.shaded.protobuf.d dVar = new com.google.crypto.tink.shaded.protobuf.d();
            qVar.getClass();
            g1VarA.a(b0VarP, bArr, 0, length, dVar);
            g1VarA.makeImmutable(b0VarP);
            com.google.crypto.tink.shaded.protobuf.b0.f(b0VarP);
            return (g2) b0VarP;
        } catch (InvalidProtocolBufferException e) {
            if (e.f49345a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4.getMessage(), e4);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static void v(g2 g2Var, int i) {
        g2Var.primaryKeyId_ = i;
    }

    public static void w(g2 g2Var, f2 f2Var) {
        g2Var.getClass();
        com.google.crypto.tink.shaded.protobuf.f0 f0Var = g2Var.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.b) f0Var).f49346a) {
            int size = f0Var.size();
            g2Var.key_ = f0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        g2Var.key_.add(f2Var);
    }

    public final int A() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (c2.f204431a[a0Var.ordinal()]) {
            case 1:
                return new g2();
            case 2:
                return new d2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", f2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (g2.class) {
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

    public final f2 x(int i) {
        return (f2) this.key_.get(i);
    }

    public final int y() {
        return this.key_.size();
    }

    public final List z() {
        return this.key_;
    }
}
