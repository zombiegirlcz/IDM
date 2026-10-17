package ibh;

import a5h.g;
import al4.n;
import al4.p;
import android.accounts.AccountManager;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.text.InputFilter;
import androidx.work.WorkManager;
import bn4.b0;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.configuration.impl.network.ConfigurationService;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import com.revolut.feature.credit.card.impl.network.CreditCardUiService;
import com.revolut.feature.credit.card.impl.widget.statement.CreditCardStatementWidgetMapper;
import com.revolut.feature.gambling.impl.services.GamblingBlockService;
import com.revolut.feature.product_article.impl.network.ProductArticleConfigService;
import com.revolut.feature.rev_points.giftcards.impl.data.network.RevPointsGiftcardsService;
import com.revolut.feature.spending_analytics.impl.network.SpendingAnalyticsService;
import com.revolut.feature.tab.accounts.impl.data.AccountsDatabase;
import com.revolut.feature.tax_residency.impl.services.TaxResidencyService;
import com.revolut.feature_market_data_impl.data.network.OrderQuoteService;
import djb.u;
import dp4.c0;
import dp4.c1;
import dp4.d1;
import dp4.e0;
import dp4.e1;
import dp4.j;
import dp4.q0;
import e4m.e;
import ecm.q;
import ffk.t;
import g48.r0;
import h80.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import jm4.a3;
import jm4.q4;
import jm4.r;
import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import ljl.w1;
import lnd.t0;
import nd.m;
import nyb.k;
import om4.a0;
import om4.a4;
import om4.b4;
import om4.c3;
import om4.c4;
import om4.d0;
import om4.e3;
import om4.g3;
import om4.h3;
import om4.j4;
import om4.k0;
import om4.k3;
import om4.k4;
import om4.l;
import om4.n0;
import om4.n4;
import om4.r1;
import om4.v0;
import om4.w;
import om4.x1;
import om4.x2;
import om4.y2;
import om4.z;
import pjl.z0;
import pl1.d;
import retrofit2.Retrofit;
import u90.x;
import u90.y;
import v90.h;
import v90.i;
import vc.s;
import xe0.f;
import zhm.f0;
import zxb.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f160175c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f160173a = i2;
        this.f160175c = obj2;
        this.f160174b = i;
    }

    private final Object a() {
        jm2.a aVar = (jm2.a) this.f160175c;
        q qVar = aVar.f175917a;
        int i = this.f160174b;
        if (i == 0) {
            return new jza.c(aVar.k, 2);
        }
        if (i == 1) {
            nm2.e eVar = (nm2.e) ((nm2.c) aVar.f175922j.get()).b();
            s.k(eVar);
            return eVar;
        }
        if (i == 2) {
            return new nm2.c(aVar.f175918b, aVar.f175919c, aVar.d, qVar);
        }
        if (i == 3) {
            return d.c(qVar, aVar.k, aVar.e, aVar.f, aVar.f175920g, aVar.f175921h, aVar.i);
        }
        throw new AssertionError(i);
    }

    private final Object b() {
        r rVar = (r) this.f160175c;
        int i = this.f160174b;
        switch (i) {
            case 0:
                n nVar = (n) rVar.f176306y.get();
                k0 k0Var = (k0) rVar.f176305x.get();
                al4.q qVarA = rVar.f176290a.a();
                s.j(qVarA);
                c0 c0Var = (c0) rVar.f176303t.get();
                x1 x1Var = (x1) rVar.B.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) rVar.f176293g).c();
                s.j(aVarC);
                return new r1(nVar, k0Var, qVarA, c0Var, x1Var, aVarC, rVar.f176294h.a(), ((nj0.d) rVar.d).f216295c);
            case 1:
                c1 c1VarM = rVar.m();
                zk4.b bVar = rVar.f176290a;
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) rVar.f176293g).c();
                s.j(aVarC2);
                al4.q qVarA2 = bVar.a();
                s.j(qVarA2);
                wsg.b bVarA = rVar.f176294h.a();
                ep4.a aVar = new ep4.a();
                c0 c0Var2 = (c0) rVar.f176303t.get();
                p pVarI = bVar.i();
                s.j(pVarI);
                gte.a aVarB = rVar.i.b();
                s.j(aVarB);
                return new x2(c1VarM, aVarC2, qVarA2, bVarA, aVar, c0Var2, pVarI, aVarB, (k3) rVar.u.get(), (al4.d) rVar.f176304w.get(), (k0) rVar.f176305x.get());
            case 2:
                return jge.r.g(rVar.f176291b, (Retrofit) rVar.f176300q.get());
            case 3:
                jm4.e eVar = rVar.f176291b;
                Retrofit retrofitJ = ((c21.b) rVar.f176292c).j();
                s.j(retrofitJ);
                return jge.r.i(eVar, retrofitJ, (o) rVar.f176299p.get());
            case 4:
                o oVarH = ((c21.b) rVar.f176292c).h();
                s.j(oVarH);
                return jge.r.k(oVarH);
            case 5:
                le0.b bVarC = rVar.e.c();
                s.j(bVarC);
                o oVarA = fe0.c.a();
                yk0.a aVarB2 = rVar.f.b();
                s.j(aVarB2);
                f fVarF = rVar.e.f();
                s.j(fVarF);
                return jge.r.h(oVarA, bVarC, fVarF, aVarB2);
            case 6:
                return new c0((CreditCardService) rVar.f176301r.get(), jm4.d.a(), rVar.l(), rVar.v());
            case 7:
                mk0.a aVarA = rVar.f176295j.a();
                s.j(aVarA);
                return new k3(aVarA, rVar.m());
            case 8:
                e eVar2 = rVar.v;
                zk4.b bVar2 = rVar.f176290a;
                dp4.e eVar3 = (dp4.e) eVar2.get();
                al4.q qVarA3 = bVar2.a();
                s.j(qVarA3);
                k4 k4VarF = bVar2.f();
                s.j(k4VarF);
                return new l(eVar3, qVarA3, k4VarF);
            case 9:
                return new dp4.e((CreditCardService) rVar.f176301r.get(), rVar.l(), rVar.v());
            case 10:
                c1 c1VarM2 = rVar.m();
                zk4.b bVar3 = rVar.f176290a;
                p pVarI2 = bVar3.i();
                s.j(pVarI2);
                al4.q qVarA4 = bVar3.a();
                s.j(qVarA4);
                return new k0(c1VarM2, pVarI2, qVarA4);
            case 11:
                return new x1((c0) rVar.f176303t.get(), (dp4.q) rVar.z.get(), (k0) rVar.f176305x.get(), (a0) rVar.A.get(), rVar.k.e());
            case 12:
                return new dp4.q((CreditCardService) rVar.f176301r.get(), jm4.d.a(), rVar.v());
            case 13:
                gte.a aVarB3 = rVar.i.b();
                s.j(aVarB3);
                return new a0(aVarB3, (n) rVar.f176306y.get());
            case 14:
                CreditCardService creditCardService = (CreditCardService) rVar.f176301r.get();
                xx4.d dVarL = rVar.l();
                xx4.e eVarV = rVar.v();
                wj0.a aVarI = ((nj0.d) rVar.d).i();
                s.j(aVarI);
                return new n4(new g(creditCardService, dVarL, eVarV, aVarI));
            case 15:
                e eVar4 = rVar.f176301r;
                nj0.a aVar2 = rVar.d;
                CreditCardService creditCardService2 = (CreditCardService) eVar4.get();
                xx4.d dVarL2 = rVar.l();
                xx4.e eVarV2 = rVar.v();
                nj0.d dVar = (nj0.d) aVar2;
                wj0.a aVarI2 = dVar.i();
                s.j(aVarI2);
                return new w(new j(creditCardService2, dVarL2, eVarV2, aVarI2, dVar.f216295c), (n) rVar.f176306y.get(), (k0) rVar.f176305x.get(), ((nj0.d) aVar2).j());
            case 16:
                return new m((e1) rVar.G.get());
            case 17:
                return new e1((CreditCardService) rVar.f176301r.get(), (t90.g) rVar.F.get());
            case 18:
                rVar.getClass();
                return new t90.g(new e84.e(new h(), new v90.e(new x()), new v90.e(r.u()), new v90.c(), new v90.e(new u90.a0()), new v90.d(rVar.t(), new t90.a(), r.u(), new u90.c0(new y())), new i(rVar.t()), new v90.g(new t90.a(), new y(), new u90.a0(), r.u()), new v90.b(rVar.t(), new t90.a(), r.u())));
            case 19:
                return new j4();
            case 20:
                return new z((dp4.l) rVar.I.get(), (n) rVar.f176306y.get());
            case 21:
                CreditCardService creditCardService3 = (CreditCardService) rVar.f176301r.get();
                wj0.a aVarI3 = ((nj0.d) rVar.d).i();
                s.j(aVarI3);
                return new dp4.l(creditCardService3, aVarI3);
            case 22:
                n nVar2 = (n) rVar.f176306y.get();
                dp4.s sVar = (dp4.s) rVar.K.get();
                t tVarF = rVar.f176298n.f();
                s.j(tVarF);
                return new n0(nVar2, sVar, tVarF);
            case 23:
                return new dp4.s((CreditCardService) rVar.f176301r.get(), rVar.l(), rVar.v());
            case 24:
                return new y2((e0) rVar.M.get());
            case 25:
                return new e0((CreditCardService) rVar.f176301r.get());
            case 26:
                n nVar3 = (n) rVar.f176306y.get();
                gte.a aVarB4 = rVar.i.b();
                s.j(aVarB4);
                p pVarI3 = rVar.f176290a.i();
                s.j(pVarI3);
                return new b4(nVar3, aVarB4, pVarI3);
            case 27:
                dp4.q qVar = (dp4.q) rVar.z.get();
                a0 a0Var = (a0) rVar.A.get();
                al4.q qVarA5 = rVar.f176290a.a();
                s.j(qVarA5);
                return new om4.c0(qVar, a0Var, qVarA5, (x1) rVar.B.get());
            case 28:
                dp4.t tVar = (dp4.t) rVar.Q.get();
                k3 k3Var = (k3) rVar.u.get();
                gte.a aVarB5 = rVar.i.b();
                s.j(aVarB5);
                return new v0(tVar, k3Var, aVarB5);
            case 29:
                return new dp4.t((CreditCardService) rVar.f176301r.get(), rVar.l(), rVar.v());
            case 30:
                gte.a aVarB6 = rVar.i.b();
                s.j(aVarB6);
                ang.f fVarE = rVar.k.e();
                al4.q qVarA6 = rVar.f176290a.a();
                s.j(qVarA6);
                return new om4.f(aVarB6, fVarE, qVarA6);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        jm4.s sVar = (jm4.s) this.f160175c;
        int i = this.f160174b;
        switch (i) {
            case 0:
                return new jm4.j(sVar.f176318a, sVar.f176320b, sVar.f176322c, sVar.d, sVar.e, sVar.f, sVar.f176325g, sVar.f176326h, sVar.i, sVar.f176328j, sVar.k, sVar.f176330l, sVar.f176331m, sVar.f176332n, sVar.o, sVar.f176335p, sVar.f176336q, sVar.f176337r, sVar.f176339s, sVar.f176341t, sVar.u, sVar.v, sVar.f176343w, sVar.f176344x, sVar.f176329k0, sVar.m0, sVar.f176334o0, sVar.N, sVar.O, sVar.P, sVar.D, sVar.M, sVar.Q, sVar.R, sVar.J, sVar.S, sVar.T, sVar.U, sVar.V, sVar.G, sVar.W, sVar.X, sVar.Y, sVar.Z, sVar.f176319a0, sVar.z, sVar.C, sVar.f176321b0, sVar.c0, sVar.K, sVar.f176323d0);
            case 1:
                r rVar = (r) ((jm4.a) sVar.j0.get()).b();
                s.k(rVar);
                return rVar;
            case 2:
                return new jm4.a(sVar.f176318a, sVar.f176345y, sVar.f176320b, sVar.z, sVar.f176326h, sVar.i, sVar.A, sVar.d, sVar.B, sVar.C, sVar.D, sVar.i0, sVar.I, sVar.J, sVar.f, sVar.K);
            case 3:
                zk4.b bVar = (zk4.b) ((lm4.a) sVar.f176327h0.get()).b();
                s.k(bVar);
                return bVar;
            case 4:
                return new lm4.a(sVar.f176320b, sVar.z, sVar.f, sVar.E, sVar.f176326h, sVar.i, sVar.f176325g, sVar.C, sVar.F, sVar.B, sVar.G, sVar.H, sVar.f176318a);
            case 5:
                return jge.r.C((nm4.a) sVar.l0.get());
            case 6:
                return nga.c.h(sVar.f176318a, sVar.L, sVar.z, sVar.f176329k0, sVar.f176320b, sVar.C);
            case 7:
                zk4.a aVar = (zk4.a) ((km4.a) sVar.f176333n0.get()).b();
                s.k(aVar);
                return aVar;
            case 8:
                return new km4.a(sVar.f176318a, sVar.f176329k0, sVar.f176335p, sVar.M);
            case 9:
                return new fy2.a(sVar.f176318a, sVar.f176324e0, sVar.f176329k0, sVar.m0, sVar.q0, sVar.f0, sVar.g0, sVar.R, sVar.f176328j);
            case 10:
                a3 a3Var = (a3) ((jm4.j) sVar.p0.get()).b();
                s.k(a3Var);
                return a3Var;
            case 11:
                return new cxj.c(sVar.f176318a, sVar.f, 3);
            case 12:
                return rga.l.e(sVar.f176329k0, sVar.K);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        a3 a3Var = (a3) this.f160175c;
        int i = this.f160174b;
        switch (i) {
            case 0:
                Context context = a3Var.f175967c;
                r rVar = a3Var.f175965b;
                sri.m mVarO = jge.r.o(context);
                p pVarI = rVar.i();
                al4.d dVarO = rVar.o();
                s.j(dVarO);
                n nVarS = rVar.s();
                s.j(nVarS);
                al4.q qVarA = rVar.a();
                lb5.b bVarA = a3Var.d.a();
                s.j(bVarA);
                f73.c cVar = new f73.c();
                l93.f fVarJ = a3Var.e.j();
                s.j(fVarJ);
                k0 k0VarQ = rVar.q();
                s.j(k0VarQ);
                al4.e eVarP = rVar.p();
                s.j(eVarP);
                return new b0(mVarO, pVarI, dVarO, nVarS, qVarA, bVarA, cVar, fVarJ, k0VarQ, eVarP, a3Var.f.e(), a3Var.f175970g.a());
            case 1:
                r rVar2 = a3Var.f175965b;
                r rVar3 = a3Var.f175965b;
                n nVarS2 = rVar2.s();
                s.j(nVarS2);
                al4.m mVarR = rVar3.r();
                s.j(mVarR);
                jid.z zVarM = a3Var.m();
                thf.d dVarD = a3Var.f175971h.d();
                s.j(dVarD);
                k0 k0VarQ2 = rVar3.q();
                s.j(k0VarQ2);
                return new ht4.c(nVarS2, mVarR, zVarM, dVarD, k0VarQ2);
            case 2:
                n nVarS3 = a3Var.f175965b.s();
                s.j(nVarS3);
                lb5.b bVarA2 = a3Var.d.a();
                s.j(bVarA2);
                return new aw4.b(nVarS3, bVarA2, a3Var.f.e());
            case 3:
                efk.a aVar = a3Var.i;
                zxb.k0 k0Var = a3Var.f175973j;
                t tVarF = aVar.f();
                s.j(tVarF);
                k kVarC = k0Var.c();
                s.j(kVarC);
                nyb.j jVarB = k0Var.b();
                s.j(jVarB);
                return new wu4.a(tVarF, kVarC, jVarB);
            case 4:
                return jm4.p.a();
            case 5:
                CreditCardUiService creditCardUiService = (CreditCardUiService) a3Var.g0.get();
                xx4.d dVar = (xx4.d) a3Var.f175972h0.get();
                xx4.e eVar = (xx4.e) a3Var.j0.get();
                go3.b bVarA3 = a3Var.A.a();
                s.j(bVarA3);
                return new dp4.w(creditCardUiService, dVar, eVar, new ox4.c(bVarA3));
            case 6:
                return jge.r.f((Retrofit) a3Var.f0.get());
            case 7:
                Retrofit retrofitJ = ((c21.b) a3Var.f175980p).j();
                s.j(retrofitJ);
                return jge.r.j((o) a3Var.f175969e0.get(), retrofitJ);
            case 8:
                o oVarH = ((c21.b) a3Var.f175980p).h();
                s.j(oVarH);
                return jge.r.l(oVarH);
            case 9:
                return h7d.a.x(new ne0.d());
            case 10:
                return h7d.a.y((ue0.c) a3Var.i0.get());
            case 11:
                le0.b bVarC = a3Var.f175990y.c();
                s.j(bVarC);
                o oVarA = fe0.c.a();
                yk0.a aVarB = a3Var.z.b();
                s.j(aVarB);
                f fVarF = a3Var.f175990y.f();
                s.j(fVarF);
                return jge.r.x(oVarA, bVarC, fVarF, aVarB);
            case 12:
                n nVarS4 = a3Var.f175965b.s();
                s.j(nVarS4);
                n4 n4Var = (n4) a3Var.f175965b.D.get();
                s.j(n4Var);
                return new e3(nVarS4, n4Var);
            case 13:
                eb5.a aVar2 = (eb5.a) a3Var.I.f112676g.get();
                s.j(aVar2);
                xq3.t tVar = (xq3.t) a3Var.E.F.get();
                s.j(tVar);
                k0 k0VarQ3 = a3Var.f175965b.q();
                s.j(k0VarQ3);
                return new c3(aVar2, tVar, k0VarQ3);
            case 14:
                m2j.j jVarC = a3Var.T.c();
                q0 q0Var = (q0) a3Var.q0.get();
                w5i.a aVarA = a3Var.V.a();
                s.j(aVarA);
                return new a4(jVarC, q0Var, aVarA);
            case 15:
                return new q0((CreditCardService) a3Var.p0.get());
            case 16:
                return jge.r.g(a3Var.U, (Retrofit) a3Var.f175979o0.get());
            case 17:
                jm4.e eVar2 = a3Var.U;
                Retrofit retrofitJ2 = ((c21.b) a3Var.f175980p).j();
                s.j(retrofitJ2);
                return jge.r.i(eVar2, retrofitJ2, (o) a3Var.f175978n0.get());
            case 18:
                o oVarH2 = ((c21.b) a3Var.f175980p).h();
                s.j(oVarH2);
                return jge.r.k(oVarH2);
            case 19:
                return new c4((d1) a3Var.f175985s0.get());
            case 20:
                return new d1((CreditCardService) a3Var.p0.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        q4 q4Var = (q4) this.f160175c;
        int i = this.f160174b;
        switch (i) {
            case 0:
                n nVarS = q4Var.f176274a.s();
                s.j(nVarS);
                qw4.e eVar = new qw4.e();
                ish.a0 a0VarC = q4Var.f176275b.c();
                s.j(a0VarC);
                return new qw4.g(nVarS, eVar, a0VarC, (qw4.f) q4Var.f176279j.get());
            case 1:
                k0 k0VarQ = q4Var.f176274a.q();
                s.j(k0VarQ);
                return new qw4.f(k0VarQ);
            case 2:
                tw4.g gVar = new tw4.g();
                tw4.a aVar = (tw4.a) q4Var.f176280l.get();
                ish.a0 a0VarC2 = q4Var.f176275b.c();
                s.j(a0VarC2);
                bm4.b bVar = (bm4.b) q4Var.f176276c.f175964a0.get();
                s.j(bVar);
                return new tw4.f(gVar, aVar, a0VarC2, bVar, (tw4.j) q4Var.f176281m.get());
            case 3:
                return new tw4.a();
            case 4:
                e eVar2 = q4Var.f176280l;
                r rVar = q4Var.f176274a;
                tw4.a aVar2 = (tw4.a) eVar2.get();
                al4.q qVarA = rVar.a();
                k0 k0VarQ2 = rVar.q();
                s.j(k0VarQ2);
                return new tw4.j(aVar2, qVarA, k0VarQ2);
            case 5:
                CreditCardStatementWidgetMapper creditCardStatementWidgetMapper = new CreditCardStatementWidgetMapper();
                n nVarS2 = q4Var.f176274a.s();
                s.j(nVarS2);
                sri.m mVarD = ((g8b.a) q4Var.d).d();
                s.j(mVarD);
                ish.a0 a0VarC3 = q4Var.f176275b.c();
                s.j(a0VarC3);
                return new ww4.g(creditCardStatementWidgetMapper, nVarS2, mVarD, a0VarC3, (ww4.j) q4Var.o.get());
            case 6:
                n nVarS3 = q4Var.f176274a.s();
                s.j(nVarS3);
                k0 k0VarQ3 = q4Var.f176274a.q();
                s.j(k0VarQ3);
                return new ww4.j(nVarS3, k0VarQ3);
            case 7:
                zxb.k0 k0Var = q4Var.e;
                vw4.i iVar = new vw4.i(new j1c.a());
                com.revolut.feature.rev_points.api.navigation.a aVarA = q4Var.f.a();
                s.j(aVarA);
                wu4.a aVar3 = (wu4.a) q4Var.f176276c.c0.get();
                s.j(aVar3);
                sri.m mVarD2 = ((g8b.a) q4Var.d).d();
                s.j(mVarD2);
                ish.a0 a0VarC4 = q4Var.f176275b.c();
                s.j(a0VarC4);
                return new vw4.g(iVar, aVarA, aVar3, mVarD2, a0VarC4, (vw4.m) q4Var.f176284q.get(), (vw4.b) q4Var.f176285r.get(), q4Var.f176277g);
            case 8:
                k0 k0VarQ4 = q4Var.f176274a.q();
                s.j(k0VarQ4);
                return new vw4.m(k0VarQ4, q4Var.f176274a.a());
            case 9:
                eub.a aVarA2 = q4Var.e.a();
                s.j(aVarA2);
                return new vw4.b(aVarA2);
            case 10:
                al4.d dVarO = q4Var.f176274a.o();
                s.j(dVarO);
                pw4.i iVar2 = new pw4.i(new pp4.a());
                ish.a0 a0VarC5 = q4Var.f176275b.c();
                s.j(a0VarC5);
                pw4.j jVar = (pw4.j) q4Var.f176287t.get();
                sri.m mVarD3 = ((g8b.a) q4Var.d).d();
                s.j(mVarD3);
                return new pw4.g(dVarO, iVar2, a0VarC5, jVar, mVarD3);
            case 11:
                al4.d dVarO2 = q4Var.f176274a.o();
                s.j(dVarO2);
                return new pw4.n(dVarO2);
            case 12:
                h3 h3VarB = q4Var.f176278h.b();
                s.j(h3VarB);
                uw4.i iVar3 = new uw4.i();
                ish.a0 a0VarC6 = q4Var.f176275b.c();
                s.j(a0VarC6);
                uw4.j jVar2 = (uw4.j) q4Var.v.get();
                g3 g3VarA = q4Var.f176278h.a();
                s.j(g3VarA);
                wli.x xVarD = ((s41.a) q4Var.i).d();
                sri.m mVarD4 = ((g8b.a) q4Var.d).d();
                s.j(mVarD4);
                return new uw4.h(h3VarB, iVar3, a0VarC6, jVar2, g3VarA, xVarD, mVarD4);
            case 13:
                h3 h3VarB2 = q4Var.f176278h.b();
                s.j(h3VarB2);
                return new uw4.j(h3VarB2);
            case 14:
                r rVar2 = q4Var.f176274a;
                r rVar3 = q4Var.f176274a;
                n0 n0Var = (n0) rVar2.L.get();
                s.j(n0Var);
                bl4.e eVarD = q4Var.f176276c.f175963a.d();
                sri.m mVarD5 = ((g8b.a) q4Var.d).d();
                s.j(mVarD5);
                ish.a0 a0VarC7 = q4Var.f176275b.c();
                s.j(a0VarC7);
                n nVarS4 = rVar3.s();
                s.j(nVarS4);
                k0 k0VarQ5 = rVar3.q();
                s.j(k0VarQ5);
                return new sw4.j(n0Var, eVarD, mVarD5, a0VarC7, nVarS4, k0VarQ5);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        jmd.d dVar = (jmd.d) this.f160175c;
        int i = this.f160174b;
        switch (i) {
            case 0:
                of1.a aVarA = dVar.f176527a.a();
                s.j(aVarA);
                gte.a aVarB = dVar.f176529b.b();
                s.j(aVarB);
                return new lmd.e(aVarA, aVarB);
            case 1:
                return new lmd.a((qmd.j) dVar.u0.get());
            case 2:
                return new qmd.j((ne0.j) dVar.f176551t0.get(), (ue0.c) dVar.f176547r0.get());
            case 3:
                le0.b bVarC = dVar.f176531c.c();
                s.j(bVarC);
                o oVarA = fe0.c.a();
                yk0.a aVarB2 = dVar.d.b();
                s.j(aVarB2);
                f fVarF = dVar.f176531c.f();
                s.j(fVarF);
                return jge.r.y(oVarA, bVarC, fVarF, aVarB2);
            case 4:
                return new ne0.d();
            case 5:
                e eVar = dVar.y0;
                ke3.e eVar2 = dVar.f176535h;
                qmd.g gVar = (qmd.g) eVar.get();
                xua.a aVarA2 = dVar.f.a();
                s.j(aVarA2);
                wsg.n nVarB = dVar.f176534g.b();
                l5i.q qVarB = eVar2.b();
                le3.i iVar = (le3.i) eVar2.v.get();
                s.j(iVar);
                return new lmd.j(gVar, aVarA2, nVarB, qVarB, iVar);
            case 6:
                return new qmd.g((SpendingAnalyticsService) dVar.f176554w0.get(), (ue0.c) dVar.f176547r0.get(), (ne0.j) dVar.f176556x0.get());
            case 7:
                return jge.r.v(((nj0.d) dVar.e).f());
            case 8:
                e eVar3 = dVar.z0;
                ke3.e eVar4 = dVar.f176535h;
                izi.a aVar = dVar.f176537j;
                xld.f fVar = (xld.f) eVar3.get();
                l5i.q qVarB2 = eVar4.b();
                gmd.e eVar5 = new gmd.e();
                ge3.a aVarE = eVar4.e();
                s.j(aVarE);
                wsg.n nVarB2 = dVar.f176534g.b();
                ang.f fVarE = dVar.i.e();
                eqj.d dVarA = ((dqj.r) aVar).a();
                s.j(dVarA);
                kzi.a aVarB3 = ((dqj.r) aVar).b();
                s.j(aVarB3);
                eqj.g gVarG = ((dqj.r) aVar).g();
                s.j(gVarG);
                djb.q qVarC = dVar.k.c();
                s.j(qVarC);
                l80.e eVarH = dVar.f176539l.h();
                s.j(eVarH);
                return new lmd.g(fVar, qVarB2, eVar5, aVarE, nVarB2, fVarE, dVarA, aVarB3, gVarG, qVarC, eVarH);
            case 9:
                usg.a aVar2 = dVar.f176534g;
                bpj.a aVar3 = dVar.f176557y;
                ku5.g gVar2 = dVar.f176553w;
                ta7.a aVar4 = dVar.f176544p;
                e48.a aVar5 = dVar.f176545q;
                usg.a aVar6 = dVar.f176534g;
                xmg.a aVar7 = dVar.i;
                ite.a aVar8 = dVar.f176529b;
                npk.a aVar9 = dVar.f176540m;
                jsd.a aVar10 = new jsd.a(aVar2.b(), aVar9.a(), new jsd.c(), dVar.l());
                r0 r0VarC = aVar5.c();
                wsg.n nVarB3 = aVar2.b();
                ppk.f fVarA = aVar9.a();
                hsd.b bVar = new hsd.b();
                twg.c cVarL = dVar.l();
                gte.a aVarB4 = aVar8.b();
                s.j(aVarB4);
                hsd.f fVar2 = new hsd.f(r0VarC, nVarB3, fVarA, bVar, cVarL, aVarB4);
                gr6.e eVarA = dVar.f176546r.a();
                s.j(eVarA);
                gr6.a aVarA3 = dVar.o.a();
                s.j(aVarA3);
                g gVar3 = new g(eVarA, aVarA3, new msd.d(), aVar2.b(), aVar9.a(), dVar.l());
                bd3.a aVarA4 = dVar.f176548s.a();
                s.j(aVarA4);
                t tVarF = dVar.f176550t.f();
                s.j(tVarF);
                ppk.f fVarA2 = aVar9.a();
                wsg.n nVarB4 = aVar2.b();
                g6e.b bVarA = dVar.u.a();
                s.j(bVarA);
                gte.a aVarB5 = aVar8.b();
                s.j(aVarB5);
                ksd.i iVar2 = new ksd.i(aVarB5);
                ldi.f fVarA3 = dVar.v.a();
                s.j(fVarA3);
                p38.a aVarA5 = aVar5.a();
                s.j(aVarA5);
                gsd.c cVar = new gsd.c(aVar10, fVar2, gVar3, new ksd.g(aVarA4, tVarF, fVarA2, nVarB4, bVarA, iVar2, fVarA3, aVarA5, dVar.l(), aVar7.e(), aVar4.d()));
                wsg.n nVarB5 = aVar6.b();
                mu5.f fVarD = gVar2.d();
                psd.g gVar4 = new psd.g(new wt5.a());
                ji5.m mVarE = dVar.f176555x.e();
                s.j(mVarE);
                ppk.f fVarA4 = aVar9.a();
                xoj.a aVarA6 = aVar3.a();
                s.j(aVarA6);
                ur5.c cVarD = t2d.c.d(aVar9.a(), aVar6.b());
                gte.a aVarB6 = aVar8.b();
                s.j(aVarB6);
                p76.b bVar2 = dVar.z;
                psd.j jVar = new psd.j(nVarB5, fVarD, gVar4, mVarE, fVarA4, aVarA6, cVarD, aVarB6, new psd.d(bVar2.b(), bVar2.c(), aVar9.a()));
                wsg.n nVarB6 = aVar6.b();
                zdl.c cVar2 = dVar.A;
                ybl.d dVarH = cVar2.h();
                s.j(dVarH);
                zjh.f fVarA5 = dVar.B.a();
                h9h.a aVar11 = dVar.C;
                tzg.m mVarT = aVar11.t();
                s.j(mVarT);
                ael.t tVarF2 = cVar2.f();
                s.j(tVarF2);
                ybl.k kVarD = dVar.D.d();
                s.j(kVarD);
                ybl.l lVarF = aVar11.f();
                mu5.f fVarD2 = gVar2.d();
                rsd.d dVar2 = new rsd.d(new kpj.f(aVar11.H()));
                xoj.a aVarA7 = aVar3.a();
                s.j(aVarA7);
                y1b.a aVarD = dVar.E.d();
                s.j(aVarD);
                rsd.k kVar = new rsd.k(nVarB6, dVarH, fVarA5, mVarT, tVarF2, kVarD, lVarF, fVarD2, dVar2, aVarA7, aVarD, aVar7.e());
                blb.e eVar6 = (blb.e) dVar.F;
                zsd.f fVar3 = new zsd.f(eVar6.f());
                ijb.a aVarG = eVar6.g();
                s.j(aVarG);
                toh.d dVarA2 = dVar.G.a();
                anb.s sVar = dVar.k;
                djb.n nVarA = sVar.a();
                s.j(nVarA);
                u uVarD = sVar.d();
                s.j(uVarD);
                elb.b bVarE = eVar6.e();
                r0 r0VarC2 = aVar5.c();
                gte.a aVarB7 = aVar8.b();
                s.j(aVarB7);
                zsd.l lVar = new zsd.l(fVar3, aVarG, dVarA2, nVarA, uVarD, bVarE, r0VarC2, aVarB7, aVar4.d(), ((fob.a) dVar.H).c(), aVar7.e());
                tsj.g gVarE = ((dqj.r) dVar.f176537j).e();
                s.j(gVarE);
                return new mmd.b(cVar, jVar, kVar, lVar, new gsd.c(gVarE, new qsd.d(new rrd.b(), new rrd.f()), aVar9.a(), aVar6.b(), dVar.I.b()), new nsd.b(dVar.c(), dVar.b()), new nsd.b(dVar.a(), dVar.d(), dVar.e()), dVar.c(), dVar.b(), dVar.a(), dVar.d(), dVar.e(), (xld.d) dVar.q0.get());
            case 10:
                usg.a aVar12 = dVar.f176534g;
                npk.a aVar13 = dVar.f176540m;
                zdl.c cVar3 = dVar.A;
                bpj.a aVar14 = dVar.f176557y;
                h9h.a aVar15 = dVar.C;
                anb.s sVar2 = dVar.k;
                usg.a aVar16 = dVar.f176534g;
                ite.a aVar17 = dVar.f176529b;
                wsg.n nVarB7 = aVar12.b();
                toh.d dVarA3 = dVar.G.a();
                djb.n nVarA2 = sVar2.a();
                s.j(nVarA2);
                r0 r0VarC3 = dVar.f176545q.c();
                ang.f fVarE2 = dVar.i.e();
                g6e.d dVarB = dVar.f176541n.b();
                s.j(dVarB);
                g6e.b bVarA2 = dVar.u.a();
                s.j(bVarA2);
                l80.e eVarH2 = dVar.f176539l.h();
                s.j(eVarH2);
                rqd.h hVar = (rqd.h) dVar.C0.get();
                gte.a aVarB8 = aVar17.b();
                s.j(aVarB8);
                upd.p pVar = new upd.p(fVarE2, dVarB, bVarA2, eVarH2, hVar, aVarB8);
                u uVarD2 = sVar2.d();
                s.j(uVarD2);
                ybl.k kVarD2 = dVar.D.d();
                s.j(kVarD2);
                ybl.l lVarF2 = aVar15.f();
                xoj.a aVarA8 = aVar14.a();
                s.j(aVarA8);
                ybl.d dVarH2 = cVar3.h();
                s.j(dVarH2);
                su9.c cVar4 = new su9.c(aVar13.a(), aVar16.b());
                ybl.d dVarH3 = cVar3.h();
                s.j(dVarH3);
                ybl.b bVarB = cVar3.b();
                s.j(bVarB);
                ael.q qVarE = cVar3.e();
                s.j(qVarE);
                su9.c cVar5 = new su9.c(aVar13.a(), aVar16.b());
                gte.a aVarB9 = aVar17.b();
                s.j(aVarB9);
                upd.c cVar6 = new upd.c(dVarH3, bVarB, qVarE, cVar5, aVarB9);
                gte.a aVarB10 = aVar17.b();
                s.j(aVarB10);
                upd.h hVar2 = new upd.h(kVarD2, lVarF2, aVarA8, dVarH2, cVar4, cVar6, aVarB10);
                xoj.a aVarA9 = aVar14.a();
                s.j(aVarA9);
                qmc.h hVarA = dVar.R.a();
                tzg.m mVarT2 = aVar15.t();
                s.j(mVarT2);
                ael.t tVarF3 = cVar3.f();
                s.j(tVarF3);
                upd.n nVar = new upd.n(aVarA9, hVarA, mVarT2, tVarF3, aVar16.b());
                cl3.a aVarD2 = dVar.S.d();
                s.j(aVarD2);
                upd.r rVar = new upd.r(aVarD2, ((b3j.p) dVar.T).e());
                gte.a aVarB11 = aVar17.b();
                s.j(aVarB11);
                xh5.a aVarA10 = dVar.f176555x.a();
                s.j(aVarA10);
                m2j.j jVarC = dVar.U.c();
                nw5.j jVarD = dVar.V.d();
                s.j(jVarD);
                tv5.b bVarC2 = dVar.W.c();
                s.j(bVarC2);
                upd.b bVar3 = new upd.b(aVarB11, aVarA10, jVarC, jVarD, bVarC2);
                gte.a aVarB12 = aVar17.b();
                s.j(aVarB12);
                return new tpd.f(nVarB7, dVarA3, nVarA2, r0VarC3, pVar, uVarD2, hVar2, nVar, rVar, bVar3, aVarB12);
            case 11:
                return new rqd.h(dVar.f176540m.a());
            case 12:
                wzi.a aVarA11 = ((ctj.b) dVar.X).a();
                s.j(aVarA11);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) dVar.Y).c();
                s.j(aVarC);
                wsg.n nVarB8 = dVar.f176534g.b();
                l80.e eVarH3 = dVar.f176539l.h();
                s.j(eVarH3);
                return new rqd.g(aVarA11, aVarC, nVarB8, eVarH3);
            case 13:
                l80.e eVarH4 = dVar.f176539l.h();
                s.j(eVarH4);
                return new ipd.b(eVarH4);
            case 14:
                return new cnd.a();
            case 15:
                q8b.a aVar18 = dVar.f176528a0;
                djf.c cVar7 = dVar.f176530b0;
                n8b.a aVarA12 = aVar18.a();
                s.j(aVarA12);
                thf.m mVarG = cVar7.g();
                s.j(mVarG);
                thf.d dVarD = cVar7.d();
                s.j(dVarD);
                thf.c cVarC = cVar7.c();
                s.j(cVarC);
                wsg.n nVarB9 = dVar.f176534g.b();
                tia.b bVar4 = (tia.b) dVar.c0.f.get();
                s.j(bVar4);
                t0 t0Var = new t0(bVar4);
                g6e.b bVarA3 = dVar.u.a();
                s.j(bVarA3);
                je6.h hVarC = ((xf6.t) dVar.J).c();
                s.j(hVarC);
                cm4.a aVarI = dVar.N.f175963a.i();
                m93.d dVarF = dVar.f176532d0.f();
                s.j(dVarF);
                gte.a aVarB13 = dVar.f176529b.b();
                s.j(aVarB13);
                return new fnd.d(aVarA12, mVarG, dVarD, cVarC, nVarB9, t0Var, bVarA3, hVarC, aVarI, dVarF, aVarB13);
            case 16:
                return new cnd.b();
            case 17:
                return new omd.c((sri.m) dVar.H0.get());
            case 18:
                return jge.r.q(dVar.f176538k0);
            case 19:
                e eVar7 = dVar.H0;
                izi.a aVar19 = dVar.f176537j;
                sri.m mVar = (sri.m) eVar7.get();
                f0j.a aVar20 = (f0j.a) ((dqj.r) aVar19).f117026n0.get();
                s.j(aVar20);
                j0j.a aVarH = ((dqj.r) aVar19).h();
                s.j(aVarH);
                return new gnd.e(mVar, aVar20, aVarH);
            case 20:
                return new omd.g((sri.m) dVar.H0.get());
            case 21:
                r0 r0VarC4 = dVar.f176545q.c();
                wsg.n nVarB10 = dVar.f176534g.b();
                hj8.a aVarA13 = dVar.l0.a();
                s.j(aVarA13);
                n nVarS = dVar.M.s();
                s.j(nVarS);
                return new ptd.b(r0VarC4, nVarB10, aVarA13, nVarS);
            case 22:
                return new end.a();
            case 23:
                je0.d dVarD2 = dVar.f176531c.d();
                s.j(dVarD2);
                f fVarF2 = dVar.f176531c.f();
                s.j(fVarF2);
                return jge.r.w(dVarD2, fVarF2);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object aVar;
        Object cVar2;
        Object aVar2;
        Object z0Var;
        Object cVar3;
        Object fVar;
        switch (this.f160173a) {
            case 0:
                b bVar = (b) this.f160175c;
                h9h.a aVar3 = bVar.f160177b;
                yah.a aVar4 = bVar.f160176a;
                int i = this.f160174b;
                if (i == 0) {
                    f1h.c cVarA = aVar4.a();
                    s.j(cVarA);
                    hbh.o oVar = (hbh.o) bVar.d.get();
                    h1h.d dVar = (h1h.d) bVar.e.get();
                    ugc.a aVarB = aVar4.b();
                    y2f.a aVarB2 = bVar.f160178c.b();
                    s.j(aVarB2);
                    return new hbh.j(cVarA, oVar, dVar, aVarB, aVarB2);
                }
                if (i == 1) {
                    x8h.q qVarA = aVar3.A();
                    tzg.m mVarT = aVar3.t();
                    s.j(mVarT);
                    return new hbh.o(qVarA, mVarT);
                }
                if (i != 2) {
                    throw new AssertionError(i);
                }
                f1h.e eVar = (f1h.e) aVar4.f312023c.get();
                s.j(eVar);
                return new hbh.m(eVar);
            case 1:
                ige.c cVar4 = (ige.c) this.f160175c;
                int i2 = this.f160174b;
                switch (i2) {
                    case 0:
                        cVar = new f49.c(cVar4.f161167a, cVar4.f161168b, cVar4.G, cVar4.f161182x, cVar4.f161183y, cVar4.I, cVar4.A);
                        break;
                    case 1:
                        ige.a aVar5 = (ige.a) ((jge.f) cVar4.F.get()).b();
                        s.k(aVar5);
                        return aVar5;
                    case 2:
                        cVar = new jge.f(cVar4.f161169c, cVar4.d, cVar4.A, cVar4.C, cVar4.E, cVar4.f161180t, cVar4.u, cVar4.v, cVar4.f161171h, cVar4.f161181w);
                        break;
                    case 3:
                        return hy1.g.C((nge.e) cVar4.z.get());
                    case 4:
                        return nga.c.g(cVar4.e, cVar4.f, cVar4.f161170g, cVar4.f161171h);
                    case 5:
                        return hy1.g.A((rhe.a) cVar4.B.get());
                    case 6:
                        return rga.l.h(cVar4.i, cVar4.f161172j, cVar4.k, cVar4.f161173l, cVar4.f161174m, cVar4.f161175n, cVar4.o, cVar4.f161176p, cVar4.f161177q, cVar4.f161178r, cVar4.f161179s);
                    case 7:
                        return hy1.g.D((jge.q) cVar4.D.get());
                    case 8:
                        return iz8.c.e(cVar4.e);
                    case 9:
                        return ige.d.C((jge.s) cVar4.H.get());
                    case 10:
                        return jge.t.a();
                    case 11:
                        return iz8.c.d(cVar4.f);
                    case 12:
                        return jge.r.a(cVar4.L);
                    case 13:
                        return hy1.g.z((jge.c) cVar4.K.get());
                    default:
                        throw new AssertionError(i2);
                }
                return cVar;
            case 2:
                ika.e eVar2 = (ika.e) this.f160175c;
                nj0.a aVar6 = eVar2.f161933b;
                int i3 = this.f160174b;
                if (i3 == 0) {
                    l80.e eVarH = eVar2.f161932a.h();
                    s.j(eVarH);
                    ne0.j jVar = (ne0.j) eVar2.e.get();
                    ProductArticleConfigService productArticleConfigService = (ProductArticleConfigService) eVar2.f161935g.get();
                    mk0.a aVarA = eVar2.f161934c.a();
                    s.j(aVarA);
                    return new jka.a(eVarH, jVar, productArticleConfigService, aVarA);
                }
                if (i3 == 1) {
                    return new ne0.d();
                }
                if (i3 == 2) {
                    return ige.d.t((Retrofit) eVar2.f.get());
                }
                if (i3 == 3) {
                    ik0.b bVarM = ((nj0.d) aVar6).m();
                    s.j(bVarM);
                    return ige.d.s(bVarM, fe0.d.a());
                }
                if (i3 != 4) {
                    throw new AssertionError(i3);
                }
                ik0.b bVarM2 = ((nj0.d) aVar6).m();
                s.j(bVarM2);
                return ige.d.u(bVarM2, fe0.d.a(), eVar2.d);
            case 3:
                imd.a aVar7 = (imd.a) this.f160175c;
                a31.a aVar8 = aVar7.f0;
                a31.a aVar9 = aVar7.f162366p;
                a31.a aVar10 = aVar7.N;
                a31.a aVar11 = aVar7.f162374y;
                a31.a aVar12 = aVar7.z;
                a31.a aVar13 = aVar7.P;
                a31.a aVar14 = aVar7.I;
                a31.a aVar15 = aVar7.J;
                a31.a aVar16 = aVar7.F;
                a31.a aVar17 = aVar7.D;
                a31.a aVar18 = aVar7.u;
                a31.a aVar19 = aVar7.v;
                a31.a aVar20 = aVar7.L;
                a31.a aVar21 = aVar7.e;
                a31.a aVar22 = aVar7.f162356g;
                a31.a aVar23 = aVar7.f162358h0;
                a31.a aVar24 = aVar7.i0;
                a31.a aVar25 = aVar7.j0;
                a31.a aVar26 = aVar7.M;
                a31.a aVar27 = aVar7.f162355e0;
                a31.a aVar28 = aVar7.f162354d0;
                a31.a aVar29 = aVar7.f162353c;
                int i5 = this.f160174b;
                if (i5 == 0) {
                    return new jmd.f(aVar7.f162349a, aVar7.f162351b, aVar29, aVar7.d, aVar21, aVar7.f, aVar22, aVar7.f162357h, aVar7.i, aVar7.f162359j, aVar7.k, aVar7.f162361l, aVar7.f162362m, aVar7.f162363n, aVar7.o, aVar9, aVar7.f162367q, aVar7.f162368r, aVar7.f162370s, aVar7.f162371t, aVar18, aVar19, aVar7.f162372w, aVar7.f162373x, aVar11, aVar12, aVar7.A, aVar7.B, aVar7.C, aVar17, aVar7.E, aVar16, aVar7.G, aVar7.H, aVar14, aVar15, aVar7.K, aVar20, aVar26, aVar10, aVar7.O, aVar13, aVar7.Q, aVar7.R, aVar7.S, aVar7.T, aVar7.U, aVar7.V, aVar7.W, aVar7.X, aVar7.Y, aVar7.Z, aVar7.f162350a0, aVar7.f162352b0, aVar7.c0, aVar28, aVar27, aVar8, aVar7.g0, aVar23, aVar24, aVar25, aVar7.f162360k0, aVar7.l0, aVar7.m0, aVar7.f162364n0, aVar7.f162365o0, aVar7.p0);
                }
                if (i5 == 1) {
                    return jge.r.c(aVar29, aVar28, aVar27, aVar26, aVar25, aVar24, aVar23, aVar22, aVar21, aVar20, aVar19, aVar18, aVar17, aVar16, aVar15, aVar14, aVar13, aVar12, aVar11, aVar10, aVar9, aVar8, aVar7.g0);
                }
                throw new AssertionError(i5);
            case 4:
                ine.o oVar2 = (ine.o) this.f160175c;
                ee0.a aVar30 = oVar2.f162880b;
                int i6 = this.f160174b;
                switch (i6) {
                    case 0:
                        aVar = new hoe.a((joe.b) oVar2.f162888p.get());
                        break;
                    case 1:
                        aVar = new joe.o((TaxResidencyService) oVar2.f162886m.get(), (ne0.j) oVar2.f162887n.get(), (ue0.c) oVar2.o.get());
                        break;
                    case 2:
                        return ine.c0.a(((nj0.d) oVar2.f162879a).f());
                    case 3:
                        return new ne0.d();
                    case 4:
                        je0.d dVarB = aVar30.b();
                        s.j(dVarB);
                        yk0.a aVarB3 = oVar2.f162881c.b();
                        s.j(aVarB3);
                        f fVarF = aVar30.f();
                        s.j(fVarF);
                        return ine.b0.a(dVarB, fVarF, aVarB3);
                    case 5:
                        return new fne.b();
                    case 6:
                        return new dpe.a();
                    default:
                        throw new AssertionError(i6);
                }
                return aVar;
            case 5:
                iq.b bVar2 = (iq.b) this.f160175c;
                ee0.a aVar31 = bVar2.f167771a;
                rg0.e eVar3 = bVar2.f167773c;
                Context context = bVar2.d;
                an0.c cVar5 = bVar2.f167772b;
                int i21 = this.f160174b;
                if (i21 == 0) {
                    e eVar4 = bVar2.f167778m;
                    zm0.c cVarJ = cVar5.j();
                    s.j(cVarJ);
                    return new kq.h(eVar4, cVarJ);
                }
                if (i21 == 1) {
                    je0.d dVarB2 = aVar31.b();
                    s.j(dVarB2);
                    yk0.a aVarB4 = cVar5.b();
                    s.j(aVarB4);
                    f fVarF2 = aVar31.f();
                    s.j(fVarF2);
                    return ige.d.z(dVarB2, fVarF2, aVarB4);
                }
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new AssertionError(i21);
                    }
                    zm0.c cVarJ2 = cVar5.j();
                    s.j(cVarJ2);
                    mt8.d dVarB3 = bVar2.f167775h.b();
                    s.j(dVarB3);
                    return new jq.g(cVarJ2, dVarB3);
                }
                CoroutineScope coroutineScopeA = eVar3.a();
                s.j(coroutineScopeA);
                iq.e eVar5 = iq.f.Companion;
                eVar5.getClass();
                e.a aVar32 = h80.e.f149935b;
                s.k(aVar32);
                eVar5.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                WorkManager companion = WorkManager.INSTANCE.getInstance(context);
                s.k(companion);
                ho.t tVarC = bVar2.e.c();
                s.j(tVarC);
                Intrinsics.checkNotNullParameter(context, "context");
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                Intrinsics.checkNotNullExpressionValue(appWidgetManager, "getInstance(...)");
                s.k(appWidgetManager);
                yf.c cVar6 = new yf.c(context, 9);
                zm0.c cVarJ3 = cVar5.j();
                s.j(cVarJ3);
                n80.b bVar3 = new n80.b();
                d0 d0VarA = ((oad.d) bVar2.f).a();
                hn0.n nVarH = cVar5.h();
                s.j(nVarH);
                df0.b bVarA = bVar2.f167774g.a();
                s.j(bVarA);
                kq.h hVar = (kq.h) bVar2.f167779n.get();
                zm0.c cVarJ4 = cVar5.j();
                s.j(cVarJ4);
                CoroutineScope coroutineScopeA2 = eVar3.a();
                s.j(coroutineScopeA2);
                return new gq.i(coroutineScopeA, context, aVar32, companion, tVarC, appWidgetManager, cVar6, cVarJ3, bVar3, new gq.e(d0VarA, nVarH, bVarA, hVar, cVarJ4, coroutineScopeA2));
            case 6:
                ite.a aVar33 = (ite.a) this.f160175c;
                ee0.a aVar34 = aVar33.f168368c;
                o81.a aVar35 = aVar33.f168366a;
                int i22 = this.f160174b;
                switch (i22) {
                    case 0:
                        m81.a aVar36 = (m81.a) aVar35.f222899h.get();
                        s.j(aVar36);
                        lte.c cVar7 = (lte.c) aVar33.f168370h.get();
                        jte.e eVar6 = new jte.e();
                        e4m.e eVar7 = aVar33.f168371j;
                        a aVar37 = aVar33.k;
                        mte.a aVar38 = new mte.a();
                        CoroutineScope coroutineScopeA3 = aVar33.e.a();
                        s.j(coroutineScopeA3);
                        return new jte.d(aVar36, cVar7, eVar6, eVar7, aVar37, new h30.q(aVar38, coroutineScopeA3, (lte.b) aVar33.f168372l.get()));
                    case 1:
                        ih0.b remoteConfig = aVar33.f168367b.f();
                        s.j(remoteConfig);
                        ite.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
                        cVar2 = new lte.c(yhm.j.b(new ite.d(remoteConfig, 0)));
                        break;
                    case 2:
                        ue0.c storage = (ue0.c) aVar33.i.get();
                        ite.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(storage, "storage");
                        cVar2 = new lte.d(storage);
                        break;
                    case 3:
                        je0.d mapper = aVar34.b();
                        s.j(mapper);
                        f storageFactory = aVar34.f();
                        s.j(storageFactory);
                        ite.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return f.e(storageFactory, "TOGGLES_FILE", mapper, 12);
                    case 4:
                        mk0.a aVarA2 = aVar33.d.a();
                        s.j(aVarA2);
                        return aVarA2;
                    case 5:
                        fte.a aVar39 = aVar33.f;
                        z70.a aVarF = aVar33.f168369g.f();
                        s.j(aVarF);
                        cVar2 = new lte.b(aVar39, aVarF);
                        break;
                    case 6:
                        m81.a aVar40 = (m81.a) aVar35.f222899h.get();
                        s.j(aVar40);
                        cVar2 = new jte.c(aVar40, (lte.c) aVar33.f168370h.get(), (lte.d) aVar33.f168371j.get());
                        break;
                    case 7:
                        ite.g.a();
                        return kte.a.f189526a;
                    default:
                        throw new AssertionError(i22);
                }
                return cVar2;
            case 7:
                iwb.r rVar = (iwb.r) this.f160175c;
                int i32 = this.f160174b;
                switch (i32) {
                    case 0:
                        gte.a aVarB5 = rVar.f169061a.b();
                        s.j(aVarB5);
                        eub.a aVarA3 = rVar.f169062b.a();
                        s.j(aVarA3);
                        return new jwb.c(aVarA3, aVarB5, rVar.f169063c.a());
                    case 1:
                        bwb.e eVar8 = (bwb.e) rVar.f169070p.get();
                        zk0.b bVarL = rVar.f169065h.l();
                        s.j(bVarL);
                        return new jwb.e(eVar8, bVarL);
                    case 2:
                        return new bwb.p((RevPointsGiftcardsService) rVar.f169067l.get(), (ne0.j) rVar.f169068m.get(), (ue0.c) rVar.o.get());
                    case 3:
                        return ige.d.v(rVar.d, (Retrofit) rVar.k.get());
                    case 4:
                        return ige.d.k(rVar.d, ((nj0.d) rVar.e).f(), (o) rVar.f169066j.get());
                    case 5:
                        iwb.x xVar = rVar.d;
                        o oVarA = fe0.c.a();
                        ige.d.j(xVar, oVarA);
                        return oVarA;
                    case 6:
                        return iwb.w.a();
                    case 7:
                        je0.d dVar2 = (je0.d) rVar.f169069n.get();
                        yk0.a aVarB6 = rVar.f169064g.b();
                        s.j(aVarB6);
                        f fVarF3 = rVar.f.f();
                        s.j(fVarF3);
                        return ige.d.w(dVar2, fVarF3, aVarB6);
                    case 8:
                        o oVar3 = (o) rVar.f169066j.get();
                        le0.b bVarC = rVar.f.c();
                        s.j(bVarC);
                        return ige.d.r(oVar3, bVarC);
                    case 9:
                        return new jwb.a((cwb.a) rVar.f169072r.get());
                    case 10:
                        return new cwb.c((ne0.j) rVar.f169068m.get(), (ue0.c) rVar.o.get());
                    case 11:
                        bwb.e eVar9 = (bwb.e) rVar.f169070p.get();
                        lwb.a aVar41 = new lwb.a();
                        svb.a aVar42 = (svb.a) rVar.i.get();
                        eub.i iVarE = rVar.f169062b.e();
                        s.j(iVarE);
                        gte.a aVarB7 = rVar.f169061a.b();
                        s.j(aVarB7);
                        return new lwb.b(eVar9, aVar41, aVar42, iVarE, aVarB7);
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                ixa.a aVar43 = (ixa.a) this.f160175c;
                a31.a aVar44 = aVar43.d;
                a31.a aVar45 = aVar43.f169526g;
                a31.a aVar46 = aVar43.f169524b;
                a31.a aVar47 = aVar43.f169525c;
                a31.a aVar48 = aVar43.f169523a;
                int i33 = this.f160174b;
                if (i33 == 0) {
                    return ka1.c.b(aVar48, aVar46, aVar47, aVar44, aVar43.e);
                }
                if (i33 == 1) {
                    return kxa.j.e(aVar43.f, aVar44);
                }
                if (i33 == 2) {
                    return jr9.h.b(aVar45, aVar43.f169527h, aVar43.i);
                }
                if (i33 == 3) {
                    return kxa.j.f(aVar45, aVar43.f169528j, aVar48, aVar43.k, aVar43.f169529l, aVar43.f169530m, aVar43.f169531n, aVar46, aVar47, aVar43.o, aVar43.f169532p, aVar43.f169536t);
                }
                if (i33 == 4) {
                    return ige.d.A((jxa.m) aVar43.f169535s.get());
                }
                if (i33 == 5) {
                    return ka1.c.a(aVar48, aVar47, aVar46);
                }
                throw new AssertionError(i33);
            case 9:
                iyc.a aVar49 = (iyc.a) this.f160175c;
                int i43 = this.f160174b;
                if (i43 == 0) {
                    return new jyc.q(aVar49.f169642a, aVar49.f169643b, aVar49.f169644c, aVar49.d, aVar49.e, aVar49.f, aVar49.f169645g);
                }
                if (i43 == 1) {
                    return ige.d.B((jyc.q) aVar49.f169646h.get());
                }
                throw new AssertionError(i43);
            case 10:
                iza.a aVar50 = (iza.a) this.f160175c;
                int i59 = this.f160174b;
                if (i59 == 0) {
                    return new jza.c(aVar50.f169861m, 0);
                }
                if (i59 != 1) {
                    if (i59 == 2) {
                        return new jza.g(aVar50.f169856c, aVar50.d, aVar50.e, aVar50.f, aVar50.f169857g, aVar50.f169858h, aVar50.i, aVar50.f169854a, aVar50.f169855b);
                    }
                    throw new AssertionError(i59);
                }
                jza.f fVar2 = (jza.f) ((jza.g) aVar50.f169860l.get()).b();
                s.k(fVar2);
                return fVar2;
            case 11:
                j1a.m mVar = (j1a.m) this.f160175c;
                a31.a aVar51 = mVar.f170338p;
                a31.a aVar52 = mVar.f170335l;
                a31.a aVar53 = mVar.f;
                q qVar = mVar.f170329a;
                int i66 = this.f160174b;
                if (i66 == 0) {
                    return new j1a.o(qVar, mVar.f170330b, mVar.f170331c, mVar.d, mVar.e, aVar53, mVar.f170332g, mVar.f170333h, mVar.i, mVar.f170334j, mVar.k, aVar52, mVar.f170336m, mVar.f170337n, mVar.o, aVar51, mVar.f170340r);
                }
                if (i66 == 1) {
                    return iz8.c.D((j1a.n) mVar.f170339q.get());
                }
                if (i66 == 2) {
                    return new j1a.n(aVar53, aVar52, aVar51, qVar);
                }
                throw new AssertionError(i66);
            case 12:
                j4i.a aVar54 = (j4i.a) this.f160175c;
                ee0.a aVar55 = aVar54.f171401c;
                j4i.e eVar10 = aVar54.f171399a;
                int i74 = this.f160174b;
                if (i74 == 0) {
                    OrderQuoteService orderQuoteService = (OrderQuoteService) aVar54.f171405l.get();
                    ne0.j jVar2 = (ne0.j) aVar54.f171406m.get();
                    l4i.a aVar56 = new l4i.a();
                    ue0.c cVar8 = (ue0.c) aVar54.f171407n.get();
                    lfm.c cVarB = ((g8b.a) aVar54.e).b();
                    s.j(cVarB);
                    return new i4i.g(orderQuoteService, jVar2, aVar56, cVar8, cVarB);
                }
                if (i74 == 1) {
                    return iz8.c.C(eVar10, (Retrofit) aVar54.k.get());
                }
                if (i74 == 2) {
                    return iz8.c.n(eVar10, ((nj0.d) aVar54.f171400b).f(), (o) aVar54.f171404j.get());
                }
                if (i74 == 3) {
                    return iz8.c.m(eVar10);
                }
                if (i74 == 4) {
                    return new ne0.d();
                }
                if (i74 != 5) {
                    throw new AssertionError(i74);
                }
                je0.d dVarB4 = aVar55.b();
                s.j(dVarB4);
                yk0.a aVarB8 = aVar54.d.b();
                s.j(aVarB8);
                f fVarF4 = aVar55.f();
                s.j(fVarF4);
                return iz8.c.w(dVarB4, fVarF4, aVarB8);
            case 13:
                j67.a aVar57 = (j67.a) this.f160175c;
                ee0.a aVar58 = aVar57.f171675c;
                int i92 = this.f160174b;
                if (i92 == 0) {
                    aVar2 = new k67.a((m67.e) aVar57.f171677h.get());
                } else {
                    if (i92 != 1) {
                        if (i92 == 2) {
                            return iz8.c.p(aVar57.f171673a, ((nj0.d) aVar57.f171674b).f());
                        }
                        if (i92 == 3) {
                            return new ne0.d();
                        }
                        if (i92 != 4) {
                            throw new AssertionError(i92);
                        }
                        je0.d dVarB5 = aVar58.b();
                        s.j(dVarB5);
                        yk0.a aVarB9 = aVar57.d.b();
                        s.j(aVarB9);
                        f fVarF5 = aVar58.f();
                        s.j(fVarF5);
                        return iz8.c.q(dVarB5, fVarF5, aVarB9);
                    }
                    aVar2 = new m67.e((GamblingBlockService) aVar57.e.get(), (ne0.j) aVar57.f.get(), (ue0.c) aVar57.f171676g.get());
                }
                return aVar2;
            case 14:
                int i96 = this.f160174b;
                if (i96 == 0) {
                    jde.a aVar59 = (jde.a) this.f160175c;
                    return new kde.c(aVar59.f173045a, aVar59.f173046b, aVar59.f173047c, aVar59.d, aVar59.e, aVar59.f, aVar59.f173048g, aVar59.f173049h, aVar59.i, aVar59.f173050j, aVar59.k, aVar59.f173051l, aVar59.f173052m, aVar59.f173053n, aVar59.o, aVar59.f173054p, aVar59.f173055q, aVar59.f173056r, 0);
                }
                if (i96 == 1) {
                    return rde.l.a();
                }
                throw new AssertionError(i96);
            case 15:
                jdi.o oVar4 = (jdi.o) this.f160175c;
                zxb.e eVar11 = oVar4.f173130c;
                ta7.a aVar60 = oVar4.f173129b;
                ite.a aVar61 = oVar4.f173131g;
                zxb.k0 k0Var = oVar4.f;
                jdi.m mVar2 = oVar4.f173128a;
                int i99 = this.f160174b;
                if (i99 == 0) {
                    ldi.f fVarA = mVar2.a();
                    s.j(fVarA);
                    tdi.g gVar = new tdi.g(aVar60.c());
                    tdi.d dVar3 = new tdi.d();
                    tdi.c cVar9 = new tdi.c(new f0c.d(y0.w(eVar11.f326121c)));
                    oqk.b bVar4 = (oqk.b) oVar4.d.A.get();
                    s.j(bVar4);
                    nhf.a aVarA4 = oVar4.e.a();
                    s.j(aVarA4);
                    fub.k kVarD = eVar11.d();
                    s.j(kVarD);
                    k kVarC = k0Var.c();
                    s.j(kVarC);
                    tdi.e eVar12 = new tdi.e();
                    gte.a aVarB10 = aVar61.b();
                    s.j(aVarB10);
                    ldi.a aVar62 = (ldi.a) mVar2.f173122n.get();
                    s.j(aVar62);
                    return new sdi.q(fVarA, gVar, dVar3, cVar9, bVar4, aVarA4, kVarD, kVarC, eVar12, aVarB10, aVar62);
                }
                if (i99 == 1) {
                    kdi.b bVar5 = (kdi.b) oVar4.f173133j.get();
                    tdi.h hVar2 = (tdi.h) oVar4.k.get();
                    q06.l lVarA = oVar4.f173132h.a();
                    s.j(lVarA);
                    return new sdi.i(bVar5, hVar2, lVarA, (edi.a) oVar4.f173134l.get(), aVar60.b());
                }
                if (i99 == 2) {
                    ldi.f fVarA2 = mVar2.a();
                    s.j(fVarA2);
                    return new kdi.c(fVarA2);
                }
                if (i99 == 3) {
                    return new tdi.i();
                }
                if (i99 == 4) {
                    eub.i iVarE2 = k0Var.e();
                    s.j(iVarE2);
                    return new ndi.b(iVarE2);
                }
                if (i99 != 5) {
                    throw new AssertionError(i99);
                }
                ldi.f fVarA3 = mVar2.a();
                s.j(fVarA3);
                tdi.a aVar63 = new tdi.a();
                eub.a aVarA5 = k0Var.a();
                s.j(aVarA5);
                ldi.d dVar4 = (ldi.d) mVar2.o.get();
                s.j(dVar4);
                gte.a aVarB11 = aVar61.b();
                s.j(aVarB11);
                return new sdi.d(fVarA3, aVar63, aVarA5, dVar4, aVarB11);
            case 16:
                jfe.a aVar64 = (jfe.a) this.f160175c;
                a31.a aVar65 = aVar64.e;
                int i100 = this.f160174b;
                if (i100 == 0) {
                    return new fy9.c(aVar64.f173866a, aVar64.f173867b, aVar64.f173868c, aVar64.d, aVar65, 7);
                }
                if (i100 == 1) {
                    return m4d.e.a(aVar65);
                }
                throw new AssertionError(i100);
            case 17:
                jge.j jVar3 = (jge.j) this.f160175c;
                ige.a aVar66 = jVar3.e;
                int i101 = this.f160174b;
                if (i101 != 0) {
                    if (i101 != 1) {
                        if (i101 == 2) {
                            return new jhe.d();
                        }
                        throw new AssertionError(i101);
                    }
                    qhe.b bVarF = ((jge.m) aVar66).f();
                    s.j(bVarF);
                    return new bge.a(bVarF);
                }
                bge.b bVarA2 = jVar3.f174008a.a();
                tla.e eVarA = jVar3.f174009b.a();
                s.j(eVarA);
                n63.h hVar3 = (n63.h) jVar3.f174010c.f319904a.get();
                s.j(hVar3);
                j30.d dVarU = ((h30.n) jVar3.d).u();
                s.j(dVarU);
                qge.b bVarB = ((jge.m) aVar66).b();
                gte.a aVarB12 = jVar3.f.b();
                s.j(aVarB12);
                return new bge.e(bVarA2, eVarA, hVar3, dVarU, bVarB, aVarB12);
            case 18:
                jge.n nVar = (jge.n) this.f160175c;
                int i102 = this.f160174b;
                if (i102 == 0) {
                    return efk.j.n((AccountsDatabase) nVar.d.get());
                }
                if (i102 != 1) {
                    throw new AssertionError(i102);
                }
                Context context2 = nVar.f174028a;
                yk0.a aVarB13 = nVar.f174029b.b();
                s.j(aVarB13);
                de0.a aVarA6 = ((cl0.a) nVar.f174030c).a();
                s.j(aVarA6);
                return efk.j.f(context2, aVarB13, aVarA6);
            case 19:
                jjl.a aVar67 = (jjl.a) this.f160175c;
                Context context3 = aVar67.f175009a;
                int i103 = this.f160174b;
                if (i103 == 0) {
                    pjl.d dVar5 = new pjl.d(context3);
                    pn0.b bVar6 = (pn0.b) aVar67.f175010b.f217433c.get();
                    s.j(bVar6);
                    pjl.c cVar10 = new pjl.c(context3, bVar6);
                    ekl.a aVar68 = (ekl.a) aVar67.e.get();
                    qjl.f fVar3 = (qjl.f) aVar67.f175013h.get();
                    ih0.b bVarF2 = aVar67.f175011c.f();
                    s.j(bVarF2);
                    z0Var = new z0(context3, dVar5, cVar10, aVar68, fVar3, bVarF2, new bkl.g((Json) aVar67.i.get(), 0));
                } else {
                    if (i103 == 1) {
                        return new ekl.a();
                    }
                    if (i103 != 2) {
                        if (i103 == 3) {
                            Intrinsics.checkNotNullParameter(context3, "context");
                            AccountManager accountManager = AccountManager.get(context3);
                            Intrinsics.checkNotNullExpressionValue(accountManager, "get(...)");
                            return new qjl.a(accountManager);
                        }
                        if (i103 != 4) {
                            if (i103 == 5) {
                                return w1.j(aVar67.d);
                            }
                            throw new AssertionError(i103);
                        }
                        Intrinsics.checkNotNullParameter(context3, "context");
                        AccountManager accountManager2 = AccountManager.get(context3);
                        Intrinsics.checkNotNullExpressionValue(accountManager2, "get(...)");
                        return new qjl.c(accountManager2);
                    }
                    ImmutableSet migrations = ImmutableSet.of((qjl.d) aVar67.f.get(), (qjl.d) aVar67.f175012g.get());
                    Intrinsics.checkNotNullParameter(context3, "context");
                    Intrinsics.checkNotNullParameter(migrations, "migrations");
                    z0Var = new qjl.g();
                    Intrinsics.checkNotNullExpressionValue(AccountManager.get(context3), "get(...)");
                }
                return z0Var;
            case 20:
                jk3.c cVar11 = (jk3.c) this.f160175c;
                ee0.a aVar69 = cVar11.f175058b;
                int i104 = this.f160174b;
                switch (i104) {
                    case 0:
                        fk3.b bVar7 = (fk3.b) cVar11.f175061h.get();
                        zm0.c cVarJ5 = cVar11.d.j();
                        s.j(cVarJ5);
                        cVar3 = new ik3.c(bVar7, cVarJ5);
                        break;
                    case 1:
                        ConfigurationService configurationService = (ConfigurationService) cVar11.e.get();
                        ue0.c cVar12 = (ue0.c) cVar11.f.get();
                        ne0.j jVar4 = (ne0.j) cVar11.f175060g.get();
                        ne0.j jVar5 = (ne0.j) cVar11.f175060g.get();
                        ne0.j jVar6 = (ne0.j) cVar11.f175060g.get();
                        ne0.j jVar7 = (ne0.j) cVar11.f175060g.get();
                        f7l.a aVarA7 = cVar11.f175059c.a();
                        s.j(aVarA7);
                        cVar3 = new ik3.g(configurationService, cVar12, jVar4, jVar5, jVar6, jVar7, aVarA7);
                        break;
                    case 2:
                        Retrofit retrofit = ((nj0.d) cVar11.f175057a).f();
                        jk3.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(ConfigurationService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        ConfigurationService configurationService2 = (ConfigurationService) objCreate;
                        s.k(configurationService2);
                        return configurationService2;
                    case 3:
                        je0.d dVarB6 = aVar69.b();
                        s.j(dVarB6);
                        f fVarF6 = aVar69.f();
                        s.j(fVarF6);
                        return jge.r.d(dVarB6, fVarF6);
                    case 4:
                        jk3.b.Companion.getClass();
                        return new ne0.d();
                    case 5:
                        return new mk3.a();
                    case 6:
                        return new mk3.e();
                    default:
                        throw new AssertionError(i104);
                }
                return cVar3;
            case 21:
                jk8.a aVar70 = (jk8.a) this.f160175c;
                ee0.a aVar71 = aVar70.f175123a;
                int i105 = this.f160174b;
                if (i105 != 0) {
                    if (i105 == 1) {
                        return new kk8.e();
                    }
                    if (i105 != 2) {
                        throw new AssertionError(i105);
                    }
                    z70.a aVarF2 = aVar70.f175126g.f();
                    s.j(aVarF2);
                    return jge.r.B(aVarF2);
                }
                Json jsonA = fe0.d.a();
                me0.a aVarE = aVar71.e();
                s.j(aVarE);
                fl0.a aVarT = jge.r.t(jsonA, aVarE);
                yk0.a aVarB14 = aVar70.f175124b.b();
                s.j(aVarB14);
                f fVarF7 = aVar71.f();
                s.j(fVarF7);
                return jge.r.n(aVarT, aVarB14, fVarF7);
            case 22:
                jm0.a aVar72 = (jm0.a) this.f160175c;
                l70.e eVar13 = aVar72.d;
                ee0.a aVar73 = aVar72.f175896b;
                int i106 = this.f160174b;
                switch (i106) {
                    case 0:
                        dm0.d deviceIdRepository = (dm0.d) aVar72.o.get();
                        Intrinsics.checkNotNullParameter(deviceIdRepository, "deviceIdRepository");
                        s.k(deviceIdRepository);
                        return deviceIdRepository;
                    case 1:
                        gm0.f deviceIdMigrator = (gm0.f) aVar72.f175903n.get();
                        Intrinsics.checkNotNullParameter(deviceIdMigrator, "deviceIdMigrator");
                        Map map = deviceIdMigrator.f144737b;
                        Lazy lazy = deviceIdMigrator.f144738c;
                        fVar = (dm0.d) map.get(Integer.valueOf(((Number) lazy.getValue()).intValue()));
                        if (fVar == null) {
                            throw new IllegalStateException(("device id with " + ((Number) lazy.getValue()).intValue() + " not found").toString());
                        }
                        break;
                    case 2:
                        dm0.c cVar13 = aVar72.f175895a;
                        ue0.c cVar14 = (ue0.c) aVar72.k.get();
                        LinkedHashMap linkedHashMapU = ue0.e.u(4);
                        i70.a aVar74 = (i70.a) eVar13.f192443n.get();
                        s.j(aVar74);
                        linkedHashMapU.put(0, new gm0.h(aVar74));
                        i70.a aVar75 = (i70.a) eVar13.f192443n.get();
                        s.j(aVar75);
                        linkedHashMapU.put(1, new gm0.j(aVar75, aVar72.a(), (gm0.o) aVar72.f175901l.get(), new gm0.p(aVar72.c())));
                        linkedHashMapU.put(2, aVar72.b());
                        linkedHashMapU.put(3, aVar72.b());
                        fVar = new gm0.f(cVar13, cVar14, linkedHashMapU.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapU));
                        break;
                    case 3:
                        je0.d mapper2 = aVar73.b();
                        s.j(mapper2);
                        fni.a nativeValuesProvider = aVar72.f175897c;
                        f storageFactory2 = aVar73.f();
                        s.j(storageFactory2);
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return f.g(storageFactory2, new bn0.f(nativeValuesProvider, 1), "s_general.device", mapper2, 1, f0.f322471a, false, 32);
                    case 4:
                        fVar = new gm0.o((ue0.c) aVar72.k.get());
                        break;
                    case 5:
                        Context context4 = aVar72.f;
                        Intrinsics.checkNotNullParameter(context4, "context");
                        AccountManager accountManager3 = AccountManager.get(context4);
                        Intrinsics.checkNotNullExpressionValue(accountManager3, "get(...)");
                        s.k(accountManager3);
                        return accountManager3;
                    case 6:
                        ne0.j jVar8 = (ne0.j) aVar72.f175905q.get();
                        ue0.c cVar15 = (ue0.c) aVar72.f175906r.get();
                        b70.e eVarB = eVar13.b();
                        s.j(eVarB);
                        fn0.a aVar76 = new fn0.a();
                        pn0.c cVarA2 = aVar72.f175899h.a();
                        s.j(cVarA2);
                        CoroutineScope coroutineScopeA4 = aVar72.i.a();
                        s.j(coroutineScopeA4);
                        fVar = new in0.d(jVar8, cVar15, eVarB, aVar76, cVarA2, coroutineScopeA4);
                        break;
                    case 7:
                        return new ne0.d();
                    case 8:
                        je0.d dVarB7 = aVar73.b();
                        s.j(dVarB7);
                        f fVarF8 = aVar73.f();
                        s.j(fVarF8);
                        return ige.d.x(dVarB7, fVarF8);
                    default:
                        throw new AssertionError(i106);
                }
                return fVar;
            case 23:
                return a();
            case 24:
                return b();
            case 25:
                return c();
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                jpf.a aVar77 = (jpf.a) this.f160175c;
                int i107 = this.f160174b;
                if (i107 == 0) {
                    return new irf.b((InputFilter) ((e4m.e) aVar77.f177269c).get(), new u80.o(), (w80.b) ((e4m.e) aVar77.f177268b).get());
                }
                if (i107 != 1) {
                    if (i107 == 2) {
                        return jpf.d.a();
                    }
                    throw new AssertionError(i107);
                }
                qd0.b bVarN = ((l70.e) aVar77.f177267a).n();
                s.j(bVarN);
                return jge.r.e(bVarN);
        }
    }
}
