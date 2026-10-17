package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details;

import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import gim.i;
import kge.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lzi.c;
import lzi.e;
import lzi.g;
import lzi.h;
import lzi.j;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ AnalyticsDetailsContract$InputData.Configuration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f87561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AnalyticsSpendingPeriod$Interval f87562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AnalyticsDetailsContract$InputData.Configuration configuration, b bVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, Continuation continuation) {
        super(2, continuation);
        this.v = configuration;
        this.f87561w = bVar;
        this.f87562x = analyticsSpendingPeriod$Interval;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f87561w, this.f87562x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.f87561w;
        AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData = bVar.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            AnalyticsDetailsContract$InputData.Configuration configuration = this.v;
            lzi.i iVar = configuration.f87553h;
            PeriodPreferenceType periodPreferenceType = null;
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f87562x;
            if (iVar != null) {
                d dVar = bVar.f87567t;
                j period = new j(iVar, analyticsSpendingPeriod$Interval, null);
                yld.d screenType = analyticsDetailsContract$InputData.f87547b;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(period, "period");
                Intrinsics.checkNotNullParameter(screenType, "screenType");
                eqj.d dVar2 = (eqj.d) dVar.f183974b;
                j jVarA = dVar2.a(screenType.toString());
                if (jVarA != null) {
                    period = jVarA;
                }
                dVar2.h(period);
            } else {
                d dVar3 = bVar.f87567t;
                String string = analyticsSpendingPeriod$Interval.f99210a.toString();
                h hVar = configuration.f87552g;
                if ((hVar instanceof c) || (hVar instanceof e)) {
                    periodPreferenceType = PeriodPreferenceType.MONTH;
                } else if (hVar instanceof g) {
                    periodPreferenceType = PeriodPreferenceType.WEEK;
                } else if (hVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                yld.d dVar4 = analyticsDetailsContract$InputData.f87547b;
                this.u = 1;
                if (dVar3.z(string, periodPreferenceType, null, dVar4, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
