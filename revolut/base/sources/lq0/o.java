package lq0;

import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import au0.x5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o {
    private o() {
    }

    public static p a(ViewGroup root, m transition) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(transition, "transition");
        p pVar = new p(root, transition);
        if (pVar.f199178g == 2) {
            return pVar;
        }
        pVar.f199177c.clear();
        or0.u.e(root, new n(pVar, 0));
        OneShotPreDrawListener.add(root, new x5(root, pVar, 24));
        return pVar;
    }
}
