package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.DocumentsUploadPluginFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m2 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentsUploadPluginFlowContract$InputData f119248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119249c;
    public final m2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119251h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119252j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119255n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119260t;
    public final e4m.e u;

    public m2(c1 c1Var, iq3.a aVar, ViewController viewController, DocumentsUploadPluginFlowContract$InputData documentsUploadPluginFlowContract$InputData) {
        this.f119249c = c1Var;
        this.f119247a = aVar;
        this.f119248b = documentsUploadPluginFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 17;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119250g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119251h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(documentsUploadPluginFlowContract$InputData));
        int i2 = 17;
        this.f119252j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119253l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119254m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119255n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119256p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119257q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119258r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119259s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119260t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119259s.get(), (yji.n) this.f119260t.get(), (yji.n) this.f119256p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119251h.get(), (yji.d) this.f119258r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119249c, this.d, 24);
    }
}
