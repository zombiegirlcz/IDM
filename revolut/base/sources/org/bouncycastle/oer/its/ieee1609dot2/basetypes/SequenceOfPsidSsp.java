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
public class SequenceOfPsidSsp extends ASN1Object {
    private final List<PsidSsp> psidSsps;

    public static class Builder {
        private List<PsidSsp> items = new ArrayList();

        public SequenceOfPsidSsp createSequenceOfPsidSsp() {
            return new SequenceOfPsidSsp(this.items);
        }

        public Builder setItem(PsidSsp... psidSspArr) {
            for (int i = 0; i != psidSspArr.length; i++) {
                this.items.add(psidSspArr[i]);
            }
            return this;
        }

        public Builder setItems(List<PsidSsp> list) {
            this.items = list;
            return this;
        }
    }

    public SequenceOfPsidSsp(List<PsidSsp> list) {
        this.psidSsps = Collections.unmodifiableList(list);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SequenceOfPsidSsp getInstance(Object obj2) {
        if (obj2 instanceof SequenceOfPsidSsp) {
            return (SequenceOfPsidSsp) obj2;
        }
        if (obj2 != null) {
            return new SequenceOfPsidSsp(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public List<PsidSsp> getPsidSsps() {
        return this.psidSsps;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.psidSsps);
    }

    private SequenceOfPsidSsp(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it8 = aSN1Sequence.iterator();
        while (it8.hasNext()) {
            arrayList.add(PsidSsp.getInstance(it8.next()));
        }
        this.psidSsps = Collections.unmodifiableList(arrayList);
    }
}
