package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityHubInputData f292081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f292082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f292083c = this;
    public final e4m.e d;

    public u(t tVar, SecurityHubInputData securityHubInputData) {
        this.f292082b = tVar;
        this.f292081a = securityHubInputData;
        this.d = e4m.b.b(new n(tVar, this, 1));
    }

    public final smd.s b() {
        t tVar = this.f292082b;
        return new smd.s(tVar.f292072n.e(), (wtc.q0) tVar.f0.get());
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
