package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralsFlowContract$InputData f130625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f130627c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(j jVar, ViewController viewController, ReferralsFlowContract$InputData referralsFlowContract$InputData) {
        this.f130626b = jVar;
        this.f130625a = referralsFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.e = e4m.b.b(new ea2.p(jVar, this, 1, i));
        this.f = e4m.b.b(new ea2.p(jVar, this, 0, i));
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
