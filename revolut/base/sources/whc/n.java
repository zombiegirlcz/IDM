package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PerkDetailsFlowContract$InputData f297546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f297547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f297548c;
    public final n d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f297549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f297550h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f297551j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f297552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f297553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f297554n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f297555p;

    public n(s sVar, ViewController viewController, PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData) {
        this.f297548c = sVar;
        this.f297546a = perkDetailsFlowContract$InputData;
        this.f297547b = viewController;
        int i = 28;
        this.e = e4m.b.b(new vzc.j(sVar, this, 3, i));
        this.f = e4m.b.b(new vzc.j(sVar, this, 4, i));
        this.f297549g = e4m.b.b(new vzc.j(sVar, this, 2, i));
        this.f297550h = e4m.b.b(new vzc.j(sVar, this, 1, i));
        this.i = e4m.b.b(new vzc.j(sVar, this, 0, i));
        this.f297551j = e4m.b.b(new vzc.j(sVar, this, 5, i));
        this.k = e4m.b.b(new vzc.j(sVar, this, 6, i));
        this.f297552l = e4m.b.b(new vzc.j(sVar, this, 8, i));
        this.f297553m = e4m.b.b(new vzc.j(sVar, this, 7, i));
        this.f297554n = e4m.b.b(new vzc.j(sVar, this, 10, i));
        this.o = e4m.b.b(new vzc.j(sVar, this, 9, i));
        this.f297555p = e4m.b.b(new vzc.j(sVar, this, 11, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get(), (yji.n) this.f297551j.get(), (yji.n) this.k.get(), (yji.n) this.f297553m.get(), (yji.n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
