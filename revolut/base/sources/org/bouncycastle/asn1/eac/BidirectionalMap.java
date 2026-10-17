package org.bouncycastle.asn1.eac;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes14.dex */
public class BidirectionalMap extends Hashtable {
    private static final long serialVersionUID = -7457289971962812909L;
    Hashtable reverseMap = new Hashtable();

    public Object getReverse(Object obj2) {
        return this.reverseMap.get(obj2);
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object put(Object obj2, Object obj3) {
        this.reverseMap.put(obj3, obj2);
        return super.put(obj2, obj3);
    }
}
