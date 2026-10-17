package m44;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.CreditAddressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreditAddressScreen creditAddressScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarI3 = this.v.T2();
        boolean z = !model.f52521c;
        uVarI3.getClass();
        uVarI3.x2(new l3d.f(uVarI3, z, 4));
        return Unit.f186387a;
    }
}
