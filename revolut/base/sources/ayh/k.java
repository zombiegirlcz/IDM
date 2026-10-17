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
public final class k implements gyh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOrderDetailsInputData f11218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f11219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11220c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f11221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f11222h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f11223j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f11224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f11225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f11226n;

    public k(b bVar, c cVar, ViewController viewController, CryptoOrderDetailsInputData cryptoOrderDetailsInputData) {
        this.f11220c = bVar;
        this.f11218a = cryptoOrderDetailsInputData;
        this.f11219b = viewController;
        int i = 20;
        this.d = e4m.g.a(new ak5.f(bVar, this, 1, i));
        this.e = e4m.g.a(new ak5.f(bVar, this, 2, i));
        this.f = e4m.g.a(new ak5.f(bVar, this, 3, i));
        this.f11221g = e4m.b.b(new ak5.f(bVar, this, 0, i));
        this.f11222h = e4m.b.b(new ak5.f(bVar, this, 5, i));
        this.i = e4m.g.a(new ak5.f(bVar, this, 4, i));
        this.f11223j = e4m.g.a(new ak5.f(bVar, this, 6, i));
        this.k = e4m.g.a(new ak5.f(bVar, this, 7, i));
        this.f11224l = e4m.b.b(new ak5.f(bVar, this, 9, i));
        this.f11225m = e4m.b.b(new ak5.f(bVar, this, 8, i));
        this.f11226n = e4m.b.b(new ak5.f(bVar, this, 10, i));
    }

    @Override // gyh.b
    public final fyh.g a() {
        return (fyh.g) this.f11226n.get();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        yji.n activeModel = (yji.n) this.f11221g.get();
        vxh.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(activeModel, "activeModel");
        Set setB = y0.b(activeModel);
        s.k(setB);
        builderBuilderWithExpectedSize.addAll((Iterable) setB);
        return j6.a.g(this.f11224l, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) p0.i(this.f11218a, (yji.n) this.f11221g.get(), (h) this.i.get(), (i) this.f11223j.get(), (j) this.k.get()));
        return j6.a.g(this.f11225m, builderBuilderWithExpectedSize);
    }
}
