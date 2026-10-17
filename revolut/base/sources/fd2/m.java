package fd2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.services.ideal.impl.ui.auth.IdealAuthScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdealAuthScreenContract$InputData f133886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f133887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133888c;

    public m(g gVar, j jVar, IdealAuthScreenContract$InputData idealAuthScreenContract$InputData) {
        this.f133886a = idealAuthScreenContract$InputData;
        int i = 8;
        this.f133887b = e4m.b.b(new fa0.q(gVar, this, 1, i));
        this.f133888c = e4m.b.b(new fa0.q(gVar, this, 0, i));
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
