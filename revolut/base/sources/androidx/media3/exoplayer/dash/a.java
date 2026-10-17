package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.source.chunk.ChunkSampleStream;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        return DashMediaPeriod.lambda$selectTracks$0((ChunkSampleStream) obj2);
    }
}
