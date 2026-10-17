package ayh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import vtc.p0;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements gyh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOrderDetailsInputData f11233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f11234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11235c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f11236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f11237h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f11238j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f11239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f11240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f11241n;

    public p(b bVar, ViewController viewController, CryptoOrderDetailsInputData cryptoOrderDetailsInputData) {
        this.f11235c = bVar;
        this.f11233a = cryptoOrderDetailsInputData;
        this.f11234b = viewController;
        int i = 21;
        this.d = e4m.g.a(new ak5.f(bVar, this, 1, i));
        this.e = e4m.g.a(new ak5.f(bVar, this, 2, i));
        this.f = e4m.g.a(new ak5.f(bVar, this, 3, i));
        this.f11236g = e4m.b.b(new ak5.f(bVar, this, 0, i));
        this.f11237h = e4m.b.b(new ak5.f(bVar, this, 5, i));
        this.i = e4m.g.a(new ak5.f(bVar, this, 4, i));
        this.f11238j = e4m.g.a(new ak5.f(bVar, this, 6, i));
        this.k = e4m.g.a(new ak5.f(bVar, this, 7, i));
        this.f11239l = e4m.b.b(new ak5.f(bVar, this, 9, i));
        this.f11240m = e4m.b.b(new ak5.f(bVar, this, 8, i));
        this.f11241n = e4m.b.b(new ak5.f(bVar, this, 10, i));
    }

    @Override // gyh.b
    public final fyh.g a() {
        return (fyh.g) this.f11241n.get();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        yji.n activeModel = (yji.n) this.f11236g.get();
        vxh.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(activeModel, "activeModel");
        Set setB = y0.b(activeModel);
        s.k(setB);
        builderBuilderWithExpectedSize.addAll((Iterable) setB);
        return j6.a.g(this.f11239l, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) p0.i(this.f11233a, (yji.n) this.f11236g.get(), (h) this.i.get(), (i) this.f11238j.get(), (j) this.k.get()));
        return j6.a.g(this.f11240m, builderBuilderWithExpectedSize);
    }
}
