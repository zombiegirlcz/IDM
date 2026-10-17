package org.bouncycastle.crypto.generators;

import j6.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFCounterParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes14.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f228394h;
    private byte[] ios;
    private byte[] k;
    private int maxSizeExcl;

    /* JADX INFO: renamed from: prf, reason: collision with root package name */
    private final Mac f228395prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.f228395prf = mac;
        int macSize = mac.getMacSize();
        this.f228394h = macSize;
        this.k = new byte[macSize];
    }

    private void generateNext() {
        int i = (this.generatedBytes / this.f228394h) + 1;
        byte[] bArr = this.ios;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i;
        Mac mac = this.f228395prf;
        byte[] bArr2 = this.fixedInputDataCtrPrefix;
        mac.update(bArr2, 0, bArr2.length);
        Mac mac2 = this.f228395prf;
        byte[] bArr3 = this.ios;
        mac2.update(bArr3, 0, bArr3.length);
        Mac mac3 = this.f228395prf;
        byte[] bArr4 = this.fixedInputData_afterCtr;
        mac3.update(bArr4, 0, bArr4.length);
        this.f228395prf.doFinal(this.k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i5 = i3 + i2;
        if (i5 < 0 || i5 >= this.maxSizeExcl) {
            throw new DataLengthException(a.v(new StringBuilder("Current KDFCTR may only be used for "), " bytes", this.maxSizeExcl));
        }
        if (i3 % this.f228394h == 0) {
            generateNext();
        }
        int i6 = this.generatedBytes;
        int i21 = this.f228394h;
        int i22 = i6 % i21;
        int iMin = Math.min(i21 - (i6 % i21), i2);
        System.arraycopy(this.k, i22, bArr, i, iMin);
        this.generatedBytes += iMin;
        int i32 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i32 <= 0) {
                return i2;
            }
            generateNext();
            iMin = Math.min(this.f228394h, i32);
            System.arraycopy(this.k, 0, bArr, i, iMin);
            this.generatedBytes += iMin;
            i32 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.f228395prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.f228395prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r2 = kDFCounterParameters.getR();
        this.ios = new byte[r2 / 8];
        this.maxSizeExcl = r2 >= Integers.numberOfLeadingZeros(this.f228394h) ? Integer.MAX_VALUE : this.f228394h << r2;
        this.generatedBytes = 0;
    }
}
