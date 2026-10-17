package tv7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tjf.p0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ GetHelpScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GetHelpScreen getHelpScreen, Continuation continuation) {
        super(2, continuation);
        this.u = getHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.u.d();
        jVarE3.getClass();
        jVarE3.n2(new p0(jVarE3, null, 17), new whi.b(6));
        return Unit.f186387a;
    }
}
