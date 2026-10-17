package org.ejbca.cvc;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.ejbca.cvc.exception.ConstructionException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractSequence extends CVCObject {
    private static final long serialVersionUID = 1;
    private final List<CVCTagEnum> allowedFields;
    private final Map<CVCTagEnum, CVCObject> subfields;

    public AbstractSequence(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
        this.subfields = new HashMap();
        this.allowedFields = Arrays.asList(getAllowedFields());
    }

    public void addSubfield(CVCObject cVCObject) throws ConstructionException {
        addSubfield(cVCObject, false);
    }

    @Override // org.ejbca.cvc.CVCObject
    public int encode(DataOutputStream dataOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
        Iterator<CVCObject> it8 = getEncodableFields().iterator();
        int iEncode = 0;
        while (it8.hasNext()) {
            iEncode += it8.next().encode(dataOutputStream2);
        }
        dataOutputStream2.close();
        int value = getTag().getValue();
        int size = dataOutputStream.size();
        dataOutputStream.write(CVCObject.toByteArray(Integer.valueOf(value)));
        dataOutputStream.write(CVCObject.encodeLength(iEncode));
        dataOutputStream.write(byteArrayOutputStream.toByteArray());
        return dataOutputStream.size() - size;
    }

    public abstract CVCTagEnum[] getAllowedFields();

    @Override // org.ejbca.cvc.CVCObject
    public String getAsText(String str) {
        return getAsText(str, true);
    }

    public byte[] getDEREncoded() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th10;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                encode(new DataOutputStream(byteArrayOutputStream));
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th11) {
                th10 = th11;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th10;
            }
        } catch (Throwable th12) {
            byteArrayOutputStream = null;
            th10 = th12;
        }
    }

    public List<CVCObject> getEncodableFields() {
        return getOrderedSubfields();
    }

    public CVCObject getOptionalSubfield(CVCTagEnum cVCTagEnum) {
        return this.subfields.get(cVCTagEnum);
    }

    public List<CVCObject> getOrderedSubfields() {
        ArrayList arrayList = new ArrayList();
        Iterator<CVCTagEnum> it8 = this.allowedFields.iterator();
        while (it8.hasNext()) {
            CVCObject cVCObject = this.subfields.get(it8.next());
            if (cVCObject != null) {
                arrayList.add(cVCObject);
            }
        }
        return arrayList;
    }

    public CVCObject getSubfield(CVCTagEnum cVCTagEnum) throws NoSuchFieldException {
        CVCObject cVCObject = this.subfields.get(cVCTagEnum);
        if (cVCObject != null) {
            return cVCObject;
        }
        throw new NoSuchFieldException("Could not find subfield " + cVCTagEnum);
    }

    public Collection<CVCObject> getSubfields() {
        return this.subfields.values();
    }

    public void addSubfield(CVCObject cVCObject, boolean z) throws ConstructionException {
        if (cVCObject != null) {
            if (!this.allowedFields.contains(cVCObject.getTag())) {
                throw new ConstructionException("Field " + cVCObject.getTag() + " not allowed in " + getClass().getName());
            }
            if (!this.subfields.containsKey(cVCObject.getTag()) || z) {
                cVCObject.setParent(this);
                this.subfields.put(cVCObject.getTag(), cVCObject);
            } else {
                throw new ConstructionException("Field " + cVCObject.getTag() + " has already been added to " + getClass().getName());
            }
        }
    }

    @Override // org.ejbca.cvc.CVCObject
    public String getAsText(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.getAsText(str, z));
        for (CVCObject cVCObject : getOrderedSubfields()) {
            stringBuffer.append(CVCObject.NEWLINE);
            stringBuffer.append(cVCObject.getAsText(str + "   ", z));
        }
        return stringBuffer.toString();
    }
}
