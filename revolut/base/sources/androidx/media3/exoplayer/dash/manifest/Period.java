package androidx.media3.exoplayer.dash.manifest;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class Period {
    public final List<AdaptationSet> adaptationSets;
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f7510id;
    public final long startMs;

    public Period(String str, long j2, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j2, list, list2, null);
    }

    public int getAdaptationSetIndex(int i) {
        int size = this.adaptationSets.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.adaptationSets.get(i2).type == i) {
                return i2;
            }
        }
        return -1;
    }

    public Period(String str, long j2, List<AdaptationSet> list, List<EventStream> list2, Descriptor descriptor) {
        this.f7510id = str;
        this.startMs = j2;
        this.adaptationSets = Collections.unmodifiableList(list);
        this.eventStreams = Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }
}
