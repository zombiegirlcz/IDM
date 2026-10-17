package v0f;

import aqd.n1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.screens.card_details.b f284807w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.topup_screen.impl.screens.card_details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284807w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f284807w, continuation, 0);
            case 1:
                return new g0(this.f284807w, continuation, 1);
            default:
                return new g0(this.f284807w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = this.f284807w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    v0b.b bVar2 = new v0b.b(rd0.e.b(bVar.v.D(c01.a.NEXT)), bVar, i2);
                    d0 d0Var = new d0(bVar, null, i2);
                    this.v = 1;
                    if (vkm.q.o(bVar2, d0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarF = bVar.f91091p.f(false);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar.H2(bVar.G, new a2f.j((do3.n) obj2, 20));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarA = bVar.f91095t.a();
                    u53.a aVar4 = u53.a.f;
                    ufm.i iVar = new ufm.i(d0VarA, new tc7.m0(23), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    pfm.z zVarF = ue0.e.F(iVar, Boolean.FALSE);
                    this.v = 1;
                    obj2 = nim.a.b(zVarF, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar.H2(bVar.G, new n1(24, (Boolean) obj2));
                return Unit.f186387a;
        }
    }
}
