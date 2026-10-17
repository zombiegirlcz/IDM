package zb6;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ OneTimeDonationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OneTimeDonationScreen oneTimeDonationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = oneTimeDonationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar2 = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.u.d();
        k kVar = (k) ((h) ((j2) aVar2.z.f22677a).getValue()).e.getContent();
        if (kVar instanceof j) {
            j jVar = (j) kVar;
            oki.h.v2(aVar2.A, new OneTimeDonationScreenContract$ModalStep.Breakdown(new DonationBreakdownContract$InputData(jVar.f320811b, jVar.f320810a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!(kVar instanceof i) && kVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException("Cannot open payment breakdown with no fees");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
