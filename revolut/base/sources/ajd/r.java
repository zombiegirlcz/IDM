package ajd;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(data);
        this.v.x2(new af4.t((Data) iii.c.f(data, new aik.d(9), new ah1.p(10), new a2g.m(18)), 19));
        return Unit.f186387a;
    }
}
