package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralsTroubleshooterTopLevelScreenContract$InputData f130628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130630c;
    public final e4m.e d;
    public final e4m.e e;

    public g(j jVar, f fVar, ReferralsTroubleshooterTopLevelScreenContract$InputData referralsTroubleshooterTopLevelScreenContract$InputData) {
        this.f130629b = jVar;
        this.f130628a = referralsTroubleshooterTopLevelScreenContract$InputData;
        int i = 27;
        this.f130630c = e4m.b.b(new ea2.p(jVar, this, 1, i));
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
