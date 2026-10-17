package org.bouncycastle.crypto.hash2curve;

import java.lang.reflect.Array;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class HashToField {
    protected int L;
    protected final ECCurve curve;
    protected final byte[] dst;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f228403m;
    protected final MessageExpansion messageExpansion;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected BigInteger f228404p;

    public HashToField(byte[] bArr, ECCurve eCCurve, MessageExpansion messageExpansion, int i) {
        this.dst = bArr;
        this.curve = eCCurve;
        this.L = i;
        this.messageExpansion = messageExpansion;
        this.f228404p = eCCurve.getField().getCharacteristic();
        this.f228403m = eCCurve.getField().getDimension();
    }

    public BigInteger[][] process(byte[] bArr, int i) {
        byte[] bArrExpandMessage = this.messageExpansion.expandMessage(bArr, this.dst, this.f228403m * i * this.L);
        BigInteger[][] bigIntegerArr = (BigInteger[][]) Array.newInstance((Class<?>) BigInteger.class, i, this.f228403m);
        for (int i2 = 0; i2 < i; i2++) {
            BigInteger[] bigIntegerArr2 = new BigInteger[this.f228403m];
            int i3 = 0;
            while (true) {
                int i5 = this.f228403m;
                if (i3 < i5) {
                    int i6 = this.L;
                    int i21 = ((i5 * i2) + i3) * i6;
                    bigIntegerArr2[i3] = H2cUtils.os2ip(Arrays.copyOfRange(bArrExpandMessage, i21, i6 + i21)).mod(this.f228404p);
                    i3++;
                }
            }
            bigIntegerArr[i2] = bigIntegerArr2;
        }
        return bigIntegerArr;
    }
}
