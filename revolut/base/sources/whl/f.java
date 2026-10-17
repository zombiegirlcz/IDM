package whl;

import android.content.Context;
import c4f.j;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;
import vdl.l1;
import zhl.k;

/* JADX INFO: loaded from: classes12.dex */
public final class f {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f297708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f297709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifl.a f297710c;
    public final an0.c d;
    public final Context e;
    public final ee0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f297711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ite.a f297712h;
    public final zdl.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f297713j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f297714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f297715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f297716n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f297717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f297718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f297719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f297720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f297721t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f297722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f297723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f297724y;
    public final e4m.e z;

    public f(ee0.a aVar, nj0.a aVar2, ifl.a aVar3, an0.c cVar, ee0.c cVar2, j jVar, ite.a aVar4, zdl.c cVar3, e eVar, Context context) {
        this.f297708a = aVar2;
        this.f297709b = aVar;
        this.f297710c = aVar3;
        this.d = cVar;
        this.e = context;
        this.f = cVar2;
        this.f297711g = jVar;
        this.f297712h = aVar4;
        this.i = cVar3;
        this.f297713j = eVar;
        int i = 11;
        this.k = e4m.b.b(new vy9.a(this, 3, i));
        this.f297714l = e4m.b.b(new vy9.a(this, 2, i));
        this.f297715m = e4m.b.b(new vy9.a(this, 4, i));
        this.f297716n = e4m.b.b(new vy9.a(this, 6, i));
        this.o = e4m.b.b(new vy9.a(this, 5, i));
        this.f297717p = e4m.b.b(new vy9.a(this, 1, i));
        this.f297718q = e4m.b.b(new vy9.a(this, 7, i));
        this.f297719r = e4m.b.b(new vy9.a(this, 8, i));
        this.f297720s = e4m.b.b(new vy9.a(this, 0, i));
        this.f297721t = e4m.b.b(new vy9.a(this, 10, i));
        this.u = e4m.b.b(new vy9.a(this, 9, i));
        this.v = e4m.b.b(new vy9.a(this, 13, i));
        this.f297722w = e4m.b.b(new vy9.a(this, 15, i));
        this.f297723x = e4m.b.b(new vy9.a(this, 14, i));
        this.f297724y = e4m.b.b(new vy9.a(this, 17, i));
        this.z = e4m.b.b(new vy9.a(this, 16, i));
        this.A = e4m.b.b(new vy9.a(this, 12, i));
        this.B = e4m.b.b(new vy9.a(this, 11, i));
        this.C = e4m.b.b(new vy9.a(this, 20, i));
        this.D = e4m.b.b(new vy9.a(this, 19, i));
        this.E = e4m.b.b(new vy9.a(this, 18, i));
    }

    public final k a() {
        zdl.c cVar = this.i;
        l1 l1Var = (l1) cVar.f321556o0.get();
        s.j(l1Var);
        yhl.d dVarA = this.f297713j.a();
        s.j(dVarA);
        yhl.h hVar = (yhl.h) this.B.get();
        gte.a aVarB = this.f297712h.b();
        s.j(aVarB);
        ybl.b bVarB = cVar.b();
        s.j(bVarB);
        return new k(l1Var, dVarA, hVar, aVarB, bVarB, new zhl.a());
    }

    public final rul.e b() {
        return new rul.e(e(), (ugl.c) this.f297720s.get());
    }

    public final su9.c c() {
        return e();
    }

    public final ugl.c d() {
        return (ugl.c) this.f297720s.get();
    }

    public final su9.c e() {
        yhl.g gVar = (yhl.g) this.u.get();
        LinkedHashMap linkedHashMapU = ue0.e.u(3);
        linkedHashMapU.put(zel.b.TOP_MOVERS, new ail.e());
        linkedHashMapU.put(zel.b.MOST_TRADED, new ail.c());
        linkedHashMapU.put(zel.b.MOST_OWNED, new ail.a());
        return new su9.c(gVar, new bil.a(linkedHashMapU.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapU)));
    }

    public final ScreenerService f() {
        Retrofit retrofit = (Retrofit) this.f297714l.get();
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ScreenerService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ScreenerService screenerService = (ScreenerService) objCreate;
        s.k(screenerService);
        return screenerService;
    }
}
