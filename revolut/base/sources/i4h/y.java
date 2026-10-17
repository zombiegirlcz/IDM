package i4h;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.v = p0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.v, continuation);
        yVar.u = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((i4l.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i4l.a aVar = (i4l.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p0 p0Var = this.v;
        p0Var.X2(p0Var.f158478y, new i30.a(aVar, 12));
        return Unit.f186387a;
    }
}
