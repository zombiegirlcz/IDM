package v0i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TPSLAmountControllerContract$InputData f284875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f284876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f284877c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f284878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f284879h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f284880j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f284881l;

    public d(b bVar, ViewController viewController, TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData) {
        this.f284876b = bVar;
        this.f284875a = tPSLAmountControllerContract$InputData;
        this.f284877c = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.d = e4m.b.b(new r2(bVar, this, 1, i));
        this.e = e4m.b.b(new r2(bVar, this, 0, i));
        this.f = e4m.b.b(new r2(bVar, this, 4, i));
        this.f284878g = e4m.b.b(new r2(bVar, this, 3, i));
        this.f284879h = e4m.b.b(new r2(bVar, this, 2, i));
        this.i = e4m.b.b(new r2(bVar, this, 6, i));
        this.f284880j = e4m.b.b(new r2(bVar, this, 7, i));
        this.k = e4m.b.b(new r2(bVar, this, 8, i));
        this.f284881l = e4m.b.b(new r2(bVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f284879h.get());
    }
}
