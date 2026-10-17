package sw;

import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import aw.u;
import bw.t;
import e4m.e;
import java.time.Clock;
import mp.p;
import r10.f;
import vw.g;
import yw.h;

/* JADX INFO: loaded from: classes16.dex */
public final class d {
    public final e A;
    public final e B;
    public final e C;
    public final e D;
    public final e E;
    public final e F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f266051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f266052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PreviewView f266053c;
    public final g d;
    public final vw.b e;
    public final vw.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vw.d f266054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f266055h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f266056j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f266057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f266058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f266059n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f266060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f266061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f266062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f266063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f266064t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f266065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f266066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f266067y;
    public final ryc.d z;

    public d(c cVar, LifecycleOwner lifecycleOwner, PreviewView previewView, h hVar, Boolean bool, vw.b bVar, vw.c cVar2, vw.d dVar, g gVar) {
        this.i = cVar;
        this.f266051a = lifecycleOwner;
        this.f266052b = hVar;
        this.f266053c = previewView;
        this.d = gVar;
        this.e = bVar;
        this.f = cVar2;
        this.f266054g = dVar;
        this.f266055h = bool;
        int i = 28;
        this.f266056j = e4m.b.b(new ryc.d(cVar, this, 2, i));
        this.k = e4m.b.b(new ryc.d(cVar, this, 5, i));
        this.f266057l = e4m.b.b(new ryc.d(cVar, this, 6, i));
        this.f266058m = e4m.b.b(new ryc.d(cVar, this, 4, i));
        this.f266059n = e4m.b.b(new ryc.d(cVar, this, 3, i));
        this.o = e4m.b.b(new ryc.d(cVar, this, 8, i));
        this.f266060p = e4m.b.b(new ryc.d(cVar, this, 9, i));
        this.f266061q = e4m.b.b(new ryc.d(cVar, this, 7, i));
        this.f266062r = e4m.b.b(new ryc.d(cVar, this, 10, i));
        this.f266063s = e4m.b.b(new ryc.d(cVar, this, 12, i));
        this.f266064t = e4m.b.b(new ryc.d(cVar, this, 11, i));
        this.u = e4m.b.b(new ryc.d(cVar, this, 15, i));
        this.v = e4m.b.b(new ryc.d(cVar, this, 16, i));
        this.f266065w = e4m.b.b(new ryc.d(cVar, this, 14, i));
        this.f266066x = e4m.b.b(new ryc.d(cVar, this, 13, i));
        this.f266067y = e4m.b.b(new ryc.d(cVar, this, 18, i));
        this.z = new ryc.d(cVar, this, 17, i);
        this.A = e4m.b.b(new ryc.d(cVar, this, 19, i));
        this.B = e4m.b.b(new ryc.d(cVar, this, 20, i));
        this.C = e4m.b.b(new ryc.d(cVar, this, 1, i));
        this.D = e4m.b.b(new ryc.d(cVar, this, 21, i));
        this.E = e4m.b.b(new ryc.d(cVar, this, 0, i));
        this.F = e4m.b.b(new ryc.d(cVar, this, 22, i));
    }

    public final p a() {
        return new p((u) this.f266058m.get(), (t) this.i.f266048g.get(), (Clock) this.A.get());
    }

    public final f b() {
        return new f((t) this.i.f266048g.get(), this.d);
    }
}
