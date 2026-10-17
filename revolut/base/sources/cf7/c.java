package cf7;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import jf7.b0;
import jf7.d1;
import jf7.e0;
import jf7.h0;
import jf7.j1;
import jf7.n0;
import jf7.t0;
import jf7.w0;
import jf7.y;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements wf7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncentiveRewardDetailsControllerContract$InputData f23589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f23590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f23591c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f23592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f23593h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f23594j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f23595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f23596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f23597n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f23598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f23599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f23600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f23601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f23602t;
    public final e4m.e u;

    public c(b bVar, d dVar, ViewController viewController, IncentiveRewardDetailsControllerContract$InputData incentiveRewardDetailsControllerContract$InputData) {
        this.f23589a = incentiveRewardDetailsControllerContract$InputData;
        this.f23590b = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.f23591c = e4m.b.b(new bt7.e(bVar, this, 2, i));
        this.d = e4m.b.b(new bt7.e(bVar, this, 1, i));
        this.e = e4m.b.b(new bt7.e(bVar, this, 0, i));
        this.f = e4m.b.b(new bt7.e(bVar, this, 4, i));
        this.f23592g = e4m.b.b(new bt7.e(bVar, this, 5, i));
        this.f23593h = e4m.b.b(new bt7.e(bVar, this, 6, i));
        this.i = e4m.b.b(new bt7.e(bVar, this, 7, i));
        this.f23594j = e4m.b.b(new bt7.e(bVar, this, 8, i));
        this.k = e4m.b.b(new bt7.e(bVar, this, 9, i));
        this.f23595l = e4m.b.b(new bt7.e(bVar, this, 10, i));
        this.f23596m = e4m.b.b(new bt7.e(bVar, this, 11, i));
        this.f23597n = e4m.b.b(new bt7.e(bVar, this, 12, i));
        this.o = e4m.b.b(new bt7.e(bVar, this, 13, i));
        this.f23598p = e4m.b.b(new bt7.e(bVar, this, 14, i));
        this.f23599q = e4m.b.b(new bt7.e(bVar, this, 15, i));
        this.f23600r = e4m.b.b(new bt7.e(bVar, this, 16, i));
        this.f23601s = e4m.b.b(new bt7.e(bVar, this, 17, i));
        this.f23602t = e4m.b.b(new bt7.e(bVar, this, 18, i));
        this.u = e4m.b.b(new bt7.e(bVar, this, 3, i));
    }

    public final dsh.h b() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(13);
        builderBuilderWithExpectedSize.put(jf7.f.class, this.f23592g.get());
        builderBuilderWithExpectedSize.put(jf7.i.class, this.f23593h.get());
        builderBuilderWithExpectedSize.put(jf7.o.class, this.i.get());
        builderBuilderWithExpectedSize.put(jf7.r.class, this.f23594j.get());
        builderBuilderWithExpectedSize.put(y.class, this.k.get());
        builderBuilderWithExpectedSize.put(b0.class, this.f23595l.get());
        builderBuilderWithExpectedSize.put(e0.class, this.f23596m.get());
        builderBuilderWithExpectedSize.put(h0.class, this.f23597n.get());
        builderBuilderWithExpectedSize.put(n0.class, this.o.get());
        builderBuilderWithExpectedSize.put(t0.class, this.f23598p.get());
        builderBuilderWithExpectedSize.put(w0.class, this.f23599q.get());
        builderBuilderWithExpectedSize.put(d1.class, this.f23600r.get());
        builderBuilderWithExpectedSize.put(j1.class, this.f23601s.get());
        return new dsh.h(builderBuilderWithExpectedSize.build(), 3);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
