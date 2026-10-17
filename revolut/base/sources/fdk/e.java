package fdk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$InputData;
import f4g.m;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MonthlyDrawsFlowContract$InputData f133977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f133978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133979c;

    public e(g gVar, MonthlyDrawsFlowContract$InputData monthlyDrawsFlowContract$InputData) {
        this.f133978b = gVar;
        this.f133977a = monthlyDrawsFlowContract$InputData;
        this.f133979c = e4m.b.b(new m(gVar, this, 16));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
