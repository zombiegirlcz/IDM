package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceTypeSelectionScreenContract$InputData f120267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f120269c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120270g;

    public z2(c1 c1Var, q qVar, ViewController viewController, EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData) {
        this.f120267a = evidenceTypeSelectionScreenContract$InputData;
        this.f120268b = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, qVar, this, 1, 16);
        this.f120269c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, qVar, this, 0, 16));
        this.f = e4m.b.b(this.f120269c);
        this.f120270g = e4m.b.b(new e0(c1Var, qVar, this, 2, 16));
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
