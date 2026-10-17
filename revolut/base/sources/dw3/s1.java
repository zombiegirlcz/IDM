package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomSolicitorDetailsControllerContract$InputData f119726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119728c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119730h;
    public final e4m.e i;

    public s1(c1 c1Var, r6 r6Var, ViewController viewController, CustomSolicitorDetailsControllerContract$InputData customSolicitorDetailsControllerContract$InputData) {
        this.f119727b = c1Var;
        this.f119726a = customSolicitorDetailsControllerContract$InputData;
        this.f119728c = e4m.b.b(e4m.c.a(viewController));
        int i = 8;
        e0 e0Var = new e0(c1Var, r6Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, r6Var, this, 0, i));
        this.f119729g = e4m.b.b(this.d);
        this.f119730h = e4m.b.b(new e0(c1Var, r6Var, this, 3, i));
        this.i = e4m.b.b(new e0(c1Var, r6Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119729g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
