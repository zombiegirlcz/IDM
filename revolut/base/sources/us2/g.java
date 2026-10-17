package us2;

import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralInviteeDetailsScreenContract$InputData f282399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282401c;
    public final e4m.e d;
    public final e4m.e e;

    public g(j jVar, h hVar, ViewController viewController, ReferralInviteeDetailsScreenContract$InputData referralInviteeDetailsScreenContract$InputData) {
        this.f282399a = referralInviteeDetailsScreenContract$InputData;
        this.f282400b = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        this.f282401c = e4m.b.b(new k0(jVar, this, 0, i));
        this.d = e4m.b.b(new k0(jVar, this, 2, i));
        this.e = e4m.b.b(new k0(jVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.singleton((yji.d) this.f282401c.get());
    }
}
