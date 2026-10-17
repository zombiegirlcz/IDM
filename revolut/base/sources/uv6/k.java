package uv6;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kr6.a;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hha.d f283335w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, hha.d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f283335w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f283335w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarE = lVar.f283337q.e();
            this.u = 1;
            obj2 = nim.a.b(d0VarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (Intrinsics.f(this.f283335w.f152287a, ((hha.d) obj2).f152287a)) {
            lVar.C2(a.b.f188662a);
        } else {
            lVar.C2(new kr6.b(new pi3.h(this.f283335w, hha.i.MONTHLY, null, false, 52)));
        }
        return Unit.f186387a;
    }
}
