package xya;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ AllReferralsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AllReferralsController allReferralsController, Continuation continuation) {
        super(2, continuation);
        this.u = allReferralsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar = (com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b) this.u.R2();
        if (bVar.v) {
            bVar.l2(new g(bVar, null, 2), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
