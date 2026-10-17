package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements xki.c, tkl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualReviewFlowContract$InputData f195881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f195882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f195883c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f195884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f195885h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f195886j;
    public final e4m.e k;

    public b0(q0 q0Var, ViewController viewController, ManualReviewFlowContract$InputData manualReviewFlowContract$InputData) {
        this.f195882b = q0Var;
        this.f195881a = manualReviewFlowContract$InputData;
        int i = 1;
        this.d = e4m.b.b(new u(q0Var, this, 1, i));
        this.e = e4m.g.a(new u(q0Var, this, 3, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 1;
        this.f195884g = e4m.b.b(new u(q0Var, this, 4, i2));
        this.f195885h = e4m.b.b(new u(q0Var, this, 5, i2));
        this.i = e4m.b.b(new u(q0Var, this, 2, i2));
        this.f195886j = e4m.b.b(new u(q0Var, this, 0, i2));
        this.k = e4m.b.b(new u(q0Var, this, 6, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // tkl.a
    public final z0 q() {
        return new z0(this.f195882b, this.f195883c, 0);
    }
}
