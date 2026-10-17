package did;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsCarouselDetailsScreenContract$InputData f115016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f115017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115018c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f115019g;

    public h(d dVar, ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData) {
        this.f115017b = dVar;
        this.f115016a = shopsCarouselDetailsScreenContract$InputData;
        int i = 6;
        this.f115018c = e4m.b.b(new db1.f(dVar, this, 1, i));
        this.d = e4m.b.b(new db1.f(dVar, this, 0, i));
        this.e = e4m.b.b(new db1.f(dVar, this, 3, i));
        this.f = e4m.b.b(new db1.f(dVar, this, 2, i));
        this.f115019g = e4m.b.b(new db1.f(dVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
