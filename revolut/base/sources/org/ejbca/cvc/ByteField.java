package org.ejbca.cvc;

import j6.a;
import java.math.BigInteger;
import org.ejbca.cvc.util.StringConverter;

/* JADX INFO: loaded from: classes14.dex */
public class ByteField extends AbstractDataField {
    private static final long serialVersionUID = 1;
    private byte[] data;
    private boolean showBitLength;

    public ByteField(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
        this.showBitLength = false;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public byte[] getEncoded() {
        return this.data;
    }

    public boolean isShowBitLength() {
        return this.showBitLength;
    }

    public void setShowBitLength(boolean z) {
        this.showBitLength = z;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public String valueAsText() {
        String strL;
        if (this.showBitLength) {
            strL = a.l(this.data != null ? new BigInteger(1, this.data).bitLength() : 0, "[", "]  ");
        } else {
            strL = "";
        }
        StringBuilder sbS = p.a.s(strL);
        sbS.append(StringConverter.byteToHex(this.data));
        return sbS.toString();
    }

    public ByteField(CVCTagEnum cVCTagEnum, byte[] bArr) {
        this(cVCTagEnum, bArr, false);
    }

    public ByteField(CVCTagEnum cVCTagEnum, byte[] bArr, boolean z) {
        super(cVCTagEnum);
        this.data = bArr;
        this.showBitLength = z;
    }
}
