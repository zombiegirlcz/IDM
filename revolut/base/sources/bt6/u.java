package bt6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements xki.c, v37.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubSettingsFlowContract$InputData f18384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f18386c = this;
    public final e4m.e d = e4m.b.b(new ap3.d(this, 22));

    public u(b bVar, TaxHubSettingsFlowContract$InputData taxHubSettingsFlowContract$InputData) {
        this.f18385b = bVar;
        this.f18384a = taxHubSettingsFlowContract$InputData;
    }

    @Override // v37.a
    public final d0 b() {
        return new d0(this.f18385b, this.f18386c, 0);
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
