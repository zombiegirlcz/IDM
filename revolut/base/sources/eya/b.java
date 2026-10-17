package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InviteCampaignHomeControllerContract$InputData f130609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130611c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130613h;

    public b(j jVar, f fVar, InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData) {
        this.f130610b = jVar;
        this.f130609a = inviteCampaignHomeControllerContract$InputData;
        int i = 23;
        this.f130611c = e4m.b.b(new ea2.p(jVar, this, 2, i));
        this.d = e4m.b.b(new ea2.p(jVar, this, 1, i));
        this.e = e4m.b.b(new ea2.p(jVar, this, 0, i));
        this.f = e4m.b.b(new ea2.p(jVar, this, 4, i));
        this.f130612g = e4m.b.b(new ea2.p(jVar, this, 3, i));
        this.f130613h = e4m.b.b(new ea2.p(jVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f130612g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
