package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 implements xki.c, asd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthFlowContract$InputData f238557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f238559c = this;
    public final e4m.e d;

    public u0(n nVar, TotalWealthFlowContract$InputData totalWealthFlowContract$InputData) {
        this.f238558b = nVar;
        this.f238557a = totalWealthFlowContract$InputData;
        this.d = e4m.b.b(new u(nVar, this, 10));
    }

    @Override // asd.a
    public final j1 c() {
        return new j1(this.f238558b, this.f238559c, 0);
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
