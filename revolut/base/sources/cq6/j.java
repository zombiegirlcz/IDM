package cq6;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ l u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        aq6.f fVar = new aq6.f(new aq6.b(true));
        l lVar = this.u;
        lVar.N2(lVar.o2(fVar), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new cp7.k(lVar, 12));
        return Unit.f186387a;
    }
}
