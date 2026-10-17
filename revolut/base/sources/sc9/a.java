package sc9;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.onboarding.impl.revolut_card_ready.RevolutCardReadyContract$Configuration;
import e4m.e;
import fsi.g;
import java.util.Set;
import yy0.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ns2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f261663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardReadyContract$Configuration f261664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f261665c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f261666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f261667h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f261668j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f261669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f261670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f261671n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f261672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f261673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f261674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f261675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f261676t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f261677w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f261678x;

    public a(b bVar, xoi.d dVar, RevolutCardReadyContract$Configuration revolutCardReadyContract$Configuration) {
        this.f261665c = bVar;
        this.f261663a = dVar;
        this.f261664b = revolutCardReadyContract$Configuration;
        int i = 11;
        this.d = e4m.b.b(new ryc.d(bVar, this, 0, i));
        this.e = e4m.b.b(new ryc.d(bVar, this, 1, i));
        this.f = e4m.b.b(new ryc.d(bVar, this, 3, i));
        this.f261666g = e4m.b.b(new ryc.d(bVar, this, 2, i));
        this.f261667h = e4m.b.b(new ryc.d(bVar, this, 4, i));
        this.i = e4m.b.b(new ryc.d(bVar, this, 5, i));
        this.f261668j = e4m.b.b(new ryc.d(bVar, this, 7, i));
        this.k = e4m.b.b(new ryc.d(bVar, this, 6, i));
        this.f261669l = e4m.b.b(new ryc.d(bVar, this, 8, i));
        this.f261670m = e4m.b.b(new ryc.d(bVar, this, 9, i));
        this.f261671n = e4m.b.b(new ryc.d(bVar, this, 10, i));
        this.o = e4m.b.b(new ryc.d(bVar, this, 11, i));
        this.f261672p = e4m.b.b(new ryc.d(bVar, this, 13, i));
        this.f261673q = e4m.b.b(new ryc.d(bVar, this, 12, i));
        this.f261674r = e4m.b.b(new ryc.d(bVar, this, 15, i));
        this.f261675s = e4m.b.b(new ryc.d(bVar, this, 14, i));
        this.f261676t = e4m.b.b(new ryc.d(bVar, this, 16, i));
        this.u = e4m.b.b(new ryc.d(bVar, this, 18, i));
        this.v = e4m.b.b(new ryc.d(bVar, this, 17, i));
        this.f261677w = e4m.b.b(new ryc.d(bVar, this, 19, i));
        this.f261678x = e4m.b.b(new ryc.d(bVar, this, 20, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f261663a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f261663a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f261663a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f261663a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f261663a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f261663a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f261663a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f261663a);
    }

    @Override // ns2.a
    public final ms2.c b() {
        return (ms2.c) this.f261678x.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f261663a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f261663a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f261663a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f261663a);
    }

    @Override // ns2.a
    public final ks2.a getState() {
        return (ks2.a) this.f261665c.f261689q.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(17);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f261663a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f261666g.get());
        builderBuilderWithExpectedSize.add(this.f261667h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f261669l.get());
        builderBuilderWithExpectedSize.add(this.f261670m.get());
        builderBuilderWithExpectedSize.add(this.f261671n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f261673q.get());
        builderBuilderWithExpectedSize.add(this.f261675s.get());
        builderBuilderWithExpectedSize.add(new en.c((mm.d) this.f261665c.f261687n.get(), com.google.android.gms.internal.mlkit_vision_face.a.e(mm.e.class)));
        builderBuilderWithExpectedSize.add(this.f261676t.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        return j6.a.g(this.f261677w, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f261663a);
    }

    @Override // ns2.a
    public final void n(BluePromptActivity bluePromptActivity) {
        bluePromptActivity.B0 = (opi.b) this.f261669l.get();
    }
}
