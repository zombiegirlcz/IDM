package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w4 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PartnerSolicitorDetailsControllerContract$InputData f120060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f120062c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120064h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120065j;

    public w4(c1 c1Var, r6 r6Var, ViewController viewController, PartnerSolicitorDetailsControllerContract$InputData partnerSolicitorDetailsControllerContract$InputData) {
        this.f120061b = c1Var;
        this.f120060a = partnerSolicitorDetailsControllerContract$InputData;
        this.f120062c = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, r6Var, this, 1, 25);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, r6Var, this, 0, 25));
        this.f120063g = e4m.b.b(new e0(c1Var, r6Var, this, 2, 25));
        this.f120064h = e4m.b.b(new e0(c1Var, r6Var, this, 3, 25));
        this.i = e4m.b.b(this.d);
        this.f120065j = e4m.b.b(new e0(c1Var, r6Var, this, 4, 25));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f120063g.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120064h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f120063g.get());
    }
}
