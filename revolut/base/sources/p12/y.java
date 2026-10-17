package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f231822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmNewAliasNavigation$InputData f231823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f231824c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public y(v vVar, com.revolut.feature.apm.core.ui.api.navigation.a aVar, ApmNewAliasNavigation$InputData apmNewAliasNavigation$InputData) {
        this.f231824c = vVar;
        this.f231822a = aVar;
        this.f231823b = apmNewAliasNavigation$InputData;
        int i = 26;
        this.d = e4m.b.b(new ove.w(vVar, this, 0, i));
        this.e = e4m.b.b(new ove.w(vVar, this, 2, i));
        this.f = e4m.b.b(new ove.w(vVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
