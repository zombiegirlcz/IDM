package tyk;

import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import com.revolut.retail.feature.trading_onboarding.impl.ui.completed.CompletedContract$Configuration;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import ty0.c;
import xoi.d;
import yy0.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f275684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompletedContract$Configuration f275685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f275686c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f275687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f275688h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f275689j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f275690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f275691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f275692n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f275693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f275694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f275695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f275696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f275697t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f275698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f275699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f275700y;

    public a(b bVar, d dVar, CompletedContract$Configuration completedContract$Configuration) {
        this.f275686c = bVar;
        this.f275684a = dVar;
        this.f275685b = completedContract$Configuration;
        this.d = e4m.b.b(new tg5.h(bVar, this, 0, 16));
        this.e = e4m.b.b(new tg5.h(bVar, this, 1, 16));
        this.f = e4m.b.b(new tg5.h(bVar, this, 3, 16));
        this.f275687g = e4m.b.b(new tg5.h(bVar, this, 2, 16));
        this.f275688h = e4m.b.b(new tg5.h(bVar, this, 4, 16));
        this.i = e4m.b.b(new tg5.h(bVar, this, 6, 16));
        this.f275689j = e4m.b.b(new tg5.h(bVar, this, 5, 16));
        this.k = e4m.b.b(new tg5.h(bVar, this, 8, 16));
        this.f275690l = e4m.b.b(new tg5.h(bVar, this, 7, 16));
        this.f275691m = e4m.b.b(new tg5.h(bVar, this, 9, 16));
        this.f275692n = e4m.b.b(new tg5.h(bVar, this, 10, 16));
        this.o = e4m.b.b(new tg5.h(bVar, this, 12, 16));
        this.f275693p = e4m.b.b(new tg5.h(bVar, this, 11, 16));
        this.f275694q = e4m.b.b(new tg5.h(bVar, this, 13, 16));
        this.f275695r = e4m.b.b(new tg5.h(bVar, this, 15, 16));
        this.f275696s = e4m.b.b(new tg5.h(bVar, this, 14, 16));
        this.f275697t = e4m.b.b(new tg5.h(bVar, this, 17, 16));
        this.u = e4m.b.b(new tg5.h(bVar, this, 16, 16));
        this.v = e4m.b.b(new tg5.h(bVar, this, 18, 16));
        this.f275698w = e4m.b.b(new tg5.h(bVar, this, 20, 16));
        this.f275699x = e4m.b.b(new tg5.h(bVar, this, 19, 16));
        this.f275700y = e4m.b.b(new tg5.h(bVar, this, 21, 16));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f275684a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f275684a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f275684a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f275684a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f275684a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f275684a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f275684a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f275684a);
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f275684a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f275684a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f275684a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f275684a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(18);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f275684a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f275687g.get());
        builderBuilderWithExpectedSize.add(this.f275688h.get());
        builderBuilderWithExpectedSize.add(this.f275689j.get());
        builderBuilderWithExpectedSize.add(this.f275690l.get());
        builderBuilderWithExpectedSize.add(this.f275691m.get());
        builderBuilderWithExpectedSize.add(this.f275692n.get());
        builderBuilderWithExpectedSize.add(this.f275693p.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f275694q.get());
        builderBuilderWithExpectedSize.add(this.f275696s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        b bVar = this.f275686c;
        builderBuilderWithExpectedSize.add(new en.c((mm.d) bVar.f275714t.get(), ImmutableMap.of(mm.e.class, (mm.b) new mm.f(), OnboardingActionsContract$LaunchRemediationNextPartAction.class, (mm.b) bVar.u.get(), OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction.class, (mm.b) bVar.v.get())));
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f275699x.get());
        return j6.a.g(this.f275700y, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f275684a);
    }
}
