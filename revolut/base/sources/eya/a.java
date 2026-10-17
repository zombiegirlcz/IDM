package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AllReferralsScreenContract$InputData f130606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130608c;
    public final e4m.e d;
    public final e4m.e e;

    public a(j jVar, f fVar, AllReferralsScreenContract$InputData allReferralsScreenContract$InputData) {
        this.f130607b = jVar;
        this.f130606a = allReferralsScreenContract$InputData;
        int i = 22;
        this.f130608c = e4m.b.b(new ea2.p(jVar, this, 1, i));
        this.d = e4m.b.b(new ea2.p(jVar, this, 0, i));
        this.e = e4m.b.b(new ea2.p(jVar, this, 2, i));
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
