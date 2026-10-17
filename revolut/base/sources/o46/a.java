package o46;

import com.revolut.kompot.common.ModalDestination;
import f88.f;
import gim.i;
import k46.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar = (c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = cVar instanceof k46.b;
        f fVar = this.v;
        if (z) {
            fVar.A2(((k46.b) cVar).f180837a);
        } else {
            if (!(cVar instanceof k46.a)) {
                throw new NoWhenBranchMatchedException();
            }
            n.P2(fVar, fVar.o2(((k46.a) cVar).f180836a), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
        }
        return Unit.f186387a;
    }
}
