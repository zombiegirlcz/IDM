package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethodsScreenContract$InputData f249685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f249686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249687c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f249689h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f249690j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f249691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f249692m;

    public y(w wVar, x xVar, ViewController viewController, TopupMethodsScreenContract$InputData topupMethodsScreenContract$InputData) {
        this.f249686b = wVar;
        this.f249685a = topupMethodsScreenContract$InputData;
        this.f249687c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new ppd.j(wVar, xVar, this, 2, i));
        this.e = e4m.b.b(new ppd.j(wVar, xVar, this, 1, i));
        this.f = e4m.b.b(new ppd.j(wVar, xVar, this, 0, i));
        this.f249688g = e4m.b.b(new ppd.j(wVar, xVar, this, 5, i));
        this.f249689h = e4m.b.b(new ppd.j(wVar, xVar, this, 4, i));
        this.i = e4m.b.b(new ppd.j(wVar, xVar, this, 3, i));
        this.f249690j = e4m.b.b(new ppd.j(wVar, xVar, this, 6, i));
        this.k = e4m.b.b(new ppd.j(wVar, xVar, this, 8, i));
        this.f249691l = e4m.b.b(new ppd.j(wVar, xVar, this, 9, i));
        this.f249692m = e4m.b.b(new ppd.j(wVar, xVar, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f249690j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}
