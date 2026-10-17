package j88;

import com.revolut.feature.junior.accounts.impl.ui.total_wealth.dialog.YouthTotalWealthInfoScreen;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import nhe.k;
import nhe.p;
import yfe.h;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends yfe.c {
    @Override // yfe.c
    public final Object Z2(h.a aVar, k kVar) {
        n.P2(this, new YouthTotalWealthInfoScreen(), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }

    @Override // yfe.c
    public final Object b3(h.c cVar, p pVar) {
        A2(new JuniorOnboardingDestination.Creation((mh8.h) null, 3));
        return Boolean.TRUE;
    }
}
