package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.media3.common.Format;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements VideoFrameMetadataListener {
    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void onVideoFrameAboutToBeRendered(long j2, long j3, Format format, MediaFormat mediaFormat) {
        DefaultVideoSink.lambda$new$1(j2, j3, format, mediaFormat);
    }
}
