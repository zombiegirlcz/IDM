package org.jmrtd.lds.icao;

import a0.d;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import net.sf.scuba.data.Gender;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.AbstractLDSInfo;
import org.jmrtd.lds.LDSFile;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class MRZInfo extends AbstractLDSInfo {
    public static final int DOC_TYPE_ID1 = 1;
    public static final int DOC_TYPE_ID2 = 2;
    public static final int DOC_TYPE_ID3 = 3;
    public static final int DOC_TYPE_UNSPECIFIED = 0;
    private static final String MRZ_CHARS = "<0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final long serialVersionUID = 7054965914471297804L;
    private char compositeCheckDigit;
    private String dateOfBirth;
    private char dateOfBirthCheckDigit;
    private String dateOfExpiry;
    private char dateOfExpiryCheckDigit;
    private String documentCode;
    private String documentNumber;
    private char documentNumberCheckDigit;
    private DocumentType documentType;
    private String gender;
    private String issuingState;
    private String nationality;
    private String optionalData1;
    private String optionalData2;
    private char personalNumberCheckDigit;
    private String primaryIdentifier;
    private String secondaryIdentifier;

    /* JADX INFO: renamed from: org.jmrtd.lds.icao.MRZInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$sf$scuba$data$Gender;
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType;

        static {
            int[] iArr = new int[Gender.values().length];
            $SwitchMap$net$sf$scuba$data$Gender = iArr;
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$sf$scuba$data$Gender[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DocumentType.values().length];
            $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType = iArr2;
            try {
                iArr2[DocumentType.TD1.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.TD2.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.MRVB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.TD3.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.MRVA.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum DocumentType {
        UNKNOWN(0),
        TD1(1),
        TD2(2),
        TD3(3),
        MRVA(4),
        MRVB(5);

        private int code;

        DocumentType(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    @Deprecated
    public MRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender, String str8, String str9) {
        this(getDocumentTypeFromDocumentCode(str), str, str2, str5, personalNumberToOptionalData(str9), str7, gender, str8, str6, null, str3, str4);
    }

    public static char checkDigit(String str) {
        return checkDigit(str, false);
    }

    public static MRZInfo createMRVAMRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Object obj2, String str8, String str9) {
        return new MRZInfo(DocumentType.MRVA, str, str2, str5, str9, str7, obj2, str8, str6, null, str3, str4);
    }

    public static MRZInfo createMRVBMRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Object obj2, String str8, String str9) {
        return new MRZInfo(DocumentType.MRVB, str, str2, str5, str9, str7, obj2, str8, str6, null, str3, str4);
    }

    public static MRZInfo createTD1MRZInfo(String str, String str2, String str3, String str4, String str5, Object obj2, String str6, String str7, String str8, String str9, String str10) {
        return new MRZInfo(DocumentType.TD1, str, str2, str3, str4, str5, obj2, str6, str7, str8, str9, str10);
    }

    public static MRZInfo createTD2MRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Object obj2, String str8, String str9) {
        return new MRZInfo(DocumentType.TD2, str, str2, str5, str9, str7, obj2, str8, str6, null, str3, str4);
    }

    public static MRZInfo createTD3MRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Object obj2, String str8, String str9) {
        return new MRZInfo(DocumentType.TD3, str, str2, str5, personalNumberToOptionalData(str9), str7, obj2, str8, str6, null, str3, str4);
    }

    private static int decodeMRZDigit(byte b4) {
        if (b4 == 60) {
            return 0;
        }
        switch (b4) {
            case 48:
                return 0;
            case 49:
                return 1;
            case 50:
                return 2;
            case 51:
                return 3;
            case 52:
                return 4;
            case 53:
                return 5;
            case 54:
                return 6;
            case 55:
                return 7;
            case 56:
                return 8;
            case 57:
                return 9;
            default:
                switch (b4) {
                    case 65:
                        return 10;
                    case 66:
                        return 11;
                    case 67:
                        return 12;
                    case 68:
                        return 13;
                    case 69:
                        return 14;
                    case 70:
                        return 15;
                    case 71:
                        return 16;
                    case 72:
                        return 17;
                    case 73:
                        return 18;
                    case 74:
                        return 19;
                    case 75:
                        return 20;
                    case 76:
                        return 21;
                    case 77:
                        return 22;
                    case 78:
                        return 23;
                    case 79:
                        return 24;
                    case 80:
                        return 25;
                    case 81:
                        return 26;
                    case 82:
                        return 27;
                    case 83:
                        return 28;
                    case 84:
                        return 29;
                    case 85:
                        return 30;
                    case 86:
                        return 31;
                    case 87:
                        return 32;
                    case 88:
                        return 33;
                    case 89:
                        return 34;
                    case 90:
                        return 35;
                    default:
                        switch (b4) {
                            case 97:
                                return 10;
                            case 98:
                                return 11;
                            case 99:
                                return 12;
                            case 100:
                                return 13;
                            case 101:
                                return 14;
                            case 102:
                                return 15;
                            case 103:
                                return 16;
                            case 104:
                                return 17;
                            case 105:
                                return 18;
                            case 106:
                                return 19;
                            case 107:
                                return 20;
                            case LDSFile.EF_DG12_TAG /* 108 */:
                                return 21;
                            case LDSFile.EF_DG13_TAG /* 109 */:
                                return 22;
                            case LDSFile.EF_DG14_TAG /* 110 */:
                                return 23;
                            case LDSFile.EF_DG15_TAG /* 111 */:
                                return 24;
                            case 112:
                                return 25;
                            case 113:
                                return 26;
                            case 114:
                                return 27;
                            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                                return 28;
                            case 116:
                                return 29;
                            case LDSFile.EF_DG2_TAG /* 117 */:
                                return 30;
                            case LDSFile.EF_DG4_TAG /* 118 */:
                                return 31;
                            case LDSFile.EF_SOD_TAG /* 119 */:
                                return 32;
                            case SyslogConstants.LOG_CLOCK /* 120 */:
                                return 33;
                            case 121:
                                return 34;
                            case 122:
                                return 35;
                            default:
                                StringBuilder sbW = d.w(b4, "Could not decode MRZ character ", " ('");
                                sbW.append(Character.toString((char) b4));
                                sbW.append("')");
                                throw new NumberFormatException(sbW.toString());
                        }
                }
        }
    }

    public static boolean equalsModuloFillerChars(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int iMax = Math.max(str.length(), str2.length());
        return mrzFormat(str, iMax).equals(mrzFormat(str2, iMax));
    }

    private static String genderToString(Object obj2) {
        if (!(obj2 instanceof Gender)) {
            return Objects.toString(obj2);
        }
        int i = AnonymousClass1.$SwitchMap$net$sf$scuba$data$Gender[((Gender) obj2).ordinal()];
        return i != 1 ? i != 2 ? "<" : "F" : "M";
    }

    private String getComposite(DocumentType documentType) {
        StringBuilder sb6 = new StringBuilder();
        int length = this.documentNumber.length();
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i == 1) {
            if (length <= 9) {
                sb6.append(mrzFormat(this.documentNumber, 9));
                sb6.append(this.documentNumberCheckDigit);
                sb6.append(mrzFormat(this.optionalData1, 15));
            } else {
                sb6.append(this.documentNumber.substring(0, 9));
                sb6.append("<");
                String strSubstring = this.documentNumber.substring(9);
                sb6.append(strSubstring);
                sb6.append(this.documentNumberCheckDigit);
                sb6.append('<');
                sb6.append(mrzFormat(this.optionalData1, 13 - strSubstring.length()));
            }
            sb6.append(this.dateOfBirth);
            sb6.append(this.dateOfBirthCheckDigit);
            sb6.append(this.dateOfExpiry);
            sb6.append(this.dateOfExpiryCheckDigit);
            sb6.append(mrzFormat(this.optionalData2, 11));
            return sb6.toString();
        }
        if (i == 2) {
            sb6.append(this.documentNumber);
            sb6.append(this.documentNumberCheckDigit);
            sb6.append(this.dateOfBirth);
            sb6.append(this.dateOfBirthCheckDigit);
            sb6.append(this.dateOfExpiry);
            sb6.append(this.dateOfExpiryCheckDigit);
            sb6.append(mrzFormat(this.optionalData1, 7));
            return sb6.toString();
        }
        if (i == 3) {
            return null;
        }
        if (i != 4) {
            if (i == 5) {
                return null;
            }
            throw new IllegalStateException("Unsupported document type");
        }
        sb6.append(mrzFormat(this.documentNumber, 9));
        sb6.append(this.documentNumberCheckDigit);
        sb6.append(this.dateOfBirth);
        sb6.append(this.dateOfBirthCheckDigit);
        sb6.append(this.dateOfExpiry);
        sb6.append(this.dateOfExpiryCheckDigit);
        sb6.append(mrzFormat(this.optionalData1, 14));
        sb6.append(this.personalNumberCheckDigit);
        return sb6.toString();
    }

    private static DocumentType getDocumentTypeFromDocumentCode(String str) {
        return (str.startsWith("A") || str.startsWith("C") || str.startsWith("I")) ? DocumentType.TD1 : str.startsWith("V") ? DocumentType.MRVB : str.startsWith("P") ? DocumentType.TD3 : DocumentType.UNKNOWN;
    }

    private static boolean isDocumentCodeConsistentWithDocumentType(DocumentType documentType, String str) {
        if (str == null) {
            return false;
        }
        if (str.length() != 1 && str.length() != 2) {
            return false;
        }
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i == 1 || i == 2) {
            return str.startsWith("C") || str.startsWith("I") || str.startsWith("A");
        }
        if (i != 3) {
            if (i == 4) {
                return str.startsWith("P");
            }
            if (i != 5) {
                return false;
            }
        }
        return str.startsWith("V");
    }

    private static boolean isOptionalDataConsistentWithDocumentType(DocumentType documentType, String str, String str2) {
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i == 1) {
            return (str == null || str.length() <= 15) && (str2 == null || str2.length() <= 11);
        }
        if (i == 2) {
            return (str == null || str.length() <= 7) && str2 == null;
        }
        if (i == 3) {
            return (str == null || str.length() <= 8) && str2 == null;
        }
        if (i == 4) {
            return (str == null || str.length() <= 15) && str2 == null;
        }
        if (i != 5) {
            return false;
        }
        return (str == null || str.length() <= 16) && str2 == null;
    }

    private static String mrzFormat(String str, int i) {
        if (str == null) {
            return "";
        }
        if (str.length() > i) {
            throw new IllegalArgumentException("Argument too wide (" + str.length() + " > " + i + ")");
        }
        String strTrim = str.toUpperCase().trim();
        StringBuilder sb6 = new StringBuilder();
        for (int i2 = 0; i2 < strTrim.length(); i2++) {
            char cCharAt = strTrim.charAt(i2);
            if ("<0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cCharAt) == -1) {
                sb6.append('<');
            } else {
                sb6.append(cCharAt);
            }
        }
        while (sb6.length() < i) {
            sb6.append("<");
        }
        return sb6.toString();
    }

    private static String nameToString(String str, String str2, int i) {
        String[] strArrSplit = str.split(" |<");
        String[] strArrSplit2 = (str2 == null || str2.trim().isEmpty()) ? new String[0] : str2.split(" |<");
        StringBuilder sb6 = new StringBuilder();
        boolean z = true;
        boolean z3 = true;
        for (String str3 : strArrSplit) {
            if (z3) {
                z3 = false;
            } else {
                sb6.append('<');
            }
            sb6.append(str3);
        }
        if (str2 != null && !str2.trim().isEmpty()) {
            sb6.append("<<");
            for (String str4 : strArrSplit2) {
                if (z) {
                    z = false;
                } else {
                    sb6.append('<');
                }
                sb6.append(str4);
            }
        }
        return mrzFormat(sb6.toString(), i);
    }

    private static String personalNumberToOptionalData(String str) {
        if (str == null || equalsModuloFillerChars(str, "")) {
            return "";
        }
        if (str.length() == 15) {
            return str;
        }
        if (str.length() <= 14) {
            return mrzFormat(str, 14);
        }
        throw new IllegalArgumentException("Wrong personal number: ".concat(str));
    }

    private static String readCountryCode(DataInputStream dataInputStream) throws IOException {
        return trimTrailingFillerChars(readString(dataInputStream, 3));
    }

    private String readDate(DataInputStream dataInputStream) throws IOException, NumberFormatException {
        return readString(dataInputStream, 6);
    }

    private void readNameIdentifiers(String str) {
        int iIndexOf = str.indexOf("<<");
        if (iIndexOf < 0) {
            this.primaryIdentifier = trimTrailingFillerChars(str).replace("<", " ");
            this.secondaryIdentifier = "";
        } else {
            this.primaryIdentifier = trimTrailingFillerChars(str.substring(0, iIndexOf)).replace("<", " ");
            readSecondaryIdentifiers(str.substring(iIndexOf + 2));
        }
    }

    private void readObject(InputStream inputStream, int i) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        String strTrimTrailingFillerChars = trimTrailingFillerChars(readString(dataInputStream, 2));
        this.documentCode = strTrimTrailingFillerChars;
        DocumentType documentType = getDocumentType(strTrimTrailingFillerChars, i);
        this.documentType = documentType;
        int i2 = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i2 == 1) {
            readObjectTD1(dataInputStream);
        } else if (i2 == 2 || i2 == 3) {
            readObjectTD2orMRVB(dataInputStream);
        } else {
            readObjectTD3OrMRVA(dataInputStream);
        }
    }

    private void readObjectTD1(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.issuingState = readCountryCode(dataInputStream);
        this.documentNumber = readString(dataInputStream, 9);
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        String strTrimTrailingFillerChars = trimTrailingFillerChars(readString(dataInputStream, 15));
        this.optionalData1 = strTrimTrailingFillerChars;
        if (this.documentNumberCheckDigit == '<' && !strTrimTrailingFillerChars.isEmpty()) {
            int iIndexOf = this.optionalData1.indexOf(60);
            if (iIndexOf < 0) {
                iIndexOf = this.optionalData1.length();
            }
            int i = iIndexOf - 1;
            this.documentNumber = a.i(new StringBuilder(), this.documentNumber, this.optionalData1.substring(0, i));
            this.documentNumberCheckDigit = this.optionalData1.charAt(i);
            String str = this.optionalData1;
            this.optionalData1 = str.substring(Integer.min(iIndexOf + 1, str.length()));
        }
        this.documentNumber = trimTrailingFillerChars(this.documentNumber);
        this.dateOfBirth = readDate(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = readString(dataInputStream, 1);
        this.dateOfExpiry = readDate(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = readCountryCode(dataInputStream);
        this.optionalData2 = trimTrailingFillerChars(readString(dataInputStream, 11));
        this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
        readNameIdentifiers(readString(dataInputStream, 30));
    }

    private void readObjectTD2orMRVB(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.issuingState = readCountryCode(dataInputStream);
        readNameIdentifiers(readString(dataInputStream, 31));
        this.documentNumber = trimTrailingFillerChars(readString(dataInputStream, 9));
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = readCountryCode(dataInputStream);
        this.dateOfBirth = readDate(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = readString(dataInputStream, 1);
        this.dateOfExpiry = readDate(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        DocumentType documentType = this.documentType;
        if (documentType == DocumentType.MRVB) {
            this.optionalData1 = trimTrailingFillerChars(readString(dataInputStream, 8));
        } else if (documentType == DocumentType.TD2) {
            String strTrimTrailingFillerChars = trimTrailingFillerChars(readString(dataInputStream, 7));
            this.optionalData1 = strTrimTrailingFillerChars;
            if (this.documentNumberCheckDigit == '<' && !strTrimTrailingFillerChars.isEmpty()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(this.documentNumber);
                String str = this.optionalData1;
                sb6.append(str.substring(0, str.length() - 1));
                this.documentNumber = sb6.toString();
                String str2 = this.optionalData1;
                this.documentNumberCheckDigit = str2.charAt(str2.length() - 1);
                this.optionalData1 = "";
            }
        }
        this.documentNumber = trimTrailingFillerChars(this.documentNumber);
        if (this.documentType == DocumentType.TD2) {
            this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
        }
    }

    private void readObjectTD3OrMRVA(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.issuingState = readCountryCode(dataInputStream);
        readNameIdentifiers(readString(dataInputStream, 39));
        this.documentNumber = trimTrailingFillerChars(readString(dataInputStream, 9));
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = readCountryCode(dataInputStream);
        this.dateOfBirth = readDate(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = readString(dataInputStream, 1);
        this.dateOfExpiry = readDate(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        if (this.documentType == DocumentType.MRVA) {
            this.optionalData1 = trimTrailingFillerChars(readString(dataInputStream, 16));
            return;
        }
        this.optionalData1 = trimTrailingFillerChars(readString(dataInputStream, 14));
        this.personalNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
    }

    private void readSecondaryIdentifiers(String str) {
        this.secondaryIdentifier = trimTrailingFillerChars(str).replace("<", " ");
    }

    private static String readString(DataInputStream dataInputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new String(bArr).trim();
    }

    private static Gender stringToGender(String str) {
        return "M".equalsIgnoreCase(str) ? Gender.MALE : "F".equalsIgnoreCase(str) ? Gender.FEMALE : Gender.UNKNOWN;
    }

    private static String trimTrailingFillerChars(String str) {
        if (str == null) {
            str = "";
        }
        byte[] bytes = str.trim().getBytes();
        for (int length = bytes.length - 1; length >= 0 && bytes[length] == 60; length--) {
            bytes[length] = 32;
        }
        return new String(bytes).trim();
    }

    private static void writeCountryCode(String str, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(mrzFormat(str, 3).getBytes("UTF-8"));
    }

    private void writeDateOfBirth(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.dateOfBirth.getBytes("UTF-8"));
    }

    private void writeDateOfExpiry(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.dateOfExpiry.getBytes("UTF-8"));
    }

    private void writeDocumentType(DataOutputStream dataOutputStream) throws IOException {
        writeString(this.documentCode, dataOutputStream, 2);
    }

    private void writeGender(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.gender.getBytes("UTF-8"));
    }

    private void writeName(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.write(nameToString(this.primaryIdentifier, this.secondaryIdentifier, i).getBytes("UTF-8"));
    }

    private void writeObjectTD1(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        writeDocumentType(dataOutputStream);
        writeCountryCode(this.issuingState, dataOutputStream);
        if (this.documentNumber.length() > 9) {
            writeString(this.documentNumber.substring(0, 9), dataOutputStream, 9);
            dataOutputStream.write(60);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.documentNumber.substring(9));
            sb6.append(Character.toString(this.documentNumberCheckDigit));
            sb6.append("<");
            String str = this.optionalData1;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            writeString(sb6.toString(), dataOutputStream, 15);
        } else {
            writeString(this.documentNumber, dataOutputStream, 9);
            dataOutputStream.write(this.documentNumberCheckDigit);
            String str2 = this.optionalData1;
            if (str2 == null) {
                str2 = "";
            }
            writeString(str2, dataOutputStream, 15);
        }
        writeDateOfBirth(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        writeGender(dataOutputStream);
        writeDateOfExpiry(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        writeCountryCode(this.nationality, dataOutputStream);
        String str3 = this.optionalData2;
        writeString(str3 != null ? str3 : "", dataOutputStream, 11);
        dataOutputStream.write(this.compositeCheckDigit);
        writeName(dataOutputStream, 30);
    }

    private void writeObjectTD2OrMRVB(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        writeDocumentType(dataOutputStream);
        writeCountryCode(this.issuingState, dataOutputStream);
        writeName(dataOutputStream, 31);
        boolean z = this.documentType == DocumentType.TD2 && this.documentNumber.length() > 9 && equalsModuloFillerChars(this.optionalData1, "");
        if (z) {
            writeString(this.documentNumber.substring(0, 9), dataOutputStream, 9);
            dataOutputStream.write(60);
        } else {
            writeString(this.documentNumber, dataOutputStream, 9);
            dataOutputStream.write(this.documentNumberCheckDigit);
        }
        writeCountryCode(this.nationality, dataOutputStream);
        writeDateOfBirth(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        writeGender(dataOutputStream);
        writeDateOfExpiry(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        if (this.documentType == DocumentType.MRVB) {
            String str = this.optionalData1;
            writeString(str != null ? str : "", dataOutputStream, 8);
            return;
        }
        if (!z) {
            String str2 = this.optionalData1;
            writeString(str2 != null ? str2 : "", dataOutputStream, 7);
            dataOutputStream.write(this.compositeCheckDigit);
        } else {
            writeString(this.documentNumber.substring(9) + this.documentNumberCheckDigit + "<", dataOutputStream, 7);
            dataOutputStream.write(this.compositeCheckDigit);
        }
    }

    private void writeObjectTD3OrMRVA(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        writeDocumentType(dataOutputStream);
        writeCountryCode(this.issuingState, dataOutputStream);
        writeName(dataOutputStream, 39);
        writeString(this.documentNumber, dataOutputStream, 9);
        dataOutputStream.write(this.documentNumberCheckDigit);
        writeCountryCode(this.nationality, dataOutputStream);
        writeDateOfBirth(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        writeGender(dataOutputStream);
        writeDateOfExpiry(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        if (this.documentType == DocumentType.MRVA) {
            String str = this.optionalData1;
            writeString(str != null ? str : "", dataOutputStream, 16);
        } else {
            String str2 = this.optionalData1;
            writeString(str2 != null ? str2 : "", dataOutputStream, 14);
            dataOutputStream.write(this.personalNumberCheckDigit);
            dataOutputStream.write(this.compositeCheckDigit);
        }
    }

    private void writeString(String str, DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.write(mrzFormat(str, i).getBytes("UTF-8"));
    }

    public boolean equals(Object obj2) {
        String str;
        String str2;
        String str3;
        if (obj2 == null || !obj2.getClass().equals(getClass())) {
            return false;
        }
        MRZInfo mRZInfo = (MRZInfo) obj2;
        return equalsModuloFillerChars(this.documentCode, mRZInfo.documentCode) && equalsModuloFillerChars(this.issuingState, mRZInfo.issuingState) && equalsModuloFillerChars(this.primaryIdentifier, mRZInfo.primaryIdentifier) && equalsModuloFillerChars(this.secondaryIdentifier, mRZInfo.secondaryIdentifier) && equalsModuloFillerChars(this.nationality, mRZInfo.nationality) && equalsModuloFillerChars(this.documentNumber, mRZInfo.documentNumber) && (equalsModuloFillerChars(this.optionalData1, mRZInfo.optionalData1) || equalsModuloFillerChars(getPersonalNumber(), mRZInfo.getPersonalNumber())) && ((((str = this.dateOfBirth) == null && mRZInfo.dateOfBirth == null) || (str != null && str.equals(mRZInfo.dateOfBirth))) && ((((str2 = this.gender) == null && mRZInfo.gender == null) || (str2 != null && str2.equals(mRZInfo.gender))) && ((((str3 = this.dateOfExpiry) == null && mRZInfo.dateOfExpiry == null) || (str3 != null && str3.equals(mRZInfo.dateOfExpiry))) && equalsModuloFillerChars(this.optionalData2, mRZInfo.optionalData2))));
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public String getDocumentCode() {
        return this.documentCode;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    @Deprecated
    public int getDocumentType() {
        return this.documentType.getCode();
    }

    @Deprecated
    public Gender getGender() {
        return stringToGender(this.gender);
    }

    public Gender getGenderCode() {
        return stringToGender(this.gender);
    }

    public String getIssuingState() {
        return mrzFormat(this.issuingState, 3);
    }

    public String getNameOfHolder() {
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[this.documentType.ordinal()];
        if (i == 1) {
            return trimTrailingFillerChars(nameToString(this.primaryIdentifier, this.secondaryIdentifier, 30));
        }
        if (i == 2 || i == 3) {
            return trimTrailingFillerChars(nameToString(this.primaryIdentifier, this.secondaryIdentifier, 31));
        }
        if (i == 4 || i == 5) {
            return trimTrailingFillerChars(nameToString(this.primaryIdentifier, this.secondaryIdentifier, 39));
        }
        throw new IllegalStateException("Unsupported document type");
    }

    public String getNationality() {
        return mrzFormat(this.nationality, 3);
    }

    public String getOptionalData1() {
        return this.optionalData1;
    }

    public String getOptionalData2() {
        return this.optionalData2;
    }

    public String getPersonalNumber() {
        String str = this.optionalData1;
        if (str == null) {
            return null;
        }
        return str.length() > 14 ? trimTrailingFillerChars(this.optionalData1.substring(0, 14)) : trimTrailingFillerChars(this.optionalData1);
    }

    public String getPrimaryIdentifier() {
        return this.primaryIdentifier;
    }

    public String getSecondaryIdentifier() {
        return this.secondaryIdentifier;
    }

    public String[] getSecondaryIdentifierComponents() {
        return this.secondaryIdentifier.split(" |<");
    }

    public int hashCode() {
        return (toString().hashCode() * 2) + 53;
    }

    public String toString() {
        try {
            String str = new String(getEncoded(), "UTF-8");
            int length = str.length();
            if (length == 72) {
                return str.substring(0, 36) + "\n" + str.substring(36, 72) + "\n";
            }
            if (length == 88) {
                return str.substring(0, 44) + "\n" + str.substring(44, 88) + "\n";
            }
            if (length != 90) {
                return str;
            }
            return str.substring(0, 30) + "\n" + str.substring(30, 60) + "\n" + str.substring(60, 90) + "\n";
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) throws IOException {
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[this.documentType.ordinal()];
        if (i == 1) {
            writeObjectTD1(outputStream);
            return;
        }
        if (i == 2 || i == 3) {
            writeObjectTD2OrMRVB(outputStream);
        } else {
            if (i != 4 && i != 5) {
                throw new IllegalStateException("Unsupported document type");
            }
            writeObjectTD3OrMRVA(outputStream);
        }
    }

    private void checkDigit() {
        this.documentNumberCheckDigit = checkDigit(this.documentNumber);
        this.dateOfBirthCheckDigit = checkDigit(this.dateOfBirth);
        this.dateOfExpiryCheckDigit = checkDigit(this.dateOfExpiry);
        if (this.documentType == DocumentType.TD3 && this.optionalData1.length() < 15) {
            this.personalNumberCheckDigit = checkDigit(mrzFormat(this.optionalData1, 14), true);
        }
        this.compositeCheckDigit = checkDigit(getComposite(this.documentType));
    }

    private static DocumentType getDocumentType(String str, int i) {
        if (str == null || str.length() < 1 || str.length() > 2) {
            throw new IllegalArgumentException(j6.a.q("Was expecting 1 or 2 digit document code, got ", str));
        }
        return i != 72 ? i != 88 ? i != 90 ? DocumentType.UNKNOWN : DocumentType.TD1 : str.startsWith("V") ? DocumentType.MRVA : DocumentType.TD3 : str.startsWith("V") ? DocumentType.MRVB : DocumentType.TD2;
    }

    @Deprecated
    public MRZInfo(String str, String str2, String str3, String str4, String str5, Gender gender, String str6, String str7, String str8, String str9, String str10) {
        this(getDocumentTypeFromDocumentCode(str), str, str2, str3, str4, str5, gender, str6, str7, str8, str9, str10);
    }

    public MRZInfo(InputStream inputStream, int i) {
        try {
            readObject(inputStream, i);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public MRZInfo(String str) {
        if (str != null) {
            String strReplace = str.trim().replace("\n", "");
            try {
                readObject(new ByteArrayInputStream(strReplace.getBytes("UTF-8")), strReplace.length());
                return;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Exception", e);
            } catch (IOException e2) {
                throw new IllegalArgumentException("Exception", e2);
            }
        }
        throw new IllegalArgumentException("Null string");
    }

    private static char checkDigit(String str, boolean z) {
        try {
            byte[] bytes = str == null ? new byte[0] : str.getBytes("UTF-8");
            int[] iArr = {7, 3, 1};
            int iDecodeMRZDigit = 0;
            for (int i = 0; i < bytes.length; i++) {
                iDecodeMRZDigit = ((iArr[i % 3] * decodeMRZDigit(bytes[i])) + iDecodeMRZDigit) % 10;
            }
            String string = Integer.toString(iDecodeMRZDigit);
            if (string.length() == 1) {
                char c2 = (char) string.getBytes("UTF-8")[0];
                if (z && c2 == '0') {
                    return '<';
                }
                return c2;
            }
            throw new IllegalStateException("Error in computing check digit.");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Error in computing check digit", e);
        } catch (NumberFormatException e2) {
            throw new IllegalStateException("Error in computing check digit", e2);
        } catch (Exception e4) {
            throw new IllegalArgumentException("Error in computing check digit", e4);
        }
    }

    private MRZInfo(DocumentType documentType, String str, String str2, String str3, String str4, String str5, Object obj2, String str6, String str7, String str8, String str9, String str10) {
        this.documentType = documentType;
        if (isDocumentCodeConsistentWithDocumentType(documentType, str)) {
            if (!isOptionalDataConsistentWithDocumentType(documentType, str4, str8)) {
                throw new IllegalArgumentException("Wrong optional data length");
            }
            if (obj2 != null) {
                this.documentCode = trimTrailingFillerChars(str);
                this.issuingState = str2;
                this.primaryIdentifier = trimTrailingFillerChars(str9).replace("<", " ");
                this.secondaryIdentifier = trimTrailingFillerChars(str10).replace("<", " ");
                this.documentNumber = trimTrailingFillerChars(str3);
                this.nationality = str7;
                this.dateOfBirth = str5;
                this.gender = genderToString(obj2);
                this.dateOfExpiry = str6;
                this.optionalData1 = str4 == null ? "" : trimTrailingFillerChars(str4);
                this.optionalData2 = str8 == null ? null : trimTrailingFillerChars(str8);
                checkDigit();
                return;
            }
            throw new IllegalArgumentException("Gender must not be null");
        }
        throw new IllegalArgumentException("Wrong document code");
    }
}
