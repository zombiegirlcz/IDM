package iyg;

import a41.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a f169726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f169726w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(0, this.f169726w, continuation);
            case 1:
                return new d0(1, this.f169726w, continuation);
            case 2:
                return new d0(2, this.f169726w, continuation);
            default:
                return new d0(3, this.f169726w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                this.v = 1;
                com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar2 = this.f169726w;
                Object objX = vkm.q.x(mo3.a.g(vkm.q.Q(aVar2.u.d(), new y(1, aVar2, null)), null, new iui.b(23), 1), this);
                return objX == aVar ? aVar : objX;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objI2 = com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a.I2(this.f169726w, this);
                return objI2 == aVar3 ? aVar3 : objI2;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Enum enumJ2 = com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a.J2(this.f169726w, this);
                return enumJ2 == aVar4 ? aVar4 : enumJ2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    j1 j1Var = new j1(this.f169726w, (Continuation) null, 15);
                    this.v = 1;
                    if (skm.e0.o(j1Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
