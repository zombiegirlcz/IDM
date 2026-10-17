package androidx.media3.common.text;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import i4.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CueGroup {
    private static final Ordering<Cue> CUES_PRIORITY_COMPARATOR = Ordering.natural().onResultOf(new a(0));
    public static final CueGroup EMPTY_TIME_ZERO = new CueGroup(ImmutableList.of(), 0);
    private static final String FIELD_CUES = Util.intToStringMaxRadix(0);
    private static final String FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    public final ImmutableList<Cue> cues;
    public final long presentationTimeUs;

    public CueGroup(List<Cue> list, long j2) {
        this.cues = ImmutableList.sortedCopyOf(CUES_PRIORITY_COMPARATOR, list);
        this.presentationTimeUs = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0(Cue cue2) {
        return Integer.valueOf(cue2.zIndex);
    }
}
