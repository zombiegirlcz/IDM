package ajh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ l u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, RowDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.u = lVar;
        this.v = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        RowDelegate.Model model = this.v;
        l lVar = this.u;
        return lVar.n2(new j(lVar, model, null), new whi.b(6));
    }
}
