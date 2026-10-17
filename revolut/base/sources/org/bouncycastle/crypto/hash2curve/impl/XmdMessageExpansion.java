package org.bouncycastle.crypto.hash2curve.impl;

import a0.d;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.hash2curve.H2cUtils;
import org.bouncycastle.crypto.hash2curve.MessageExpansion;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class XmdMessageExpansion implements MessageExpansion {
    private final Digest digest;
    private final int hashOutputBytes;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f228413s;

    public XmdMessageExpansion(Digest digest, int i, int i2) {
        this.digest = digest;
        this.f228413s = i2;
        int digestSize = digest.getDigestSize();
        this.hashOutputBytes = digestSize;
        if (digestSize < ((int) Math.ceil(((double) (i * 2)) / 8.0d))) {
            throw new IllegalArgumentException("Hash output size is too small for the security level of the curve");
        }
    }

    private static int getInputBlockSize(ExtendedDigest extendedDigest) {
        return extendedDigest.getByteLength() * 8;
    }

    private byte[] hash(byte[] bArr) {
        Digest digestCloneDigest = DigestFactory.cloneDigest(this.digest);
        digestCloneDigest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        digestCloneDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.hash2curve.MessageExpansion
    public byte[] expandMessage(byte[] bArr, byte[] bArr2, int i) {
        int iCeil = (int) Math.ceil(((double) i) / ((double) this.hashOutputBytes));
        if (iCeil > 255) {
            throw new IllegalArgumentException(d.n("Ell parameter must not be greater than 255. Current value = ", iCeil));
        }
        if (i > 65535) {
            throw new IllegalArgumentException(d.n("Output size must not be greater than 65535. Current value = ", i));
        }
        if (bArr2.length > 255) {
            throw new IllegalArgumentException("DST size must not be greater than 255. Current value = " + bArr2.length);
        }
        byte[] bArrConcatenate = Arrays.concatenate(bArr2, H2cUtils.i2osp(bArr2.length, 1));
        byte[] bArrConcatenate2 = Arrays.concatenate(new byte[][]{H2cUtils.i2osp(0, this.f228413s / 8), bArr, H2cUtils.i2osp(i, 2), H2cUtils.i2osp(0, 1), bArrConcatenate});
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iCeil + 1, this.hashOutputBytes);
        byte[] bArrHash = hash(bArrConcatenate2);
        bArr3[0] = bArrHash;
        byte[] bArrHash2 = hash(Arrays.concatenate(bArrHash, H2cUtils.i2osp(1, 1), bArrConcatenate));
        bArr3[1] = bArrHash2;
        byte[] bArrClone = Arrays.clone(bArrHash2);
        for (int i2 = 2; i2 <= iCeil; i2++) {
            byte[] bArrHash3 = hash(Arrays.concatenate(H2cUtils.xor(bArr3[0], bArr3[i2 - 1]), H2cUtils.i2osp(i2, 1), bArrConcatenate));
            bArr3[i2] = bArrHash3;
            bArrClone = Arrays.concatenate(bArrClone, bArrHash3);
        }
        return Arrays.copyOfRange(bArrClone, 0, i);
    }

    public XmdMessageExpansion(ExtendedDigest extendedDigest, int i) {
        this(extendedDigest, i, getInputBlockSize(extendedDigest));
    }
}
