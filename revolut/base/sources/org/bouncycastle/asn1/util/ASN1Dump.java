package org.bouncycastle.asn1.util;

import a0.d;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    public static void _dumpAsString(String str, boolean z, ASN1Primitive aSN1Primitive, StringBuilder sb6) {
        String strLineSeparator = Strings.lineSeparator();
        sb6.append(str);
        if (aSN1Primitive instanceof ASN1Null) {
            sb6.append("NULL");
            sb6.append(strLineSeparator);
            return;
        }
        int i = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            sb6.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
            sb6.append(strLineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String strR = d.r(str, "    ");
            int size = aSN1Sequence.size();
            while (i < size) {
                _dumpAsString(strR, z, aSN1Sequence.getObjectAt(i).toASN1Primitive(), sb6);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            sb6.append(aSN1Primitive instanceof BERSet ? "BER Set" : aSN1Primitive instanceof DERSet ? "DER Set" : "Set");
            sb6.append(strLineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String strR2 = d.r(str, "    ");
            int size2 = aSN1Set.size();
            while (i < size2) {
                _dumpAsString(strR2, z, aSN1Set.getObjectAt(i).toASN1Primitive(), sb6);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            sb6.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            sb6.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                sb6.append(" IMPLICIT");
            }
            sb6.append(strLineSeparator);
            _dumpAsString(str + "    ", z, aSN1TaggedObject.getBaseObject().toASN1Primitive(), sb6);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            sb6.append("ObjectIdentifier(" + ((ASN1ObjectIdentifier) aSN1Primitive).getId() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            sb6.append("RelativeOID(" + ((ASN1RelativeOID) aSN1Primitive).getId() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            sb6.append("Boolean(" + ((ASN1Boolean) aSN1Primitive).isTrue() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            sb6.append("Integer(" + ((ASN1Integer) aSN1Primitive).getValue() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            sb6.append(aSN1Primitive instanceof BEROctetString ? "BER Constructed Octet String[" : "DER Octet String[");
            sb6.append(aSN1OctetString.getOctetsLength() + "]" + strLineSeparator);
            if (z) {
                dumpBinaryDataAsString(sb6, str, aSN1OctetString.getOctets());
                return;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            sb6.append(aSN1BitString instanceof DERBitString ? "DER Bit String[" : aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[");
            sb6.append(aSN1BitString.getBytesLength() + ", " + aSN1BitString.getPadBits() + "]" + strLineSeparator);
            if (z) {
                dumpBinaryDataAsString(sb6, str, aSN1BitString.getBytes());
                return;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            sb6.append("IA5String(" + ((ASN1IA5String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            sb6.append("UTF8String(" + ((ASN1UTF8String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            sb6.append("NumericString(" + ((ASN1NumericString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            sb6.append("PrintableString(" + ((ASN1PrintableString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            sb6.append("VisibleString(" + ((ASN1VisibleString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            sb6.append("BMPString(" + ((ASN1BMPString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            sb6.append("T61String(" + ((ASN1T61String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            sb6.append("GraphicString(" + ((ASN1GraphicString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            sb6.append("VideotexString(" + ((ASN1VideotexString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            sb6.append("UTCTime(" + ((ASN1UTCTime) aSN1Primitive).getTime() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            sb6.append("GeneralizedTime(" + ((ASN1GeneralizedTime) aSN1Primitive).getTime() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            sb6.append("DER Enumerated(" + ((ASN1Enumerated) aSN1Primitive).getValue() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            sb6.append("ObjectDescriptor(" + ((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString() + ") " + strLineSeparator);
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            sb6.append(aSN1Primitive.toString() + strLineSeparator);
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        sb6.append("External " + strLineSeparator);
        String str2 = str + "    ";
        if (aSN1External.getDirectReference() != null) {
            StringBuilder sbL = a.l(str2, "Direct Reference: ");
            sbL.append(aSN1External.getDirectReference().getId());
            sbL.append(strLineSeparator);
            sb6.append(sbL.toString());
        }
        if (aSN1External.getIndirectReference() != null) {
            StringBuilder sbL2 = a.l(str2, "Indirect Reference: ");
            sbL2.append(aSN1External.getIndirectReference().toString());
            sbL2.append(strLineSeparator);
            sb6.append(sbL2.toString());
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(str2, z, aSN1External.getDataValueDescriptor(), sb6);
        }
        StringBuilder sbL3 = a.l(str2, "Encoding: ");
        sbL3.append(aSN1External.getEncoding());
        sbL3.append(strLineSeparator);
        sb6.append(sbL3.toString());
        _dumpAsString(str2, z, aSN1External.getExternalContent(), sb6);
    }

    private static void appendAscString(StringBuilder sb6, byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b4 = bArr[i3];
            if (b4 >= 32 && b4 <= 126) {
                sb6.append((char) b4);
            }
        }
    }

    public static String dumpAsString(Object obj2) {
        return dumpAsString(obj2, false);
    }

    private static void dumpBinaryDataAsString(StringBuilder sb6, String str, byte[] bArr) {
        if (bArr.length < 1) {
            return;
        }
        String strLineSeparator = Strings.lineSeparator();
        String strR = d.r(str, "    ");
        for (int i = 0; i < bArr.length; i += 32) {
            int iMin = Math.min(bArr.length - i, 32);
            sb6.append(strR);
            sb6.append(Hex.toHexString(bArr, i, iMin));
            for (int i2 = iMin; i2 < 32; i2++) {
                sb6.append("  ");
            }
            sb6.append("    ");
            appendAscString(sb6, bArr, i, iMin);
            sb6.append(strLineSeparator);
        }
    }

    public static String dumpAsString(Object obj2, boolean z) {
        ASN1Primitive aSN1Primitive;
        if (obj2 instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj2;
        } else {
            if (!(obj2 instanceof ASN1Encodable)) {
                return "unknown object type " + obj2.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj2).toASN1Primitive();
        }
        StringBuilder sb6 = new StringBuilder();
        _dumpAsString("", z, aSN1Primitive, sb6);
        return sb6.toString();
    }
}
