package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeclineInvitationPopupScreenContract$InputData f118326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118328c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public b2(c1 c1Var, ViewController viewController, DeclineInvitationPopupScreenContract$InputData declineInvitationPopupScreenContract$InputData) {
        this.f118326a = declineInvitationPopupScreenContract$InputData;
        this.f118327b = e4m.b.b(e4m.c.a(viewController));
        this.f118328c = e4m.b.b(new h1(c1Var, this, 2, 9));
        this.d = e4m.b.b(new h1(c1Var, this, 1, 9));
        this.e = e4m.b.b(new h1(c1Var, this, 0, 9));
        this.f = e4m.b.b(new h1(c1Var, this, 3, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
