package za0;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ g u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = this.u;
        gVar.e3((BottomPromptScreen) gVar.Z2());
        return Unit.f186387a;
    }
}
