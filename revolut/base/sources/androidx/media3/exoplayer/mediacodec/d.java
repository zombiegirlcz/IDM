package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements MediaCodecUtil.ScoreProvider {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj2) {
        return MediaCodecUtil.lambda$applyWorkarounds$3((MediaCodecInfo) obj2);
    }
}
