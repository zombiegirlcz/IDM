package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes14.dex */
abstract class ASN1Type {
    final Class javaClass;

    public ASN1Type(Class cls) {
        this.javaClass = cls;
    }

    public final boolean equals(Object obj2) {
        return this == obj2;
    }

    public final Class getJavaClass() {
        return this.javaClass;
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
