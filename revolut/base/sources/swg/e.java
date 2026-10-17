package swg;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function3 {
    public final /* synthetic */ int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.v = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                new e(this.v, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                new e(this.v, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
                throw null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw null;
        }
    }
}
