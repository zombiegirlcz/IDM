package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignDocumentsScreenContract$InputData f119640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119642c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119644h;

    public r2(c1 c1Var, s2 s2Var, ViewController viewController, ESignDocumentsScreenContract$InputData eSignDocumentsScreenContract$InputData) {
        this.f119641b = c1Var;
        this.f119640a = eSignDocumentsScreenContract$InputData;
        this.f119642c = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        e0 e0Var = new e0(c1Var, s2Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, s2Var, this, 0, i));
        this.f119643g = e4m.b.b(this.d);
        this.f119644h = e4m.b.b(new e0(c1Var, s2Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119643g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
