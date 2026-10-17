package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreBrandDetailMsiScreenContract$InputData f180499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f180500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f180501c;
    public final e4m.e d;
    public final e4m.e e;

    public e(j jVar, d dVar, StoreBrandDetailMsiScreenContract$InputData storeBrandDetailMsiScreenContract$InputData) {
        this.f180499a = storeBrandDetailMsiScreenContract$InputData;
        this.f180500b = e4m.b.b(new il8.d(jVar, dVar, this, 1, 13));
        int i = 13;
        this.f180501c = e4m.b.b(new il8.d(jVar, dVar, this, 0, i));
        this.d = e4m.b.b(new il8.d(jVar, dVar, this, 2, i));
        this.e = e4m.b.b(new il8.d(jVar, dVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f180501c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
