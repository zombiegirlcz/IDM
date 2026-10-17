package org.bouncycastle.crypto.generators;

import j6.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFFeedbackParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes14.dex */
public class KDFFeedbackBytesGenerator implements MacDerivationFunction {
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f228399h;
    private byte[] ios;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f228400iv;
    private byte[] k;
    private int maxSizeExcl;

    /* JADX INFO: renamed from: prf, reason: collision with root package name */
    private final Mac f228401prf;
    private boolean useCounter;

    public KDFFeedbackBytesGenerator(Mac mac) {
        this.f228401prf = mac;
        int macSize = mac.getMacSize();
        this.f228399h = macSize;
        this.k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.f228401prf;
            byte[] bArr = this.f228400iv;
            mac.update(bArr, 0, bArr.length);
        } else {
            Mac mac2 = this.f228401prf;
            byte[] bArr2 = this.k;
            mac2.update(bArr2, 0, bArr2.length);
        }
        if (this.useCounter) {
            int i = (this.generatedBytes / this.f228399h) + 1;
            byte[] bArr3 = this.ios;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr3[0] = (byte) (i >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i;
            this.f228401prf.update(bArr3, 0, bArr3.length);
        }
        Mac mac3 = this.f228401prf;
        byte[] bArr4 = this.fixedInputData;
        mac3.update(bArr4, 0, bArr4.length);
        this.f228401prf.doFinal(this.k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i5 = i3 + i2;
        if (i5 < 0 || i5 >= this.maxSizeExcl) {
            throw new DataLengthException(a.v(new StringBuilder("Current KDFCTR may only be used for "), " bytes", this.maxSizeExcl));
        }
        if (i3 % this.f228399h == 0) {
            generateNext();
        }
        int i6 = this.generatedBytes;
        int i21 = this.f228399h;
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
            iMin = Math.min(this.f228399h, i32);
            System.arraycopy(this.k, 0, bArr, i, iMin);
            this.generatedBytes += iMin;
            i32 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.f228401prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFFeedbackParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFFeedbackParameters kDFFeedbackParameters = (KDFFeedbackParameters) derivationParameters;
        this.f228401prf.init(new KeyParameter(kDFFeedbackParameters.getKI()));
        this.fixedInputData = kDFFeedbackParameters.getFixedInputData();
        int r2 = kDFFeedbackParameters.getR();
        this.ios = new byte[r2 / 8];
        int i = Integer.MAX_VALUE;
        if (kDFFeedbackParameters.useCounter() && r2 < Integers.numberOfLeadingZeros(this.f228399h)) {
            i = this.f228399h << r2;
        }
        this.maxSizeExcl = i;
        this.f228400iv = kDFFeedbackParameters.getIV();
        this.useCounter = kDFFeedbackParameters.useCounter();
        this.generatedBytes = 0;
    }
}
