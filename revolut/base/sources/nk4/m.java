package nk4;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConfirmAutopayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ConfirmAutopayScreen confirmAutopayScreen, Continuation continuation) {
        super(2, continuation);
        this.v = confirmAutopayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b bVar = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) this.v.d();
        bVar.H2(bVar.f68643s, new lph.c(!model.f52521c, 17));
        return Unit.f186387a;
    }
}
