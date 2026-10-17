package px;

import com.google.common.collect.ImmutableSet;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import prk.k0;
import yji.n;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.b f240514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BarcodeReaderFlowContract$InputData f240515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f240516c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f240517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f240518h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f240519j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f240520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f240521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f240522n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f240523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f240524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f240525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f240526s;

    public f(g gVar, oy.b bVar, ViewController viewController, BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData) {
        this.f240516c = gVar;
        this.f240514a = bVar;
        this.f240515b = barcodeReaderFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.e = e4m.b.b(new k0(gVar, this, 1, i));
        this.f = e4m.b.b(new k0(gVar, this, 0, i));
        this.f240517g = e4m.b.b(new k0(gVar, this, 4, i));
        this.f240518h = e4m.b.b(new k0(gVar, this, 3, i));
        this.i = e4m.b.b(new k0(gVar, this, 2, i));
        this.f240519j = e4m.b.b(new k0(gVar, this, 10, i));
        this.k = e4m.b.b(new k0(gVar, this, 9, i));
        this.f240520l = e4m.b.b(new k0(gVar, this, 12, i));
        this.f240521m = e4m.b.b(new k0(gVar, this, 11, i));
        this.f240522n = e4m.b.b(new k0(gVar, this, 8, i));
        this.o = e4m.b.b(new k0(gVar, this, 7, i));
        this.f240523p = e4m.b.b(new k0(gVar, this, 6, i));
        this.f240524q = e4m.b.b(new k0(gVar, this, 13, i));
        this.f240525r = e4m.b.b(new k0(gVar, this, 14, i));
        this.f240526s = e4m.b.b(new k0(gVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
