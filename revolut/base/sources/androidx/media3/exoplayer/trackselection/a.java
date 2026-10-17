package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7592a;

    public /* synthetic */ a(int i) {
        this.f7592a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f7592a) {
            case 0:
                return DefaultTrackSelector.ImageTrackInfo.compareSelections((List) obj2, (List) obj3);
            case 1:
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj2, (List) obj3);
            case 2:
                return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj2, (DefaultTrackSelector.VideoTrackInfo) obj3);
            default:
                return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj2, (DefaultTrackSelector.VideoTrackInfo) obj3);
        }
    }
}
