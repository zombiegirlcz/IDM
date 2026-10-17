package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.BERTags;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
public final class Cea608Decoder extends CeaDecoder {
    private int captionMode;
    private int captionRowCount;
    private List<Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, Constants.TAG_USB_CAPABILITY, 93, Constants.TAG_MPOS_MODULE_STATE, Constants.TAG_F3_BUILD_CONFIGURATION, Constants.TAG_SUPPORTED_LOCALE_LIST, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, LDSFile.EF_DG12_TAG, LDSFile.EF_DG13_TAG, LDSFile.EF_DG14_TAG, LDSFile.EF_DG15_TAG, 112, 113, 114, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, 116, LDSFile.EF_DG2_TAG, LDSFile.EF_DG4_TAG, LDSFile.EF_SOD_TAG, SyslogConstants.LOG_CLOCK, 121, 122, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, Constants.TAG_BLE_FIRMWARE_VERSION, Constants.TAG_FIRMWARE_VERSION, Constants.TAG_TRANSACTION_DATA, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, SyslogConstants.LOG_LOCAL6, 189, 191, 8482, 162, Constants.TAG_ACE_LAYER_VERSION, 9834, BERTags.FLAGS, 32, 232, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION, Constants.TAG_EMV_ICC_CONFIG_VERSION, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, Constants.TAG_F4, Constants.TAG_FB_CHARGING_STATUS};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {Constants.TAG_ATMEL_SERIAL, 201, 211, Constants.TAG_BOOT_LOADER_CHECKSUM, 220, Constants.TAG_FC_SPEED_MODE, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1, Constants.TAG_EMV_NFC_CONFIG_VERSION, 206, Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, 239, Constants.TAG_PCI_PED_CHECKSUM, Constants.TAG_BOOT_LOADER_VERSION, Constants.TAG_RESOURCE_FILE_VERSION, Constants.TAG_KSL_ID, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS, Constants.TAG_KSN_FORMATS, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, Constants.TAG_OS_VERSION, Constants.TAG_SVPP_CHECKSUM, 242, Constants.TAG_EMV_L1_VERSION, Constants.TAG_F5, 123, ISO781611.SMT_TAG, 92, 94, 95, 124, 126, 196, Constants.TAG_E4_CUSTOMER_DATA, Constants.TAG_EMV_L1_CHECKSUM, 246, PassportService.DEFAULT_MAX_BLOCKSIZE, Constants.TAG_EMVL3_VERSION, Constants.TAG_GPI_VERSION, 9474, Constants.TAG_BATTERY_STATE, Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION, Constants.TAG_EMV_L2_CHECKSUM, Constants.TAG_FULL_SVPP_IDENTIFICATION, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    private int currentChannel = 0;

    public static final class CueBuilder {
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i, boolean z, int i2) {
                this.style = i;
                this.underline = z;
                this.start = i2;
            }
        }

        public CueBuilder(int i, int i2) {
            reset(i);
            this.captionRowCount = i2;
        }

        private SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i5 = -1;
            int i6 = 0;
            int i21 = 0;
            boolean z = false;
            while (i6 < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i6);
                boolean z3 = cueStyle.underline;
                int i22 = cueStyle.style;
                if (i22 != 8) {
                    boolean z4 = i22 == 7;
                    if (i22 != 7) {
                        i5 = Cea608Decoder.STYLE_COLORS[i22];
                    }
                    z = z4;
                }
                int i32 = cueStyle.start;
                i6++;
                if (i32 != (i6 < this.cueStyles.size() ? this.cueStyles.get(i6).start : length)) {
                    if (i != -1 && !z3) {
                        setUnderlineSpan(spannableStringBuilder, i, i32);
                        i = -1;
                    } else if (i == -1 && z3) {
                        i = i32;
                    }
                    if (i2 != -1 && !z) {
                        setItalicSpan(spannableStringBuilder, i2, i32);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i32;
                    }
                    if (i5 != i3) {
                        setColorSpan(spannableStringBuilder, i21, i32, i3);
                        i3 = i5;
                        i21 = i32;
                    }
                }
            }
            if (i != -1 && i != length) {
                setUnderlineSpan(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                setItalicSpan(spannableStringBuilder, i2, length);
            }
            if (i21 != length) {
                setColorSpan(spannableStringBuilder, i21, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void append(char c2) {
            if (this.captionStringBuilder.length() < 32) {
                this.captionStringBuilder.append(c2);
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i = cueStyle.start;
                    if (i != length) {
                        return;
                    }
                    cueStyle.start = i - 1;
                }
            }
        }

        public Cue build(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.rolledUpCaptions.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.indent + this.tabOffset;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i5 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.captionMode != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.captionMode != 2 || i5 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.row;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.captionMode == 1) {
                i6 -= this.captionRowCount - 1;
            }
            return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i6, 1).setPosition(f).setPositionAnchor(i).build();
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i) {
            this.captionMode = i;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int iMin = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionMode(int i) {
            this.captionMode = i;
        }

        public void setCaptionRowCount(int i) {
            this.captionRowCount = i;
        }

        public void setStyle(int i, boolean z) {
            this.cueStyles.add(new CueStyle(i, z, this.captionStringBuilder.length()));
        }
    }

    public Cea608Decoder(String str, int i, long j2) {
        if (j2 != -9223372036854775807L) {
            Preconditions.checkArgument(j2 >= 16000);
            this.validDataChannelTimeoutUs = j2 * 1000;
        } else {
            this.validDataChannelTimeoutUs = -9223372036854775807L;
        }
        this.packetLength = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i == 2) {
            this.selectedChannel = 1;
            this.selectedField = 0;
        } else if (i == 3) {
            this.selectedChannel = 0;
            this.selectedField = 1;
        } else if (i != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else {
            this.selectedChannel = 1;
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = -9223372036854775807L;
    }

    private static char getBasicChar(byte b4) {
        return (char) BASIC_CHARACTER_SET[(b4 & Ascii.DEL) - 32];
    }

    private static int getChannel(byte b4) {
        return (b4 >> 3) & 1;
    }

    private List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueBuild = this.cueBuilders.get(i).build(Integer.MIN_VALUE);
            arrayList.add(cueBuild);
            if (cueBuild != null) {
                iMin = Math.min(iMin, cueBuild.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cue2 = (Cue) arrayList.get(i2);
            if (cue2 != null) {
                if (cue2.positionAnchor != iMin) {
                    cue2 = (Cue) Preconditions.checkNotNull(this.cueBuilders.get(i2).build(iMin));
                }
                arrayList2.add(cue2);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b4) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b4 & Ascii.US];
    }

    private static char getExtendedPtDeChar(byte b4) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b4 & Ascii.US];
    }

    private static char getExtendedWestEuropeanChar(byte b4, byte b5) {
        return (b4 & 1) == 0 ? getExtendedEsFrChar(b5) : getExtendedPtDeChar(b5);
    }

    private static char getSpecialNorthAmericanChar(byte b4) {
        return (char) SPECIAL_CHARACTER_SET[b4 & 15];
    }

    private void handleMidrowCtrl(byte b4) {
        this.currentCueBuilder.append(p.SPACE_CHAR);
        this.currentCueBuilder.setStyle((b4 >> 1) & 7, (b4 & 1) == 1);
    }

    private void handleMiscCode(byte b4) {
        if (b4 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b4 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b4) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i = this.captionMode;
                if (i != 0) {
                    if (b4 != 33) {
                        switch (b4) {
                            case 44:
                                this.cues = Collections.EMPTY_LIST;
                                if (i == 1 || i == 3) {
                                    resetCueBuilders();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    } else {
                        this.currentCueBuilder.backspace();
                        break;
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b4, byte b5) {
        int i = ROW_INDICES[b4 & 7];
        if ((b5 & 32) != 0) {
            i++;
        }
        if (i != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i;
        }
        boolean z = (b5 & 16) == 16;
        boolean z3 = (b5 & 1) == 1;
        int i2 = (b5 >> 1) & 7;
        this.currentCueBuilder.setStyle(z ? 8 : i2, z3);
        if (z) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i2];
        }
    }

    private static boolean isCtrlCode(byte b4) {
        return (b4 & ISO7816.INS_CREATE_FILE) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b4, byte b5) {
        return (b4 & 246) == 18 && (b5 & ISO7816.INS_CREATE_FILE) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b4, byte b5) {
        return (b4 & 247) == 17 && (b5 & 240) == 32;
    }

    private static boolean isMiscCode(byte b4, byte b5) {
        return (b4 & 246) == 20 && (b5 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b4, byte b5) {
        return (b4 & 240) == 16 && (b5 & ISO7816.INS_GET_RESPONSE) == 64;
    }

    private static boolean isRepeatable(byte b4) {
        return (b4 & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z, byte b4, byte b5) {
        if (!z || !isRepeatable(b4)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b4 && this.repeatableControlCc2 == b5) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b4;
            this.repeatableControlCc2 = b5;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b4) {
        return (b4 & 246) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b4, byte b5) {
        return (b4 & 247) == 17 && (b5 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b4, byte b5) {
        return (b4 & 247) == 23 && b5 >= 33 && b5 <= 35;
    }

    private static boolean isXdsControlCode(byte b4) {
        return 1 <= b4 && b4 <= 15;
    }

    private void maybeUpdateIsInCaptionService(byte b4, byte b5) {
        if (isXdsControlCode(b4)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b4)) {
            if (b5 != 32 && b5 != 47) {
                switch (b5) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b5) {
                            case 42:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                        return;
                }
            }
            this.isInCaptionService = true;
        }
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i) {
        int i2 = this.captionMode;
        if (i2 == i) {
            return;
        }
        this.captionMode = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.cueBuilders.size(); i3++) {
                this.cueBuilders.get(i3).setCaptionMode(i);
            }
            return;
        }
        resetCueBuilders();
        if (i2 == 3 || i == 1 || i == 0) {
            this.cues = Collections.EMPTY_LIST;
        }
    }

    private void setCaptionRowCount(int i) {
        this.captionRowCount = i;
        this.currentCueBuilder.setCaptionRowCount(i);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.validDataChannelTimeoutUs == -9223372036854775807L || this.lastCueUpdateUs == -9223372036854775807L || getPositionUs() - this.lastCueUpdateUs < this.validDataChannelTimeoutUs) ? false : true;
    }

    private boolean updateAndVerifyCurrentChannel(byte b4) {
        if (isCtrlCode(b4)) {
            this.currentChannel = getChannel(b4);
        }
        return this.currentChannel == this.selectedChannel;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle((List) Preconditions.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void decode(androidx.media3.extractor.text.SubtitleInputBuffer r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.Cea608Decoder.decode(androidx.media3.extractor.text.SubtitleInputBuffer):void");
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void release() {
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j2) {
        super.setPositionUs(j2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = Collections.EMPTY_LIST;
        this.lastCueUpdateUs = -9223372036854775807L;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }
}
