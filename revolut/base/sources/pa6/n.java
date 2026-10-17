package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements qji.a, jb6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationsFlowContract$InputData f234405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f234407c = this;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 17));

    public n(m mVar, DonationsFlowContract$InputData donationsFlowContract$InputData) {
        this.f234406b = mVar;
        this.f234405a = donationsFlowContract$InputData;
    }

    @Override // jb6.a
    public final r b() {
        return new r(this.f234406b, this.f234407c, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
