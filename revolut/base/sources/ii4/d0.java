package ii4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import hs3.s1;
import hs3.u1;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j;
import nii.y0;
import skm.a2;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.spinner.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SpinnerConfiguration.Popup f161518w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.credit.application.plugins.impl.ui.spinner.b bVar, SpinnerConfiguration.Popup popup, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f161518w = popup;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.v, this.f161518w, continuation);
        d0Var.u = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar = (n) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = nVar instanceof j;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.spinner.b bVar = this.v;
        if (z) {
            it3.d dVar = ((j) nVar).f161531a;
            a2 a2Var = bVar.f68428s;
            if (a2Var != null) {
                a2Var.f(null);
            }
            bVar.s1();
            bVar.l2(new i44.a(bVar, dVar, continuation, 27), new yi5.b(26));
        } else if (nVar instanceof m) {
            ju3.g gVar = this.f161518w.f66389b.f;
            WaitingPopupScreenConfig waitingPopupScreenConfig = ((m) nVar).f161537b;
            a2 a2Var2 = bVar.f68428s;
            if (a2Var2 != null) {
                a2Var2.f(null);
            }
            bVar.s1();
            int i = c0.f161514a[gVar.ordinal()];
            if (i == 1) {
                oki.h.w2(bVar.f68429t, new SpinnerLazyFlowContract$Step.Timeout(waitingPopupScreenConfig, v7.m(bVar.f68425p.f68415b, AnalyticsContext.INSTANCE)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                yji.l.a1(bVar, bVar.X1(new y0(null, new nii.g0(waitingPopupScreenConfig.f66427a, waitingPopupScreenConfig.f66428b, null, waitingPopupScreenConfig.f66429c, null, null, null, j.b.f216170a, true, null, false, null, 15988), false, 5)), null, null, new iaf.d(bVar, continuation, 5), 3);
            }
        } else {
            if (!(nVar instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            u1 u1Var = ((k) nVar).f161532a;
            List list = u1Var.f154955c;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(com.revolut.feature.credit.application.plugins.api.models.config.c.a((s1) it8.next()));
            }
            bVar.Q2(u1Var.f154954b, arrayList);
        }
        return Unit.f186387a;
    }
}
