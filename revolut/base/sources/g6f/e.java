package g6f;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ aah.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(aah.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TrendViewDelegate.a model = (TrendViewDelegate.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) ((c) this.v.e);
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        mVar.X2(mVar.f140938n, new k(model, 0));
        return Unit.f186387a;
    }
}
