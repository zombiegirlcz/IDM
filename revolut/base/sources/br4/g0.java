package br4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.details.a f17893w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.credit.card.impl.ui.details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17893w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f17893w, continuation, 0);
            case 1:
                return new g0(this.f17893w, continuation, 1);
            default:
                return new g0(this.f17893w, continuation, 2);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.details.a aVar2 = this.f17893w;
                f0 f0Var = new f0(aVar2, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "accept_credit_limit_increase_offer", f0Var, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.details.a aVar4 = this.f17893w;
                    lal.a aVar5 = aVar4.F;
                    String str = aVar4.o.f69221a;
                    this.v = 1;
                    if (aVar5.B(str, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.credit.card.impl.ui.details.a aVar7 = this.f17893w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    b9k.f fVar = aVar7.E;
                    String str2 = aVar7.o.f69221a;
                    this.v = 1;
                    if (fVar.C(str2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                lb5.b bVar = aVar7.J;
                String str3 = aVar7.o.f69221a;
                this.v = 2;
                if (((yb5.e) bVar).h(str3, this) == aVar6) {
                    return aVar6;
                }
                return Unit.f186387a;
        }
    }
}
