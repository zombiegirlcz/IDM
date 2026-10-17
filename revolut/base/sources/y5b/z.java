package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlansService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import w5b.d3;
import w5b.n1;
import w5b.q1;
import w5b.z4;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f311072w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f311072w = c0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new z(this.f311072w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new z(this.f311072w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new z(this.f311072w, (Continuation) obj4, 2).invokeSuspend(Unit.f186387a);
            default:
                return new z(this.f311072w, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsPlansService cobrandedCardsPlansService = this.f311072w.f311026a;
                    this.v = 1;
                    obj2 = cobrandedCardsPlansService.getCurrentPlan(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                n1 n1Var = (n1) obj2;
                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                return new r5b.j(n1Var.f294932a, n1Var.f294933b, n1Var.f294934c, n1Var.d);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsPlansService cobrandedCardsPlansService2 = this.f311072w.f311026a;
                    this.v = 1;
                    obj2 = cobrandedCardsPlansService2.getPlanHub(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return x5b.e.a((d3) obj2);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsPlansService cobrandedCardsPlansService3 = this.f311072w.f311026a;
                    this.v = 1;
                    obj2 = cobrandedCardsPlansService3.getPlanSwitchDashboard(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return x5b.c.c((q1) obj2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsPlansService cobrandedCardsPlansService4 = this.f311072w.f311026a;
                    this.v = 1;
                    obj2 = cobrandedCardsPlansService4.getProductArticleId(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((z4) obj2).f295092a;
        }
    }
}
