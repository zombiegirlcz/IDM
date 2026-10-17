package srh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.g;
import java.util.Set;
import r7d.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeScreenContract$InputData f265212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f265213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f265214c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f265215g;

    public a(b bVar, d dVar, ViewController viewController, BarcodeScreenContract$InputData barcodeScreenContract$InputData) {
        this.f265212a = barcodeScreenContract$InputData;
        this.f265213b = e4m.b.b(new w(bVar, dVar, this, 2, 6));
        this.f265214c = g.a(new w(bVar, dVar, this, 3, 6));
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new w(bVar, dVar, this, 1, 6));
        this.f = e4m.b.b(new w(bVar, dVar, this, 0, 6));
        this.f265215g = e4m.b.b(new w(bVar, dVar, this, 4, 6));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
