package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitCheckoutScreenContract$InputData f155915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155917c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f155918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f155919h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f155920j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f155921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f155922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f155923n;
    public final e4m.e o;

    public j(q qVar, BaseScreen baseScreen, TransitCheckoutScreenContract$InputData transitCheckoutScreenContract$InputData) {
        this.f155916b = qVar;
        this.f155915a = transitCheckoutScreenContract$InputData;
        this.f155917c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 6;
        this.d = e4m.b.b(new hjg.b(qVar, this, 2, i));
        this.e = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.f = e4m.b.b(new hjg.b(qVar, this, 0, i));
        this.f155918g = e4m.b.b(new hjg.b(qVar, this, 4, i));
        this.f155919h = e4m.b.b(new hjg.b(qVar, this, 3, i));
        this.i = e4m.b.b(new hjg.b(qVar, this, 6, i));
        this.f155920j = e4m.b.b(new hjg.b(qVar, this, 5, i));
        this.k = e4m.b.b(new hjg.b(qVar, this, 8, i));
        this.f155921l = e4m.b.b(new hjg.b(qVar, this, 7, i));
        this.f155922m = e4m.b.b(new hjg.b(qVar, this, 9, i));
        this.f155923n = e4m.b.b(new hjg.b(qVar, this, 11, i));
        this.o = e4m.b.b(new hjg.b(qVar, this, 10, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155916b.f155949n.get(), (yji.n) this.f155919h.get(), (yji.n) this.f155920j.get(), (yji.n) this.f155921l.get(), (yji.n) this.f155922m.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
