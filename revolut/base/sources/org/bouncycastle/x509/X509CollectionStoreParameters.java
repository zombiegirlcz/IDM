package org.bouncycastle.x509;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public class X509CollectionStoreParameters implements X509StoreParameters {
    private Collection collection;

    public X509CollectionStoreParameters(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("collection cannot be null");
        }
        this.collection = collection;
    }

    public Object clone() {
        return new X509CollectionStoreParameters(this.collection);
    }

    public Collection getCollection() {
        return new ArrayList(this.collection);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("X509CollectionStoreParameters: [\n");
        sb6.append("  collection: " + this.collection + "\n");
        sb6.append("]");
        return sb6.toString();
    }
}
