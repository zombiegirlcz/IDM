package org.bouncycastle.crypto.generators;

import j6.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes14.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f228396a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f228397h;
    private byte[] ios;
    private byte[] k;
    private int maxSizeExcl;

    /* JADX INFO: renamed from: prf, reason: collision with root package name */
    private final Mac f228398prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.f228398prf = mac;
        int macSize = mac.getMacSize();
        this.f228397h = macSize;
        this.f228396a = new byte[macSize];
        this.k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.f228398prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.f228398prf.doFinal(this.f228396a, 0);
        } else {
            Mac mac2 = this.f228398prf;
            byte[] bArr2 = this.f228396a;
            mac2.update(bArr2, 0, bArr2.length);
            this.f228398prf.doFinal(this.f228396a, 0);
        }
        Mac mac3 = this.f228398prf;
        byte[] bArr3 = this.f228396a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i = (this.generatedBytes / this.f228397h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr4[0] = (byte) (i >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i;
            this.f228398prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac4 = this.f228398prf;
        byte[] bArr5 = this.fixedInputData;
        mac4.update(bArr5, 0, bArr5.length);
        this.f228398prf.doFinal(this.k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i5 = i3 + i2;
        if (i5 < 0 || i5 >= this.maxSizeExcl) {
            throw new DataLengthException(a.v(new StringBuilder("Current KDFCTR may only be used for "), " bytes", this.maxSizeExcl));
        }
        if (i3 % this.f228397h == 0) {
            generateNext();
        }
        int i6 = this.generatedBytes;
        int i21 = this.f228397h;
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
            iMin = Math.min(this.f228397h, i32);
            System.arraycopy(this.k, 0, bArr, i, iMin);
            this.generatedBytes += iMin;
            i32 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.f228398prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.f228398prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r2 = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r2 / 8];
        int i = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter() && r2 < Integers.numberOfLeadingZeros(this.f228397h)) {
            i = this.f228397h << r2;
        }
        this.maxSizeExcl = i;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
