package org.bouncycastle.asn1;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.BigInteger;
import okl.m;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class ASN1Integer extends ASN1Primitive {
    public static final ASN1Integer FIVE;
    public static final ASN1Integer FOUR;
    public static final ASN1Integer ONE;
    static final int SIGN_EXT_SIGNED = -1;
    static final int SIGN_EXT_UNSIGNED = 255;
    public static final ASN1Integer THREE;
    public static final ASN1Integer TWO;
    public static final ASN1Integer ZERO;
    private final byte[] bytes;
    private final int start;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Integer.class, 2) { // from class: org.bouncycastle.asn1.ASN1Integer.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Integer.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final ASN1Integer[] SMALL_CONSTANTS = new ASN1Integer[17];

    static {
        int i = 0;
        while (true) {
            ASN1Integer[] aSN1IntegerArr = SMALL_CONSTANTS;
            if (i >= aSN1IntegerArr.length) {
                ZERO = aSN1IntegerArr[0];
                ONE = aSN1IntegerArr[1];
                TWO = aSN1IntegerArr[2];
                THREE = aSN1IntegerArr[3];
                FOUR = aSN1IntegerArr[4];
                FIVE = aSN1IntegerArr[5];
                return;
            }
            aSN1IntegerArr[i] = new ASN1Integer(i);
            i++;
        }
    }

    public ASN1Integer(int i) {
        this.bytes = BigInteger.valueOf(i).toByteArray();
        this.start = 0;
    }

    public static ASN1Integer createPrimitive(byte[] bArr) {
        return new ASN1Integer(bArr, false);
    }

    public static ASN1Integer getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof ASN1Integer)) {
            return (ASN1Integer) obj2;
        }
        if (!(obj2 instanceof byte[])) {
            throw new IllegalArgumentException(a.g(obj2, "illegal object in getInstance: "));
        }
        try {
            return (ASN1Integer) TYPE.fromByteArray((byte[]) obj2);
        } catch (Exception e) {
            throw new IllegalArgumentException(m.g(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static ASN1Integer getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Integer) TYPE.getTagged(aSN1TaggedObject, z);
    }

    public static int intValue(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 4);
        int i3 = i2 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[iMax] & 255);
        }
    }

    public static boolean isMalformed(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || Properties.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public static long longValue(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 8);
        long j2 = i2 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j2;
            }
            j2 = (j2 << 8) | ((long) (bArr[iMax] & UnsignedBytes.MAX_VALUE));
        }
    }

    public static int signBytesToSkip(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    public static ASN1Integer valueOf(int i) {
        if (i >= 0) {
            ASN1Integer[] aSN1IntegerArr = SMALL_CONSTANTS;
            if (i < aSN1IntegerArr.length) {
                return aSN1IntegerArr[i];
            }
        }
        return new ASN1Integer(i);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.areEqual(this.bytes, ((ASN1Integer) aSN1Primitive).bytes);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.writeEncodingDL(z, 2, this.bytes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.bytes.length);
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean hasValue(int i) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i2 = this.start;
        return length - i2 <= 4 && intValue(bArr, i2, -1) == i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return intValue(bArr, i, 255);
    }

    public int intValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        if (length - i <= 4) {
            return intValue(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long longValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        if (length - i <= 8) {
            return longValue(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public String toString() {
        return getValue().toString();
    }

    public ASN1Integer(long j2) {
        this.bytes = BigInteger.valueOf(j2).toByteArray();
        this.start = 0;
    }

    public static ASN1Integer valueOf(long j2) {
        if (j2 >= 0) {
            ASN1Integer[] aSN1IntegerArr = SMALL_CONSTANTS;
            if (j2 < aSN1IntegerArr.length) {
                return aSN1IntegerArr[(int) j2];
            }
        }
        return new ASN1Integer(j2);
    }

    public boolean hasValue(long j2) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        return length - i <= 8 && longValue(bArr, i, -1) == j2;
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
        this.start = 0;
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && intValue(this.bytes, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Integer(byte[] bArr, boolean z) {
        if (isMalformed(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.bytes = z ? Arrays.clone(bArr) : bArr;
        this.start = signBytesToSkip(bArr);
    }

    public static ASN1Integer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Integer) TYPE.getContextTagged(aSN1TaggedObject, z);
    }
}
