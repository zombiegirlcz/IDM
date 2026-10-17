package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreBrandDetailRedeemScreenContract$InputData f180502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f180503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f180504c;
    public final e4m.e d;
    public final e4m.e e;

    public f(j jVar, d dVar, StoreBrandDetailRedeemScreenContract$InputData storeBrandDetailRedeemScreenContract$InputData) {
        this.f180502a = storeBrandDetailRedeemScreenContract$InputData;
        this.f180503b = e4m.b.b(new il8.d(jVar, dVar, this, 1, 14));
        int i = 14;
        this.f180504c = e4m.b.b(new il8.d(jVar, dVar, this, 0, i));
        this.d = e4m.b.b(new il8.d(jVar, dVar, this, 2, i));
        this.e = e4m.b.b(new il8.d(jVar, dVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f180504c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
