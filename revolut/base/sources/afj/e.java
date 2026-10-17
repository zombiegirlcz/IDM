package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCheckoutScreenContract$InputData f4212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4214c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f4216h;

    public e(b bVar, c cVar, EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData) {
        this.f4213b = bVar;
        this.f4212a = esimCheckoutScreenContract$InputData;
        this.f4214c = e4m.b.b(new d(bVar, cVar, this, 1, 0));
        int i = 0;
        this.d = e4m.b.b(new d(bVar, cVar, this, 0, i));
        this.e = e4m.b.b(new d(bVar, cVar, this, 2, i));
        this.f = e4m.b.b(new d(bVar, cVar, this, 3, i));
        this.f4215g = e4m.b.b(new d(bVar, cVar, this, 5, i));
        this.f4216h = e4m.b.b(new d(bVar, cVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.e.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
