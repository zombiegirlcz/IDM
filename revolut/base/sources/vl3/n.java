package vl3;

import android.content.Context;
import com.revolut.feature.contacts.impl.data.network.UserService;
import kotlin.jvm.internal.Intrinsics;
import ml3.q;
import ml3.x;
import retrofit2.Retrofit;
import vc.s;
import wl3.t;
import wl3.u;

/* JADX INFO: loaded from: classes13.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f290225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f290226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.c f290227c;
    public final ee0.a d;
    public final nj0.a e;
    public final l70.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xmg.a f290228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jk3.c f290229h;
    public final fy9.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q8b.a f290230j;
    public final ite.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ufk.a f290231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f290232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f290233n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f290234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f290235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f290236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f290237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f290238t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f290239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f290240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f290241y;
    public final e4m.e z;

    public n(xmg.a aVar, jk3.c cVar, l70.e eVar, nj0.a aVar2, ee0.a aVar3, q8b.a aVar4, ee0.c cVar2, ite.a aVar5, an0.c cVar3, fy9.b bVar, ufk.a aVar6, Context context) {
        this.f290225a = context;
        this.f290226b = cVar3;
        this.f290227c = cVar2;
        this.d = aVar3;
        this.e = aVar2;
        this.f = eVar;
        this.f290228g = aVar;
        this.f290229h = cVar;
        this.i = bVar;
        this.f290230j = aVar4;
        this.k = aVar5;
        this.f290231l = aVar6;
        int i = 24;
        this.f290232m = e4m.b.b(new uhc.a(this, 0, i));
        this.f290233n = e4m.b.b(new uhc.a(this, 1, i));
        this.o = e4m.b.b(new uhc.a(this, 2, i));
        e4m.b.b(new uhc.a(this, 3, i));
        this.f290234p = e4m.b.b(new uhc.a(this, 5, i));
        this.f290235q = e4m.b.b(new uhc.a(this, 6, i));
        this.f290236r = e4m.b.b(new uhc.a(this, 7, i));
        this.f290237s = e4m.b.b(new uhc.a(this, 8, i));
        this.f290238t = e4m.b.b(new uhc.a(this, 9, i));
        this.u = e4m.b.b(new uhc.a(this, 4, i));
        this.v = e4m.b.b(new uhc.a(this, 10, i));
        this.f290239w = e4m.b.b(new uhc.a(this, 11, i));
        this.f290240x = e4m.b.b(new uhc.a(this, 12, i));
        this.f290241y = e4m.b.b(new uhc.a(this, 13, i));
        this.z = e4m.b.b(new uhc.a(this, 14, i));
        e4m.b.b(new uhc.a(this, 15, i));
    }

    public final ao.h a() {
        return new ao.h((ml3.a) this.f290234p.get(), (ne0.j) this.f290233n.get());
    }

    public final xe0.e b() {
        ee0.a aVar = this.d;
        je0.d mapper = aVar.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = this.f290226b.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "contacts_storage", mapper, 0, null, 56);
    }

    public final dl3.f c() {
        return (dl3.f) this.f290241y.get();
    }

    public final cl3.a d() {
        return (cl3.a) this.f290239w.get();
    }

    public final fl3.a e() {
        return (fl3.a) this.u.get();
    }

    public final u f() {
        cl3.a aVar = (cl3.a) this.f290239w.get();
        ay9.b bVar = (ay9.b) this.i.i.get();
        s.j(bVar);
        n8b.a aVarA = this.f290230j.a();
        s.j(aVarA);
        am2.a aVar2 = new am2.a(aVarA, 1);
        l80.e eVarH = this.f.h();
        s.j(eVarH);
        gte.a aVarB = this.k.b();
        s.j(aVarB);
        return new u(aVar, bVar, aVar2, eVarH, new t(aVarB));
    }

    public final sl3.u g() {
        q qVar = (q) this.f290236r.get();
        ml3.s sVar = (ml3.s) this.f290237s.get();
        UserService userServiceH = h();
        xe0.e eVarB = b();
        l80.e eVarH = this.f.h();
        s.j(eVarH);
        return new sl3.u(qVar, sVar, userServiceH, eVarB, eVarH);
    }

    public final UserService h() {
        Retrofit retrofit = ((nj0.d) this.e).f();
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(UserService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        UserService userService = (UserService) objCreate;
        s.k(userService);
        return userService;
    }

    public final yf.c i() {
        return new yf.c((x) this.f290238t.get());
    }
}
