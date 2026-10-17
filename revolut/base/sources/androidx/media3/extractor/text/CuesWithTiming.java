package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class CuesWithTiming {
    public final ImmutableList<Cue> cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j2, long j3) {
        this.cues = ImmutableList.copyOf((Collection) list);
        this.startTimeUs = j2;
        this.durationUs = j3;
        long j5 = -9223372036854775807L;
        if (j2 != -9223372036854775807L && j3 != -9223372036854775807L) {
            j5 = j2 + j3;
        }
        this.endTimeUs = j5;
    }
}
