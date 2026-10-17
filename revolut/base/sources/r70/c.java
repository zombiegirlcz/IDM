package r70;

import android.os.VibrationEffect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface c {

    @NotNull
    public static final a Companion = a.f251969a;

    static void b(c cVar, int i) {
        long j2 = (i & 1) != 0 ? 1L : 50L;
        e eVar = (e) cVar;
        int ringerMode = eVar.f251972b.getRingerMode();
        if (ringerMode == 1 || ringerMode == 2) {
            eVar.f251971a.vibrate(VibrationEffect.createOneShot(j2, -1));
        }
    }
}
