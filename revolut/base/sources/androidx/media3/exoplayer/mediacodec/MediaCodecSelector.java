package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT;
    public static final MediaCodecSelector PREFER_SOFTWARE;

    static {
        final int i = 0;
        DEFAULT = new MediaCodecSelector() { // from class: t4.b
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
            public final List getDecoderInfos(String str, boolean z, boolean z3) {
                switch (i) {
                    case 0:
                        return MediaCodecUtil.getDecoderInfos(str, z, z3);
                    default:
                        return MediaCodecSelector.lambda$static$0(str, z, z3);
                }
            }
        };
        final int i2 = 1;
        PREFER_SOFTWARE = new MediaCodecSelector() { // from class: t4.b
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
            public final List getDecoderInfos(String str, boolean z, boolean z3) {
                switch (i2) {
                    case 0:
                        return MediaCodecUtil.getDecoderInfos(str, z, z3);
                    default:
                        return MediaCodecSelector.lambda$static$0(str, z, z3);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List lambda$static$0(String str, boolean z, boolean z3) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(DEFAULT.getDecoderInfos(str, z, z3));
    }

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z3) throws MediaCodecUtil.DecoderQueryException;
}
