package ckg;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f24835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ip.b f24836c;
    public final l70.e d;
    public final rk0.c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f24837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f24838h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f24839j;

    public a(l70.e eVar, ee0.a aVar, rk0.c cVar, Context context, ip.b bVar) {
        this.f24834a = context;
        this.f24835b = aVar;
        this.f24836c = bVar;
        this.d = eVar;
        this.e = cVar;
        int i = 7;
        this.f = e4m.b.b(new c63.b(this, 1, i));
        this.f24837g = e4m.b.b(new c63.b(this, 2, i));
        this.f24838h = e4m.g.a(new c63.b(this, 3, i));
        this.i = e4m.b.b(new c63.b(this, 4, i));
        this.f24839j = e4m.b.b(new c63.b(this, 0, i));
    }

    public final vjg.g a() {
        return (vjg.g) this.f24838h.get();
    }

    public final ekg.g b() {
        Context context = this.f24834a;
        gkg.d dVar = new gkg.d(context);
        akg.b bVar = (akg.b) this.f24839j.get();
        l70.e eVar = this.d;
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        vjg.g gVar = (vjg.g) this.f24838h.get();
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        h01.g gVarZ = jh.d.f(context).Z();
        Intrinsics.i(gVarZ, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.sensitivedata.MutableSensitiveDataManager");
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        c90.c cVar = new c90.c(context);
        k70.a aVar = (k70.a) eVar.v.get();
        s.j(aVar);
        return new ekg.g(dVar, bVar, eVarH, gVar, (h01.b) gVarZ, cVar, aVar);
    }
}
