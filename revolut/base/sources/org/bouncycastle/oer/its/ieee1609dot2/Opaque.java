package org.bouncycastle.oer.its.ieee1609dot2;

import a10.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.OERInputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class Opaque extends ASN1Object {
    private final byte[] content;

    private Opaque(ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }

    public static Opaque getInstance(Object obj2) {
        if (obj2 instanceof Opaque) {
            return (Opaque) obj2;
        }
        if (obj2 != null) {
            return new Opaque(ASN1OctetString.getInstance(obj2));
        }
        return null;
    }

    public static <T> T getValue(final Class<T> cls, final Element element, Opaque opaque) {
        return (T) AccessController.doPrivileged(new PrivilegedAction<T>() { // from class: org.bouncycastle.oer.its.ieee1609dot2.Opaque.1
            @Override // java.security.PrivilegedAction
            public T run() {
                try {
                    ASN1Encodable aSN1Encodable = OERInputStream.parse(Opaque.this.content, element);
                    return (T) cls.cast(cls.getMethod("getInstance", Object.class).invoke(null, aSN1Encodable));
                } catch (Exception e) {
                    throw new IllegalStateException(b.r(e, new StringBuilder("could not invoke getInstance on type ")), e);
                }
            }
        });
    }

    public byte[] getContent() {
        return this.content;
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.content);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(this.content);
    }

    public Opaque(byte[] bArr) {
        this.content = Arrays.clone(bArr);
    }
}
