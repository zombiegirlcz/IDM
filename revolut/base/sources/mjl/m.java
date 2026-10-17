package mjl;

import akl.b0;
import akl.f0;
import akl.o0;
import android.content.Context;
import com.revolut.sso.impl.network.services.DocumentsService;
import kotlin.jvm.internal.Intrinsics;
import ljl.i2;
import ljl.r1;
import ljl.t1;
import ljl.u1;
import ljl.w1;
import ljl.y1;
import ljl.z1;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements q {
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final e4m.e L;
    public final e4m.e M;
    public final e4m.e N;
    public final e4m.e O;
    public final e4m.e P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f206096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f206097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf0.a f206098c;
    public final l70.e d;
    public final Context e;
    public final jm0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final th0.a f206099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y60.c f206100h;
    public final tql.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gmi.a f206101j;
    public final r1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qqk.b f206102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y1 f206103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ee0.c f206104n;
    public final an0.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i2 f206105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jjl.a f206106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ee0.a f206107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ika.f f206108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f206109t = this;
    public final e4m.e u = e4m.b.b(new l(this, 2));
    public final e4m.e v = e4m.b.b(new l(this, 4));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f206110w = e4m.b.b(new l(this, 5));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f206111x = e4m.b.b(new l(this, 8));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f206112y = e4m.b.b(new l(this, 7));
    public final e4m.e z = e4m.b.b(new l(this, 9));
    public final e4m.e A = e4m.b.b(new l(this, 10));
    public final e4m.a B = new e4m.a();
    public final l C = new l(this, 11);
    public final e4m.e D = e4m.b.b(new l(this, 6));
    public final e4m.e E = e4m.b.b(new l(this, 12));

    public m(r1 r1Var, y1 y1Var, z1 z1Var, i2 i2Var, y60.c cVar, l70.e eVar, ee0.a aVar, nf0.a aVar2, nj0.a aVar3, ee0.c cVar2, jm0.a aVar4, th0.a aVar5, gmi.a aVar6, ika.f fVar, jjl.a aVar7, qqk.b bVar, tql.a aVar8, an0.c cVar3, Context context) {
        this.f206096a = aVar3;
        this.f206097b = z1Var;
        this.f206098c = aVar2;
        this.d = eVar;
        this.e = context;
        this.f = aVar4;
        this.f206099g = aVar5;
        this.f206100h = cVar;
        this.i = aVar8;
        this.f206101j = aVar6;
        this.k = r1Var;
        this.f206102l = bVar;
        this.f206103m = y1Var;
        this.f206104n = cVar2;
        this.o = cVar3;
        this.f206105p = i2Var;
        this.f206106q = aVar7;
        this.f206107r = aVar;
        this.f206108s = fVar;
        e4m.a.a(this.B, e4m.b.b(new l(this, 3)));
        this.F = e4m.b.b(new l(this, 1));
        this.G = e4m.b.b(new l(this, 13));
        this.H = e4m.b.b(new l(this, 0));
        this.I = e4m.b.b(new l(this, 16));
        this.J = e4m.b.b(new l(this, 17));
        this.K = e4m.b.b(new l(this, 18));
        this.L = e4m.b.b(new l(this, 15));
        this.M = e4m.b.b(new l(this, 20));
        this.N = e4m.b.b(new l(this, 19));
        this.O = e4m.b.b(new l(this, 14));
        this.P = e4m.b.b(new l(this, 21));
    }

    public final r10.q a() {
        return new r10.q((f0) this.H.get(), (o0) this.D.get(), this.f206102l.b());
    }

    public final b0 b() {
        ne0.j jVar = (ne0.j) this.A.get();
        rqk.k kVarA = this.f206102l.a();
        Retrofit retrofit = (Retrofit) this.f206110w.get();
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(DocumentsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        DocumentsService documentsService = (DocumentsService) objCreate;
        s.k(documentsService);
        return new b0(jVar, kVarA, documentsService);
    }

    public final OkHttpClient c() {
        nj0.d dVar = (nj0.d) this.f206096a;
        wj0.a aVarI = dVar.i();
        s.j(aVarI);
        sf0.h hVarB = this.f206098c.b();
        s.j(hVarB);
        xj0.f fVarR = l70.h.r(aVarI, hVarB);
        rj0.a aVar = dVar.i;
        ikl.b bVarT = l70.h.t(aVar);
        yj0.g gVarC = dVar.c();
        yj0.h hVarG = dVar.g();
        ij0.a aVar2 = dVar.f216295c;
        b80.c cVarP = this.d.p();
        s.j(cVarP);
        xj0.a aVar3 = new xj0.a(cVarP);
        mzl.a aVarA = u1.a();
        fk0.a aVar4 = (fk0.a) dVar.f216309y.get();
        s.j(aVar4);
        lj0.b bVar = new lj0.b(aVarA, aVar2, aVar4, new x70.a());
        nz5.a aVar5 = new nz5.a(aVar);
        xj0.d dVar2 = (xj0.d) dVar.v.get();
        s.j(dVar2);
        bk0.b bVar2 = new bk0.b();
        jm0.a aVar6 = this.f;
        qm0.b bVarE = aVar6.e();
        yh0.a aVarC = this.f206099g.c();
        ak0.a aVar7 = new ak0.a(aVar2);
        ak0.c cVar = new ak0.c(aVar2);
        yj0.j jVar = (yj0.j) dVar.f216308x.get();
        s.j(jVar);
        gk0.a aVar8 = new gk0.a();
        xj0.k kVar = (xj0.k) dVar.f216307w.get();
        s.j(kVar);
        sj0.b bVarN = dVar.n();
        ek0.a aVar9 = new ek0.a();
        fk0.a aVar10 = (fk0.a) dVar.f216309y.get();
        s.j(aVar10);
        nz5.a aVarC2 = this.f206100h.c();
        qm0.i iVar = new qm0.i(new yf.c(aVar6.f175898g));
        qql.b bVarA = this.i.a();
        jj0.g gVarE = ((oad.a) this.f206101j).e();
        s.j(gVarE);
        dk0.c cVarM = w1.m(fVarR, bVarT, gVarC, hVarG, aVar2, aVar3, this.e, bVar, aVar5, dVar2, bVar2, bVarE, aVarC, aVar7, cVar, jVar, aVar8, kVar, bVarN, aVar9, aVar10, aVarC2, iVar, bVarA, gVarE);
        kg.o oVarA = ikl.a.a();
        s.k(oVarA);
        return w1.l(cVarM, l70.h.f(oVarA, this.B), new kkl.c(), this.f206102l.a());
    }
}
