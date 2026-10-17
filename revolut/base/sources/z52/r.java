package z52;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisSettingsScreenContract$InputData f319471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f319472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319473c;
    public final e4m.e d;

    public r(j jVar, m mVar, IrisSettingsScreenContract$InputData irisSettingsScreenContract$InputData) {
        this.f319472b = jVar;
        this.f319471a = irisSettingsScreenContract$InputData;
        this.f319473c = e4m.b.b(new q(jVar, mVar, this, 0, 0));
        this.d = e4m.b.b(new q(jVar, mVar, this, 1, 0));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f319473c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
