package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7593a;

    public /* synthetic */ b(int i) {
        this.f7593a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        List list = (List) obj2;
        List list2 = (List) obj3;
        switch (this.f7593a) {
            case 0:
                return DefaultTrackSelector.AudioTrackInfo.compareSelections(list, list2);
            default:
                return DefaultTrackSelector.TextTrackInfo.compareSelections(list, list2);
        }
    }
}
