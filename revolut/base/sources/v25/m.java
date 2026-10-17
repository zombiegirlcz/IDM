package v25;

import aii.u;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v20.s;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f285660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f285661x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f285660w = oVar;
        this.f285661x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.f285660w, this.f285661x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar2 = this.f285660w;
            r rVarG = m70.a.g(nim.a.w(kli.a.h(oVar2.f285665n.b(this.f285661x, w4l.h.f294642c), oVar2.u.k(false)), new s(17)), null, new g(4), 1);
            this.u = oVar2;
            this.v = 1;
            Object objC = nim.a.c(rVarG, this);
            if (objC == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "awaitFirst(...)");
        oVar.A2((u) obj2);
        return Unit.f186387a;
    }
}
