package fdk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreenContract$InputData;
import f4g.m;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MonthlyDrawHubScreenContract$InputData f133974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f133975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133976c;

    public d(g gVar, MonthlyDrawHubScreenContract$InputData monthlyDrawHubScreenContract$InputData) {
        this.f133975b = gVar;
        this.f133974a = monthlyDrawHubScreenContract$InputData;
        this.f133976c = e4m.b.b(new m(gVar, this, 15));
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
