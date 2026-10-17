package org.ejbca.cvc;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractDataField extends CVCObject {
    private static final long serialVersionUID = 1;

    public AbstractDataField(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
    }

    @Override // org.ejbca.cvc.CVCObject
    public int encode(DataOutputStream dataOutputStream) throws IOException {
        int size = dataOutputStream.size();
        dataOutputStream.write(CVCObject.toByteArray(Integer.valueOf(getTag().getValue())));
        byte[] encoded = getEncoded();
        dataOutputStream.write(CVCObject.encodeLength(encoded.length));
        dataOutputStream.write(encoded);
        return dataOutputStream.size() - size;
    }

    @Override // org.ejbca.cvc.CVCObject
    public String getAsText(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.getAsText(str, z));
        stringBuffer.append(valueAsText());
        return stringBuffer.toString();
    }

    public abstract byte[] getEncoded();

    public abstract String valueAsText();
}
