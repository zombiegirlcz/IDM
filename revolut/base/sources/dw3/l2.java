package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.DocumentsUploadFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l2 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentsUploadFlowContract$InputData f119173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119174c;
    public final l2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119176h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119177j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119180n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119185t;
    public final e4m.e u;

    public l2(c1 c1Var, iq3.a aVar, ViewController viewController, DocumentsUploadFlowContract$InputData documentsUploadFlowContract$InputData) {
        this.f119174c = c1Var;
        this.f119172a = aVar;
        this.f119173b = documentsUploadFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119175g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119176h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(documentsUploadFlowContract$InputData));
        int i2 = 16;
        this.f119177j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119178l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119179m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119180n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119181p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119182q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119183r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119184s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119185t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119184s.get(), (yji.n) this.f119185t.get(), (yji.n) this.f119181p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119176h.get(), (yji.d) this.f119183r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119174c, this.d, 22);
    }
}
