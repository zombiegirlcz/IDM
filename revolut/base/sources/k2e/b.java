package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreBrandDetailDiscountScreenContract$InputData f180487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f180488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f180489c;
    public final e4m.e d;
    public final e4m.e e;

    public b(j jVar, d dVar, StoreBrandDetailDiscountScreenContract$InputData storeBrandDetailDiscountScreenContract$InputData) {
        this.f180487a = storeBrandDetailDiscountScreenContract$InputData;
        this.f180488b = e4m.b.b(new il8.d(jVar, dVar, this, 1, 11));
        int i = 11;
        this.f180489c = e4m.b.b(new il8.d(jVar, dVar, this, 0, i));
        this.d = e4m.b.b(new il8.d(jVar, dVar, this, 2, i));
        this.e = e4m.b.b(new il8.d(jVar, dVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f180489c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
