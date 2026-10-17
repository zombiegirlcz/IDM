package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

/* JADX INFO: loaded from: classes14.dex */
public class SequenceOfPsid extends ASN1Object {
    private final List<Psid> psids;

    public static class Builder {
        private List<Psid> items = new ArrayList();

        public SequenceOfPsid createSequenceOfPsidSsp() {
            return new SequenceOfPsid(this.items);
        }

        public Builder setItem(Psid... psidArr) {
            for (int i = 0; i != psidArr.length; i++) {
                this.items.add(psidArr[i]);
            }
            return this;
        }

        public Builder setItems(List<Psid> list) {
            this.items = list;
            return this;
        }
    }

    public SequenceOfPsid(List<Psid> list) {
        this.psids = Collections.unmodifiableList(list);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SequenceOfPsid getInstance(Object obj2) {
        if (obj2 instanceof SequenceOfPsid) {
            return (SequenceOfPsid) obj2;
        }
        if (obj2 != null) {
            return new SequenceOfPsid(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public List<Psid> getPsids() {
        return this.psids;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.psids);
    }

    private SequenceOfPsid(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it8 = aSN1Sequence.iterator();
        while (it8.hasNext()) {
            arrayList.add(Psid.getInstance(it8.next()));
        }
        this.psids = Collections.unmodifiableList(arrayList);
    }
}
