package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public b u;
    public yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f87596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f87597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f87597x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f87597x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        yki.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f87596w;
        if (i == 0) {
            o.b(obj2);
            b bVar2 = this.f87597x;
            yki.a aVar3 = bVar2.f87602t;
            ufm.i iVarX = bVar2.f87601s.x(AccountId.Personal.f51414a);
            this.u = bVar2;
            this.v = aVar3;
            this.f87596w = 1;
            Object objB = nim.a.b(iVarX, this);
            if (objB == aVar2) {
                return aVar2;
            }
            bVar = bVar2;
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.a aVar4 = this.v;
            b bVar3 = this.u;
            o.b(obj2);
            aVar = aVar4;
            bVar = bVar3;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        h.t2(bVar, aVar, new AnalyticsDashboardFlowContract$Step.AddAsset((xi0.b) obj2), true, null, false, 12);
        return Unit.f186387a;
    }
}
