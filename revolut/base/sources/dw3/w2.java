package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceCategorySelectionScreenContract$InputData f120053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f120055c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120056g;

    public w2(c1 c1Var, q qVar, ViewController viewController, EvidenceCategorySelectionScreenContract$InputData evidenceCategorySelectionScreenContract$InputData) {
        this.f120053a = evidenceCategorySelectionScreenContract$InputData;
        this.f120054b = e4m.b.b(e4m.c.a(viewController));
        h1 h1Var = new h1(qVar, this, 1, 23);
        this.f120055c = h1Var;
        this.d = e4m.b.b(h1Var);
        this.e = e4m.b.b(new h1(qVar, this, 0, 23));
        this.f = e4m.b.b(this.f120055c);
        this.f120056g = e4m.b.b(new h1(qVar, this, 2, 23));
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
