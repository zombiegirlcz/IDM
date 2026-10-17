package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesListContract$InputData f130617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130619c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130621h;

    public d(j jVar, f fVar, InvitesListContract$InputData invitesListContract$InputData) {
        this.f130618b = jVar;
        this.f130617a = invitesListContract$InputData;
        int i = 25;
        this.f130619c = e4m.b.b(new ea2.p(jVar, this, 2, i));
        this.d = e4m.b.b(new ea2.p(jVar, this, 1, i));
        this.e = e4m.b.b(new ea2.p(jVar, this, 0, i));
        this.f = e4m.b.b(new ea2.p(jVar, this, 4, i));
        this.f130620g = e4m.b.b(new ea2.p(jVar, this, 3, i));
        this.f130621h = e4m.b.b(new ea2.p(jVar, this, 5, i));
    }

    public final tya.c b() {
        return new tya.c((cya.i) this.f130618b.f130646q.get());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f130620g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
