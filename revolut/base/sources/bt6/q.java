package bt6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.TaxHubProfileFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements xki.c, v37.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubProfileFlowContract$InputData f18373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f18375c = this;
    public final e4m.e d;

    public q(b bVar, TaxHubProfileFlowContract$InputData taxHubProfileFlowContract$InputData) {
        this.f18374b = bVar;
        this.f18373a = taxHubProfileFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 29));
    }

    @Override // v37.a
    public final d0 b() {
        return new d0(this.f18374b, this.f18375c, 1);
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
