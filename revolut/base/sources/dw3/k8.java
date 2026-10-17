package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k8 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SummaryScreenContract$InputData f119136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7 f119138c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119140h;

    public k8(c1 c1Var, l2 l2Var, ViewController viewController, SummaryScreenContract$InputData summaryScreenContract$InputData) {
        this.f119136a = summaryScreenContract$InputData;
        this.f119137b = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        s7 s7Var = new s7(c1Var, l2Var, this, 1, i);
        this.f119138c = s7Var;
        this.d = e4m.b.b(s7Var);
        this.e = e4m.b.b(new s7(c1Var, l2Var, this, 0, i));
        this.f = e4m.b.b(this.f119138c);
        this.f119139g = e4m.b.b(new s7(c1Var, l2Var, this, 3, i));
        this.f119140h = e4m.b.b(new s7(c1Var, l2Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
