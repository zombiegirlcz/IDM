package jm0;

import android.accounts.AccountManager;
import android.content.Context;
import cpi.g;
import dm0.c;
import dm0.d;
import gm0.m;
import gm0.o;
import gm0.p;
import kotlin.jvm.internal.Intrinsics;
import l70.e;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f175895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f175896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fni.a f175897c;
    public final e d;
    public final th0.a e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kn0.a f175898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nn0.c f175899h;
    public final rg0.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f175900j = this;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f175901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f175902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f175903n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f175904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f175905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f175906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f175907s;

    public a(fm0.a aVar, e eVar, ee0.a aVar2, th0.a aVar3, nn0.c cVar, rg0.e eVar2, Context context, c cVar2, kn0.a aVar4, fni.a aVar5) {
        this.f175895a = cVar2;
        this.f175896b = aVar2;
        this.f175897c = aVar5;
        this.d = eVar;
        this.e = aVar3;
        this.f = context;
        this.f175898g = aVar4;
        this.f175899h = cVar;
        this.i = eVar2;
        int i = 22;
        this.k = e4m.b.b(new ibh.a(this, 3, i));
        this.f175901l = e4m.b.b(new ibh.a(this, 4, i));
        this.f175902m = e4m.b.b(new ibh.a(this, 5, i));
        this.f175903n = e4m.b.b(new ibh.a(this, 2, i));
        this.o = e4m.b.b(new ibh.a(this, 1, i));
        this.f175904p = e4m.b.b(new ibh.a(this, 0, i));
        this.f175905q = e4m.b.b(new ibh.a(this, 7, i));
        this.f175906r = e4m.b.b(new ibh.a(this, 8, i));
        this.f175907s = e4m.b.b(new ibh.a(this, 6, i));
    }

    public final g a() {
        th0.a aVar = this.e;
        return new g(new nh0.b(new nh0.a(aVar.f271230a), aVar.f271231b), aVar.i(), new i90.b());
    }

    public final m b() {
        x80.a aVarQ = this.d.q();
        s.j(aVarQ);
        return new m(this.f175895a, aVarQ, (AccountManager) this.f175902m.get(), (o) this.f175901l.get(), new i90.b(), a(), new p(c()), (ue0.c) this.k.get());
    }

    public final tl0.a c() {
        w70.a androidVersion = this.d.f192433b;
        s.j(androidVersion);
        ul0.b javaWrapper = new ul0.b();
        ul0.a androidWrapper = new ul0.a();
        km0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(javaWrapper, "javaWrapper");
        Intrinsics.checkNotNullParameter(androidWrapper, "androidWrapper");
        return androidVersion.a(26) ? javaWrapper : androidWrapper;
    }

    public final d d() {
        return (d) this.f175904p.get();
    }

    public final qm0.b e() {
        tl0.a aVarC = c();
        yh0.c cVar = (yh0.c) this.e.d.get();
        s.j(cVar);
        return new qm0.b(aVarC, cVar);
    }
}
