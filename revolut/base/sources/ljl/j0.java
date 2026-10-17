package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.post_authentication.PostAuthenticationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostAuthenticationFlowContract$InputData f195997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f195998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f195999c;
    public final j0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196000g;

    public j0(q0 q0Var, ViewController viewController, PostAuthenticationFlowContract$InputData postAuthenticationFlowContract$InputData) {
        this.f195999c = q0Var;
        this.f195997a = postAuthenticationFlowContract$InputData;
        this.f195998b = viewController;
        int i = 3;
        this.e = e4m.b.b(new u(q0Var, this, 0, i));
        this.f = e4m.b.b(new u(q0Var, this, 2, i));
        this.f196000g = e4m.b.b(new u(q0Var, this, 1, i));
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
