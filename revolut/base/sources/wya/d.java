package wya;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReferralsTroubleshooterTopLevelController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController, Continuation continuation) {
        super(2, continuation);
        this.v = referralsTroubleshooterTopLevelController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarD3 = this.v.d();
        com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a aVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a) gVarD3;
        aVar2.I2(model.i, model.f52613a);
        return Unit.f186387a;
    }
}
