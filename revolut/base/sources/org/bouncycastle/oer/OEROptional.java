package org.bouncycastle.oer;

import a10.b;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.bouncycastle.asn1.ASN1Absent;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes14.dex */
public class OEROptional extends ASN1Object {
    public static final OEROptional ABSENT = new OEROptional(false, null);
    private final boolean defined;
    private final ASN1Encodable value;

    private OEROptional(boolean z, ASN1Encodable aSN1Encodable) {
        this.defined = z;
        this.value = aSN1Encodable;
    }

    public static OEROptional getInstance(Object obj2) {
        return obj2 instanceof OEROptional ? (OEROptional) obj2 : obj2 instanceof ASN1Encodable ? new OEROptional(true, (ASN1Encodable) obj2) : ABSENT;
    }

    public static <T> T getValue(Class<T> cls, Object obj2) {
        OEROptional oEROptional = getInstance(obj2);
        if (oEROptional.defined) {
            return (T) oEROptional.getObject(cls);
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass() || !super.equals(obj2)) {
            return false;
        }
        OEROptional oEROptional = (OEROptional) obj2;
        if (this.defined != oEROptional.defined) {
            return false;
        }
        ASN1Encodable aSN1Encodable = this.value;
        ASN1Encodable aSN1Encodable2 = oEROptional.value;
        return aSN1Encodable != null ? aSN1Encodable.equals(aSN1Encodable2) : aSN1Encodable2 == null;
    }

    public ASN1Encodable get() {
        return !this.defined ? ABSENT : this.value;
    }

    public <T> T getObject(final Class<T> cls) {
        if (this.defined) {
            return this.value.getClass().isInstance(cls) ? cls.cast(this.value) : (T) AccessController.doPrivileged(new PrivilegedAction<T>(this) { // from class: org.bouncycastle.oer.OEROptional.1
                final /* synthetic */ OEROptional this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.security.PrivilegedAction
                public T run() {
                    try {
                        return (T) cls.cast(cls.getMethod("getInstance", Object.class).invoke(null, this.this$0.value));
                    } catch (Exception e) {
                        throw new IllegalStateException(b.r(e, new StringBuilder("could not invoke getInstance on type ")), e);
                    }
                }
            });
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + (this.defined ? 1 : 0)) * 31;
        ASN1Encodable aSN1Encodable = this.value;
        return iHashCode + (aSN1Encodable != null ? aSN1Encodable.hashCode() : 0);
    }

    public boolean isDefined() {
        return this.defined;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return !this.defined ? ASN1Absent.INSTANCE : get().toASN1Primitive();
    }

    public String toString() {
        if (!this.defined) {
            return "ABSENT";
        }
        return "OPTIONAL(" + this.value + ")";
    }
}
