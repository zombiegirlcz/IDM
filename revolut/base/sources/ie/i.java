package ie;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.io.File;
import java.util.Comparator;
import le.g0;
import le.r1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160524a;

    public /* synthetic */ i(int i) {
        this.f160524a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f160524a) {
            case 0:
                return Long.compare(((File) obj3).lastModified(), ((File) obj2).lastModified());
            case 1:
                return ((g0) ((r1) obj2)).f194271a.compareTo(((g0) ((r1) obj3)).f194271a);
            case 2:
                return ((File) obj3).getName().compareTo(((File) obj2).getName());
            case 3:
                String name = ((File) obj2).getName();
                int i = oe.a.f;
                return name.substring(0, i).compareTo(((File) obj3).getName().substring(0, i));
            case 4:
                return BaseTrackSelection.lambda$new$0((Format) obj2, (Format) obj3);
            default:
                return DefaultTrackSelector.lambda$static$0((Integer) obj2, (Integer) obj3);
        }
    }
}
