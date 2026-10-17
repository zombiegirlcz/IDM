package wya;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReferralsTroubleshooterTopLevelController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController, Continuation continuation) {
        super(2, continuation);
        this.v = referralsTroubleshooterTopLevelController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarD3 = this.v.d();
        com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a aVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a) gVarD3;
        aVar2.I2(model.u, model.f53228a);
        return Unit.f186387a;
    }
}
