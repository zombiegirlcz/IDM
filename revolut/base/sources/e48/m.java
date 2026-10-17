package e48;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.v7;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InviteFlowContract$InputData f122455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f122456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f122457c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f122458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f122459h;
    public final e4m.e i;

    public m(g gVar, ViewController viewController, InviteFlowContract$InputData inviteFlowContract$InputData) {
        this.f122456b = gVar;
        this.f122455a = inviteFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 17;
        this.e = e4m.b.b(new v7(gVar, this, 2, i));
        this.f = e4m.b.b(new v7(gVar, this, 1, i));
        this.f122458g = e4m.b.b(new v7(gVar, this, 0, i));
        this.f122459h = e4m.b.b(new v7(gVar, this, 3, i));
        this.i = e4m.b.b(new v7(gVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f122458g.get());
    }
}
