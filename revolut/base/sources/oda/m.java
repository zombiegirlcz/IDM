package oda;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import fmf.o0;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f224387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PocketsListContract$InputData f224388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f224389c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f224390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f224391h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f224392j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f224393l;

    public m(o oVar, ViewController viewController, PocketsListContract$InputData pocketsListContract$InputData, o0 o0Var) {
        this.f224389c = oVar;
        this.f224387a = o0Var;
        this.f224388b = pocketsListContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.e = e4m.b.b(new o41.b(oVar, this, 2, i));
        this.f = e4m.b.b(new o41.b(oVar, this, 1, i));
        this.f224390g = e4m.b.b(new o41.b(oVar, this, 0, i));
        this.f224391h = e4m.b.b(new o41.b(oVar, this, 3, i));
        this.i = e4m.b.b(new o41.b(oVar, this, 4, i));
        this.f224392j = e4m.b.b(new o41.b(oVar, this, 5, i));
        this.k = e4m.b.b(new o41.b(oVar, this, 7, i));
        this.f224393l = e4m.b.b(new o41.b(oVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get(), (yji.n) this.f224392j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f224390g.get(), (yji.d) this.f224391h.get());
    }
}
