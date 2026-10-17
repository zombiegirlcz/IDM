package hdk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d f151475w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f151475w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f151475w, continuation, 0);
            case 1:
                return new i(this.f151475w, continuation, 1);
            case 2:
                return new i(this.f151475w, continuation, 2);
            default:
                return new i(this.f151475w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar = this.f151475w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    gdk.d dVar2 = dVar.f102554q;
                    this.v = 1;
                    if (((gdk.g) dVar2).a(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                gdk.d dVar3 = dVar.f102554q;
                this.v = 1;
                bdk.f fVar = ((gdk.g) dVar3).f143194a;
                fVar.getClass();
                bdk.e eVar = new bdk.e(fVar, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, eVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                gdk.d dVar4 = dVar.f102554q;
                this.v = 1;
                bdk.j jVar = ((gdk.g) dVar4).f143195b;
                xck.o oVar = xck.o.MONTHLY_DRAW;
                jVar.getClass();
                bdk.h hVar = new bdk.h(oVar, jVar, null, 0);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, hVar, this);
                return objJ2 == aVar3 ? aVar3 : objJ2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    gdk.d dVar5 = dVar.f102554q;
                    this.v = 1;
                    if (((gdk.g) dVar5).b(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
