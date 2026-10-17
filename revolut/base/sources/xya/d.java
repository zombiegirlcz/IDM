package xya;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllReferralsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AllReferralsController allReferralsController, Continuation continuation) {
        super(2, continuation);
        this.v = allReferralsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.R2();
        com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar = (com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b) qVarE3;
        bVar.I2(model.e, model.f51822a);
        return Unit.f186387a;
    }
}
