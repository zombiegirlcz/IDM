package md9;

import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import n0c.v;
import n1j.t;
import n30.n;
import vkm.j2;
import vkm.q0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f204540w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f204540w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f204540w, continuation, 0);
            case 1:
                return new j(this.f204540w, continuation, 1);
            default:
                return new j(this.f204540w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    l lVar = this.f204540w;
                    w4l.f fVar = ((jc9.c) lVar.f204545r.f142372a).f172757c;
                    Object obj3 = Unit.f186387a;
                    vkm.d dVarB = rd0.e.b(fVar.f(obj3, true));
                    h0 h0Var = h0.f322473a;
                    q0 q0VarN = rd0.e.n(dVarB, h0Var);
                    n nVar = lVar.f204546s;
                    r rVarTimeout = m70.a.g(rd0.e.p(ue0.e.H(nim.a.w(v20.o.L(nVar.f211647a), new n30.b(nVar, 4)), h0Var, new t(23)), 100L, 500L, 24), null, new v(19), 1).map(new n30.d(new t(22), 1)).timeout(5L, TimeUnit.SECONDS);
                    Intrinsics.checkNotNullExpressionValue(rVarTimeout, "timeout(...)");
                    Object objCollect = yh5.b.d(q0VarN, rd0.e.b(ue0.e.E(rVarTimeout, Boolean.FALSE))).collect(new blj.t(lVar, 13), this);
                    if (objCollect == aVar) {
                        obj3 = objCollect;
                    }
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l lVar2 = this.f204540w;
                Object content = ((e) ((j2) lVar2.f204547t.f22677a).getValue()).f204533a.getContent();
                Intrinsics.i(content, "null cannot be cast to non-null type com.revolut.feature.onboarding.api.promo.models.PromptLocked.Locked");
                w89.c cVar = ((w89.a) content).f295617c;
                this.v = 1;
                Object objK2 = lVar2.K2(cVar, this);
                return objK2 == aVar2 ? aVar2 : objK2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l lVar3 = this.f204540w;
                Object content2 = ((e) ((j2) lVar3.f204547t.f22677a).getValue()).f204533a.getContent();
                Intrinsics.i(content2, "null cannot be cast to non-null type com.revolut.feature.onboarding.api.promo.models.PromptLocked.Locked");
                w89.c cVar2 = ((w89.a) content2).d;
                if (cVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.v = 1;
                Object objK22 = lVar3.K2(cVar2, this);
                return objK22 == aVar3 ? aVar3 : objK22;
        }
    }
}
