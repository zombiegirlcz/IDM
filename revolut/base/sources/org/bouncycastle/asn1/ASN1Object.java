package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ASN1Object implements ASN1Encodable, Encodable {
    public static boolean hasEncodedTagValue(Object obj2, int i) {
        return (obj2 instanceof byte[]) && ((byte[]) obj2)[0] == i;
    }

    public void encodeTo(OutputStream outputStream) throws IOException {
        toASN1Primitive().encodeTo(outputStream);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof ASN1Encodable) {
            return toASN1Primitive().equals(((ASN1Encodable) obj2).toASN1Primitive());
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        toASN1Primitive().encodeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public abstract ASN1Primitive toASN1Primitive();

    public void encodeTo(OutputStream outputStream, String str) throws IOException {
        toASN1Primitive().encodeTo(outputStream, str);
    }

    public byte[] getEncoded(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        toASN1Primitive().encodeTo(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
