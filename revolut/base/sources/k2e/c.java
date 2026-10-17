package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreBrandDetailEarnScreenContract$InputData f180490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f180491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f180492c;
    public final e4m.e d;
    public final e4m.e e;

    public c(j jVar, d dVar, StoreBrandDetailEarnScreenContract$InputData storeBrandDetailEarnScreenContract$InputData) {
        this.f180490a = storeBrandDetailEarnScreenContract$InputData;
        this.f180491b = e4m.b.b(new il8.d(jVar, dVar, this, 1, 12));
        int i = 12;
        this.f180492c = e4m.b.b(new il8.d(jVar, dVar, this, 0, i));
        this.d = e4m.b.b(new il8.d(jVar, dVar, this, 2, i));
        this.e = e4m.b.b(new il8.d(jVar, dVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f180492c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
