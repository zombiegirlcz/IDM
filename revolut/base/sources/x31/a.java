package x31;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import r10.t;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements t31.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f302610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final poi.b f302611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f302612c;
    public final l70.e d;
    public final th0.a e;
    public final nn0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final an0.c f302613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jm0.a f302614h;
    public final z76.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l41.a f302615j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f302616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f302617m;

    public a(poi.b bVar, l70.e eVar, kf0.c cVar, nn0.c cVar2, z76.a aVar, l41.a aVar2, ite.a aVar3, jm0.a aVar4, th0.a aVar5, an0.c cVar3, Context context) {
        this.f302610a = context;
        this.f302611b = bVar;
        this.f302612c = aVar3;
        this.d = eVar;
        this.e = aVar5;
        this.f = cVar2;
        this.f302613g = cVar3;
        this.f302614h = aVar4;
        this.i = aVar;
        this.f302615j = aVar2;
        int i = 20;
        this.k = e4m.b.b(new vy9.a(this, 1, i));
        this.f302616l = e4m.b.b(new vy9.a(this, 2, i));
        this.f302617m = e4m.b.b(new vy9.a(this, 0, i));
    }

    public final w31.e a() {
        return (w31.e) this.f302617m.get();
    }

    public final c41.c b() {
        xg0.a dynamicDelivery = this.e.a();
        s.j(dynamicDelivery);
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Context context = this.f302610a;
        Intrinsics.checkNotNullParameter(context, "context");
        z76.a dependenciesApi = this.i;
        Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
        z76.c.Companion.getClass();
        Intrinsics.checkNotNullParameter("feature_seon_sdk_retail", "name");
        return new c41.c(new t(dynamicDelivery, context, new l0i.b()));
    }
}
