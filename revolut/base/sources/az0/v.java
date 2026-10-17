package az0;

import com.revolut.core.ui_kit_core.displayers.image.models.CountdownTimerImage;
import java.util.Comparator;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Float.valueOf(((CountdownTimerImage.ProgressCycle) obj3).f59903a), Float.valueOf(((CountdownTimerImage.ProgressCycle) obj2).f59903a));
    }
}
