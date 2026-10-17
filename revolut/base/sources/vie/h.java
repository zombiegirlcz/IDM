package vie;

import com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditTab;
import ft3.d1;
import ft3.j1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xq3.q;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f289581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up3.b f289582b;

    public h(gte.a featureToggleInteractor, up3.b creditFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        this.f289581a = featureToggleInteractor;
        this.f289582b = creditFeatureAvailabilityInteractor;
    }

    public final boolean a() {
        if (!((jte.d) this.f289581a).c(TabCreditApi$Toggles$CreditTab.f89768c)) {
            return false;
        }
        List listK = v.k(new d1(j1.CREDIT_CARD, null, null), new d1(j1.FIXED_TERM_CREDIT, null, null), new d1(j1.MORTGAGE, null, null), new d1(j1.BUY_NOW_PAY_LATER, null, null));
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return false;
        }
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            if (((q) this.f289582b).h((d1) it8.next())) {
                return true;
            }
        }
        return false;
    }
}
