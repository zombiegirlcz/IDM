package org.jmrtd;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class ASN1Util {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");

    public static ASN1Encodable checkTag(ASN1Encodable aSN1Encodable, int i, int i2) {
        if (aSN1Encodable == null) {
            throw new IllegalArgumentException("Expected a tagged object. Found null.");
        }
        if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException("Expected a tagged object. Found " + aSN1Encodable.getClass());
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
        if (aSN1TaggedObject.getTagClass() == i || aSN1TaggedObject.getTagNo() == i2) {
            return aSN1TaggedObject.getBaseObject();
        }
        throw new IllegalArgumentException("Expected [" + tagClassToString(i) + " " + i2 + "], found [" + tagClassToString(aSN1TaggedObject.getTagClass()) + " " + aSN1TaggedObject.getTagNo() + "]");
    }

    public static BigInteger decodeBigInteger(ASN1Encodable aSN1Encodable) {
        if (!(aSN1Encodable instanceof ASN1OctetString)) {
            throw new NumberFormatException("Could not parse integer");
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Encodable);
        if (aSN1OctetString != null) {
            return new BigInteger(aSN1OctetString.getOctets());
        }
        throw new NumberFormatException("Could not parse integer");
    }

    public static boolean decodeBoolean(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable instanceof ASN1Boolean) {
            return ((ASN1Boolean) aSN1Encodable).isTrue();
        }
        if (aSN1Encodable instanceof ASN1OctetString) {
            return (((ASN1OctetString) aSN1Encodable).getOctets()[0] & UnsignedBytes.MAX_VALUE) != 0;
        }
        throw new IllegalArgumentException("Could not decode boolean from " + aSN1Encodable);
    }

    public static int decodeInt(ASN1Encodable aSN1Encodable) {
        BigInteger bigIntegerDecodeBigInteger = decodeBigInteger(aSN1Encodable);
        if (bigIntegerDecodeBigInteger != null) {
            return bigIntegerDecodeBigInteger.intValue();
        }
        throw new NumberFormatException("Could not parse integer");
    }

    public static Map<Integer, ASN1Encodable> decodeTaggedObjects(ASN1Encodable aSN1Encodable) {
        HashMap map = new HashMap();
        if (aSN1Encodable != null) {
            if (!(aSN1Encodable instanceof ASN1Sequence)) {
                if (aSN1Encodable instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
                    map.put(Integer.valueOf(aSN1TaggedObject.getTagNo()), aSN1TaggedObject.getBaseObject());
                    return map;
                }
                throw new IllegalArgumentException("Not a sequence and not a tagged object " + aSN1Encodable.getClass());
            }
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Encodable);
            int size = aSN1Sequence.size();
            for (int i = 0; i < size; i++) {
                ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i);
                if (objectAt instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(objectAt);
                    aSN1TaggedObject2.getTagClass();
                    int tagNo = aSN1TaggedObject2.getTagNo();
                    if (map.containsKey(Integer.valueOf(tagNo))) {
                        LOGGER.warning("Double key " + tagNo);
                    }
                    map.put(Integer.valueOf(tagNo), aSN1TaggedObject2.getBaseObject());
                } else {
                    LOGGER.warning("Not a tagged object. Skipping " + objectAt.getClass());
                }
            }
        }
        return map;
    }

    public static ASN1Encodable encodeBigInteger(BigInteger bigInteger) {
        return new DEROctetString(bigInteger.toByteArray());
    }

    public static ASN1Encodable encodeBoolean(boolean z) {
        return new DEROctetString(new byte[]{(byte) (z ? 255 : 0)});
    }

    public static ASN1Encodable encodeInt(int i) {
        return encodeBigInteger(BigInteger.valueOf(i));
    }

    public static ASN1Encodable encodeTaggedObjects(Map<Integer, ASN1Encodable> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Integer, ASN1Encodable> entry : map.entrySet()) {
            ASN1Encodable value = entry.getValue();
            if (value != null) {
                arrayList.add(new DERTaggedObject(false, entry.getKey().intValue(), value));
            }
        }
        return new DERSequence((ASN1Encodable[]) arrayList.toArray(new ASN1Encodable[0]));
    }

    public static boolean isSequenceOfSequences(ASN1Encodable aSN1Encodable) {
        if (!(aSN1Encodable instanceof ASN1Sequence)) {
            return false;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Encodable);
        int size = aSN1Sequence.size();
        for (int i = 0; i < size; i++) {
            if (!(aSN1Sequence.getObjectAt(i) instanceof ASN1Sequence)) {
                return false;
            }
        }
        return true;
    }

    public static List<ASN1Encodable> list(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            return null;
        }
        if (!(aSN1Encodable instanceof ASN1Sequence)) {
            return Collections.singletonList(aSN1Encodable);
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Encodable;
        int size = aSN1Sequence.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(aSN1Sequence.getObjectAt(i));
        }
        return arrayList;
    }

    public static ASN1Encodable readASN1Object(InputStream inputStream) throws IOException {
        return new ASN1InputStream(inputStream, true).readObject();
    }

    private static String tagClassToString(int i) {
        return i != 0 ? i != 64 ? i != 128 ? i != 192 ? Integer.toString(i) : "PRIVATE" : "CONTEXT_SPECIFIC" : "APPLICATION" : "UNIVERSAL";
    }
}
