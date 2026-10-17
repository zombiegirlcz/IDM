package mm5;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ml3.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ ActionRequiredScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ActionRequiredScreen actionRequiredScreen, Continuation continuation) {
        super(2, continuation);
        this.u = actionRequiredScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = (o) this.u.d();
        oVar.getClass();
        int i = 10;
        oVar.l2(new mci.e(oVar, null, i), new y(oVar, i));
        return Unit.f186387a;
    }
}
