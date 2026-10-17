package fae;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.history.flow.SubscriptionsHistoryFlowContract$Configuration;
import e4m.e;
import fa0.q;
import fsi.g;
import gsi.h;
import java.util.Set;
import xoi.d;
import xpi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f133289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubscriptionsHistoryFlowContract$Configuration f133290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f133291c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f133292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f133293h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f133294j;

    public a(b bVar, d dVar, SubscriptionsHistoryFlowContract$Configuration subscriptionsHistoryFlowContract$Configuration) {
        xpi.e eVar = f.Companion;
        this.f133291c = bVar;
        this.f133289a = dVar;
        this.f133290b = subscriptionsHistoryFlowContract$Configuration;
        this.d = e4m.b.b(new q(bVar, this, 0, 4));
        this.e = e4m.b.b(new q(bVar, this, 1, 4));
        this.f = e4m.b.b(new q(bVar, this, 2, 4));
        this.f133292g = e4m.b.b(new q(bVar, this, 4, 4));
        this.f133293h = e4m.b.b(new q(bVar, this, 3, 4));
        this.i = e4m.b.b(new q(bVar, this, 6, 4));
        this.f133294j = e4m.b.b(new q(bVar, this, 5, 4));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f133289a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f133289a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f133289a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f133289a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f133289a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f133289a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f133289a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f133289a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f133289a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f133289a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f133289a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f133289a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f133289a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        return j6.a.g(this.f133293h, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f133289a);
    }
}
