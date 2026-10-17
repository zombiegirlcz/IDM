package androidx.media3.exoplayer.hls;

import androidx.media3.extractor.metadata.id3.PrivFrame;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Predicate {
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj2) {
        return HlsMediaChunk.lambda$peekId3PrivTimestamp$0((PrivFrame) obj2);
    }
}
