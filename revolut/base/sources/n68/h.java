package n68;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior.account_activation.impl.ui.screen.request.ActivationRequestScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ActivationRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ActivationRequestScreen activationRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.v = activationRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.e3();
        Intrinsics.h(model);
        rVarE3.K2(model);
        return Unit.f186387a;
    }
}
