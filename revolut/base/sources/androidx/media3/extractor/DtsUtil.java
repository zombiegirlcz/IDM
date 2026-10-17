package androidx.media3.extractor;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes15.dex */
public abstract class DtsUtil {
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 16000, 32000, -1, -1, 11025, 22050, MicAvailabilityHelper.SAMPLE_RATE_HZ, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, BERTags.FLAGS, 256, 384, CaptureActivity.RESULT_EXIT_USER_FLOW, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] SAMPLE_RATE_BY_INDEX = {ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 16000, 32000, 64000, 128000, 22050, MicAvailabilityHelper.SAMPLE_RATE_HZ, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    public static final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final String mimeType;
        public final int sampleRate;

        private DtsHeader(String str, int i, int i2, int i3, long j2, int i5) {
            this.mimeType = str;
            this.channelCount = i;
            this.sampleRate = i2;
            this.frameSize = i3;
            this.frameDurationUs = j2;
            this.bitrate = i5;
        }
    }

    private static void checkCrc(byte[] bArr, int i) throws ParserException {
        int i2 = i - 2;
        if (((bArr[i - 1] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] << 8) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) != Util.crc16(bArr, 0, i2, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.DtsUtil.getDtsFrameSize(byte[]):int");
    }

    public static int getFrameType(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    private static ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b4 = bArr[0];
        if (b4 == 127 || b4 == 100 || b4 == 64 || b4 == 113) {
            return new ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b5 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b5;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b4 = bArr[0];
        return b4 == -2 || b4 == -1 || b4 == 37 || b4 == -14 || b4 == -24;
    }

    public static boolean isSampleDtsHd(ExtractorInput extractorInput, int i) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        if (!extractorInput.peekFully(parsableByteArray.getData(), 0, i, true)) {
            return false;
        }
        extractorInput.resetPeekPosition();
        if (getFrameType(parsableByteArray.peekInt()) != 1 || parsableByteArray.bytesLeft() < 10) {
            return false;
        }
        byte[] bArr = new byte[10];
        parsableByteArray.readBytes(bArr, 0, 10);
        parsableByteArray.setPosition(0);
        int dtsFrameSize = getDtsFrameSize(bArr);
        if (dtsFrameSize > 0 && parsableByteArray.bytesLeft() >= dtsFrameSize + 4) {
            parsableByteArray.skipBytes(dtsFrameSize);
            if (getFrameType(parsableByteArray.readInt()) == 2) {
                return true;
            }
        }
        return false;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i;
        byte b4;
        int i2;
        byte b5;
        byte b7 = bArr[0];
        if (b7 != -2) {
            if (b7 == -1) {
                i = (bArr[4] & 7) << 4;
                b5 = bArr[7];
            } else if (b7 != 31) {
                i = (bArr[4] & 1) << 6;
                b4 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b5 = bArr[6];
            }
            i2 = b5 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b4 = bArr[4];
        i2 = b4 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, String str, String str2, int i, String str3, DrmInitData drmInitData) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i2 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i3 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int bits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i5 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        normalizedFrame.skipBits(10);
        return new Format.Builder().setId(str).setContainerMimeType(str3).setSampleMimeType("audio/vnd.dts").setAverageBitrate(i5).setChannelCount(i2 + (normalizedFrame.readBits(2) > 0 ? 1 : 0)).setSampleRate(i3).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i).build();
    }

    public static DtsHeader parseDtsHdHeader(byte[] bArr) throws ParserException {
        int i;
        int i2;
        int bits;
        int i3;
        long jScaleLargeTimestamp;
        int i5;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int bits2 = normalizedFrame.readBits(2);
        if (normalizedFrame.readBit()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        normalizedFrame.skipBits(i2);
        int bits3 = normalizedFrame.readBits(i) + 1;
        boolean bit = normalizedFrame.readBit();
        int bits4 = -1;
        int i6 = 0;
        if (bit) {
            bits = normalizedFrame.readBits(2);
            int bits5 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int bits6 = normalizedFrame.readBits(3) + 1;
            int bits7 = normalizedFrame.readBits(3) + 1;
            if (bits6 != 1 || bits7 != 1) {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i21 = bits2 + 1;
            int bits8 = normalizedFrame.readBits(i21);
            for (int i22 = 0; i22 < i21; i22++) {
                if (((bits8 >> i22) & 1) == 1) {
                    normalizedFrame.skipBits(8);
                }
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(2);
                int bits9 = (normalizedFrame.readBits(2) + 1) << 2;
                int bits10 = normalizedFrame.readBits(2) + 1;
                while (i6 < bits10) {
                    normalizedFrame.skipBits(bits9);
                    i6++;
                }
            }
            i6 = bits5;
        } else {
            bits = -1;
        }
        normalizedFrame.skipBits(i);
        normalizedFrame.skipBits(12);
        if (bit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            normalizedFrame.skipBits(5);
            i3 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            bits4 = normalizedFrame.readBits(8) + 1;
        } else {
            i3 = -2147483647;
        }
        int i32 = i3;
        if (bit) {
            if (bits == 0) {
                i5 = 32000;
            } else if (bits == 1) {
                i5 = MicAvailabilityHelper.SAMPLE_RATE_HZ;
            } else {
                if (bits != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                }
                i5 = 48000;
            }
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(i6, 1000000L, i5);
        } else {
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        return new DtsHeader("audio/vnd.dts.hd;profile=lbr", bits4, i32, bits3, jScaleLargeTimestamp, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        return normalizedFrame.readBits(normalizedFrame.readBit() ? 12 : 8) + 1;
    }

    public static DtsHeader parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int bits;
        long jScaleLargeTimestamp;
        AtomicInteger atomicInteger2;
        int i;
        int i2;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        int i3 = normalizedFrame.readBits(32) == 1078008818 ? 1 : 0;
        int unsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        if (i3 == 0) {
            bits = -2147483647;
            jScaleLargeTimestamp = -9223372036854775807L;
        } else {
            if (!normalizedFrame.readBit()) {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            checkCrc(bArr, unsignedVarInt);
            int bits2 = normalizedFrame.readBits(2);
            if (bits2 == 0) {
                i = 512;
            } else if (bits2 == 1) {
                i = DefaultFrameSampler.DESIRED_FRAME_WIDTH;
            } else {
                if (bits2 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits2, null);
                }
                i = 384;
            }
            int bits3 = (normalizedFrame.readBits(3) + 1) * i;
            int bits4 = normalizedFrame.readBits(2);
            if (bits4 == 0) {
                i2 = 32000;
            } else if (bits4 == 1) {
                i2 = MicAvailabilityHelper.SAMPLE_RATE_HZ;
            } else {
                if (bits4 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits4, null);
                }
                i2 = 48000;
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            bits = (1 << normalizedFrame.readBits(2)) * i2;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(bits3, 1000000L, i2);
        }
        int i5 = bits;
        long j2 = jScaleLargeTimestamp;
        int unsignedVarInt2 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            unsignedVarInt2 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        if (i3 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new DtsHeader("audio/vnd.dts.uhd;profile=p2", 2, i5, unsignedVarInt2 + (atomicInteger2.get() != 0 ? parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true) : 0) + unsignedVarInt, j2, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    private static int parseUnsignedVarInt(ParsableBitArray parsableBitArray, int[] iArr, boolean z) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && parsableBitArray.readBit(); i3++) {
            i2++;
        }
        if (z) {
            int i5 = 0;
            while (i < i2) {
                i5 += 1 << iArr[i];
                i++;
            }
            i = i5;
        }
        return parsableBitArray.readBits(iArr[i2]) + i;
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i;
        byte b4;
        int i2;
        byte b5;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b7 = byteBuffer.get(iPosition);
        if (b7 != -2) {
            if (b7 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b5 = byteBuffer.get(iPosition + 7);
            } else if (b7 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b4 = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b5 = byteBuffer.get(iPosition + 6);
            }
            i2 = b5 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b4 = byteBuffer.get(iPosition + 4);
        i2 = b4 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }
}
