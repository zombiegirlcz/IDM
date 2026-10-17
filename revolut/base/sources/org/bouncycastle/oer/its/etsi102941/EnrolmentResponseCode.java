package org.bouncycastle.oer.its.etsi102941;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;

/* JADX INFO: loaded from: classes14.dex */
public class EnrolmentResponseCode extends ASN1Enumerated {

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public static final EnrolmentResponseCode f228750ok = new EnrolmentResponseCode(0);
    public static final EnrolmentResponseCode cantparse = new EnrolmentResponseCode(1);
    public static final EnrolmentResponseCode badcontenttype = new EnrolmentResponseCode(2);
    public static final EnrolmentResponseCode imnottherecipient = new EnrolmentResponseCode(3);
    public static final EnrolmentResponseCode unknownencryptionalgorithm = new EnrolmentResponseCode(4);
    public static final EnrolmentResponseCode decryptionfailed = new EnrolmentResponseCode(5);
    public static final EnrolmentResponseCode unknownits = new EnrolmentResponseCode(6);
    public static final EnrolmentResponseCode invalidsignature = new EnrolmentResponseCode(7);
    public static final EnrolmentResponseCode invalidencryptionkey = new EnrolmentResponseCode(8);
    public static final EnrolmentResponseCode baditsstatus = new EnrolmentResponseCode(9);
    public static final EnrolmentResponseCode incompleterequest = new EnrolmentResponseCode(10);
    public static final EnrolmentResponseCode deniedpermissions = new EnrolmentResponseCode(11);
    public static final EnrolmentResponseCode invalidkeys = new EnrolmentResponseCode(12);
    public static final EnrolmentResponseCode deniedrequest = new EnrolmentResponseCode(13);

    public EnrolmentResponseCode(int i) {
        super(i);
        assertValues();
    }

    public static EnrolmentResponseCode getInstance(Object obj2) {
        if (obj2 instanceof EnrolmentResponseCode) {
            return (EnrolmentResponseCode) obj2;
        }
        if (obj2 != null) {
            return new EnrolmentResponseCode(ASN1Enumerated.getInstance(obj2));
        }
        return null;
    }

    public void assertValues() {
        if (getValue().intValue() < 0 || getValue().intValue() > 13) {
            throw new IllegalArgumentException("invalid enumeration value " + getValue());
        }
    }

    public EnrolmentResponseCode(BigInteger bigInteger) {
        super(bigInteger);
        assertValues();
    }

    private EnrolmentResponseCode(ASN1Enumerated aSN1Enumerated) {
        this(aSN1Enumerated.getValue());
    }

    public EnrolmentResponseCode(byte[] bArr) {
        super(bArr);
        assertValues();
    }
}
