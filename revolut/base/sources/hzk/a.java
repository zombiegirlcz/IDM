package hzk;

import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import com.revolut.retail.feature.trading_onboarding.impl.ui.helper_next.NextContract$Configuration;
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
    public final d f157218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NextContract$Configuration f157219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f157220c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f157221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f157222h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f157223j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f157224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f157225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f157226n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f157227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f157228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f157229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f157230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f157231t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f157232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f157233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f157234y;

    public a(b bVar, d dVar, NextContract$Configuration nextContract$Configuration) {
        this.f157220c = bVar;
        this.f157218a = dVar;
        this.f157219b = nextContract$Configuration;
        int i = 17;
        this.d = e4m.b.b(new hjg.b(bVar, this, 0, i));
        this.e = e4m.b.b(new hjg.b(bVar, this, 1, i));
        this.f = e4m.b.b(new hjg.b(bVar, this, 3, i));
        this.f157221g = e4m.b.b(new hjg.b(bVar, this, 2, i));
        this.f157222h = e4m.b.b(new hjg.b(bVar, this, 4, i));
        this.i = e4m.b.b(new hjg.b(bVar, this, 5, i));
        this.f157223j = e4m.b.b(new hjg.b(bVar, this, 7, i));
        this.k = e4m.b.b(new hjg.b(bVar, this, 6, i));
        this.f157224l = e4m.b.b(new hjg.b(bVar, this, 8, i));
        this.f157225m = e4m.b.b(new hjg.b(bVar, this, 9, i));
        this.f157226n = e4m.b.b(new hjg.b(bVar, this, 10, i));
        this.o = e4m.b.b(new hjg.b(bVar, this, 12, i));
        this.f157227p = e4m.b.b(new hjg.b(bVar, this, 11, i));
        this.f157228q = e4m.b.b(new hjg.b(bVar, this, 14, i));
        this.f157229r = e4m.b.b(new hjg.b(bVar, this, 13, i));
        this.f157230s = e4m.b.b(new hjg.b(bVar, this, 15, i));
        this.f157231t = e4m.b.b(new hjg.b(bVar, this, 17, i));
        this.u = e4m.b.b(new hjg.b(bVar, this, 16, i));
        this.v = e4m.b.b(new hjg.b(bVar, this, 18, i));
        this.f157232w = e4m.b.b(new hjg.b(bVar, this, 20, i));
        this.f157233x = e4m.b.b(new hjg.b(bVar, this, 19, i));
        this.f157234y = e4m.b.b(new hjg.b(bVar, this, 21, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f157218a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f157218a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f157218a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f157218a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f157218a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f157218a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f157218a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f157218a);
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f157218a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f157218a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f157218a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f157218a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(18);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f157218a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f157221g.get());
        builderBuilderWithExpectedSize.add(this.f157222h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f157224l.get());
        builderBuilderWithExpectedSize.add(this.f157225m.get());
        builderBuilderWithExpectedSize.add(this.f157226n.get());
        builderBuilderWithExpectedSize.add(this.f157227p.get());
        builderBuilderWithExpectedSize.add(this.f157229r.get());
        b bVar = this.f157220c;
        builderBuilderWithExpectedSize.add(new en.c((mm.d) bVar.f157247s.get(), ImmutableMap.of(mm.e.class, (mm.b) new mm.f(), OnboardingActionsContract$LaunchRemediationNextPartAction.class, (mm.b) bVar.f157248t.get(), OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction.class, (mm.b) bVar.u.get())));
        builderBuilderWithExpectedSize.add(this.f157230s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f157233x.get());
        return j6.a.g(this.f157232w, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f157218a);
    }
}
