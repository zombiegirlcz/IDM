package us2;

import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralAccountScreenContract$InputData f282393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f282394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282395c;
    public final e4m.e d;

    public e(j jVar, h hVar, ReferralAccountScreenContract$InputData referralAccountScreenContract$InputData) {
        this.f282394b = jVar;
        this.f282393a = referralAccountScreenContract$InputData;
        int i = 13;
        this.f282395c = e4m.b.b(new k0(jVar, this, 1, i));
        this.d = e4m.b.b(new k0(jVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
