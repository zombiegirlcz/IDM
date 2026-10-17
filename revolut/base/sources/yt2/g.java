package yt2;

import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg0.e f316613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h30.a f316614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee7.a f316615c;
    public final l70.e d;
    public final xt2.a e;
    public final nj0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ee0.a f316616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final an0.c f316617h;
    public final g i = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f316618j = new f(this, 1);
    public final f k = new f(this, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f316619l = e4m.b.b(new f(this, 3));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f316620m = e4m.b.b(new f(this, 0));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f316621n = e4m.b.b(new f(this, 5));
    public final e4m.e o = e4m.b.b(new f(this, 4));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f316622p = e4m.b.b(new f(this, 7));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f316623q = e4m.b.b(new f(this, 6));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f316624r = e4m.b.b(new f(this, 8));

    public g(l70.e eVar, ee7.a aVar, rg0.e eVar2, h30.a aVar2, ee0.a aVar3, an0.c cVar, xt2.a aVar4, nj0.a aVar5) {
        this.f316613a = eVar2;
        this.f316614b = aVar2;
        this.f316615c = aVar;
        this.d = eVar;
        this.e = aVar4;
        this.f = aVar5;
        this.f316616g = aVar3;
        this.f316617h = cVar;
    }

    public final TelephonyManager a() {
        z70.a contextProvider = this.d.f();
        s.j(contextProvider);
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Object systemService = contextProvider.getContext().getSystemService("phone");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }
}
