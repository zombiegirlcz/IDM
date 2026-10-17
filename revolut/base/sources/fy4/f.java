package fy4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.core.ui.info.CreditInfoController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditInfoController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CreditInfoController creditInfoController, Continuation continuation) {
        super(2, continuation);
        this.v = creditInfoController;
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.core.ui.info.a) this.v.d()).J2(new k(model.u));
        return Unit.f186387a;
    }
}
