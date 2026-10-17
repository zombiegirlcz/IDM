package j83;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TerminatedCardChargebackScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TerminatedCardChargebackScreen terminatedCardChargebackScreen, Continuation continuation) {
        super(2, continuation);
        this.u = terminatedCardChargebackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarT2 = this.u.T2();
        mVarT2.v2(new i(((f) mVarT2.t2()).f172105a));
        return Unit.f186387a;
    }
}
