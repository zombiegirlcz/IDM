package qud;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f249380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingConfirmationControllerContract$InputData f249381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249382c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f249384h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f249385j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f249386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f249387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f249388n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f249389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f249390q;

    public d(c cVar, ViewController viewController, StakingConfirmationControllerContract$InputData stakingConfirmationControllerContract$InputData) {
        this.f249380a = viewController;
        this.f249381b = stakingConfirmationControllerContract$InputData;
        this.f249382c = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.d = e4m.b.b(new v1(cVar, this, 2, i));
        this.e = e4m.b.b(new v1(cVar, this, 1, i));
        this.f = e4m.b.b(new v1(cVar, this, 0, i));
        this.f249383g = e4m.b.b(new v1(cVar, this, 4, i));
        this.f249384h = e4m.b.b(new v1(cVar, this, 6, i));
        this.i = e4m.b.b(new v1(cVar, this, 5, i));
        this.f249385j = e4m.b.b(new v1(cVar, this, 7, i));
        this.k = e4m.b.b(new v1(cVar, this, 3, i));
        this.f249386l = e4m.b.b(new v1(cVar, this, 8, i));
        this.f249387m = e4m.b.b(new v1(cVar, this, 11, i));
        this.f249388n = e4m.b.b(new v1(cVar, this, 10, i));
        this.o = e4m.b.b(new v1(cVar, this, 12, i));
        this.f249389p = e4m.b.b(new v1(cVar, this, 13, i));
        this.f249390q = e4m.b.b(new v1(cVar, this, 9, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f249386l.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.k.get());
    }
}
