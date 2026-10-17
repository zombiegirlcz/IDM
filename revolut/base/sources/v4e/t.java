package v4e;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TrendViewDelegate.a aVar = (TrendViewDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = this.v.d;
        Intrinsics.h(aVar);
        mVar.b3(aVar);
        return Unit.f186387a;
    }
}
