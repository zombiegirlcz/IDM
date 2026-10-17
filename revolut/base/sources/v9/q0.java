package v9;

import ch.qos.logback.core.CoreConstants;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public final class q0 extends p0 implements t9.h {
    public static final char[] e = "0123456789abcdef".toCharArray();
    public final Boolean d;

    public q0(Boolean bool) {
        super(UUID.class);
        this.d = bool;
    }

    public static final void r(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void s(char[] cArr, int i, int i2) {
        char[] cArr2 = e;
        cArr[i2] = cArr2[(i >> 12) & 15];
        cArr[i2 + 1] = cArr2[(i >> 8) & 15];
        cArr[i2 + 2] = cArr2[(i >> 4) & 15];
        cArr[i2 + 3] = cArr2[i & 15];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    @Override // t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r2, k9.d r3) {
        /*
            r1 = this;
            java.lang.Class r0 = r1.f286928a
            d9.p r2 = v9.o0.m(r2, r3, r0)
            if (r2 == 0) goto L18
            d9.o r2 = r2.f112315b
            d9.o r3 = d9.o.BINARY
            if (r2 != r3) goto L11
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L19
        L11:
            d9.o r3 = d9.o.STRING
            if (r2 != r3) goto L18
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.Boolean r3 = r1.d
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L27
            v9.q0 r3 = new v9.q0
            r3.<init>(r2)
            return r3
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.q0.a(k9.v, k9.d):k9.k");
    }

    @Override // v9.p0, k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        UUID uuid = (UUID) obj2;
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        boolean zBooleanValue;
        UUID uuid = (UUID) obj2;
        Boolean bool = this.d;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            hVar.getClass();
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            r((int) (mostSignificantBits >> 32), 0, bArr);
            r((int) mostSignificantBits, 4, bArr);
            r((int) (leastSignificantBits >> 32), 8, bArr);
            r((int) leastSignificantBits, 12, bArr);
            hVar.getClass();
            hVar.j(com.fasterxml.jackson.core.c.f26164a, bArr, 0, 16);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i = (int) (mostSignificantBits2 >> 32);
        s(cArr, i >> 16, 0);
        s(cArr, i, 4);
        cArr[8] = CoreConstants.DASH_CHAR;
        int i2 = (int) mostSignificantBits2;
        s(cArr, i2 >>> 16, 9);
        cArr[13] = CoreConstants.DASH_CHAR;
        s(cArr, i2, 14);
        cArr[18] = CoreConstants.DASH_CHAR;
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        s(cArr, (int) (leastSignificantBits2 >>> 48), 19);
        cArr[23] = CoreConstants.DASH_CHAR;
        s(cArr, (int) (leastSignificantBits2 >>> 32), 24);
        int i3 = (int) leastSignificantBits2;
        s(cArr, i3 >> 16, 28);
        s(cArr, i3, 32);
        hVar.C(cArr, 0, 36);
    }
}
