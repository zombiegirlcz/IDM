package bd;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import kl.t1;

/* JADX INFO: loaded from: classes17.dex */
public final class v extends b {
    public static v b(j jVar, t1 t1Var, Integer num) throws GeneralSecurityException {
        od.a aVar = (od.a) t1Var.f185240b;
        j jVar2 = j.f14482n;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar.f224252a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f224252a.length);
        }
        if (jVar == jVar2) {
            od.a.a(new byte[0]);
        } else if (jVar == j.f14481m) {
            od.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.f14480l) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            od.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new v();
    }
}
