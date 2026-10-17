package androidx.media3.extractor;

import a0.d;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MpegAudioUtil {
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {MicAvailabilityHelper.SAMPLE_RATE_HZ, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] BITRATE_V1_L2 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] BITRATE_V1_L3 = {32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] BITRATE_V2 = {ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 16000, 24000, 32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: loaded from: classes.dex */
    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public Header() {
        }

        public boolean setForHeaderData(int i) {
            int i2;
            int i3;
            int i5;
            int i6;
            if (!MpegAudioUtil.isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i5 = (i >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i2;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i3];
            int i21 = MpegAudioUtil.SAMPLING_RATE_V1[i6];
            this.sampleRate = i21;
            if (i2 == 2) {
                this.sampleRate = i21 / 2;
            } else if (i2 == 0) {
                this.sampleRate = i21 / 4;
            }
            int i22 = (i >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i2, i3);
            if (i3 == 3) {
                int i32 = i2 == 3 ? MpegAudioUtil.BITRATE_V1_L1[i5 - 1] : MpegAudioUtil.BITRATE_V2_L1[i5 - 1];
                this.bitrate = i32;
                this.frameSize = (((i32 * 12) / this.sampleRate) + i22) * 4;
            } else {
                int i33 = SyslogConstants.LOG_LOCAL2;
                if (i2 == 3) {
                    int i43 = i3 == 2 ? MpegAudioUtil.BITRATE_V1_L2[i5 - 1] : MpegAudioUtil.BITRATE_V1_L3[i5 - 1];
                    this.bitrate = i43;
                    this.frameSize = ((i43 * SyslogConstants.LOG_LOCAL2) / this.sampleRate) + i22;
                } else {
                    int i59 = MpegAudioUtil.BITRATE_V2[i5 - 1];
                    this.bitrate = i59;
                    if (i3 == 1) {
                        i33 = 72;
                    }
                    this.frameSize = ((i33 * i59) / this.sampleRate) + i22;
                }
            }
            this.channels = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public Header(Header header) {
            this.version = header.version;
            this.mimeType = header.mimeType;
            this.frameSize = header.frameSize;
            this.sampleRate = header.sampleRate;
            this.channels = header.channels;
            this.bitrate = header.bitrate;
            this.samplesPerFrame = header.samplesPerFrame;
        }
    }

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i5;
        int i6;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i5 = (i >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i21 = SAMPLING_RATE_V1[i6];
        if (i2 == 2) {
            i21 /= 2;
        } else if (i2 == 0) {
            i21 /= 4;
        }
        int i22 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? BITRATE_V1_L1[i5 - 1] : BITRATE_V2_L1[i5 - 1]) * 12) / i21) + i22) * 4;
        }
        int i32 = i2 == 3 ? i3 == 2 ? BITRATE_V1_L2[i5 - 1] : BITRATE_V1_L3[i5 - 1] : BITRATE_V2[i5 - 1];
        int i33 = SyslogConstants.LOG_LOCAL2;
        if (i2 == 3) {
            return d.D(i32, SyslogConstants.LOG_LOCAL2, i21, i22);
        }
        if (i3 == 1) {
            i33 = 72;
        }
        return d.D(i33, i32, i21, i22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i) {
        int i2;
        int i3;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i >>> 12) & 15;
        int i6 = (i >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i2, i3);
    }
}
