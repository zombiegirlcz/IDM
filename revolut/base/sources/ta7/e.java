package ta7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements xki.c, gb7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HiddenAccountsFlowContract$InputData f269123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f269124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f269125c = this;
    public final e4m.e d;

    public e(d dVar, HiddenAccountsFlowContract$InputData hiddenAccountsFlowContract$InputData) {
        this.f269124b = dVar;
        this.f269123a = hiddenAccountsFlowContract$InputData;
        this.d = e4m.b.b(new t1f.i(dVar, this));
    }

    @Override // gb7.a
    public final i c() {
        return new i(this.f269124b, this.f269125c, 1);
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
