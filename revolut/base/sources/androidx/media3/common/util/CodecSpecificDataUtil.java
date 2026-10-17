package androidx.media3.common.util;

import a0.d;
import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.StandardBiometricHeader;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodecSpecificDataUtil {
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", "A", "B", "C"};
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    private static int ac4BitstreamAndPresentationVersionsToProfileConst(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE;
            }
            return -1;
        }
        if (i != 1) {
            if (i != 2) {
                return -1;
            }
            if (i2 == 1) {
                return 1026;
            }
            return i2 == 2 ? 1028 : -1;
        }
        if (i2 == 0) {
            return 513;
        }
        if (i2 == 1) {
            return SyslogConstants.SYSLOG_PORT;
        }
        return -1;
    }

    private static int ac4LevelNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int av1LevelNumberToConst(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return PKIFailureInfo.badCertTemplate;
            case 21:
                return PKIFailureInfo.badSenderNonce;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcProfileNumberToConst(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String buildApvCodecString(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 17, "Invalid APV CSD length: %s", bArr.length);
        byte b4 = bArr[0];
        Preconditions.checkArgument(b4 == 1, "Invalid APV CSD version: %s", (int) b4);
        return Util.formatInvariant("apv1.apvf%d.apvl%d.apvb%d", Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7]));
    }

    public static String buildAvcCodecString(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String buildDolbyVisionCodecString(int i, int i2) {
        return i > 9 ? Util.formatInvariant("dvh1.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2)) : i > 8 ? Util.formatInvariant("dvav.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2)) : Util.formatInvariant("dvhe.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static byte[] buildDolbyVisionInitializationData(int i, int i2) {
        int i3;
        int i5;
        byte[] bArr = new byte[24];
        if (i == 8) {
            i3 = 4;
            i5 = 0;
        } else if (i == 9) {
            i3 = 2;
            i5 = 1;
        } else {
            i3 = 0;
            i5 = 0;
        }
        bArr[0] = 1;
        bArr[1] = 0;
        byte b4 = (byte) ((i & CertificateBody.profileType) << 1);
        bArr[2] = b4;
        bArr[2] = (byte) ((b4 | ((i2 >> 5) & 1)) & 255);
        byte b5 = (byte) ((i2 & 31) << 3);
        bArr[3] = b5;
        byte b7 = (byte) (b5 | 4);
        bArr[3] = b7;
        byte b13 = b7;
        bArr[3] = b13;
        bArr[3] = (byte) (b13 | 1);
        byte b15 = (byte) (i3 << 4);
        bArr[4] = b15;
        bArr[4] = (byte) (b15 | (i5 << 2));
        return bArr;
    }

    public static String buildH263CodecString(int i, int i2) {
        return Util.formatInvariant("s263.%d.%d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i5) {
        StringBuilder sb6 = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i5)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb6.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb6.toString();
    }

    public static String buildIamfCodecString(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        String invariant = null;
        String string = null;
        while (parsableByteArray.bytesLeft() > 0 && (invariant == null || string == null)) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int i = unsignedByte >> 3;
            boolean z = (unsignedByte & 2) != 0;
            boolean z3 = (unsignedByte & 1) != 0;
            int unsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
            if (i > 4 && i < 24 && z) {
                parsableByteArray.skipLeb128();
                parsableByteArray.skipLeb128();
            }
            if (z3) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedLeb128ToInt());
            }
            int position = parsableByteArray.getPosition() + unsignedLeb128ToInt;
            if (i == 31) {
                parsableByteArray.skipBytes(4);
                invariant = Util.formatInvariant("iamf.%03X.%03X", Integer.valueOf(parsableByteArray.readUnsignedByte()), Integer.valueOf(parsableByteArray.readUnsignedByte()));
            } else if (i == 0) {
                parsableByteArray.skipLeb128();
                string = parsableByteArray.readString(4);
                if (string.equals("mp4a")) {
                    parsableByteArray.skipLeb128();
                    parsableByteArray.skipBytes(2);
                    ParsableBitArray parsableBitArray = new ParsableBitArray();
                    parsableBitArray.reset(parsableByteArray);
                    int bits = parsableBitArray.readBits(5);
                    if (bits == 31) {
                        bits = parsableBitArray.readBits(6) + 32;
                    }
                    string = com.google.android.gms.internal.mlkit_vision_face.a.k(bits, string, ".40.");
                }
            }
            parsableByteArray.setPosition(position);
        }
        if (invariant == null || string == null) {
            return null;
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(invariant, ".", string);
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static ImmutableList<byte[]> buildVp9CodecPrivateInitializationData(byte b4, byte b5, byte b7, byte b13) {
        return ImmutableList.of(new byte[]{1, 1, b4, 2, 1, b5, 3, 1, b7, 4, 1, b13});
    }

    public static int dolbyVisionConstantToLevelNumber(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                switch (i) {
                    case 4:
                        return 3;
                    case 8:
                        return 4;
                    case 16:
                        return 5;
                    case 32:
                        return 6;
                    case 64:
                        return 7;
                    case 128:
                        return 8;
                    case 256:
                        return 9;
                    case 512:
                        return 10;
                    case 1024:
                        return 11;
                    case 2048:
                        return 12;
                    case 4096:
                        return 13;
                    default:
                        throw new IllegalArgumentException(d.n("Unknown Dolby Vision level: ", i));
                }
            }
        }
        return i2;
    }

    public static int dolbyVisionConstantToProfileNumber(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        if (i == 1024) {
            return 10;
        }
        throw new IllegalArgumentException(d.n("Unknown Dolby Vision profile: ", i));
    }

    private static Integer dolbyVisionStringToLevel(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Integer dolbyVisionStringToProfile(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed MP4A codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed MP4A codec string: ", str, "CodecSpecificDataUtil");
        }
        return null;
    }

    private static Pair<Integer, Integer> getAc4CodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length != 4) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed AC-4 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int i3 = Integer.parseInt(strArr[3]);
            int iAc4BitstreamAndPresentationVersionsToProfileConst = ac4BitstreamAndPresentationVersionsToProfileConst(i, i2);
            if (iAc4BitstreamAndPresentationVersionsToProfileConst != -1) {
                int iAc4LevelNumberToConst = ac4LevelNumberToConst(i3);
                if (iAc4LevelNumberToConst != -1) {
                    return new Pair<>(Integer.valueOf(iAc4BitstreamAndPresentationVersionsToProfileConst), Integer.valueOf(iAc4LevelNumberToConst));
                }
                com.google.android.gms.internal.mlkit_vision_face.a.z(i3, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                return null;
            }
            Log.w("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i + "." + i2);
            return null;
        } catch (NumberFormatException unused) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed AC-4 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
    }

    private static Pair<Integer, Integer> getApvProfileAndLevel(String str, String[] strArr) {
        int i;
        if (strArr.length < 4) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed APV codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1].substring(4));
            int i3 = Integer.parseInt(strArr[2].substring(4));
            int i5 = Integer.parseInt(strArr[3].substring(4));
            if (i2 == 33) {
                i = 1;
            } else {
                if (i2 != 44) {
                    com.google.android.gms.internal.mlkit_vision_face.a.z(i2, "Ignoring invalid APV profile: ", "CodecSpecificDataUtil");
                    return null;
                }
                i = 8192;
            }
            int i6 = (i3 / 30) * 2;
            if (i3 % 30 == 0) {
                i6--;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf((1 << i5) | (256 << (i6 - 1))));
        } catch (NumberFormatException e) {
            Log.w("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str, e);
            return null;
        }
    }

    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        if (strArr.length < 4) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2].substring(0, 2));
            int i5 = Integer.parseInt(strArr[3]);
            if (i2 != 0) {
                com.google.android.gms.internal.mlkit_vision_face.a.z(i2, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                return null;
            }
            if (i5 != 8 && i5 != 10) {
                com.google.android.gms.internal.mlkit_vision_face.a.z(i5, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                return null;
            }
            int i6 = i5 != 8 ? (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i = colorInfo.colorTransfer) == 7 || i == 6)) ? 2 : 4096 : 1;
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i3);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i6), Integer.valueOf(iAv1LevelNumberToConst));
            }
            com.google.android.gms.internal.mlkit_vision_face.a.z(i3, "Unknown AV1 level: ", "CodecSpecificDataUtil");
            return null;
        } catch (NumberFormatException unused) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
    }

    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    Log.w("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i2);
            if (iAvcProfileNumberToConst == -1) {
                com.google.android.gms.internal.mlkit_vision_face.a.z(i2, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            com.google.android.gms.internal.mlkit_vision_face.a.z(i, "Unknown AVC level: ", "CodecSpecificDataUtil");
            return null;
        } catch (NumberFormatException unused) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
    }

    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "ac-4":
                return getAc4CodecProfileAndLevel(format.codecs, strArrSplit);
            case "apv1":
                return getApvProfileAndLevel(format.codecs, strArrSplit);
            case "av01":
                return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case "avc1":
            case "avc2":
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case "hev1":
            case "hvc1":
                return getHevcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case "iamf":
                return getIamfCodecProfileAndLevel(format.codecs, strArrSplit);
            case "mp4a":
                return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
            case "s263":
                return getH263ProfileAndLevel(format.codecs, strArrSplit);
            case "vp09":
                return getVp9ProfileAndLevel(format.codecs, strArrSplit);
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed Dolby Vision codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed Dolby Vision codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        com.google.android.gms.internal.mlkit_vision_face.a.D("Unknown Dolby Vision level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }

    private static Pair<Integer, Integer> getH263ProfileAndLevel(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
            return pair;
        }
    }

    public static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        if (strArr.length < 4) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        int i = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i = 6;
            if ("2".equals(strGroup)) {
                i = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                com.google.android.gms.internal.mlkit_vision_face.a.D("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i), numHevcCodecStringToProfileLevel);
        }
        com.google.android.gms.internal.mlkit_vision_face.a.D("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }

    private static Pair<Integer, Integer> getIamfCodecProfileAndLevel(String str, String[] strArr) {
        int i = 4;
        if (strArr.length < 4) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed IAMF codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            int i2 = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i = 1;
                    break;
                case "fLaC":
                    break;
                case "ipcm":
                    i = 8;
                    break;
                case "mp4a":
                    i = 2;
                    break;
                default:
                    Log.w("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair<>(Integer.valueOf(16777216 | i2 | i), 0);
        } catch (NumberFormatException e) {
            Log.w("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e);
            return null;
        }
    }

    public static ByteBuffer getVorbisInitializationData(Format format) {
        Preconditions.checkArgument(format.initializationData.size() > 1, "csd-0 and csd-1 must be present for Vorbis.");
        byte[] bArr = format.initializationData.get(0);
        byte[] bArr2 = format.initializationData.get(1);
        byte[] bArr3 = {3, 118, ISOFileInfo.FCI_BYTE, 114, ISOFileInfo.FCP_BYTE, 105, 115, 7, 0, 0, 0, 97, 110, ISOFileInfo.FMD_BYTE, 114, ISOFileInfo.FCI_BYTE, 105, ISOFileInfo.FMD_BYTE, 0, 0, 0, 0, 1};
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrXiphLaceEnc = xiphLaceEnc(length);
        byte[] bArrXiphLaceEnc2 = xiphLaceEnc(23);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrXiphLaceEnc.length + 1 + bArrXiphLaceEnc2.length + length + 23 + length2);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put(bArrXiphLaceEnc);
        byteBufferAllocate.put(bArrXiphLaceEnc2);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.put(bArr3);
        byteBufferAllocate.put(bArr2);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i);
            if (iVp9ProfileNumberToConst == -1) {
                com.google.android.gms.internal.mlkit_vision_face.a.z(i, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i2);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            com.google.android.gms.internal.mlkit_vision_face.a.z(i2, "Unknown VP9 level: ", "CodecSpecificDataUtil");
            return null;
        } catch (NumberFormatException unused) {
            com.google.android.gms.internal.mlkit_vision_face.a.D("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer hevcCodecStringToProfileLevel(String str) {
        if (str == null) {
            return null;
        }
        byte b4 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b4 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b4 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b4 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b4 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b4 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b4 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b4 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b4 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b4 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b4 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b4 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b4 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b4 = 12;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b4 = 13;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b4 = 14;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b4 = 15;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b4 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b4 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b4 = 18;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b4 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b4 = Ascii.DC4;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b4 = Ascii.NAK;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b4 = Ascii.SYN;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b4 = Ascii.ETB;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b4 = Ascii.CAN;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b4 = Ascii.EM;
                }
                break;
        }
        switch (b4) {
        }
        return null;
    }

    private static int mp4aAudioObjectTypeToProfile(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static int[] parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(5);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(9);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return new int[]{parsableByteArray.readUnsignedIntToInt(), unsignedByte2, unsignedByte};
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    private static int vp9LevelNumberToConst(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static byte[] xiphLaceEnc(int i) {
        int i2 = i / 255;
        byte[] bArr = new byte[i2 + 1];
        Arrays.fill(bArr, (byte) -1);
        bArr[i2] = (byte) (i % 255);
        return bArr;
    }
}
