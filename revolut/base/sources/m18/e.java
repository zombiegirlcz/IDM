package m18;

import android.content.Context;
import com.revolut.feature.invest.smart_notifications.impl.data.network.InvestSmartNotificationsService;
import dp4.f1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import ljl.y;
import r10.q;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f201261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f201262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f201263c;
    public final Context d;
    public final an0.c e;
    public final c21.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l70.e f201264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zdl.c f201265h;
    public final u8h.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rk0.c f201266j;
    public final voa.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zdl.f f201267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vhh.a f201268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k3d.b f201269n;
    public final l0k.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h9h.a f201270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f201271q = this;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f201272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f201273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f201274t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f201275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f201276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f201277y;
    public final e4m.e z;

    public e(l70.e eVar, ee0.a aVar, nj0.a aVar2, rk0.c cVar, c21.e eVar2, ite.a aVar3, l0k.c cVar2, voa.a aVar4, an0.c cVar3, k3d.b bVar, h9h.a aVar5, vhh.a aVar6, u8h.c cVar4, zdl.c cVar5, zdl.f fVar, Context context) {
        this.f201261a = aVar3;
        this.f201262b = aVar2;
        this.f201263c = aVar;
        this.d = context;
        this.e = cVar3;
        this.f = eVar2;
        this.f201264g = eVar;
        this.f201265h = cVar5;
        this.i = cVar4;
        this.f201266j = cVar;
        this.k = aVar4;
        this.f201267l = fVar;
        this.f201268m = aVar6;
        this.f201269n = bVar;
        this.o = cVar2;
        this.f201270p = aVar5;
        int i = 21;
        this.f201272r = e4m.b.b(new y(this, 1, i));
        this.f201273s = e4m.b.b(new y(this, 0, i));
        this.f201274t = e4m.b.b(new y(this, 2, i));
        this.u = e4m.b.b(new y(this, 4, i));
        this.v = e4m.b.b(new y(this, 3, i));
        this.f201275w = e4m.b.b(new y(this, 6, i));
        this.f201276x = e4m.b.b(new y(this, 8, i));
        this.f201277y = e4m.b.b(new y(this, 7, i));
        this.z = e4m.b.b(new y(this, 5, i));
    }

    public final q18.c a() {
        gte.a aVarB = this.f201261a.b();
        s.j(aVarB);
        return new q18.c(new q18.b(aVarB));
    }

    public final prl.e b() {
        mk0.a aVarA = this.f201266j.a();
        s.j(aVarA);
        gte.a aVarB = this.f201261a.b();
        s.j(aVarB);
        toa.a aVarA2 = this.k.a();
        s.j(aVarA2);
        ybl.k kVarD = this.f201267l.d();
        s.j(kVarD);
        return new prl.e(aVarA, aVarB, aVarA2, kVarD);
    }

    public final jt0.b c() {
        gte.a aVarB = this.f201261a.b();
        s.j(aVarB);
        q provider = new q(d(), (ne0.j) this.f201274t.get(), (c18.a) this.v.get());
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        Continuation continuation = null;
        x4l.c cVar = new x4l.c(new frk.a(provider, continuation, 4), new g1.b(provider, 6), new fv1.a(provider, 18), new g18.d(provider, continuation, 0), new f1(provider, continuation, 22), new g18.d(provider, continuation, 1));
        x4l.c cVar2 = (x4l.c) this.z.get();
        l80.e eVarH = this.f201264g.h();
        s.j(eVarH);
        k18.c cVar3 = new k18.c(cVar, cVar2, eVarH);
        ybl.b bVarB = this.f201265h.b();
        s.j(bVarB);
        return new jt0.b(aVarB, cVar3, bVarB);
    }

    public final InvestSmartNotificationsService d() {
        Retrofit retrofit = (Retrofit) this.f201273s.get();
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(InvestSmartNotificationsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InvestSmartNotificationsService investSmartNotificationsService = (InvestSmartNotificationsService) objCreate;
        s.k(investSmartNotificationsService);
        return investSmartNotificationsService;
    }

    public final prl.e e() {
        q18.c cVarA = a();
        jt0.b bVarC = c();
        oih.j jVarE = ((mkh.s) this.f201268m).e();
        s.j(jVarE);
        h0 h0VarB = this.f201269n.b();
        s.j(h0VarB);
        return new prl.e(cVarA, bVarC, jVarE, h0VarB);
    }
}
