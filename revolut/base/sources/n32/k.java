package n32;

import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.feature.apm.core.api.ApmToggles$ApmDisableQR;
import g12.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f211678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f211679b;

    public k(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f211678a = featureToggleInteractor;
        this.f211679b = yhm.j.b(new n08.b(22));
    }

    public final List a(r tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        if (!this.f211678a.a(ApmToggles$ApmDisableQR.f61779c)) {
            return f0.f322471a;
        }
        int i = j.f211677a[tab2.ordinal()];
        if (i == 1) {
            return u.c((IconNavBarMenuItem) this.f211679b.getValue());
        }
        if (i == 2) {
            return f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
