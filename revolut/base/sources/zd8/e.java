package zd8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_coparent.impl.ui.invitation.CoparentInvitationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoparentInvitationFlowContract$InputData f321337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f321338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f321339c;
    public final e4m.e d;
    public final e4m.e e;

    public e(f fVar, ViewController viewController, CoparentInvitationFlowContract$InputData coparentInvitationFlowContract$InputData) {
        this.f321338b = fVar;
        this.f321337a = coparentInvitationFlowContract$InputData;
        this.f321339c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new k0(fVar, this, 1, i));
        this.e = e4m.b.b(new k0(fVar, this, 0, i));
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
