package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceHolderSelectionScreenContract$InputData f120199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f120201c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120202g;

    public y2(c1 c1Var, x2 x2Var, ViewController viewController, EvidenceHolderSelectionScreenContract$InputData evidenceHolderSelectionScreenContract$InputData) {
        this.f120199a = evidenceHolderSelectionScreenContract$InputData;
        this.f120200b = e4m.b.b(e4m.c.a(viewController));
        h1 h1Var = new h1(x2Var, this, 1, 25);
        this.f120201c = h1Var;
        this.d = e4m.b.b(h1Var);
        this.e = e4m.b.b(new h1(x2Var, this, 0, 25));
        this.f = e4m.b.b(this.f120201c);
        this.f120202g = e4m.b.b(new h1(x2Var, this, 2, 25));
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
