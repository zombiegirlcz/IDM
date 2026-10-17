package w39;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import efm.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f294247a;

    static i a(b bVar, long j2, int i) {
        if ((i & 1) != 0) {
            j2 = 0;
        }
        return ((z39.b) bVar).f319221b.i((i & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : 500.0f, j2);
    }
}
