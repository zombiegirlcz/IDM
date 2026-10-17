package ljl;

import android.content.Context;
import au0.x3;
import com.revolut.sso.impl.data.db.SsoDatabase;
import com.revolut.sso.impl.network.services.AuthenticationService;
import com.revolut.sso.impl.network.services.UserInfoService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class p0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f196050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196051b;

    public p0(q0 q0Var, int i) {
        this.f196050a = q0Var;
        this.f196051b = i;
    }

    @Override // phm.a
    public final Object get() {
        q0 q0Var = this.f196050a;
        int i = this.f196051b;
        switch (i) {
            case 0:
                Context context = q0Var.f196055a;
                uil.a aVarA = q0Var.f196057b.a();
                vc.s.j(aVarA);
                CoroutineScope coroutineScopeA = q0Var.f196059c.a();
                vc.s.j(coroutineScopeA);
                return new fkl.h(context, aVarA, coroutineScopeA, (ue0.c) q0Var.F.get());
            case 1:
                i2 i2Var = q0Var.d;
                ee0.a aVar = q0Var.e;
                je0.d dVarD = aVar.d();
                vc.s.j(dVarD);
                yk0.a aVarB = q0Var.f.b();
                vc.s.j(aVarB);
                xe0.f fVarF = aVar.f();
                vc.s.j(fVarF);
                return w1.w(i2Var, dVarD, aVarB, fVarF);
            case 2:
                jol.b bVar = (jol.b) q0Var.I.get();
                mp.p pVarB = q0Var.b();
                akl.k kVar = (akl.k) q0Var.T.get();
                akl.l lVar = (akl.l) q0Var.U.get();
                fkg.a aVarD = q0Var.d();
                th0.a aVar2 = q0Var.i;
                ph0.f fVarB = t2d.c.b(aVar2.f271230a, aVar2.f271231b);
                gql.a aVar3 = (gql.a) q0Var.V.get();
                bjl.p0 p0Var = (bjl.p0) q0Var.H.get();
                xjl.i iVar = (xjl.i) q0Var.Z.get();
                akl.w1 w1Var = new akl.w1(l70.h.q((Retrofit) q0Var.K.get()), (ne0.j) q0Var.O.get());
                akl.z zVarC = q0Var.c();
                iy8.b bVarA = q0Var.f196078t.a();
                vc.s.j(bVarA);
                return new xjl.j(kVar, lVar, zVarC, w1Var, p0Var, aVarD, aVar3, bVarA, bVar, pVarB, fVarB, iVar);
            case 3:
                z80.b bVarS = q0Var.f196062g.s();
                vc.s.j(bVarS);
                return new jol.c(bVarS, (bjl.p0) q0Var.H.get());
            case 4:
                return q0Var.f196063h.a();
            case 5:
                return new akl.k(l70.h.g((Retrofit) q0Var.K.get()), (akl.f1) q0Var.P.get(), q0Var.l());
            case 6:
                nj0.a aVar4 = q0Var.f196065j;
                nj0.a aVar5 = q0Var.f196065j;
                ik0.b bVarM = ((nj0.d) aVar4).m();
                vc.s.j(bVarM);
                kg.o oVarA = ikl.a.a();
                vc.s.k(oVarA);
                Converter.Factory factoryA = v1.a(oVarA);
                nj0.d dVar = (nj0.d) aVar5;
                wj0.a aVarI = dVar.i();
                rj0.a aVar6 = dVar.i;
                ij0.a aVar7 = dVar.f216295c;
                vc.s.j(aVarI);
                sf0.h hVarB = q0Var.f196067l.b();
                vc.s.j(hVarB);
                xj0.f fVarR = l70.h.r(aVarI, hVarB);
                ikl.b bVarT = l70.h.t(aVar6);
                yj0.g gVarC = dVar.c();
                yj0.h hVarG = dVar.g();
                b80.c cVarP = q0Var.f196062g.p();
                vc.s.j(cVarP);
                xj0.a aVar8 = new xj0.a(cVarP);
                Context context2 = q0Var.f196055a;
                mzl.a aVarA2 = u1.a();
                fk0.a aVar9 = (fk0.a) dVar.f216309y.get();
                vc.s.j(aVar9);
                lj0.b bVar2 = new lj0.b(aVarA2, aVar7, aVar9, new x70.a());
                nz5.a aVar10 = new nz5.a(aVar6);
                xj0.d dVar2 = (xj0.d) dVar.v.get();
                vc.s.j(dVar2);
                bk0.b bVar3 = new bk0.b();
                jm0.a aVar11 = q0Var.f196068m;
                qm0.b bVarE = aVar11.e();
                yh0.a aVarC = q0Var.i.c();
                ak0.a aVar12 = new ak0.a(aVar7);
                ak0.c cVar = new ak0.c(aVar7);
                yj0.j jVar = (yj0.j) dVar.f216308x.get();
                vc.s.j(jVar);
                gk0.a aVar13 = new gk0.a();
                xj0.k kVar2 = (xj0.k) dVar.f216307w.get();
                vc.s.j(kVar2);
                sj0.b bVarN = dVar.n();
                ek0.a aVar14 = new ek0.a();
                fk0.a aVar15 = (fk0.a) dVar.f216309y.get();
                vc.s.j(aVar15);
                nz5.a aVarC2 = q0Var.f196069n.c();
                qm0.i iVar2 = new qm0.i(new yf.c(aVar11.f175898g));
                qql.b bVarA2 = q0Var.o.a();
                jj0.g gVarE = ((oad.a) q0Var.f196072p).e();
                vc.s.j(gVarE);
                dk0.c cVarM = w1.m(fVarR, bVarT, gVarC, hVarG, aVar7, aVar8, context2, bVar2, aVar10, dVar2, bVar3, bVarE, aVarC, aVar12, cVar, jVar, aVar13, kVar2, bVarN, aVar14, aVar15, aVarC2, iVar2, bVarA2, gVarE);
                kg.o oVarA2 = ikl.a.a();
                vc.s.k(oVarA2);
                OkHttpClient okHttpClientL = w1.l(cVarM, l70.h.f(oVarA2, q0Var.P), new kkl.c(), (bjl.p0) q0Var.H.get());
                yil.b bVar4 = q0Var.f196063h.f248575j;
                ((nj0.d) aVar5).getClass();
                return x1.a(bVarM, factoryA, okHttpClientL, bVar4, pj0.e.a());
            case 7:
                z1 z1Var = q0Var.k;
                kg.o oVarA3 = ikl.a.a();
                vc.s.k(oVarA3);
                CoroutineScope coroutineScope = (CoroutineScope) q0Var.J.get();
                AuthenticationService authenticationServiceG = l70.h.g((Retrofit) q0Var.K.get());
                akl.o0 o0Var = (akl.o0) q0Var.R.get();
                uil.a aVarA3 = q0Var.f196057b.a();
                vc.s.j(aVarA3);
                return new akl.n1(oVarA3, coroutineScope, authenticationServiceG, o0Var, aVarA3, q0Var.f196063h.b(), (bjl.p0) q0Var.H.get(), (ne0.j) q0Var.O.get(), (skm.a0) q0Var.S.get());
            case 8:
                return l70.h.y(q0Var.f196073q);
            case 9:
                UserInfoService userInfoServiceZ = w1.z((Retrofit) q0Var.K.get());
                tjl.b bVar5 = (tjl.b) q0Var.M.get();
                tjl.d dVar3 = (tjl.d) q0Var.N.get();
                ne0.j jVar2 = (ne0.j) q0Var.O.get();
                uil.a aVarA4 = q0Var.f196057b.a();
                vc.s.j(aVarA4);
                x80.a aVarQ = q0Var.f196062g.q();
                vc.s.j(aVarQ);
                dm0.d dVarD2 = q0Var.f196068m.d();
                vc.s.j(dVarD2);
                return new akl.e1(userInfoServiceZ, bVar5, dVar3, jVar2, aVarA4, aVarQ, dVarD2, new x3(q0Var.f196055a), (bjl.p0) q0Var.H.get(), e4m.b.a(q0Var.Q));
            case 10:
                return w1.g(q0Var.f196074r, (SsoDatabase) q0Var.L.get());
            case 11:
                y1 y1Var = q0Var.f196074r;
                Context context3 = q0Var.f196055a;
                de0.a aVarA5 = ((cl0.a) q0Var.f196076s).a();
                vc.s.j(aVarA5);
                yk0.a aVarB2 = q0Var.f.b();
                vc.s.j(aVarB2);
                return w1.u(y1Var, context3, aVarA5, aVarB2);
            case 12:
                return w1.y(q0Var.f196074r, (SsoDatabase) q0Var.L.get());
            case 13:
                i2 i2Var2 = q0Var.d;
                return new ne0.d(ne0.b.HASH);
            case 14:
                return new akl.y1(((nj0.d) q0Var.f196065j).k(), ((nj0.d) q0Var.f196065j).h(), q0Var.f196063h.f248575j, (bjl.p0) q0Var.H.get(), (akl.f1) q0Var.P.get());
            case 15:
                return l70.h.z(q0Var.f196073q);
            case 16:
                return new akl.r(l70.h.k((Retrofit) q0Var.K.get()), (ne0.j) q0Var.O.get(), (akl.f1) q0Var.P.get(), q0Var.l());
            case 17:
                return new gql.a(q0Var.i.i());
            case 18:
                return new xjl.i((wjl.b) q0Var.W.get(), q0Var.f());
            case 19:
                return new wjl.c();
            case 20:
                i2 i2Var3 = q0Var.d;
                le0.a aVarH = q0Var.h();
                fni.a aVar16 = q0Var.f196068m.f175897c;
                xe0.f fVarF2 = q0Var.e.f();
                vc.s.j(fVarF2);
                return bq.i.z(i2Var3, aVarH, aVar16, fVarF2);
            case 21:
                return w1.s(q0Var.d);
            case 22:
                i2 i2Var4 = q0Var.d;
                le0.a objectMapper = q0Var.h();
                yk0.a databaseSessionProvider = q0Var.f.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = q0Var.e.f();
                vc.s.j(storageFactory);
                Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "sso_configuration", objectMapper, 1, null, 48);
            case 23:
                return new akl.h(l70.h.g((Retrofit) q0Var.K.get()), (akl.k) q0Var.T.get(), (akl.f1) q0Var.P.get(), (akl.o0) q0Var.R.get(), q0Var.f(), (bjl.p0) q0Var.H.get(), (yjl.v) q0Var.c0.get());
            case 24:
                return new yjl.w(q0Var.l());
            case 25:
                return new ojl.a(q0Var.H, q0Var.f196064h0);
            case 26:
                return new yol.d((xjl.i) q0Var.Z.get(), q0Var.i(), (yol.e) q0Var.g0.get());
            case 27:
                return new xjl.h((ne0.j) q0Var.O.get(), (ue0.c) q0Var.f196061e0.get(), (CoroutineScope) q0Var.J.get());
            case 28:
                i2 i2Var5 = q0Var.d;
                le0.a aVarH2 = q0Var.h();
                yk0.a aVarB3 = q0Var.f.b();
                vc.s.j(aVarB3);
                xe0.f fVarF3 = q0Var.e.f();
                vc.s.j(fVarF3);
                return w1.t(i2Var5, aVarH2, aVarB3, fVarF3);
            case 29:
                rql.a aVarB4 = q0Var.o.b();
                vc.s.j(aVarB4);
                return new yol.h(aVarB4);
            case 30:
                return new fkl.i();
            case 31:
                mni.a aVarA6 = q0Var.u.a();
                vc.s.j(aVarA6);
                mni.a aVarB5 = q0Var.u.b();
                vc.s.j(aVarB5);
                return new xjl.e(aVarA6, aVarB5);
            case 32:
                l80.e eVarH = q0Var.f196062g.h();
                vc.s.j(eVarH);
                return new aml.m(eVarH);
            case 33:
                akl.c cVarA = q0Var.a();
                l80.e eVarH2 = q0Var.f196062g.h();
                vc.s.j(eVarH2);
                return new xjl.b(cVarA, eVarH2, (xjl.d) q0Var.m0.get());
            case 34:
                return new xjl.d((ne0.j) q0Var.O.get());
            case 35:
                return new xjl.r(q0Var.g());
            case 36:
                return new xjl.m((okl.n1) q0Var.p0.get(), (xjl.i) q0Var.Z.get());
            case 37:
                return new okl.n1((akl.d) q0Var.f196060d0.get(), (akl.k) q0Var.T.get(), q0Var.f(), (bjl.p0) q0Var.H.get());
            case 38:
                return new pjl.b1((akl.o0) q0Var.R.get(), (bjl.p0) q0Var.H.get(), (akl.f1) q0Var.P.get());
            case 39:
                lkl.b bVarL = q0Var.l();
                tql.a aVar17 = q0Var.o;
                rql.a aVarB6 = aVar17.b();
                vc.s.j(aVarB6);
                xjl.i iVar3 = (xjl.i) q0Var.Z.get();
                nkl.b bVarI = q0Var.i();
                rql.a aVarB7 = aVar17.b();
                vc.s.j(aVarB7);
                return new fkl.f(bVarL, aVarB6, new yol.b(iVar3, bVarI, aVarB7));
            case 40:
                return new xjl.n((bjl.p0) q0Var.H.get(), q0Var.f(), q0Var.c());
            case 41:
                return new xjl.o(q0Var.j());
            case 42:
                return new lll.a();
            case 43:
                z80.b bVarS2 = q0Var.f196062g.s();
                vc.s.j(bVarS2);
                return new tll.d(bVarS2, d2.a(), (bjl.p0) q0Var.H.get());
            case 44:
                z1 z1Var2 = q0Var.k;
                kg.o oVarA4 = ikl.a.a();
                vc.s.k(oVarA4);
                return new lkl.a(oVarA4, q0Var.f196068m.c());
            case 45:
                return new tll.n();
            case 46:
                return new tll.s((tll.n) q0Var.y0.get());
            case 47:
                return new ynl.c((ynl.a) q0Var.A0.get());
            case 48:
                return new ynl.b();
            case 49:
                return new iol.c((iol.a) q0Var.C0.get());
            case 50:
                return new iol.b();
            case 51:
                return new tll.b();
            default:
                throw new AssertionError(i);
        }
    }
}
