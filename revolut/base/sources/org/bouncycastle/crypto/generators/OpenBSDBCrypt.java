package org.bouncycastle.crypto.generators;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.jmrtd.lds.CVCAFile;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public class OpenBSDBCrypt {
    private static final Set<String> allowedVersions;
    private static final String defaultVersion = "2y";
    private static final byte[] encodingTable = {46, 47, 65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57};
    private static final byte[] decodingTable = new byte[128];

    static {
        HashSet hashSet = new HashSet();
        allowedVersions = hashSet;
        hashSet.add("2");
        hashSet.add("2x");
        hashSet.add("2a");
        hashSet.add("2y");
        hashSet.add("2b");
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i >= bArr2.length) {
                return;
            }
            decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    private OpenBSDBCrypt() {
    }

    public static boolean checkPassword(String str, byte[] bArr) {
        if (bArr != null) {
            return doCheckPassword(str, Arrays.clone(bArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    private static String createBcryptString(String str, byte[] bArr, byte[] bArr2, int i) {
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException(a.p("Version ", str, " is not accepted by this implementation."));
        }
        StringBuilder sb6 = new StringBuilder(60);
        sb6.append(CoreConstants.DOLLAR);
        sb6.append(str);
        sb6.append(CoreConstants.DOLLAR);
        sb6.append(i < 10 ? d.n("0", i) : Integer.toString(i));
        sb6.append(CoreConstants.DOLLAR);
        encodeData(sb6, bArr2);
        encodeData(sb6, BCrypt.generate(bArr, bArr2, i));
        return sb6.toString();
    }

    private static byte[] decodeSaltString(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length != 22) {
            throw new DataLengthException(j6.a.v(new StringBuilder("Invalid base64 salt length: "), " , 22 required.", charArray.length));
        }
        for (char c2 : charArray) {
            if (c2 > 'z' || c2 < '.' || (c2 > '9' && c2 < 'A')) {
                throw new IllegalArgumentException(d.n("Salt string contains invalid character: ", c2));
            }
        }
        char[] cArr = new char[24];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        for (int i = 0; i < 24; i += 4) {
            byte[] bArr = decodingTable;
            byte b4 = bArr[cArr[i]];
            byte b5 = bArr[cArr[i + 1]];
            byte b7 = bArr[cArr[i + 2]];
            byte b13 = bArr[cArr[i + 3]];
            byteArrayOutputStream.write((b4 << 2) | (b5 >> 4));
            byteArrayOutputStream.write((b5 << 4) | (b7 >> 2));
            byteArrayOutputStream.write(b13 | (b7 << 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = new byte[16];
        System.arraycopy(byteArray, 0, bArr2, 0, 16);
        return bArr2;
    }

    private static boolean doCheckPassword(String str, byte[] bArr) {
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("Missing bcryptString.");
        }
        if (str.charAt(1) != '2') {
            throw new IllegalArgumentException("not a Bcrypt string");
        }
        int length = str.length();
        if (length != 60 && (length != 59 || str.charAt(2) != '$')) {
            throw new DataLengthException(j6.a.l(length, "Bcrypt String length: ", ", 60 required."));
        }
        int i = 3;
        if (str.charAt(2) == '$') {
            if (str.charAt(0) != '$' || str.charAt(5) != '$') {
                throw new IllegalArgumentException("Invalid Bcrypt String format.");
            }
        } else if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        if (str.charAt(2) == '$') {
            strSubstring = str.substring(1, 2);
        } else {
            strSubstring = str.substring(1, 3);
            i = 4;
        }
        if (!allowedVersions.contains(strSubstring)) {
            throw new IllegalArgumentException(a.p("Bcrypt version '", strSubstring, "' is not supported by this implementation"));
        }
        String strSubstring2 = str.substring(i, i + 2);
        try {
            int i2 = Integer.parseInt(strSubstring2);
            if (i2 < 4 || i2 > 31) {
                throw new IllegalArgumentException(j6.a.l(i2, "Invalid cost factor: ", ", 4 < cost < 31 expected."));
            }
            return Strings.constantTimeAreEqual(str, doGenerate(strSubstring, bArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, length - 31)), i2));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(j6.a.q("Invalid cost factor: ", strSubstring2));
        }
    }

    private static String doGenerate(String str, byte[] bArr, byte[] bArr2, int i) {
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException(a.p("Version ", str, " is not accepted by this implementation."));
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt required.");
        }
        if (bArr2.length != 16) {
            throw new DataLengthException("16 byte salt required: " + bArr2.length);
        }
        if (i < 4 || i > 31) {
            throw new IllegalArgumentException("Invalid cost factor.");
        }
        int length = bArr.length < 72 ? bArr.length + 1 : 72;
        byte[] bArr3 = new byte[length];
        if (length > bArr.length) {
            length = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr3, 0, length);
        Arrays.fill(bArr, (byte) 0);
        String strCreateBcryptString = createBcryptString(str, bArr3, bArr2, i);
        Arrays.fill(bArr3, (byte) 0);
        return strCreateBcryptString;
    }

    private static void encodeData(StringBuilder sb6, byte[] bArr) {
        boolean z;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException(j6.a.v(new StringBuilder("Invalid length: "), ", 24 for key or 16 for salt expected", bArr.length));
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z = false;
        }
        int length = bArr.length;
        for (int i = 0; i < length; i += 3) {
            int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
            int i3 = bArr[i + 1] & UnsignedBytes.MAX_VALUE;
            byte b4 = bArr[i + 2];
            int i5 = b4 & UnsignedBytes.MAX_VALUE;
            byte[] bArr3 = encodingTable;
            sb6.append((char) bArr3[(i2 >>> 2) & 63]);
            sb6.append((char) bArr3[((i2 << 4) | (i3 >>> 4)) & 63]);
            sb6.append((char) bArr3[((i3 << 2) | (i5 >>> 6)) & 63]);
            sb6.append((char) bArr3[b4 & 63]);
        }
        int length2 = sb6.length();
        sb6.setLength(z ? length2 - 2 : length2 - 1);
    }

    public static String generate(String str, byte[] bArr, byte[] bArr2, int i) {
        if (bArr != null) {
            return doGenerate(str, Arrays.clone(bArr), bArr2, i);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (cArr != null) {
            return doCheckPassword(str, Strings.toUTF8ByteArray(cArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    public static String generate(String str, char[] cArr, byte[] bArr, int i) {
        if (cArr != null) {
            return doGenerate(str, Strings.toUTF8ByteArray(cArr), bArr, i);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static String generate(byte[] bArr, byte[] bArr2, int i) {
        return generate("2y", bArr, bArr2, i);
    }

    public static String generate(char[] cArr, byte[] bArr, int i) {
        return generate("2y", cArr, bArr, i);
    }
}
