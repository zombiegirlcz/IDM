package znd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b f323794w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i, com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f323794w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r0(0, this.f323794w, continuation);
            case 1:
                return new r0(1, this.f323794w, continuation);
            default:
                return new r0(2, this.f323794w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = this.f323794w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    lmd.a aVar2 = bVar.f87563p;
                    amd.i filter = amd.i.CATEGORIES;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(filter, "filter");
                    aVar2.f196950b.onNext(filter);
                    this.v = 1;
                    if (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.J2(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.K2(bVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar2 = this.f323794w;
                    kge.d dVar = bVar2.f87567t;
                    yld.d dVar2 = bVar2.v.f87547b;
                    this.v = 1;
                    if (dVar.y(dVar2, this) == aVar3) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar3 = this.f323794w;
                    Continuation continuation = null;
                    wkm.l lVarQ = vkm.q.Q(bVar3.T, new p0(1, bVar3, continuation));
                    zfd.s sVar = new zfd.s(bVar3, continuation, 20);
                    this.v = 1;
                    Object objCollect = lVarQ.collect(new akg.m(wkm.s.f298328a, sVar, 5), this);
                    if (objCollect != aVar4) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar4) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
