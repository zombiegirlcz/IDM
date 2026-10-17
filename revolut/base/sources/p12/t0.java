package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class t0 implements xki.c, kx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTopupRequestNavigation$InputData f231768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f231769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f231770c = this;
    public final e4m.e d;
    public final e4m.e e;

    public t0(v vVar, ApmTopupRequestNavigation$InputData apmTopupRequestNavigation$InputData) {
        this.f231769b = vVar;
        this.f231768a = apmTopupRequestNavigation$InputData;
        int i = 0;
        this.d = e4m.b.b(new s0(this, 0, i));
        this.e = e4m.b.b(new s0(this, 1, i));
    }

    @Override // kx1.a
    public final hc2.j c() {
        return new hc2.j(this.f231769b, this.f231770c, 4);
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
