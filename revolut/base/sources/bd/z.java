package bd;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import md.z1;

/* JADX INFO: loaded from: classes17.dex */
public final class z implements ad.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f14509c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f14510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd.b f14511b;

    public z(z1 z1Var, gd.b bVar) {
        this.f14510a = z1Var;
        this.f14511b = bVar;
    }

    @Override // ad.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        com.google.crypto.tink.shaded.protobuf.a aVarF;
        z1 z1Var = this.f14510a;
        AtomicReference atomicReference = ad.r.f3209a;
        synchronized (ad.r.class) {
            try {
                hd.e eVar = ((ad.f) ad.r.f3209a.get()).a(z1Var.A()).f3191a;
                Class cls = (Class) eVar.f151344b;
                if (!((Map) eVar.f151345c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + eVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) ad.r.f3211c.get(z1Var.A())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + z1Var.A());
                }
                com.google.crypto.tink.shaded.protobuf.j jVarB = z1Var.B();
                try {
                    cam.f fVarE = eVar.e();
                    com.google.crypto.tink.shaded.protobuf.a aVarZ = fVarE.z(jVarB);
                    fVarE.E(aVarZ);
                    aVarF = fVarE.f(aVarZ);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) eVar.e().f22677a).getName()), e);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        byte[] bArrD = aVarF.d();
        byte[] bArrA = this.f14511b.a(bArrD, f14509c);
        byte[] bArrA2 = ((ad.a) ad.r.c(this.f14510a.A(), com.google.crypto.tink.shaded.protobuf.j.c(0, bArrD.length, bArrD), ad.a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // ad.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrDecrypt = this.f14511b.decrypt(bArr3, f14509c);
            String strA = this.f14510a.A();
            AtomicReference atomicReference = ad.r.f3209a;
            com.google.crypto.tink.shaded.protobuf.i iVar = com.google.crypto.tink.shaded.protobuf.j.f49370b;
            return ((ad.a) ad.r.c(strA, com.google.crypto.tink.shaded.protobuf.j.c(0, bArrDecrypt.length, bArrDecrypt), ad.a.class)).decrypt(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
