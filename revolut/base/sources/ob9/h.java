package ob9;

import efm.d0;
import gim.i;
import hy1.m;
import hy2.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rfm.l;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.plan_selection.a f223902w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f223902w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f223902w, continuation, 0);
            default:
                return new h(this.f223902w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar2 = this.f223902w;
                mtd.e eVar = new mtd.e(aVar2, null, 20);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "load_initial_step", eVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    j jVar = this.f223902w.f78476q;
                    ufm.b bVarM = d0.m(Boolean.valueOf(jVar.e.a()));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    pfm.h hVar = new pfm.h(new ufm.i(new ufm.i(new l(new rfm.j(bVarM, new m(26, new hy1.i(29)), 0), new m(27, new hy2.i(jVar, 0)), 0), new m(28, new hy2.i(jVar, 1)), 0), new m(29, new hy2.i(jVar, 2)), 1), 4);
                    Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                    pfm.a aVarV = ue0.e.v(hVar);
                    this.v = 1;
                    if (nim.a.a(aVarV, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
