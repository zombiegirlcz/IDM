package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.questionnaire_kompot.QuestionnaireFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h5 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QuestionnaireFlowContract$InputData f118888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118889c;
    public final h5 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118891h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118892j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118895n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118900t;
    public final e4m.e u;

    public h5(c1 c1Var, iq3.a aVar, ViewController viewController, QuestionnaireFlowContract$InputData questionnaireFlowContract$InputData) {
        this.f118889c = c1Var;
        this.f118887a = aVar;
        this.f118888b = questionnaireFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f118890g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f118891h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(questionnaireFlowContract$InputData));
        int i2 = 0;
        this.f118892j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f118893l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f118894m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f118895n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f118896p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f118897q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f118898r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f118899s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f118900t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118899s.get(), (yji.n) this.f118900t.get(), (yji.n) this.f118896p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118891h.get(), (yji.d) this.f118898r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118889c, this.d, 13);
    }
}
