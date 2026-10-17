package jcf;

import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import iqh.d;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends mcf.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mcf.a f172791l;

    public c(mcf.a screen, kbf.a tradingAddOnsSpecificAddOnInteractor, hcf.a headerMapper) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(tradingAddOnsSpecificAddOnInteractor, "tradingAddOnsSpecificAddOnInteractor");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f172791l = screen;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        n.l2(this, new d(e.b(((PlanTileDelegate) ((ProfileScreen) this.f172791l).p0.getValue()).f52942c), 26), null, new b(this, null), 3);
    }
}
