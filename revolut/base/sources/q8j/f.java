package q8j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$InputData;
import java.util.Set;
import prk.k0;
import x8j.o;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f243127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoEarningScreenContract$InputData f243128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f243129c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f243130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f243131h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f243132j;
    public final e4m.e k;

    public f(c cVar, ViewController viewController, CryptoEarningScreenContract$InputData cryptoEarningScreenContract$InputData, o oVar) {
        this.f243129c = cVar;
        this.f243127a = oVar;
        this.f243128b = cryptoEarningScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.e = e4m.b.b(new k0(cVar, this, 2, i));
        this.f = e4m.b.b(new k0(cVar, this, 1, i));
        this.f243130g = e4m.b.b(new k0(cVar, this, 0, i));
        this.f243131h = e4m.b.b(new k0(cVar, this, 5, i));
        this.i = e4m.b.b(new k0(cVar, this, 4, i));
        this.f243132j = e4m.b.b(new k0(cVar, this, 3, i));
        this.k = e4m.b.b(new k0(cVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.i.get(), (n) this.f243131h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f243130g.get(), (yji.d) this.f243132j.get());
    }
}
