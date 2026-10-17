package qud;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakeControllerContract$InputData f249352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f249353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249354c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f249356h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f249357j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f249358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f249359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f249360n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f249361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f249362q;

    public b(c cVar, ViewController viewController, StakeControllerContract$InputData stakeControllerContract$InputData) {
        this.f249353b = cVar;
        this.f249352a = stakeControllerContract$InputData;
        this.f249354c = e4m.b.b(e4m.c.a(viewController));
        int i = 8;
        this.d = e4m.b.b(new v1(cVar, this, 1, i));
        this.e = e4m.b.b(new v1(cVar, this, 0, i));
        this.f = e4m.b.b(new v1(cVar, this, 4, i));
        this.f249355g = e4m.b.b(new v1(cVar, this, 3, i));
        this.f249356h = e4m.b.b(new v1(cVar, this, 2, i));
        this.i = e4m.b.b(new v1(cVar, this, 6, i));
        this.f249357j = e4m.b.b(new v1(cVar, this, 5, i));
        this.k = e4m.b.b(new v1(cVar, this, 8, i));
        this.f249358l = e4m.b.b(new v1(cVar, this, 7, i));
        this.f249359m = e4m.b.b(new v1(cVar, this, 11, i));
        this.f249360n = e4m.b.b(new v1(cVar, this, 12, i));
        this.o = e4m.b.b(new v1(cVar, this, 10, i));
        this.f249361p = e4m.b.b(new v1(cVar, this, 13, i));
        this.f249362q = e4m.b.b(new v1(cVar, this, 9, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f249358l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f249356h.get(), (yji.d) this.f249357j.get());
    }
}
