package b1l;

import ak5.f;
import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import com.revolut.retail.feature.trading_onboarding.impl.ui.start.StartContract$Configuration;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import xoi.d;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartContract$Configuration f11809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11810c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f11811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f11812h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f11813j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f11814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f11815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f11816n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f11817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f11818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f11819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f11820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f11821t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f11822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f11823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f11824y;

    public a(b bVar, d dVar, StartContract$Configuration startContract$Configuration) {
        this.f11810c = bVar;
        this.f11808a = dVar;
        this.f11809b = startContract$Configuration;
        int i = 24;
        this.d = e4m.b.b(new f(bVar, this, 0, i));
        this.e = e4m.b.b(new f(bVar, this, 1, i));
        this.f = e4m.b.b(new f(bVar, this, 3, i));
        this.f11811g = e4m.b.b(new f(bVar, this, 2, i));
        this.f11812h = e4m.b.b(new f(bVar, this, 4, i));
        this.i = e4m.b.b(new f(bVar, this, 5, i));
        this.f11813j = e4m.b.b(new f(bVar, this, 7, i));
        this.k = e4m.b.b(new f(bVar, this, 6, i));
        this.f11814l = e4m.b.b(new f(bVar, this, 8, i));
        this.f11815m = e4m.b.b(new f(bVar, this, 9, i));
        this.f11816n = e4m.b.b(new f(bVar, this, 10, i));
        this.o = e4m.b.b(new f(bVar, this, 12, i));
        this.f11817p = e4m.b.b(new f(bVar, this, 11, i));
        this.f11818q = e4m.b.b(new f(bVar, this, 14, i));
        this.f11819r = e4m.b.b(new f(bVar, this, 13, i));
        this.f11820s = e4m.b.b(new f(bVar, this, 15, i));
        this.f11821t = e4m.b.b(new f(bVar, this, 17, i));
        this.u = e4m.b.b(new f(bVar, this, 16, i));
        this.v = e4m.b.b(new f(bVar, this, 18, i));
        this.f11822w = e4m.b.b(new f(bVar, this, 20, i));
        this.f11823x = e4m.b.b(new f(bVar, this, 19, i));
        this.f11824y = e4m.b.b(new f(bVar, this, 21, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f11808a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f11808a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f11808a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f11808a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f11808a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f11808a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f11808a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f11808a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f11808a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f11808a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f11808a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f11808a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(18);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f11808a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f11811g.get());
        builderBuilderWithExpectedSize.add(this.f11812h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f11814l.get());
        builderBuilderWithExpectedSize.add(this.f11815m.get());
        builderBuilderWithExpectedSize.add(this.f11816n.get());
        builderBuilderWithExpectedSize.add(this.f11817p.get());
        builderBuilderWithExpectedSize.add(this.f11819r.get());
        b bVar = this.f11810c;
        builderBuilderWithExpectedSize.add(new en.c((mm.d) bVar.f11837s.get(), ImmutableMap.of(mm.e.class, (mm.b) new mm.f(), OnboardingActionsContract$LaunchRemediationNextPartAction.class, (mm.b) bVar.f11838t.get(), OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction.class, (mm.b) bVar.u.get())));
        builderBuilderWithExpectedSize.add(this.f11820s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f11823x.get());
        return j6.a.g(this.f11822w, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f11808a);
    }
}
