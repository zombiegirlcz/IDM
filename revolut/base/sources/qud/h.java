package qud;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f249400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249402c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f249404h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f249405j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f249406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f249407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f249408n;

    public h(c cVar, ViewController viewController, StakingPocket stakingPocket) {
        this.f249400a = stakingPocket;
        this.f249401b = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.f249402c = e4m.b.b(new v1(cVar, this, 1, i));
        this.d = e4m.b.b(new v1(cVar, this, 0, i));
        this.e = e4m.b.b(new v1(cVar, this, 4, i));
        this.f = e4m.b.b(new v1(cVar, this, 3, i));
        this.f249403g = e4m.b.b(new v1(cVar, this, 2, i));
        this.f249404h = e4m.b.b(new v1(cVar, this, 7, i));
        this.i = e4m.b.b(new v1(cVar, this, 9, i));
        this.f249405j = e4m.b.b(new v1(cVar, this, 8, i));
        this.k = e4m.b.b(new v1(cVar, this, 6, i));
        this.f249406l = e4m.b.b(new v1(cVar, this, 10, i));
        this.f249407m = e4m.b.b(new v1(cVar, this, 11, i));
        this.f249408n = e4m.b.b(new v1(cVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.f249403g.get());
    }
}
