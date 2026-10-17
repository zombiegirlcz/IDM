package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesDetailsContract$InputData f130614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130616c;
    public final e4m.e d;
    public final e4m.e e;

    public c(j jVar, f fVar, ViewController viewController, InvitesDetailsContract$InputData invitesDetailsContract$InputData) {
        this.f130615b = jVar;
        this.f130614a = invitesDetailsContract$InputData;
        this.f130616c = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.d = e4m.b.b(new ea2.p(jVar, this, 1, i));
        this.e = e4m.b.b(new ea2.p(jVar, this, 0, i));
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
