package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f9 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118773a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditToRefinanceSelectionScreenContract$InputData f118774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118775c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118777h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118778j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118781n;

    public f9(c1 c1Var, p5 p5Var, ViewController viewController, CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData) {
        this.f118774b = creditToRefinanceSelectionScreenContract$InputData;
        this.f118775c = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.d = e4m.b.b(new q8(c1Var, p5Var, this, 2, i));
        this.e = e4m.b.b(new q8(c1Var, p5Var, this, 1, i));
        this.f = e4m.b.b(new q8(c1Var, p5Var, this, 0, i));
        q8 q8Var = new q8(c1Var, p5Var, this, 4, i);
        this.f118781n = q8Var;
        this.f118776g = e4m.b.b(q8Var);
        this.f118777h = e4m.b.b(new q8(c1Var, p5Var, this, 3, i));
        this.i = e4m.b.b(new q8(c1Var, p5Var, this, 5, i));
        this.f118778j = e4m.b.b(new q8(c1Var, p5Var, this, 6, i));
        this.k = e4m.b.b((q8) this.f118781n);
        this.f118779l = e4m.b.b(new q8(c1Var, p5Var, this, 8, i));
        this.f118780m = e4m.b.b(new q8(c1Var, p5Var, this, 7, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        switch (this.f118773a) {
        }
        return (cx4.b) this.i.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f118773a) {
        }
        return ImmutableSet.of((yji.n) this.f118778j.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f118773a) {
        }
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f118777h.get(), (yji.d) this.i.get());
    }

    public f9(c1 c1Var, q4 q4Var, ViewController viewController, CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData) {
        this.f118774b = creditToRefinanceSelectionScreenContract$InputData;
        this.f118775c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new q8(c1Var, q4Var, this, 2, i));
        this.e = e4m.b.b(new q8(c1Var, q4Var, this, 1, i));
        this.f = e4m.b.b(new q8(c1Var, q4Var, this, 0, i));
        q8 q8Var = new q8(c1Var, q4Var, this, 4, i);
        this.f118781n = q8Var;
        this.f118776g = e4m.b.b(q8Var);
        this.f118777h = e4m.b.b(new q8(c1Var, q4Var, this, 3, i));
        this.i = e4m.b.b(new q8(c1Var, q4Var, this, 5, i));
        this.f118778j = e4m.b.b(new q8(c1Var, q4Var, this, 6, i));
        this.k = e4m.b.b((q8) this.f118781n);
        this.f118779l = e4m.b.b(new q8(c1Var, q4Var, this, 8, i));
        this.f118780m = e4m.b.b(new q8(c1Var, q4Var, this, 7, i));
    }
}
