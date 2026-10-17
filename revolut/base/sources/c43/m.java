package c43;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements sji.b {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f21045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f21046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SelectPaymentMethodInputData f21047c;
    public final h d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f21048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f21049h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f21050j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f21051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f21052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f21053n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f21054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f21055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f21056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f21057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f21058t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f21059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f21060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f21061y;
    public final e4m.e z;

    public m(h hVar, BaseScreen baseScreen, ScreenContentRecyclerView screenContentRecyclerView, SelectPaymentMethodInputData selectPaymentMethodInputData) {
        this.d = hVar;
        this.f21045a = screenContentRecyclerView;
        this.f21046b = baseScreen;
        this.f21047c = selectPaymentMethodInputData;
        int i = 12;
        this.e = e4m.b.b(new bt7.e(hVar, this, 1, i));
        this.f = e4m.b.b(new bt7.e(hVar, this, 0, i));
        this.f21048g = e4m.b.b(e4m.c.a(baseScreen));
        int i2 = 12;
        this.f21049h = e4m.b.b(new bt7.e(hVar, this, 4, i2));
        this.i = e4m.b.b(new bt7.e(hVar, this, 3, i2));
        this.f21050j = e4m.b.b(new bt7.e(hVar, this, 2, i2));
        this.k = e4m.b.b(new bt7.e(hVar, this, 7, i2));
        this.f21051l = e4m.b.b(new bt7.e(hVar, this, 6, i2));
        this.f21052m = e4m.b.b(new bt7.e(hVar, this, 5, i2));
        this.f21053n = e4m.b.b(new bt7.e(hVar, this, 8, i2));
        this.o = e4m.b.b(new bt7.e(hVar, this, 11, i2));
        this.f21054p = e4m.b.b(new bt7.e(hVar, this, 13, i2));
        this.f21055q = e4m.b.b(new bt7.e(hVar, this, 14, i2));
        this.f21056r = e4m.b.b(new bt7.e(hVar, this, 16, i2));
        this.f21057s = e4m.b.b(new bt7.e(hVar, this, 15, i2));
        this.f21058t = e4m.b.b(new bt7.e(hVar, this, 18, i2));
        this.u = e4m.b.b(new bt7.e(hVar, this, 17, i2));
        this.v = e4m.b.b(new bt7.e(hVar, this, 12, i2));
        this.f21059w = e4m.b.b(new bt7.e(hVar, this, 19, i2));
        this.f21060x = e4m.b.b(new bt7.e(hVar, this, 20, i2));
        this.f21061y = e4m.b.b(new bt7.e(hVar, this, 10, i2));
        this.z = e4m.b.b(new bt7.e(hVar, this, 21, i2));
        this.A = e4m.b.b(new bt7.e(hVar, this, 22, i2));
        this.B = e4m.b.b(new bt7.e(hVar, this, 9, i2));
        this.C = e4m.b.b(new bt7.e(hVar, this, 23, i2));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f21053n.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f21050j.get(), (yji.d) this.f21052m.get());
    }
}
