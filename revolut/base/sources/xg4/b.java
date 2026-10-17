package xg4;

import android.app.Activity;
import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.close.ui.legacy.CreditApplicationCloseLegacyContract$Configuration;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fsi.g;
import gsi.h;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import xf6.t1;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements h, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f305509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationCloseLegacyContract$Configuration f305510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305511c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f305512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f305513h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f305514j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f305515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f305516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f305517n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f305518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f305519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f305520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f305521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f305522t;
    public final e4m.e u;

    public b(d dVar, xoi.d dVar2, CreditApplicationCloseLegacyContract$Configuration creditApplicationCloseLegacyContract$Configuration) {
        this.f305509a = dVar2;
        this.f305510b = creditApplicationCloseLegacyContract$Configuration;
        this.f305511c = e4m.b.b(new t1(dVar, this, 0, 16));
        this.d = e4m.b.b(new t1(dVar, this, 1, 16));
        this.e = e4m.b.b(new t1(dVar, this, 2, 16));
        this.f = e4m.b.b(new t1(dVar, this, 3, 16));
        this.f305512g = e4m.b.b(new t1(dVar, this, 4, 16));
        this.f305513h = e4m.b.b(new t1(dVar, this, 5, 16));
        e4m.b.b(new t1(dVar, this, 6, 16));
        this.i = e4m.b.b(new t1(dVar, this, 7, 16));
        this.f305514j = e4m.b.b(new t1(dVar, this, 9, 16));
        this.k = e4m.b.b(new t1(dVar, this, 10, 16));
        this.f305515l = e4m.b.b(new t1(dVar, this, 8, 16));
        this.f305516m = e4m.b.b(new t1(dVar, this, 12, 16));
        this.f305517n = e4m.b.b(new t1(dVar, this, 11, 16));
        this.o = e4m.b.b(new t1(dVar, this, 13, 16));
        this.f305518p = e4m.b.b(new t1(dVar, this, 14, 16));
        this.f305519q = e4m.b.b(new t1(dVar, this, 15, 16));
        this.f305520r = e4m.b.b(new t1(dVar, this, 16, 16));
        this.f305521s = e4m.b.b(new t1(dVar, this, 17, 16));
        this.f305522t = e4m.b.b(new t1(dVar, this, 18, 16));
        this.u = e4m.b.b(new t1(dVar, this, 19, 16));
    }

    @Override // gsi.a
    public final f Q() {
        return (f) this.f305511c.get();
    }

    @Override // gsi.a
    public final mz0.a V() {
        return (mz0.a) this.d.get();
    }

    @Override // gsi.a
    public final c01.d W() {
        return (c01.d) this.f305521s.get();
    }

    @Override // gsi.a
    public final py0.e X() {
        return (py0.e) this.f305518p.get();
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return (xy0.a) this.f305512g.get();
    }

    @Override // gsi.a
    public final h01.b Z() {
        return (h01.b) this.f305519q.get();
    }

    @Override // gsi.h
    public final g a() {
        return this.f305509a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return (jz0.d) this.f305513h.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return (ty0.c) this.e.get();
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return (lz0.g) this.f.get();
    }

    @Override // gsi.a
    public final i01.b d0() {
        return (i01.b) this.f305522t.get();
    }

    public final Activity e() {
        BaseDelegatesActivity baseDelegatesActivityF = f();
        i.a(baseDelegatesActivityF);
        return baseDelegatesActivityF;
    }

    @Override // gsi.a
    public final d01.g e0() {
        return (d01.g) this.f305520r.get();
    }

    public final BaseDelegatesActivity f() {
        gq3.b.Companion.getClass();
        xoi.d coreActivityApi = this.f305509a;
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        BaseDelegatesActivity baseDelegatesActivity = coreActivityApi.f307857a.f146537a;
        s.k(baseDelegatesActivity);
        return baseDelegatesActivity;
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.addAll((Iterable) i.v(ImmutableSet.of()));
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f305515l.get());
        return j6.a.g(this.f305517n, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return (py0.f) this.o.get();
    }
}
