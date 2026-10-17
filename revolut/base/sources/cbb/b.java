package cbb;

import android.content.Context;
import androidx.room.migration.Migration;
import c03.w;
import cli.n;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import com.revolut.feature.air.tip.learn.impl.data.network.LearnAirTipService;
import com.revolut.feature.apm.blik.impl.data.network.BlikService;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.onboarding.impl.esignature.data.network.ESignatureService;
import com.revolut.feature.onboarding.impl.user_migration.data.network.UserMigrationService;
import com.revolut.feature.retail.legacy.login.impl.network.AuthService;
import com.revolut.feature.shared.vaults.domain.impl.data.database.TransactionsExtraDatabase;
import com.revolut.feature.shared.vaults.domain.impl.data.database.VaultsDatabase;
import com.revolut.feature.shared.vaults.domain.impl.data.network.VaultsService;
import com.revolut.feature.transaction.workflow.impl.network.TransactionWorkflowService;
import cu1.r;
import cwi.m1;
import dmc.d0;
import dw3.a6;
import dw3.c3;
import dw3.q1;
import dw3.s3;
import dw3.x1;
import f4g.a1;
import f4g.c1;
import f4g.d1;
import g09.i;
import g94.h;
import java.util.Collection;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kxa.j;
import qw7.u;
import retrofit2.Retrofit;
import rp0.m;
import sri.o;
import udd.q;
import udd.v;
import ulm.b1;
import vc.s;
import wf6.e0;
import xf6.n1;
import xf6.r1;
import xg6.x;
import ybl.k;
import ybl.l;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22745c;

    public /* synthetic */ b(Object obj2, int i, int i2) {
        this.f22743a = i2;
        this.f22745c = obj2;
        this.f22744b = i;
    }

    private final Object a() {
        dmc.b bVar = (dmc.b) this.f22745c;
        h9h.a aVar = bVar.f115920c;
        int i = this.f22744b;
        if (i == 0) {
            Context context = bVar.f115918a;
            d0.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            return o.c(context, null, null, 14);
        }
        if (i != 1) {
            if (i == 2) {
                return new llc.b(new hkh.a(), aVar.f(), ((ika.b) bVar.f115921g).b());
            }
            throw new AssertionError(i);
        }
        k kVarD = bVar.f115919b.d();
        s.j(kVarD);
        l lVarF = aVar.f();
        gte.a aVarB = bVar.d.b();
        s.j(aVarB);
        return new com.revolut.feature.robo.impl.navigation.c(kVarD, lVarF, aVarB, bVar.e.a());
    }

    private final Object b() {
        drb.a aVar = (drb.a) this.f22745c;
        ee0.a aVar2 = aVar.f117115a;
        zse.d dVar = aVar.f117116b;
        int i = this.f22744b;
        if (i == 0) {
            je0.d objectMapper = aVar2.b();
            s.j(objectMapper);
            xe0.f storageFactory = aVar2.f();
            s.j(storageFactory);
            drb.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.e(storageFactory, "tips_binding_storage", objectMapper, 12);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        CoroutineScope coroutineScope = (CoroutineScope) dVar.d.get();
        s.j(coroutineScope);
        ate.e eVar = (ate.e) dVar.f324909g.get();
        s.j(eVar);
        bte.c shownCountBinding = new bte.c(coroutineScope, eVar);
        CoroutineScope coroutineScope2 = (CoroutineScope) dVar.d.get();
        s.j(coroutineScope2);
        ate.e eVar2 = (ate.e) dVar.f324909g.get();
        s.j(eVar2);
        brb.e eVar3 = new brb.e((ue0.c) aVar.d.get());
        i iVar = (i) ((nyj.c) aVar.f117117c).A.get();
        s.j(iVar);
        arb.g lessonsStateTipBinding = new arb.g(coroutineScope2, eVar2, eVar3, iVar);
        drb.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(shownCountBinding, "shownCountBinding");
        Intrinsics.checkNotNullParameter(lessonsStateTipBinding, "lessonsStateTipBinding");
        return new bte.b(shownCountBinding, y0.b(lessonsStateTipBinding));
    }

    private final Object c() {
        CreditPromptFlowContract$InputData creditPromptFlowContract$InputData = ((q1) this.f22745c).f119559a;
        int i = this.f22744b;
        if (i == 0) {
            return new com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a(creditPromptFlowContract$InputData);
        }
        if (i == 1) {
            return new v74.c(creditPromptFlowContract$InputData);
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        x1 x1Var = (x1) this.f22745c;
        int i = this.f22744b;
        if (i == 0) {
            return new h((n) x1Var.f120126b.get());
        }
        if (i == 1) {
            return new g94.i(x1Var.f120125a);
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        c3 c3Var = (c3) this.f22745c;
        int i = this.f22744b;
        switch (i) {
            case 0:
                return e5f.b.e((com.revolut.kompot.navigable.a) c3Var.f118497b.get(), (c84.b) c3Var.d.get(), (PluginFlowContract$Input) c3Var.e.get());
            case 1:
                return new c84.b();
            case 2:
                return j.k((j60.a) c3Var.f118500h.get());
            case 3:
                return ehe.n.s((com.revolut.kompot.navigable.a) c3Var.f118497b.get(), (m) c3Var.f118499g.get());
            case 4:
                return new m();
            case 5:
                return new db4.i(c3Var.f118496a, (j60.a) c3Var.f118500h.get(), (c84.b) c3Var.d.get(), (n) c3Var.k.get());
            case 6:
                return new db4.j();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        s3 s3Var = (s3) this.f22745c;
        int i = this.f22744b;
        if (i == 0) {
            return j.l((j60.a) s3Var.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) s3Var.f119746b.get(), (m) s3Var.f119747c.get());
        }
        if (i == 2) {
            return new m();
        }
        if (i == 3) {
            return new uc4.i((j60.a) s3Var.d.get(), s3Var.f119745a, (p) s3Var.f.get());
        }
        if (i == 4) {
            return new uc4.j();
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        int i = this.f22743a;
        int i2 = 11;
        int i3 = 6;
        int i5 = 7;
        int i6 = this.f22744b;
        Object obj2 = this.f22745c;
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                switch (i6) {
                    case 0:
                        hri.b bVar = cVar.f22746a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar2 = cVar.f22746a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        cVar.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 5:
                        return new ln.c();
                    case 6:
                        return new ym.d();
                    case 7:
                        return new mm.d();
                    case 8:
                        return new sm.e();
                    case 9:
                        return new om.c();
                    case 10:
                        Retrofit retrofit = ((nj0.d) cVar.A).f();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(AuthService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        AuthService authService = (AuthService) objCreate;
                        s.k(authService);
                        return authService;
                    case 11:
                        return new bbb.h((bbb.d) cVar.Q.get());
                    case 12:
                        return new bbb.m();
                    case 13:
                        zab.h hVar = (zab.h) cVar.Q.get();
                        xk3.a aVar = (xk3.a) cVar.D.e.get();
                        s.j(aVar);
                        ifm.b bVar3 = (ifm.b) cVar.F.get();
                        ing.b bVarA = cVar.u.a();
                        s.j(bVarA);
                        return new zab.d(hVar, aVar, bVar3, bVarA);
                    default:
                        throw new AssertionError(i6);
                }
            case 1:
                cce.b bVar4 = (cce.b) obj2;
                switch (i6) {
                    case 0:
                        hri.b bVar5 = bVar4.f23050a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar6 = bVar4.f23050a;
                        return new iri.j();
                    case 2:
                        return new bce.c();
                    case 3:
                        return new cn.e();
                    case 4:
                        return new um.c();
                    case 5:
                        bVar4.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 6:
                        return new ln.c();
                    case 7:
                        return new ym.d();
                    case 8:
                        return new mm.d();
                    case 9:
                        return new sm.e();
                    case 10:
                        return new om.c();
                    case 11:
                        return new g3l.g();
                    case 12:
                        return new s3l.f();
                    case 13:
                        bce.b bVar7 = (bce.b) bVar4.F.get();
                        qce.k kVar = (qce.k) bVar4.Q.get();
                        uc.d dVarA = bVar4.d.a();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar4.e).c();
                        s.j(aVarC);
                        nhf.a aVarA = bVar4.f.a();
                        s.j(aVarA);
                        o71.a aVarA2 = ((c21.b) bVar4.f23053g).a();
                        s71.c cVar2 = new s71.c();
                        i9e.c cVar3 = (i9e.c) bVar4.f23054h.f303681y.get();
                        s.j(cVar3);
                        gVar = new bce.g(bVar7, kVar, dVarA, aVarC, aVarA, aVarA2, cVar2, new o7.d(cVar3), bVar4.i.c(), ((rb8.a) bVar4.f23052c).a());
                        break;
                    case 14:
                        return new sce.g();
                    case 15:
                        sce.e eVar = (sce.e) bVar4.S.get();
                        d3j.b bVarE = ((b3j.p) bVar4.o).e();
                        cl3.a aVarD = bVar4.f23059p.d();
                        s.j(aVarD);
                        ppg.b bVarB = ((wpg.l) bVar4.f23060q).b();
                        s.j(bVarB);
                        qce.k kVar2 = (qce.k) bVar4.Q.get();
                        ur2.c cVarA = bVar4.f23061r.a();
                        s.j(cVarA);
                        co9.b bVarB2 = bVar4.f23062s.b();
                        s.j(bVarB2);
                        gVar = new sce.f(eVar, bVarE, aVarD, bVarB, kVar2, cVarA, bVarB2);
                        break;
                    case 16:
                        t tVar = new t((cn.e) bVar4.G.get(), (ym.d) bVar4.K.get(), (um.c) bVar4.H.get(), (ifm.b) bVar4.D.get());
                        xua.a aVarA3 = bVar4.f23055j.a();
                        s.j(aVarA3);
                        ryc.a aVarC2 = bVar4.k.c();
                        vz1.g gVarH = ((lz1.m) bVar4.f23056l).h();
                        s.j(gVarH);
                        sb8.a aVar2 = (sb8.a) ((rb8.a) bVar4.f23052c).f252984q.get();
                        s.j(aVar2);
                        return new sce.e(tVar, aVarA3, aVarC2, gVarH, aVar2, bVar4.f23057m.a(), ((j1a.i) bVar4.f23058n).a());
                    default:
                        throw new AssertionError(i6);
                }
                return gVar;
            case 2:
                cl0.a aVar3 = (cl0.a) obj2;
                l70.e eVar2 = aVar3.f24919b;
                Context context = aVar3.f24918a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new bl0.d();
                    }
                    if (i6 == 2) {
                        return new bl0.a(context);
                    }
                    throw new AssertionError(i6);
                }
                bl0.c cVar4 = (bl0.c) aVar3.d.get();
                zk0.b bVarL = eVar2.l();
                s.j(bVarL);
                h31.b bVar8 = (h31.b) aVar3.f24920c.f110697b.get();
                s.j(bVar8);
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                return new bl0.g(context, cVar4, bVarL, bVar8, eVarH, (bl0.a) aVar3.e.get());
            case 3:
                cu1.j jVar = (cu1.j) obj2;
                if (i6 == 0) {
                    return new xt1.d((BlikService) jVar.f108739b.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                Retrofit retrofit3 = ((nj0.d) jVar.f108738a).f();
                cu1.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate2 = retrofit3.create(BlikService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                BlikService blikService = (BlikService) objCreate2;
                s.k(blikService);
                return blikService;
            case 4:
                if (i6 == 0) {
                    return new tu1.h((n) ((r) obj2).f108777a.get());
                }
                if (i6 == 1) {
                    return new tu1.i();
                }
                throw new AssertionError(i6);
            case 5:
                if (i6 == 0) {
                    return new pu1.f((n) ((cu1.s) obj2).f108779a.get());
                }
                if (i6 == 1) {
                    return new pu1.g();
                }
                throw new AssertionError(i6);
            case 6:
                cud.a aVar4 = (cud.a) obj2;
                if (i6 == 0) {
                    return new a7d.a(aVar4.f108985a, 7);
                }
                if (i6 == 1) {
                    return new a7d.a(aVar4.f108986b, i3);
                }
                throw new AssertionError(i6);
            case 7:
                m1 m1Var = (m1) obj2;
                if (i6 == 0) {
                    return new fzi.a();
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                dwi.s sVarA = m1Var.f109748a.a();
                s.j(sVarA);
                return new gzi.d(sVarA, m1Var.f109749b.e());
            case 8:
                cx7.a aVar5 = (cx7.a) obj2;
                if (i6 == 0) {
                    return new ex7.b(aVar5.f109898b, aVar5.f109899c, aVar5.d, aVar5.e, aVar5.f, aVar5.f109900g, aVar5.f109901h, aVar5.f109897a);
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                ex7.a aVar6 = (ex7.a) ((ex7.b) aVar5.f109905n.get()).b();
                s.k(aVar6);
                return aVar6;
            case 9:
                d03.b bVar9 = (d03.b) obj2;
                switch (i6) {
                    case 0:
                        hri.b bVar10 = bVar9.f110302a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar11 = bVar9.f110302a;
                        return new iri.j();
                    case 2:
                        return new c03.n();
                    case 3:
                        return new om.c();
                    case 4:
                        return new ln.c();
                    case 5:
                        return new um.c();
                    case 6:
                        return new cn.e();
                    case 7:
                        bVar9.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 8:
                        return new ym.d();
                    case 9:
                        return new mm.d();
                    case 10:
                        return new sm.e();
                    case 11:
                        return new c03.m((ln.a) bVar9.i.get());
                    case 12:
                        l93.f fVarJ = bVar9.f110304c.j();
                        s.j(fVarJ);
                        return new w(fVarJ, (c03.b) bVar9.f110305g.get(), new t((cn.e) bVar9.k.get(), (ym.d) bVar9.f110309m.get(), (um.c) bVar9.f110307j.get(), (ifm.b) bVar9.e.get()));
                    default:
                        throw new AssertionError(i6);
                }
            case 10:
                d2h.a aVar7 = (d2h.a) obj2;
                if (i6 == 0) {
                    return new com.revolut.feature.wealth.asset.selection.impl.ui.flow.a(aVar7.f110832a, (e2h.b) aVar7.d.get(), (e2h.a) aVar7.e.get(), new f2h.k());
                }
                if (i6 == 1) {
                    g2h.b.Companion.getClass();
                    return new e2h.b();
                }
                if (i6 != 2) {
                    throw new AssertionError(i6);
                }
                g2h.b.Companion.getClass();
                return new e2h.a();
            case 11:
                d4g.a aVar8 = (d4g.a) obj2;
                if (i6 == 0) {
                    return new c1(aVar8.f111305a, aVar8.f111306b, aVar8.f111307c, aVar8.d, aVar8.f111317s, aVar8.f111309h, aVar8.i, aVar8.f111310j, aVar8.k, aVar8.f111311l, aVar8.f111312m, aVar8.f111313n, aVar8.o, aVar8.f111314p, aVar8.f111315q);
                }
                if (i6 == 1) {
                    a1 a1Var = (a1) ((d1) aVar8.f111316r.get()).b();
                    s.k(a1Var);
                    return a1Var;
                }
                if (i6 == 2) {
                    return new d1(aVar8.e, aVar8.f, aVar8.f111308g);
                }
                if (i6 == 3) {
                    return new a51.d(aVar8.f111317s, i5);
                }
                throw new AssertionError(i6);
            case 12:
                lfc.b bVar12 = ((db1.b) obj2).f112644a;
                if (i6 == 0) {
                    nfc.k kVar3 = (nfc.k) bVar12.f194852l.get();
                    s.j(kVar3);
                    return new com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.a(kVar3);
                }
                if (i6 == 1) {
                    wa1.a strings = bVar12.a();
                    s.j(strings);
                    Intrinsics.checkNotNullParameter(strings, "strings");
                    return new fb1.g();
                }
                if (i6 != 2) {
                    throw new AssertionError(i6);
                }
                wa1.a aVarA4 = bVar12.a();
                s.j(aVarA4);
                return new nb1.a(aVarA4);
            case 13:
                dd9.e eVar3 = (dd9.e) obj2;
                nj0.a aVar9 = eVar3.e;
                switch (i6) {
                    case 0:
                        return new ad9.a((sri.m) eVar3.f113137m.get());
                    case 1:
                        Context context2 = eVar3.f113130a;
                        dd9.k.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return o.c(context2, null, null, 14);
                    case 2:
                        sf0.h hVarB = eVar3.d.b();
                        s.j(hVarB);
                        return new ad9.s(hVarB, (bd9.c) eVar3.f113139p.get());
                    case 3:
                        return new bd9.c((UserMigrationService) eVar3.o.get());
                    case 4:
                        Retrofit retrofit4 = ((nj0.d) aVar9).f();
                        dd9.k.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(UserMigrationService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        UserMigrationService userMigrationService = (UserMigrationService) objCreate3;
                        s.k(userMigrationService);
                        return userMigrationService;
                    case 5:
                        return new o99.a((p99.c) eVar3.f113143t.get());
                    case 6:
                        return new p99.c((ne0.j) eVar3.f113141r.get(), (ESignatureService) eVar3.f113142s.get());
                    case 7:
                        return new ne0.d();
                    case 8:
                        return u.n(((nj0.d) aVar9).f());
                    default:
                        throw new AssertionError(i6);
                }
            case 14:
                dd9.g gVar2 = (dd9.g) obj2;
                if (i6 == 0) {
                    return new ed9.g((n) gVar2.f113148b.get());
                }
                if (i6 == 1) {
                    return new ed9.i(gVar2.f113147a);
                }
                throw new AssertionError(i6);
            case 15:
                ded.a aVar10 = (ded.a) obj2;
                int i21 = 9;
                switch (i6) {
                    case 0:
                        e4m.e eVar4 = aVar10.f113398s;
                        wpg.a aVar11 = aVar10.f;
                        qdd.a aVar12 = (qdd.a) eVar4.get();
                        b4j.g gVar3 = new b4j.g(aVar11.f.e(), 1);
                        qq8.a aVar13 = new qq8.a(aVar11.f299237g.b(), 2);
                        dqg.g gVarA = aVar11.a();
                        ypg.g gVar4 = new ypg.g(new qq8.a(aVar11.f299237g.b(), 2));
                        r38.a aVar14 = new r38.a(aVar11.f299237g.b(), 1);
                        m78.i iVar = new m78.i(aVar11.f299237g.b(), 2);
                        wsg.n nVarB = aVar11.f299237g.b();
                        com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) aVar11.f299238h).c();
                        s.j(aVarC3);
                        gte.a aVarB = aVar11.f299236c.b();
                        s.j(aVarB);
                        ypg.i iVar2 = new ypg.i(nVarB, aVarC3, aVarB);
                        wsg.n walletInteractor = aVar11.f299237g.b();
                        z71.a accountDetailsRepository = ((c21.b) aVar11.i).f();
                        s.j(accountDetailsRepository);
                        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                        Intrinsics.checkNotNullParameter(accountDetailsRepository, "accountDetailsRepository");
                        ryc.a aVar15 = new ryc.a();
                        aVar15.f258289a = walletInteractor;
                        aVar15.f258290b = accountDetailsRepository;
                        return new eed.n(aVar12, gVar3, aVar13, gVarA, gVar4, aVar14, iVar, iVar2, aVar15);
                    case 1:
                        e4m.e eVar5 = aVar10.f113391j;
                        wpg.a aVar16 = aVar10.f;
                        VaultsService vaultsService = (VaultsService) eVar5.get();
                        wdd.a aVar17 = (wdd.a) aVar10.f113392l.get();
                        sdd.a aVar18 = (sdd.a) aVar10.f113394n.get();
                        ne0.j jVar2 = (ne0.j) aVar10.o.get();
                        com.revolut.feature.shared.savings.impl.core.error.c cVar5 = (com.revolut.feature.shared.savings.impl.core.error.c) ((vbd.b) aVar16.f299234a).k.get();
                        s.j(cVar5);
                        dqg.g gVarA2 = aVar16.a();
                        gte.a aVarB2 = aVar16.f299236c.b();
                        s.j(aVarB2);
                        return new aed.o(vaultsService, aVar17, aVar18, jVar2, cVar5, gVarA2, new dqg.h(aVarB2), (ne0.j) aVar10.f113395p.get(), (ne0.j) aVar10.f113396q.get(), (ue0.c) aVar10.f113397r.get());
                    case 2:
                        Retrofit retrofit5 = (Retrofit) aVar10.i.get();
                        xdd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                        Object objCreate4 = retrofit5.create(VaultsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                        VaultsService vaultsService2 = (VaultsService) objCreate4;
                        s.k(vaultsService2);
                        return vaultsService2;
                    case 3:
                        ik0.b factory = ((nj0.d) aVar10.f113386a).m();
                        s.j(factory);
                        pdd.a sharedVaultsNetworkConfiguration = aVar10.f113387b;
                        xdd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(sharedVaultsNetworkConfiguration, "sharedVaultsNetworkConfiguration");
                        Retrofit retrofitA = ik0.b.a(factory, null, sharedVaultsNetworkConfiguration.getHostUrl(), null, null, 29);
                        s.k(retrofitA);
                        return retrofitA;
                    case 4:
                        return new wdd.a((VaultsDatabase) aVar10.k.get());
                    case 5:
                        Context context3 = aVar10.f113388c;
                        yk0.a databaseSessionProvider = aVar10.d.b();
                        s.j(databaseSessionProvider);
                        de0.a databaseEncryptionMigratorFactory = ((cl0.a) aVar10.e).a();
                        s.j(databaseEncryptionMigratorFactory);
                        xdd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        VaultsDatabase.Companion aVar19 = VaultsDatabase.INSTANCE;
                        aVar19.getClass();
                        VaultsDatabase vaultsDatabase = (VaultsDatabase) aVar19.a(context3, databaseSessionProvider, new Migration[]{udd.j.f279190c, udd.p.f279196c, q.f279197c, udd.r.f279198c, udd.s.f279199c, udd.t.f279200c, udd.u.f279201c, v.f279202c, udd.w.f279203c, udd.a.f279181c, udd.b.f279182c, udd.c.f279183c, udd.d.f279184c, udd.e.f279185c, udd.f.f279186c, udd.g.f279187c, udd.h.f279188c, udd.i.f279189c, udd.k.f279191c, udd.l.f279192c, udd.m.f279193c, udd.n.f279194c, udd.o.f279195c}, databaseEncryptionMigratorFactory);
                        s.k(vaultsDatabase);
                        return vaultsDatabase;
                    case 6:
                        TransactionsExtraDatabase database = (TransactionsExtraDatabase) aVar10.f113393m.get();
                        xdd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        sdd.a aVarG = database.g();
                        s.k(aVarG);
                        return aVarG;
                    case 7:
                        Context context4 = aVar10.f113388c;
                        yk0.a databaseSessionProvider2 = aVar10.d.b();
                        s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory2 = ((cl0.a) aVar10.e).a();
                        s.j(databaseEncryptionMigratorFactory2);
                        xdd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context4, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory2, "databaseEncryptionMigratorFactory");
                        TransactionsExtraDatabase.Companion aVar20 = TransactionsExtraDatabase.INSTANCE;
                        aVar20.getClass();
                        TransactionsExtraDatabase transactionsExtraDatabase = (TransactionsExtraDatabase) aVar20.a(context4, databaseSessionProvider2, new Migration[]{tdd.a.f269969c}, databaseEncryptionMigratorFactory2);
                        s.k(transactionsExtraDatabase);
                        return transactionsExtraDatabase;
                    case 8:
                        return new ne0.d();
                    case 9:
                        xdd.b.Companion.getClass();
                        return new ne0.d();
                    case 10:
                        xdd.b.Companion.getClass();
                        return new ne0.d();
                    case 11:
                        je0.d mapper = aVar10.f113389g.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider3 = aVar10.d.b();
                        s.j(databaseSessionProvider3);
                        xe0.f storageFactory = aVar10.f113389g.f();
                        s.j(storageFactory);
                        wpg.q.Companion.getClass();
                        xdd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        Intrinsics.checkNotNullParameter("vaults", "fileName");
                        return xe0.f.f(storageFactory, databaseSessionProvider3, "vaults", mapper, 2, zhm.u.c(new bed.a()), 32);
                    case 12:
                        wpg.a aVar21 = aVar10.f;
                        wpg.a aVar22 = aVar10.f;
                        ubd.i iVar3 = (ubd.i) ((vbd.b) aVar21.f299234a).f287507l.get();
                        s.j(iVar3);
                        mbd.b bVar13 = new mbd.b();
                        icd.a aVar23 = (icd.a) ((xbd.b) aVar10.f113390h).f304060s.get();
                        s.j(aVar23);
                        eed.d dVar = new eed.d(aVar23, new mbd.b());
                        odd.a aVar24 = (odd.a) aVar10.f113399t.get();
                        gte.a aVarB3 = aVar22.f299235b.f6617a.b();
                        s.j(aVarB3);
                        lob.a aVar25 = new lob.a(aVarB3);
                        anb.a aVar26 = aVar22.f299235b;
                        wsg.n walletInteractor2 = aVar26.f6619c.b();
                        com.revolut.domain.interactors.transactions.a transactionsInteractor = ((bjf.a) aVar26.d).c();
                        s.j(transactionsInteractor);
                        Intrinsics.checkNotNullParameter(walletInteractor2, "walletInteractor");
                        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                        return new eed.h(iVar3, bVar13, dVar, aVar24, aVar25, new nd.n(i21), new pak.h(aVar22.f299235b.f6619c.b()));
                    default:
                        throw new AssertionError(i6);
                }
            case 16:
                dfb.h hVar2 = (dfb.h) obj2;
                ila.b bVar14 = hVar2.f113861b;
                ite.a aVar27 = hVar2.f113860a;
                switch (i6) {
                    case 0:
                        return new c1g.v((efb.c) hVar2.f113862c.get());
                    case 1:
                        gte.a aVarB4 = aVar27.b();
                        s.j(aVarB4);
                        return new efb.c(aVarB4, new efb.l());
                    case 2:
                        return new c1g.v((efb.a) hVar2.e.get());
                    case 3:
                        gte.a aVarB5 = aVar27.b();
                        s.j(aVarB5);
                        return new efb.a(aVarB5, bVar14.a(), new efb.l());
                    case 4:
                        return new c1g.v((efb.j) hVar2.f113863g.get());
                    case 5:
                        gte.a aVarB6 = aVar27.b();
                        s.j(aVarB6);
                        return new efb.j(aVarB6, bVar14.a(), new efb.l());
                    case 6:
                        return new c1g.v((efb.b) hVar2.i.get());
                    case 7:
                        gte.a aVarB7 = aVar27.b();
                        s.j(aVarB7);
                        return new efb.b(aVarB7, bVar14.a(), new efb.l());
                    default:
                        throw new AssertionError(i6);
                }
            case 17:
                dg6.a aVar28 = (dg6.a) obj2;
                r1 r1Var = aVar28.f;
                n1 n1Var = aVar28.f114583b;
                je6.g gVar5 = aVar28.f114582a;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new AssertionError(i6);
                    }
                    Context context5 = aVar28.e;
                    dg6.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context5, "context");
                    return o.c(context5, null, null, 14);
                }
                pe6.a aVar29 = (pe6.a) ((xf6.t) gVar5).C0.get();
                s.j(aVar29);
                oe6.a aVarA5 = n1Var.a();
                s.j(aVarA5);
                oe6.a aVarA6 = n1Var.a();
                s.j(aVarA6);
                ug6.e eVar6 = new ug6.e(aVarA6, new i90.b());
                gte.a aVarB8 = aVar28.f114584c.b();
                s.j(aVarB8);
                rh6.b bVar15 = (rh6.b) n1Var.f304965l.get();
                s.j(bVar15);
                wj0.a aVarI = ((nj0.d) aVar28.d).i();
                s.j(aVarI);
                e0 e0VarH = ((xf6.t) gVar5).h();
                sri.m mVar = (sri.m) aVar28.f114586h.get();
                qg6.f fVar = (qg6.f) ((xf6.t) gVar5).F0.get();
                s.j(fVar);
                x xVarA = r1Var.a();
                s.j(xVarA);
                je6.e eVar7 = (je6.e) r1Var.z.get();
                s.j(eVar7);
                u51.a aVarA7 = aVar28.f114585g.a();
                s.j(aVarA7);
                return new ug6.f(aVar29, aVarA5, eVar6, aVarB8, bVar15, aVarI, e0VarH, mVar, fVar, xVarA, eVar7, aVarA7);
            case 18:
                dgf.a aVar30 = (dgf.a) obj2;
                if (i6 == 0) {
                    return new cgf.b((egf.c) aVar30.d.get(), (sri.m) aVar30.e.get());
                }
                if (i6 == 1) {
                    return new egf.c(fe0.d.a(), (TransactionWorkflowService) aVar30.f114654c.get());
                }
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new AssertionError(i6);
                    }
                    Context context6 = aVar30.f114653b;
                    dgf.e.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context6, "context");
                    return o.c(context6, null, null, 14);
                }
                Retrofit retrofit6 = ((nj0.d) aVar30.f114652a).f();
                dgf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                Object objCreate5 = retrofit6.create(TransactionWorkflowService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate5, "create(...)");
                TransactionWorkflowService transactionWorkflowService = (TransactionWorkflowService) objCreate5;
                s.k(transactionWorkflowService);
                return transactionWorkflowService;
            case 19:
                did.q qVar = (did.q) obj2;
                if (i6 == 0) {
                    return new jid.q(qVar.b(), 0);
                }
                if (i6 == 1) {
                    return new jid.q(qVar.b(), 1);
                }
                throw new AssertionError(i6);
            case 20:
                dj5.e eVar8 = (dj5.e) obj2;
                switch (i6) {
                    case 0:
                        return new cj5.a();
                    case 1:
                        zi5.b bVar16 = (zi5.b) eVar8.e.get();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(15);
                        builderBuilderWithExpectedSize.put("BITCOIN", eVar8.f.get());
                        builderBuilderWithExpectedSize.put("BITCOINCASH", eVar8.f115103g.get());
                        builderBuilderWithExpectedSize.put("CARDANO", eVar8.f115104h.get());
                        builderBuilderWithExpectedSize.put("DOGECOIN", eVar8.i.get());
                        builderBuilderWithExpectedSize.put("ETHEREUM", eVar8.f115105j.get());
                        builderBuilderWithExpectedSize.put("AVALANCHE", eVar8.k.get());
                        builderBuilderWithExpectedSize.put("ARBITRUM", eVar8.f115106l.get());
                        builderBuilderWithExpectedSize.put("ALGORAND", eVar8.f115107m.get());
                        builderBuilderWithExpectedSize.put("TEZOS", eVar8.f115108n.get());
                        builderBuilderWithExpectedSize.put("LITECOIN", eVar8.o.get());
                        builderBuilderWithExpectedSize.put("POLKADOT", eVar8.f115109p.get());
                        builderBuilderWithExpectedSize.put("STELLAR", eVar8.f115110q.get());
                        builderBuilderWithExpectedSize.put("SOLANA", eVar8.f115111r.get());
                        builderBuilderWithExpectedSize.put("TRON", eVar8.f115112s.get());
                        builderBuilderWithExpectedSize.put("RIPPLE", eVar8.f115113t.get());
                        return new aj5.a(bVar16, builderBuilderWithExpectedSize.build());
                    case 2:
                        return new ej5.e();
                    case 3:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("bitcoin"));
                    case 4:
                        dj5.d.Companion.getClass();
                        return new ej5.b(dj5.c.f115099b);
                    case 5:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("cardano"));
                    case 6:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("dogecoin"));
                    case 7:
                        dj5.d.Companion.getClass();
                        return new ej5.c();
                    case 8:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("avalanche"));
                    case 9:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("arbitrum"));
                    case 10:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("algorand"));
                    case 11:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("tezos"));
                    case 12:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("litecoin"));
                    case 13:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("polkadot"));
                    case 14:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("stellar"));
                    case 15:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("solana"));
                    case 16:
                        dj5.d.Companion.getClass();
                        return new ej5.b(zhm.u.c("tron"));
                    case 17:
                        return new ej5.d();
                    default:
                        throw new AssertionError(i6);
                }
            case 21:
                dk1.a aVar31 = (dk1.a) obj2;
                ee0.a aVar32 = aVar31.f115436c;
                switch (i6) {
                    case 0:
                        return new zj1.b();
                    case 1:
                        gte.a aVarB9 = aVar31.f115434a.b();
                        s.j(aVarB9);
                        return new ek1.a(aVarB9, (ck1.c) aVar31.f115440l.get());
                    case 2:
                        return new ck1.c((LearnAirTipService) aVar31.f115438h.get(), (ne0.j) aVar31.i.get(), (ue0.c) aVar31.k.get());
                    case 3:
                        Retrofit retrofit7 = (Retrofit) aVar31.f115437g.get();
                        dk1.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit7, "retrofit");
                        Object objCreate6 = retrofit7.create(LearnAirTipService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate6, "create(...)");
                        LearnAirTipService learnAirTipService = (LearnAirTipService) objCreate6;
                        s.k(learnAirTipService);
                        return learnAirTipService;
                    case 4:
                        ik0.b retrofitFactory = ((nj0.d) aVar31.f115435b).m();
                        s.j(retrofitFactory);
                        Json json = (Json) aVar31.f.get();
                        dk1.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(json, "json");
                        Retrofit retrofitA2 = ik0.b.a(retrofitFactory, null, null, p.a.g(b1.Companion, "application/json", json), null, 27);
                        s.k(retrofitA2);
                        return retrofitA2;
                    case 5:
                        Json baseJson = fe0.d.a();
                        dk1.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        return ue0.e.b(baseJson, new dg3.d(i2));
                    case 6:
                        return new ne0.d();
                    case 7:
                        je0.d mapper2 = (je0.d) aVar31.f115439j.get();
                        yk0.a databaseSessionProvider4 = aVar31.d.b();
                        s.j(databaseSessionProvider4);
                        xe0.f storageFactory2 = aVar32.f();
                        s.j(storageFactory2);
                        dk1.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider4, "learn_air_tips_storage", mapper2, 0, null, 56);
                    case 8:
                        Json json2 = (Json) aVar31.f.get();
                        me0.a factory2 = aVar32.e();
                        s.j(factory2);
                        dk1.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(json2, "json");
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.a(json2);
                    default:
                        throw new AssertionError(i6);
                }
            case 22:
                return a();
            case 23:
                if (i6 == 0) {
                    dmc.n nVar = (dmc.n) obj2;
                    return new qnc.f(nVar.f116015a, (qnc.c) nVar.f116016b.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                rnc.b riskMetricsFieldToDetailsRowMapper = new rnc.b();
                Intrinsics.checkNotNullParameter(riskMetricsFieldToDetailsRowMapper, "riskMetricsFieldToDetailsRowMapper");
                return new qnc.e();
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
                a6 a6Var = (a6) obj2;
                if (i6 == 0) {
                    return new qk4.g((p) a6Var.f118279c.get(), a6Var.f118278b);
                }
                if (i6 == 1) {
                    return new qk4.h();
                }
                throw new AssertionError(i6);
        }
    }
}
