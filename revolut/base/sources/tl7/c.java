package tl7;

import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import th9.t;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f fVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(fVar.f272009c, false, null, 3);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(fVar.f272009c, false, new t(fVar, 6), 1);
                break;
        }
        return Unit.f186387a;
    }
}
