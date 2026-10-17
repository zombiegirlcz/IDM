package androidx.media3.exoplayer.hls;

import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super(p.a.p("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
