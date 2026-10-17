package tw7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InsuranceHomeScreen insuranceHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        com.revolut.feature.insurance_home.impl.ui.screen.home.a aVar2 = (com.revolut.feature.insurance_home.impl.ui.screen.home.a) iVarE3;
        aVar2.J2(model.u, model.f53228a);
        return Unit.f186387a;
    }
}
