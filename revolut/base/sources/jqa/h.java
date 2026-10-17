package jqa;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import az0.m0;
import b9.w2;
import c8j.b;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreen;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import com.revolut.feature.junior.accounts.api.navigation.JuniorSelectionInputData;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreenContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$InputData;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$InputData;
import dw3.c1;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jm4.a3;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import ks9.b0;
import ks9.f0;
import ks9.n0;
import ks9.o0;
import ks9.r0;
import ks9.s0;
import ljl.q0;
import mga.i0;
import okhttp3.OkHttpClient;
import q2e.t0;
import t80.e;
import vkm.j2;
import zxb.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f177578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f177579c;
    public final Object d;

    public /* synthetic */ h(Object obj2, Object obj3, int i, int i2) {
        this.f177577a = i2;
        this.f177578b = obj2;
        this.d = obj3;
        this.f177579c = i;
    }

    private final Object a() {
        k2e.d dVar = (k2e.d) this.d;
        k2e.j jVar = (k2e.j) this.f177578b;
        k0 k0Var = jVar.f180511b;
        int i = this.f177579c;
        switch (i) {
            case 0:
                Object extension = (mub.b) dVar.f180495c.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 1:
                jid.z factory = k0Var.h();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object obj2 = ((phm.a) factory.f174461b).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                mub.b bVar = (mub.b) obj2;
                vc.s.k(bVar);
                return bVar;
            case 2:
                StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = dVar.f180493a;
                l2e.a aVarE = jVar.e();
                h30.q qVarD = jVar.d();
                mub.b bVar2 = (mub.b) dVar.f180495c.get();
                jwb.e eVarB = jVar.f180512c.b();
                vc.s.j(eVarB);
                nyb.k kVarC = k0Var.c();
                vc.s.j(kVarC);
                eub.i iVarE = k0Var.e();
                vc.s.j(iVarE);
                ang.f fVarE = jVar.f180518n.e();
                ffk.t tVarF = jVar.o.f();
                vc.s.j(tVarF);
                jgk.v vVarD = jVar.f180519p.d();
                vc.s.j(vVarD);
                mre.c cVarB = jVar.f180520q.b();
                vc.s.j(cVarB);
                c70.a aVarZ = jVar.f180516l.z();
                vc.s.j(aVarZ);
                return new com.revolut.feature.store.impl.ui.brand_detail.flow.c(storeBrandDetailFlowContract$InputData, aVarE, qVarD, bVar2, eVarB, kVarC, iVarE, fVarE, tVarF, vVarD, cVarB, aVarZ, new g2e.g((ue0.c) dVar.f180494b.v.get()), (q2e.a) dVar.e.get(), new t0(new t3e.b()), (vii.b) dVar.f.get(), (vii.b) dVar.f180496g.get(), (vii.b) dVar.f180497h.get(), new h30.q(jVar, dVar, 19), new h30.q(jVar, dVar, 21), new h30.q(jVar, dVar, 18), new h30.q(jVar, dVar, 20), new com.revolut.feature.store.impl.ui.brand_detail.flow.d());
            case 3:
                r2e.a.Companion.getClass();
                return new q2e.a();
            case 4:
                r2e.a.Companion.getClass();
                return new vii.b();
            case 5:
                r2e.a.Companion.getClass();
                return new vii.b();
            case 6:
                r2e.a.Companion.getClass();
                return new vii.b();
            case 7:
                r2e.a.Companion.getClass();
                return new vii.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        k2e.n nVar = (k2e.n) this.d;
        k2e.j jVar = (k2e.j) this.f177578b;
        int i = this.f177579c;
        if (i != 0) {
            if (i == 1) {
                return new n3e.c(jVar.g(), new yk0.d());
            }
            throw new AssertionError(i);
        }
        n3e.m mVar = new n3e.m();
        n3e.b bVar = (n3e.b) nVar.f180535b.get();
        jwb.e eVarB = jVar.f180512c.b();
        vc.s.j(eVarB);
        l80.e eVarH = jVar.f180516l.h();
        vc.s.j(eVarH);
        return new com.revolut.feature.store.impl.ui.orders.see_all.a(mVar, bVar, eVarB, eVarH, nVar.f180534a);
    }

    private final Object c() {
        k2e.o oVar = (k2e.o) this.d;
        k2e.j jVar = (k2e.j) this.f177578b;
        vn.a aVar = jVar.k;
        int i = this.f177579c;
        if (i == 0) {
            wn.a aVar2 = (wn.a) oVar.f180538b.get();
            ms1.g.y(aVar2);
            return aVar2;
        }
        if (i == 1) {
            return v7.z(aVar, "provider");
        }
        if (i == 2) {
            cli.n nVar = (cli.n) oVar.e.get();
            l2e.a aVarE = jVar.e();
            g2e.b bVar = (g2e.b) jVar.z.get();
            wli.x xVarD = ((s41.a) jVar.f180517m).d();
            wn.a aVar3 = (wn.a) oVar.f180538b.get();
            svb.a aVarA = jVar.f180512c.a();
            vc.s.j(aVarA);
            return new com.revolut.feature.store.impl.ui.search.a(nVar, aVarE, bVar, xVarD, aVar3, aVarA);
        }
        if (i == 3) {
            return new r3e.p((f01.a) oVar.d.get(), new u3e.c());
        }
        if (i == 4) {
            ViewController viewController = oVar.f180537a;
            s3e.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(viewController, "viewController");
            return new f01.c(viewController.m2());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        os2.g factory = aVar.c();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (sn.a) factory.f229224b;
    }

    private final Object d() {
        k2e.q qVar = (k2e.q) this.d;
        k2e.j jVar = (k2e.j) this.f177578b;
        vn.a aVar = jVar.k;
        int i = this.f177579c;
        if (i == 0) {
            wn.a aVar2 = (wn.a) qVar.f180545b.get();
            ms1.g.y(aVar2);
            return aVar2;
        }
        if (i == 1) {
            return v7.z(aVar, "provider");
        }
        if (i == 2) {
            return new y2e.s(new y2e.t(), (y2e.k) qVar.d.get(), jVar.e(), (g2e.b) jVar.z.get(), (wn.a) qVar.f180545b.get());
        }
        if (i == 3) {
            return new y2e.m(jVar.e(), (g2e.b) jVar.z.get(), new yk0.d());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        os2.g factory = aVar.c();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (sn.a) factory.f229224b;
    }

    private final Object e() {
        k2e.q qVar = (k2e.q) this.d;
        k2e.j jVar = (k2e.j) this.f177578b;
        int i = this.f177579c;
        if (i == 0) {
            wn.a aVar = (wn.a) qVar.f180545b.get();
            ms1.g.y(aVar);
            return aVar;
        }
        if (i == 1) {
            return v7.z(jVar.k, "provider");
        }
        if (i == 2) {
            return new y2e.s(new y2e.t(), (y2e.k) qVar.d.get(), jVar.e(), (g2e.b) jVar.z.get(), (wn.a) qVar.f180545b.get());
        }
        if (i == 3) {
            return new y2e.m(jVar.e(), (g2e.b) jVar.z.get(), new yk0.d());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        os2.g factory = jVar.k.c();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (sn.a) factory.f229224b;
    }

    private final Object f() {
        k2e.j jVar = (k2e.j) this.f177578b;
        vn.a aVar = jVar.k;
        k2e.s sVar = (k2e.s) this.d;
        k2e.j jVar2 = sVar.f180552c;
        int i = this.f177579c;
        if (i == 0) {
            wn.a aVar2 = (wn.a) sVar.d.get();
            ms1.g.y(aVar2);
            return aVar2;
        }
        if (i == 1) {
            return v7.z(aVar, "provider");
        }
        if (i != 2) {
            if (i == 3) {
                ViewController viewController = sVar.f180551b;
                b3e.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return new f01.c(viewController.m2());
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            os2.g factory = aVar.c();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return (sn.a) factory.f229224b;
        }
        a3e.u uVar = new a3e.u(new a3e.b(new e3e.f((f01.a) sVar.f.get()), new e3e.b((f01.a) sVar.f.get()), new e3e.m(), new e3e.l(new d3e.c()), new e3e.d((f01.a) sVar.f.get()), new e3e.o((f01.a) sVar.f.get())));
        t1 t1VarF = jVar.f();
        y80.a aVarR = jVar2.f180516l.r();
        vc.s.j(aVarR);
        w39.b bVarA = jVar2.f180514h.a();
        vc.s.j(bVarA);
        c3e.f fVar = new c3e.f(aVarR, bVarA);
        c3e.c cVar = new c3e.c(jVar2.f(), new yk0.d());
        wli.x xVarD = ((s41.a) jVar.f180517m).d();
        wn.a aVar3 = (wn.a) sVar.d.get();
        s70.a aVarM = jVar.f180516l.m();
        vc.s.j(aVarM);
        return new a3e.t(uVar, t1VarF, fVar, cVar, xVarD, aVar3, aVarM);
    }

    private final Object g() {
        k2e.j jVar = (k2e.j) this.f177578b;
        k2e.s sVar = (k2e.s) this.d;
        k2e.j jVar2 = sVar.f180552c;
        int i = this.f177579c;
        if (i == 0) {
            wn.a aVar = (wn.a) sVar.d.get();
            ms1.g.y(aVar);
            return aVar;
        }
        if (i == 1) {
            return v7.z(jVar.k, "provider");
        }
        if (i != 2) {
            if (i == 3) {
                ViewController viewController = sVar.f180551b;
                b3e.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return new f01.c(viewController.m2());
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            os2.g factory = jVar.k.c();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return (sn.a) factory.f229224b;
        }
        a3e.u uVar = new a3e.u(new a3e.b(new e3e.f((f01.a) sVar.f.get()), new e3e.b((f01.a) sVar.f.get()), new e3e.m(), new e3e.l(new d3e.c()), new e3e.d((f01.a) sVar.f.get()), new e3e.o((f01.a) sVar.f.get())));
        t1 t1VarF = jVar.f();
        y80.a aVarR = jVar2.f180516l.r();
        vc.s.j(aVarR);
        w39.b bVarA = jVar2.f180514h.a();
        vc.s.j(bVarA);
        c3e.f fVar = new c3e.f(aVarR, bVarA);
        c3e.c cVar = new c3e.c(jVar2.f(), new yk0.d());
        wli.x xVarD = ((s41.a) jVar.f180517m).d();
        wn.a aVar2 = (wn.a) sVar.d.get();
        s70.a aVarM = jVar.f180516l.m();
        vc.s.j(aVarM);
        return new a3e.t(uVar, t1VarF, fVar, cVar, xVarD, aVar2, aVarM);
    }

    private final Object h() {
        k2e.v vVar = (k2e.v) this.d;
        k2e.j jVar = (k2e.j) this.f177578b;
        vn.a aVar = jVar.k;
        int i = this.f177579c;
        if (i == 0) {
            wn.a aVar2 = (wn.a) vVar.f180561b.get();
            ms1.g.y(aVar2);
            return aVar2;
        }
        if (i == 1) {
            return v7.z(aVar, "provider");
        }
        if (i == 2) {
            return new g3e.r(new g3e.u(new u3e.c()), (g3e.f) vVar.d.get(), jVar.g(), (g2e.e) jVar.A.get(), ((s41.a) jVar.f180517m).d(), (wn.a) vVar.f180561b.get());
        }
        if (i == 3) {
            return new g3e.i(jVar.g(), (g2e.e) jVar.A.get(), new yk0.d());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        os2.g factory = aVar.c();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (sn.a) factory.f229224b;
    }

    private final Object i() {
        k2e.v vVar = (k2e.v) this.d;
        k2e.j jVar = (k2e.j) this.f177578b;
        int i = this.f177579c;
        if (i == 0) {
            wn.a aVar = (wn.a) vVar.f180561b.get();
            ms1.g.y(aVar);
            return aVar;
        }
        if (i == 1) {
            return v7.z(jVar.k, "provider");
        }
        if (i == 2) {
            return new g3e.r(new g3e.u(new u3e.c()), (g3e.f) vVar.d.get(), jVar.g(), (g2e.e) jVar.A.get(), ((s41.a) jVar.f180517m).d(), (wn.a) vVar.f180561b.get());
        }
        if (i == 3) {
            return new g3e.i(jVar.g(), (g2e.e) jVar.A.get(), new yk0.d());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        os2.g factory = jVar.k.c();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (sn.a) factory.f229224b;
    }

    private final Object j() {
        fc4.c cVar = (fc4.c) this.f177578b;
        k74.a aVar = (k74.a) this.d;
        int i = this.f177579c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f181816a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f181816a);
                t70.g gVarO = cVar.f133638b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f.get(), gsi.c.a(aVar.f181816a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f181816a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f181816a));
            case 5:
                iri.j jVar = (iri.j) cVar.f.get();
                e4m.e eVar = aVar.i;
                fsi.g gVar = aVar.f181816a;
                return new iri.g(jVar, (iri.m) eVar.get(), bq.i.f(gVar), bq.i.l(gVar));
            case 6:
                return new iri.b();
            case 7:
                return new iri.l((iri.m) aVar.i.get(), bq.i.f(aVar.f181816a), (iri.d) aVar.k.get());
            case 8:
                return new iri.d(bq.i.f(aVar.f181816a));
            case 9:
                return new opi.b(bq.i.f(aVar.f181816a));
            case 10:
                hz3.c cVarB = ((c1) ((dw3.e) cVar.f133641h)).b();
                sri.m mVarL = bq.i.l(aVar.f181816a);
                WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = aVar.f181817b;
                fc4.c cVar2 = aVar.f181818c;
                pgi.l lVar = (pgi.l) cVar2.f133640g.get();
                wli.x xVarD = ((s41.a) cVar2.d).d();
                sri.m mVarL2 = bq.i.l(aVar.f181816a);
                f80.a aVarX = cVar2.f133638b.x();
                vc.s.j(aVarX);
                return new j74.b(cVarB, mVarL, new pgi.s(webViewContract$WebViewConfiguration, lVar, xVarD, mVarL2, aVarX));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        k78.h hVar = (k78.h) this.d;
        int i = this.f177579c;
        if (i == 0) {
            return kxa.j.l((j60.a) hVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) hVar.f181889b.get(), (rp0.m) hVar.f181890c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new v78.h();
            }
            throw new AssertionError(i);
        }
        JuniorSelectionInputData juniorSelectionInputData = hVar.f181888a;
        jki.p pVar = (jki.p) hVar.f.get();
        j60.a aVar = (j60.a) hVar.d.get();
        zf8.k kVarA = ((k78.b) this.f177578b).f181858g.a();
        vc.s.j(kVarA);
        return new v78.g(juniorSelectionInputData, pVar, aVar, kVarA);
    }

    private final Object l() {
        k95.a aVar = (k95.a) this.f177578b;
        k95.b bVar = (k95.b) this.d;
        int i = this.f177579c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) bVar.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) bVar.f182284b.get(), (rp0.m) bVar.f182285c.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (f15.a) bVar.f.get();
                v95.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 4:
                j15.e provider = aVar.i.a();
                vc.s.j(provider);
                v95.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider.a();
            case 5:
                return new com.revolut.feature.credit.overdraft.impl.ui.details.a(bVar.f182283a, (o95.a) aVar.f182279r.get(), (f15.a) bVar.f.get(), (cli.n) bVar.f182287h.get());
            case 6:
                return new u95.m();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        kjl.c cVar = (kjl.c) this.f177578b;
        kjl.a aVar = (kjl.a) this.d;
        int i = this.f177579c;
        if (i == 0) {
            jki.p pVar = (jki.p) aVar.f184481b.get();
            uil.a aVarA = cVar.f.a();
            vc.s.j(aVarA);
            return new anl.i(pVar, aVarA, cVar.f184490h.a());
        }
        if (i == 1) {
            return new anl.j((tll.p) aVar.f184480a.get());
        }
        if (i == 2) {
            return new tll.r();
        }
        throw new AssertionError(i);
    }

    private final Object n() {
        kjl.c cVar = (kjl.c) this.f177578b;
        kjl.b bVar = (kjl.b) this.d;
        int i = this.f177579c;
        if (i != 0) {
            if (i == 1) {
                return new zml.g(bVar.f184484b);
            }
            if (i == 2) {
                return new com.revolut.sso.impl.ui.external_entry.external_entry.c();
            }
            throw new AssertionError(i);
        }
        ExternalEntryFlowContract$InputData externalEntryFlowContract$InputData = bVar.f184483a;
        zml.g gVar = (zml.g) bVar.d.get();
        com.revolut.sso.impl.ui.external_entry.external_entry.b bVar2 = (com.revolut.sso.impl.ui.external_entry.external_entry.b) bVar.e.get();
        nkl.b bVarI = ((q0) cVar.e).i();
        uil.a aVarA = cVar.f.a();
        vc.s.j(aVarA);
        gte.a aVarB = cVar.f184489g.b();
        vc.s.j(aVarB);
        return new com.revolut.sso.impl.ui.external_entry.external_entry.a(externalEntryFlowContract$InputData, gVar, bVar2, bVarI, aVarA, aVarB);
    }

    private final Object o() {
        kjl.c cVar = (kjl.c) this.f177578b;
        Context context = cVar.f184488c;
        l70.e eVar = cVar.f184486a;
        e84.e eVar2 = (e84.e) this.d;
        int i = this.f177579c;
        switch (i) {
            case 0:
                kjl.c cVar2 = (kjl.c) eVar2.f123569a;
                l70.e eVar3 = cVar2.f184486a;
                f90.b pluralFormatter = eVar3.t();
                vc.s.j(pluralFormatter);
                t70.g localization = eVar3.o();
                vc.s.j(localization);
                u80.t ratesMoneyUtils = eVar3.u();
                vc.s.j(ratesMoneyUtils);
                qd0.b languageProvider = eVar3.n();
                vc.s.j(languageProvider);
                wn0.a otaStringsRepository = cVar2.f184487b.a();
                vc.s.j(otaStringsRepository);
                t70.b currenciesLocalization = eVar3.g();
                vc.s.j(currenciesLocalization);
                h01.g sensitiveDataManager = (h01.g) ((e4m.e) eVar2.f123570b).get();
                Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
                Intrinsics.checkNotNullParameter(localization, "localization");
                Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                Intrinsics.checkNotNullParameter(otaStringsRepository, "otaStringsRepository");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                Intrinsics.checkNotNullParameter(sensitiveDataManager, "sensitiveDataManager");
                dcl.q clauseDisplayerFactory = new dcl.q();
                Intrinsics.checkNotNullParameter(clauseDisplayerFactory, "clauseDisplayerFactory");
                return new bp0.y(pluralFormatter, localization, ratesMoneyUtils, languageProvider, sensitiveDataManager, otaStringsRepository, currenciesLocalization);
            case 1:
                return h01.f.f148173a;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                xml.d dVar = new xml.d();
                m0 m0Var = new m0();
                ArrayList arrayList = dVar.f317745a;
                arrayList.add(m0Var);
                arrayList.add(new az0.t1(new xml.c(), new a01.f(context)));
                return dVar;
            case 3:
                return new mz0.a();
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                return new com.revolut.core.ui_kit_core.displayers.sound.a(context);
            case 5:
                r70.c hapticEngine = eVar.A();
                vc.s.j(hapticEngine);
                Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
                return new com.revolut.core.ui_kit_core.displayers.haptic.b(hapticEngine);
            case 6:
                yy0.f imageDisplayer = (yy0.f) ((e4m.e) eVar2.d).get();
                mz0.a videoDisplayer = (mz0.a) ((e4m.e) eVar2.e).get();
                Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
                Intrinsics.checkNotNullParameter(videoDisplayer, "videoDisplayer");
                return new jz0.b(imageDisplayer, videoDisplayer);
            case 7:
                zk0.b fileSystemRepository = eVar.l();
                vc.s.j(fileSystemRepository);
                g80.c urlHelper = eVar.y();
                vc.s.j(urlHelper);
                OkHttpClient okHttpClient = ((nj0.d) cVar.d).e();
                vc.s.j(okHttpClient);
                Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
                Intrinsics.checkNotNullParameter(urlHelper, "urlHelper");
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Intrinsics.checkNotNullParameter(context, "context");
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return new i01.b(new h30.q(okHttpClient, fileSystemRepository, urlHelper, resources));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        kn9.c cVar = (kn9.c) this.d;
        kn9.a aVar = (kn9.a) this.f177578b;
        l70.e eVar = aVar.f186035c;
        int i = this.f177579c;
        if (i == 0) {
            PayInStoreScreenContract$InputData payInStoreScreenContract$InputData = cVar.f186044a;
            u80.t tVarU = eVar.u();
            vc.s.j(tVarU);
            return new qn9.q(payInStoreScreenContract$InputData, tVarU, (ln9.a) aVar.f186040m.get(), aVar.f186036g.b(), new on9.a(), (jki.p) cVar.f186046c.get());
        }
        if (i == 1) {
            w80.b bVar = (w80.b) cVar.f186045b.get();
            qd0.b bVarN = eVar.n();
            vc.s.j(bVarN);
            return new qn9.o(bVar, bVarN);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        qd0.b languageProvider = eVar.n();
        vc.s.j(languageProvider);
        rn9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    private final Object q() {
        kr9.l lVar = (kr9.l) this.f177578b;
        int i = this.f177579c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            kr9.a aVar = (kr9.a) this.d;
            return new com.revolut.feature.payments.groups.impl.ui_chat.flow.b(aVar.f188676a, new zjh.f(((n2a.a) aVar.f188677b.f188761j).b()));
        }
        wj0.a idempotencyKeyHolder = ((nj0.d) lVar.i).i();
        vc.s.j(idempotencyKeyHolder);
        l80.e dateProvider = lVar.f188760h.h();
        vc.s.j(dateProvider);
        ms9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return new m60.b(idempotencyKeyHolder, dateProvider, "payments_group_invite_link_creation");
    }

    private final Object r() {
        kr9.l lVar = (kr9.l) this.f177578b;
        kr9.c cVar = (kr9.c) this.d;
        int i = this.f177579c;
        switch (i) {
            case 0:
                Object extension = (j60.a) cVar.f.get();
                rs9.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) cVar.d.get();
                rp0.m dialogDisplayer = (rp0.m) cVar.e.get();
                he2.b dialogHostFinder = ehe.n.r();
                rs9.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, dialogDisplayer, dialogHostFinder);
            case 2:
                rs9.d.Companion.getClass();
                return new rp0.m();
            case 3:
                return f0k.d.p((e60.a) cVar.f188704n.get());
            case 4:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) cVar.d.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) cVar.d.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) cVar.d.get());
                t80.x xVarY = cVar.y();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) cVar.d.get();
                f60.y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(cVar.f188700h);
                nli.a aVar3 = new nli.a((t80.c) cVar.i.get(), f60.t.a((com.revolut.kompot.navigable.a) cVar.d.get()));
                t80.x xVarY2 = cVar.y();
                zk0.b bVarL = cVar.f188697b.f188760h.l();
                vc.s.j(bVarL);
                return v1.c.q(aVar, new t80.v(aVarA, activityA, xVarY, aVar2, aVarA2, aVar3, new oli.c(xVarY2, bVarL, new nli.a((t80.c) cVar.i.get(), f60.t.a((com.revolut.kompot.navigable.a) cVar.d.get())), f60.v.a((com.revolut.kompot.navigable.a) cVar.d.get()), cVar.s()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) cVar.d.get())), v1.c.e((com.revolut.kompot.navigable.a) cVar.d.get()), new ami.n(e4m.b.a(cVar.f188701j), 1), e4m.b.a(cVar.f188700h), cVar.y(), new nli.a((t80.c) cVar.i.get(), f60.t.a((com.revolut.kompot.navigable.a) cVar.d.get())), new i90.b(), cVar.b(), cVar.s()), cVar.s()), f60.x.a(), (rp0.m) cVar.k.get(), (e60.t) cVar.f188703m.get());
            case 5:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) cVar.d.get();
                f60.y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 6:
                rs9.d.Companion.getClass();
                return new t80.c(new e.a("PaymentsGroups_Details_Settings"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 7:
                return t96.a.a();
            case 8:
                return f60.z.a();
            case 9:
                aii.o oVar = (aii.o) cVar.f188702l.get();
                y80.a aVarR = lVar.f188760h.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, cVar.b(), Optional.empty());
            case 10:
                d2a.a model = (d2a.a) cVar.f188705p.get();
                rs9.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                vc.s.k(model);
                return model;
            case 11:
                p2a.a factory = lVar.D.a();
                vc.s.j(factory);
                rs9.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 12:
                r0 extension2 = (r0) cVar.f188707r.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 13:
                mq9.f groupsInteractor = lVar.f188757b.c();
                vc.s.j(groupsInteractor);
                vr9.s trustingMapper = new vr9.s();
                j60.a extension3 = (j60.a) cVar.f.get();
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
                Intrinsics.checkNotNullParameter(trustingMapper, "trustingMapper");
                Intrinsics.checkNotNullParameter(extension3, "extension");
                return new r0(groupsInteractor, trustingMapper, extension3);
            case 14:
                ks9.a extension4 = (ks9.a) cVar.f188709t.get();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                vc.s.k(extension4);
                return extension4;
            case 15:
                j60.a extension5 = (j60.a) cVar.f.get();
                du9.b disclaimerProvider = lVar.k.a();
                vc.s.j(disclaimerProvider);
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
                return new ks9.a(extension5, disclaimerProvider);
            case 16:
                Object extension6 = (ks9.i) cVar.f188711x.get();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                yji.n nVar = (yji.n) extension6;
                vc.s.k(nVar);
                return nVar;
            case 17:
                rr9.d settlementInteractor = lVar.f188757b.b();
                vc.s.j(settlementInteractor);
                utf.a transferRequestApprovalHandler = lVar.o.a();
                vc.s.j(transferRequestApprovalHandler);
                jt0.b debtsInteractor = cVar.c();
                vr9.r settlementMapper = cVar.j();
                vr9.d balanceMapper = new vr9.d();
                ks9.c groupAppFraudExtension = (ks9.c) cVar.f188710w.get();
                ks9.g groupPaymentExtension = (ks9.g) cVar.v.get();
                j60.a extension7 = (j60.a) cVar.f.get();
                gte.a featureToggleInteractor = lVar.f188768s.b();
                vc.s.j(featureToggleInteractor);
                wr9.e memberDialogMapper = cVar.q();
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(settlementInteractor, "settlementInteractor");
                Intrinsics.checkNotNullParameter(transferRequestApprovalHandler, "transferRequestApprovalHandler");
                Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
                Intrinsics.checkNotNullParameter(settlementMapper, "settlementMapper");
                Intrinsics.checkNotNullParameter(balanceMapper, "balanceMapper");
                Intrinsics.checkNotNullParameter(groupAppFraudExtension, "groupAppFraudExtension");
                Intrinsics.checkNotNullParameter(groupPaymentExtension, "groupPaymentExtension");
                Intrinsics.checkNotNullParameter(extension7, "extension");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(memberDialogMapper, "memberDialogMapper");
                return new n0(settlementInteractor, transferRequestApprovalHandler, debtsInteractor, settlementMapper, balanceMapper, groupAppFraudExtension, groupPaymentExtension, extension7, featureToggleInteractor, memberDialogMapper);
            case 18:
                bqf.g trustedPayeeChecker = lVar.f188767r.f();
                vr9.b appFraudMapper = new vr9.b();
                ks9.g groupPaymentExtension2 = (ks9.g) cVar.v.get();
                j60.a extension8 = (j60.a) cVar.f.get();
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
                Intrinsics.checkNotNullParameter(appFraudMapper, "appFraudMapper");
                Intrinsics.checkNotNullParameter(groupPaymentExtension2, "groupPaymentExtension");
                Intrinsics.checkNotNullParameter(extension8, "extension");
                return new ks9.b(trustedPayeeChecker, appFraudMapper, groupPaymentExtension2, extension8);
            case 19:
                rr9.d dVarB = lVar.f188757b.b();
                vc.s.j(dVarB);
                zof.f fVarD = lVar.f188766q.d();
                vc.s.j(fVarD);
                return new b0(dVarB, fVarD);
            case 20:
                Object extension9 = (ks9.g) cVar.v.get();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                yji.n nVar2 = (yji.n) extension9;
                vc.s.k(nVar2);
                return nVar2;
            case 21:
                Object extension10 = (ks9.c) cVar.f188710w.get();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                yji.n nVar3 = (yji.n) extension10;
                vc.s.k(nVar3);
                return nVar3;
            case 22:
                s0 extension11 = (s0) cVar.B.get();
                Intrinsics.checkNotNullParameter(extension11, "extension");
                vc.s.k(extension11);
                return extension11;
            case 23:
                j60.a extension12 = (j60.a) cVar.f.get();
                iu9.a validationStateDescriptionProvider = (iu9.a) lVar.k.f219248y.get();
                vc.s.j(validationStateDescriptionProvider);
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension12, "extension");
                Intrinsics.checkNotNullParameter(validationStateDescriptionProvider, "validationStateDescriptionProvider");
                return new s0(extension12, validationStateDescriptionProvider);
            case 24:
                Object extension13 = (ks9.h) cVar.D.get();
                Intrinsics.checkNotNullParameter(extension13, "extension");
                yji.n nVar4 = (yji.n) extension13;
                vc.s.k(nVar4);
                return nVar4;
            case 25:
                mq9.f groupsInteractor2 = lVar.f188757b.c();
                vc.s.j(groupsInteractor2);
                jt0.b groupsDebtsInteractor = cVar.c();
                mr9.d groupsRemindersInteractor = lVar.f188757b.d();
                vc.s.j(groupsRemindersInteractor);
                wr9.e memberDialogMapper2 = cVar.q();
                j60.a extension14 = (j60.a) cVar.f.get();
                sf0.h serverErrorParser = lVar.f188769t.b();
                vc.s.j(serverErrorParser);
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(groupsInteractor2, "groupsInteractor");
                Intrinsics.checkNotNullParameter(groupsDebtsInteractor, "groupsDebtsInteractor");
                Intrinsics.checkNotNullParameter(groupsRemindersInteractor, "groupsRemindersInteractor");
                Intrinsics.checkNotNullParameter(memberDialogMapper2, "memberDialogMapper");
                Intrinsics.checkNotNullParameter(extension14, "extension");
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                return new f0(groupsInteractor2, groupsDebtsInteractor, groupsRemindersInteractor, memberDialogMapper2, extension14, serverErrorParser);
            case 26:
                Object extension15 = (ks9.d) cVar.F.get();
                Intrinsics.checkNotNullParameter(extension15, "extension");
                yji.n nVar5 = (yji.n) extension15;
                vc.s.k(nVar5);
                return nVar5;
            case 27:
                wr9.e memberDialogMapper3 = cVar.q();
                gte.a featureToggleInteractor2 = lVar.f188768s.b();
                vc.s.j(featureToggleInteractor2);
                jt0.b groupsDebtsInteractor2 = cVar.c();
                fk3.a aVarA3 = cVar.f188697b.f188772y.a();
                vc.s.j(aVarA3);
                pak.h groupSettingsInteractor = new pak.h(aVarA3);
                ks9.i settlingExtension = (ks9.i) cVar.f188711x.get();
                mq9.f groupsInteractor3 = lVar.f188757b.c();
                vc.s.j(groupsInteractor3);
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(memberDialogMapper3, "memberDialogMapper");
                Intrinsics.checkNotNullParameter(featureToggleInteractor2, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(groupsDebtsInteractor2, "groupsDebtsInteractor");
                Intrinsics.checkNotNullParameter(groupSettingsInteractor, "groupSettingsInteractor");
                Intrinsics.checkNotNullParameter(settlingExtension, "settlingExtension");
                Intrinsics.checkNotNullParameter(groupsInteractor3, "groupsInteractor");
                return new ks9.l(memberDialogMapper3, featureToggleInteractor2, groupsDebtsInteractor2, groupSettingsInteractor, settlingExtension, groupsInteractor3);
            case 28:
                Object extension16 = (ks9.j) cVar.H.get();
                Intrinsics.checkNotNullParameter(extension16, "extension");
                yji.n nVar6 = (yji.n) extension16;
                vc.s.k(nVar6);
                return nVar6;
            case 29:
                gte.a featureToggleInteractor3 = lVar.f188768s.b();
                vc.s.j(featureToggleInteractor3);
                rs9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(featureToggleInteractor3, "featureToggleInteractor");
                return new o0(featureToggleInteractor3);
            case 30:
                e60.t tVar = (e60.t) cVar.f188703m.get();
                f60.w.a(tVar);
                return tVar;
            case 31:
                kr9.l lVar2 = cVar.f188697b;
                jr9.a aVar5 = lVar2.f188765p;
                nq9.c cVarC = aVar5.c();
                vc.s.j(cVarC);
                ur9.f fVar = new ur9.f(cVarC);
                tr9.h hVar = new tr9.h();
                nq9.a aVarA4 = aVar5.a();
                vc.s.j(aVarA4);
                nq9.d dVar2 = (nq9.d) aVar5.f177951g.get();
                vc.s.j(dVar2);
                ss9.b bVar = new ss9.b(new com.revolut.feature.payments.groups.impl.mappers.transactions.a(aVarA4, dVar2));
                r2a.b bVar2 = new r2a.b();
                gte.a aVarB = lVar2.f188768s.b();
                vc.s.j(aVarB);
                ps9.b0 b0Var = new ps9.b0(new ts9.b(fVar, hVar, bVar, bVar2, aVarB));
                ks9.i iVar = (ks9.i) cVar.f188711x.get();
                GroupChatSettingsScreenContract$InputData groupChatSettingsScreenContract$InputData = cVar.f188696a;
                ks9.c cVar2 = (ks9.c) cVar.f188710w.get();
                kr9.l lVar3 = cVar.f188697b;
                mq9.f fVarC = lVar3.f188757b.c();
                vc.s.j(fVarC);
                ps9.c cVar3 = new ps9.c(fVarC, cVar.c(), lVar3.f188763m.e());
                e60.a aVar6 = (e60.a) cVar.f188704n.get();
                r0 r0Var = (r0) cVar.f188707r.get();
                vr9.r rVarJ = cVar.j();
                j60.a aVar7 = (j60.a) cVar.f.get();
                ks9.h hVar2 = (ks9.h) cVar.D.get();
                wj0.a aVarI = ((nj0.d) lVar.i).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.payments.groups.impl.ui_chat.settings.d(b0Var, iVar, groupChatSettingsScreenContract$InputData, cVar2, cVar3, aVar6, r0Var, rVarJ, aVar7, hVar2, aVarI, lVar.e.e(), (d2a.a) cVar.f188705p.get(), (ks9.d) cVar.F.get(), (ks9.j) cVar.H.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        kr9.l lVar = (kr9.l) this.f177578b;
        kr9.e eVar = (kr9.e) this.d;
        int i = this.f177579c;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) eVar.f188722l.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) eVar.d.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) eVar.d.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) eVar.d.get());
                t80.g gVar = (t80.g) eVar.e.get();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) eVar.d.get();
                f60.y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(eVar.f);
                nli.a aVar3 = new nli.a((t80.c) eVar.f188719g.get(), f60.t.a((com.revolut.kompot.navigable.a) eVar.d.get()));
                t80.g gVar2 = (t80.g) eVar.e.get();
                zk0.b bVarL = eVar.f188717b.f188760h.l();
                vc.s.j(bVarL);
                return v1.c.q(aVar, new t80.v(aVarA, activityA, gVar, aVar2, aVarA2, aVar3, new oli.c(gVar2, bVarL, new nli.a((t80.c) eVar.f188719g.get(), f60.t.a((com.revolut.kompot.navigable.a) eVar.d.get())), f60.v.a((com.revolut.kompot.navigable.a) eVar.d.get()), eVar.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) eVar.d.get())), v1.c.e((com.revolut.kompot.navigable.a) eVar.d.get()), new ami.n(e4m.b.a(eVar.f188720h), 1), e4m.b.a(eVar.f), (t80.g) eVar.e.get(), new nli.a((t80.c) eVar.f188719g.get(), f60.t.a((com.revolut.kompot.navigable.a) eVar.d.get())), new i90.b(), eVar.b(), eVar.c()), eVar.c()), f60.x.a(), (rp0.m) eVar.i.get(), (e60.t) eVar.k.get());
            case 2:
                f80.a aVarX = lVar.f188760h.x();
                vc.s.j(aVarX);
                return new t80.x(aVarX, new i90.b());
            case 3:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) eVar.d.get();
                f60.y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 4:
                ot9.b.Companion.getClass();
                return new t80.c(new e.a("PaymentsGroups_Creation"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 5:
                return t96.a.a();
            case 6:
                return f60.z.a();
            case 7:
                aii.o oVar = (aii.o) eVar.f188721j.get();
                y80.a aVarR = lVar.f188760h.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, eVar.b(), Optional.empty());
            case 8:
                e60.t tVar = (e60.t) eVar.k.get();
                f60.w.a(tVar);
                return tVar;
            case 9:
                kr9.l lVar2 = eVar.f188717b;
                mq9.f fVarC = lVar2.f188757b.c();
                vc.s.j(fVarC);
                fk3.a aVarA3 = lVar2.f188772y.a();
                vc.s.j(aVarA3);
                pak.h hVar = new pak.h(aVarA3);
                wsg.n nVarB = lVar2.z.b();
                bn2.p pVarB = lVar2.A.b();
                vc.s.j(pVarB);
                zs9.e eVar2 = new zs9.e(fVarC, hVar, nVarB, pVarB);
                e60.a aVar5 = (e60.a) eVar.f188722l.get();
                g2j.f fVar = lVar.B;
                l2j.a aVar6 = new l2j.a();
                f01.a aVar7 = (f01.a) eVar.o.get();
                nq9.c cVarC = eVar.f188717b.f188765p.c();
                vc.s.j(cVarC);
                wr9.e eVar3 = new wr9.e(cVarC);
                vr9.a aVar8 = new vr9.a();
                cli.n nVar = (cli.n) eVar.f188725p.get();
                n8b.a aVarA4 = lVar.C.a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.payments.groups.impl.ui_new.group_creation.b(eVar2, aVar5, aVar6, aVar7, eVar3, aVar8, nVar, aVarA4);
            case 10:
                ViewController viewController = eVar.f188716a;
                ot9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return new f01.c(viewController.m2());
            case 11:
                tr9.h mapper = new tr9.h();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new nt9.q();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        Object dVar;
        Object dVar2;
        Object eVar;
        Object aVar;
        Object xVar;
        Object yVar;
        switch (this.f177577a) {
            case 0:
                e eVar2 = (e) this.f177578b;
                i iVar = (i) this.d;
                int i = this.f177579c;
                switch (i) {
                    case 0:
                        PushToCardTransferReviewScreenContract$InputData inputData = iVar.f177580a;
                        wj0.a idempotencyKeyHolder = ((nj0.d) eVar2.f177541b).i();
                        vc.s.j(idempotencyKeyHolder);
                        l80.e dateProvider = eVar2.f177542c.h();
                        vc.s.j(dateProvider);
                        rsa.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                        if (!inputData.d) {
                            return new rsa.a();
                        }
                        bVar = new m60.b(idempotencyKeyHolder, dateProvider, "payments_push_to_card_transfer");
                        break;
                        break;
                    case 1:
                        PushToCardTransferReviewScreenContract$InputData inputData2 = iVar.f177580a;
                        pak.h priceQuoteTraceIdControllerExtensionFactory = eVar2.d.a();
                        rsa.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory, "priceQuoteTraceIdControllerExtensionFactory");
                        return inputData2.d ? priceQuoteTraceIdControllerExtensionFactory.a("payments_push_to_card_price_quote") : new rsa.a();
                    case 2:
                        return kxa.j.j((j60.a) iVar.f177584h.get());
                    case 3:
                        return v1.c.r((com.revolut.kompot.navigable.a) iVar.f.get(), (rp0.m) iVar.f177583g.get());
                    case 4:
                        return new rp0.m();
                    case 5:
                        n60.b bVar2 = (n60.b) iVar.f177585j.get();
                        o5k.i.m(bVar2);
                        return bVar2;
                    case 6:
                        return o5k.i.r((com.revolut.kompot.navigable.a) iVar.f.get());
                    case 7:
                        n60.a aVar2 = (n60.a) iVar.f177586l.get();
                        o5k.i.l(aVar2);
                        return aVar2;
                    case 8:
                        return o5k.i.q((com.revolut.kompot.navigable.a) iVar.f.get());
                    case 9:
                        return nga.c.s(eVar2.d.c(), (i0) iVar.f177588n.get(), (mga.f0) iVar.f177589p.get(), (on.a) iVar.f177590q.get());
                    case 10:
                        yji.o controller = (com.revolut.kompot.navigable.a) iVar.f.get();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        i0 i0Var = (i0) controller;
                        vc.s.k(i0Var);
                        return i0Var;
                    case 11:
                        return nga.c.u(eVar2.d.c(), iVar.f177581b, (wn.a) iVar.o.get());
                    case 12:
                        return v7.z(eVar2.e, "provider");
                    case 13:
                        os2.g factory = eVar2.e.c();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return (sn.a) factory.f229224b;
                    case 14:
                        Object extension = (usa.d) iVar.f177592s.get();
                        rsa.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        vc.s.k(nVar);
                        return nVar;
                    case 15:
                        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData = iVar.f177580a;
                        jid.z zVarB = iVar.b();
                        bqf.d dVarA = eVar2.i.a();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) eVar2.f177544h).c();
                        vc.s.j(aVarC);
                        wsg.n nVarB = eVar2.z.b();
                        eli.j jVarA = eVar2.D.a();
                        mri.w wVarA = ((ozl.a) eVar2.E).a();
                        vc.s.j(wVarA);
                        return new usa.g(pushToCardTransferReviewScreenContract$InputData, zVarB, dVarA, aVarC, nVarB, jVarA, wVarA, eVar2.i.c());
                    case 16:
                        usa.h extension2 = (usa.h) iVar.u.get();
                        rsa.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 17:
                        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData2 = iVar.f177580a;
                        e eVar3 = iVar.f177582c;
                        cpf.b bVarE = eVar3.B.e();
                        vc.s.j(bVarE);
                        sw8.a aVar3 = new sw8.a();
                        sf0.h hVarB = eVar3.F.b();
                        vc.s.j(hVarB);
                        kbb.c cVar = new kbb.c(bVarE, aVar3, hVarB);
                        cpf.c cVarF = eVar2.B.f();
                        vc.s.j(cVarF);
                        bVar = new usa.h(pushToCardTransferReviewScreenContract$InputData2, cVar, cVarF);
                        break;
                    case 18:
                        bsf.i extension3 = (bsf.i) iVar.f177594w.get();
                        rsa.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 19:
                        w2 factory2 = eVar2.G.b();
                        rsa.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.m();
                    case 20:
                        i5k.a aVar4 = (i5k.a) iVar.f177596y.get();
                        j5k.b.a(aVar4);
                        return aVar4;
                    case 21:
                        l80.h hVarV = eVar2.f177542c.v();
                        vc.s.j(hVarV);
                        bVar = new i5k.d(hVarV);
                        break;
                    case 22:
                        return o5k.d.a((n5k.b) iVar.E.get());
                    case 23:
                        e4m.e eVar4 = iVar.B;
                        e eVar5 = iVar.f177582c;
                        n5k.a aVar5 = (n5k.a) eVar4.get();
                        p5k.d dVar3 = new p5k.d();
                        p5k.x xVarS = iVar.s();
                        qga.a aVar6 = eVar5.f177547m;
                        p5k.k kVar = new p5k.k(dVar3, xVarS, aVar6.b(), iVar.c(), new jt0.b(aVar6.b(), eVar5.f177550q.a(), iVar.c()), iVar.j(), new RateExplanationDialogMapper());
                        ffk.t tVarF = eVar2.f177551r.f();
                        vc.s.j(tVarF);
                        ang.f fVarE = eVar2.f177549p.e();
                        wif.a aVarA = eVar2.f177550q.a();
                        gte.a aVarB = eVar2.f177545j.b();
                        vc.s.j(aVarB);
                        j60.a aVar7 = (j60.a) iVar.f177584h.get();
                        qpk.b bVar3 = new qpk.b();
                        v2k.c cVarA = eVar2.f177546l.a();
                        mre.c cVarB = eVar2.f177552s.b();
                        vc.s.j(cVarB);
                        z0h.a aVarB2 = ((u8h.b) eVar2.f177548n).b();
                        vc.s.j(aVarB2);
                        l80.e eVarH = eVar5.f177542c.h();
                        vc.s.j(eVarH);
                        return new n5k.p(aVar5, kVar, tVarF, fVarE, aVarA, aVarB, aVar7, bVar3, cVarA, cVarB, aVarB2, new p5k.a(eVarH), eVar2.f177553t.b(), (n5k.q) iVar.D.get());
                    case 24:
                        vsa.a aVar8 = (vsa.a) iVar.A.get();
                        osa.f fVarQ = iVar.q();
                        gte.a aVarB3 = eVar2.f177545j.b();
                        vc.s.j(aVarB3);
                        bVar = new lsa.e(aVar8, fVarQ, aVarB3);
                        break;
                    case 25:
                        vsa.e.Companion.getClass();
                        return new vsa.a();
                    case 26:
                        aah.i iVarD = ((u8h.b) eVar2.f177548n).d();
                        vc.s.j(iVarD);
                        return o5k.i.C(iVarD);
                    case 27:
                        return new n5k.r(new RateExplanationDialogMapper());
                    case 28:
                        return o5k.i.a((n5k.q) iVar.D.get());
                    case 29:
                        wn.a aVar9 = (wn.a) iVar.o.get();
                        n57.a.d(aVar9);
                        return aVar9;
                    case 30:
                        a3 a3Var = eVar2.H;
                        vt4.h mapper = new vt4.h();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        return new zrf.m(mapper);
                    case 31:
                        return wpg.v.C((zrf.m) iVar.I.get(), (yrf.a) iVar.J.get());
                    case 32:
                        return new yrf.a();
                    case 33:
                        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData3 = iVar.f177580a;
                        p56.a aVar10 = new p56.a(iVar.q());
                        vsa.a aVar11 = (vsa.a) iVar.A.get();
                        tsa.a aVar12 = new tsa.a();
                        npf.a aVar13 = eVar2.B;
                        npf.a aVar14 = eVar2.B;
                        zof.f fVarD = aVar13.d();
                        vc.s.j(fVarD);
                        usa.d dVar4 = (usa.d) iVar.f177592s.get();
                        usa.h hVar = (usa.h) iVar.u.get();
                        i5k.a aVar15 = (i5k.a) iVar.f177596y.get();
                        j60.a aVar16 = (j60.a) iVar.f177584h.get();
                        yof.a aVarA2 = aVar14.a();
                        vc.s.j(aVarA2);
                        tga.k kVarB = eVar2.f177547m.b();
                        vrf.h hVar2 = (vrf.h) iVar.M.get();
                        aqf.b bVarC = aVar14.c();
                        vc.s.j(bVarC);
                        bsf.i iVar2 = (bsf.i) iVar.f177594w.get();
                        e eVar6 = iVar.f177582c;
                        yof.k kVarG = eVar6.B.g();
                        vc.s.j(kVarG);
                        p5k.x xVarS2 = iVar.s();
                        vrf.h hVar3 = (vrf.h) iVar.M.get();
                        fsf.b bVar4 = (fsf.b) eVar6.I.f218861b.get();
                        vc.s.j(bVar4);
                        return new qsa.u(pushToCardTransferReviewScreenContract$InputData3, aVar10, aVar11, aVar12, fVarD, dVar4, hVar, aVar15, aVar16, aVarA2, kVarB, hVar2, bVarC, iVar2, new qsa.n(kVarG, xVarS2, hVar3, bVar4));
                    case 34:
                        List providers = wpg.v.D((zrf.g) iVar.K.get(), (zrf.m) iVar.I.get(), (zrf.n) iVar.L.get());
                        Intrinsics.checkNotNullParameter(providers, "providers");
                        return new xrf.b(providers);
                    case 35:
                        return new zrf.n();
                    default:
                        throw new AssertionError(i);
                }
                return bVar;
            case 1:
                e eVar7 = (e) this.f177578b;
                k kVar2 = (k) this.d;
                int i2 = this.f177579c;
                switch (i2) {
                    case 0:
                        Object extension4 = (rpi.j) kVar2.e.get();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.d dVar5 = (yji.d) extension4;
                        vc.s.k(dVar5);
                        return dVar5;
                    case 1:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) kVar2.d.get();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        dVar = new mqi.d(controller2);
                        break;
                    case 2:
                        n60.a aVar17 = (n60.a) kVar2.f177603g.get();
                        o5k.i.l(aVar17);
                        return aVar17;
                    case 3:
                        return o5k.i.q((com.revolut.kompot.navigable.a) kVar2.d.get());
                    case 4:
                        dVar = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a(new bra.i(), new bra.e(), new bra.g(), new o7.b((w53.b) kVar2.i.get()), new bra.d(kVar2.f177602c.a(), new cra.a()), eVar7.f177549p.e(), new era.i(), (rpi.j) kVar2.e.get(), (n60.a) kVar2.f177603g.get(), kVar2.f177601b, new ac4.g(new era.x(), new era.c(new o7.d(new mra.k()), new era.h(new p96.a(new fra.b(), new fra.a()))), new era.j(), new era.a(), new era.k(), new era.l()));
                        break;
                    case 5:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) kVar2.d.get();
                        e63.a factory3 = eVar7.N.a();
                        vc.s.j(factory3);
                        dra.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return e63.a.a(controller3.m2());
                    case 6:
                        return new gra.b();
                    default:
                        throw new AssertionError(i2);
                }
                return dVar;
            case 2:
                e eVar8 = (e) this.f177578b;
                k kVar3 = (k) this.d;
                int i3 = this.f177579c;
                switch (i3) {
                    case 0:
                        Object extension5 = (rpi.j) kVar3.e.get();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        yji.d dVar6 = (yji.d) extension5;
                        vc.s.k(dVar6);
                        return dVar6;
                    case 1:
                        com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) kVar3.d.get();
                        Intrinsics.checkNotNullParameter(controller4, "controller");
                        dVar2 = new mqi.d(controller4);
                        break;
                    case 2:
                        n60.a aVar18 = (n60.a) kVar3.f177603g.get();
                        o5k.i.l(aVar18);
                        return aVar18;
                    case 3:
                        return o5k.i.q((com.revolut.kompot.navigable.a) kVar3.d.get());
                    case 4:
                        dVar2 = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a(new bra.i(), new bra.e(), new bra.g(), new o7.b((w53.b) kVar3.i.get()), new bra.d(kVar3.f177602c.a(), new cra.a()), eVar8.f177549p.e(), new era.i(), (rpi.j) kVar3.e.get(), (n60.a) kVar3.f177603g.get(), kVar3.f177601b, new ac4.g(new era.x(), new era.c(new o7.d(new mra.k()), new era.h(new p96.a(new fra.b(), new fra.a()))), new era.j(), new era.a(), new era.k(), new era.l()));
                        break;
                    case 5:
                        com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) kVar3.d.get();
                        e63.a factory4 = eVar8.N.a();
                        vc.s.j(factory4);
                        dra.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller5, "controller");
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return e63.a.a(controller5.m2());
                    case 6:
                        return new gra.b();
                    default:
                        throw new AssertionError(i3);
                }
                return dVar2;
            case 3:
                jxd.a aVar19 = (jxd.a) this.d;
                jxd.f fVar = (jxd.f) this.f177578b;
                qve.w wVar = fVar.f179153c;
                int i5 = this.f177579c;
                if (i5 == 0) {
                    AutoTopUpFlowContract$InputData autoTopUpFlowContract$InputData = aVar19.f179135a;
                    i61.b bVarA = fVar.f179151a.a();
                    wsg.n nVarB2 = fVar.f179152b.b();
                    nxd.b bVar5 = (nxd.b) aVar19.d.get();
                    nxd.c cVar2 = (nxd.c) aVar19.e.get();
                    u51.a aVarA3 = wVar.a();
                    vc.s.j(aVarA3);
                    return new com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b(autoTopUpFlowContract$InputData, bVarA, nVarB2, bVar5, cVar2, aVarA3);
                }
                if (i5 == 1) {
                    return new nxd.b();
                }
                if (i5 == 2) {
                    return new nxd.d();
                }
                if (i5 != 3) {
                    throw new AssertionError(i5);
                }
                fk3.a aVarA4 = fVar.e.a();
                vc.s.j(aVarA4);
                u51.a aVarA5 = wVar.a();
                vc.s.j(aVarA5);
                return new kxd.e(aVarA4, aVarA5);
            case 4:
                jxd.b bVar6 = (jxd.b) this.d;
                qve.w wVar2 = ((jxd.f) this.f177578b).f179153c;
                int i6 = this.f177579c;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new AssertionError(i6);
                    }
                    xte.a aVar20 = (xte.a) wVar2.B.get();
                    vc.s.j(aVar20);
                    return new oxd.p(aVar20);
                }
                cli.n nVar2 = (cli.n) bVar6.f179140b.get();
                AutoTopUpMethodsScreenContract$InputData autoTopUpMethodsScreenContract$InputData = bVar6.f179139a;
                u51.a aVarA6 = wVar2.a();
                vc.s.j(aVarA6);
                return new oxd.o(nVar2, autoTopUpMethodsScreenContract$InputData, aVarA6);
            case 5:
                jxd.f fVar2 = (jxd.f) this.f177578b;
                jxd.d dVar7 = (jxd.d) this.d;
                int i21 = this.f177579c;
                if (i21 == 0) {
                    cli.n nVar3 = (cli.n) dVar7.d.get();
                    CustomOrderAmountScreenContract$InputData customOrderAmountScreenContract$InputData = dVar7.f179145a;
                    fk3.a aVarA7 = fVar2.e.a();
                    vc.s.j(aVarA7);
                    return new qxd.k(nVar3, customOrderAmountScreenContract$InputData, aVarA7, (w80.b) dVar7.f179147c.get());
                }
                if (i21 == 1) {
                    return new qxd.m(new u80.o(), (w80.b) dVar7.f179147c.get());
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                qd0.b languageProvider = fVar2.d.n();
                vc.s.j(languageProvider);
                rxd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 6:
                l70.e eVar9 = ((jyc.h) this.f177578b).f179385g;
                jyc.e eVar10 = (jyc.e) this.d;
                int i22 = this.f177579c;
                switch (i22) {
                    case 0:
                        return f0k.d.p((e60.a) eVar10.f179376m.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar21 = (com.revolut.kompot.navigable.a) eVar10.e.get();
                        g60.a aVarA8 = f60.v.a((com.revolut.kompot.navigable.a) eVar10.e.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) eVar10.e.get());
                        t80.g gVar = (t80.g) eVar10.f.get();
                        com.revolut.kompot.navigable.a aVar22 = (com.revolut.kompot.navigable.a) eVar10.e.get();
                        f60.y.a(aVar22);
                        d4m.a aVarA9 = e4m.b.a(eVar10.f179372g);
                        nli.a aVar23 = new nli.a((t80.c) eVar10.f179373h.get(), f60.t.a((com.revolut.kompot.navigable.a) eVar10.e.get()));
                        t80.g gVar2 = (t80.g) eVar10.f.get();
                        zk0.b bVarL = eVar10.f179371c.f179385g.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar21, new t80.v(aVarA8, activityA, gVar, aVar22, aVarA9, aVar23, new oli.c(gVar2, bVarL, new nli.a((t80.c) eVar10.f179373h.get(), f60.t.a((com.revolut.kompot.navigable.a) eVar10.e.get())), f60.v.a((com.revolut.kompot.navigable.a) eVar10.e.get()), eVar10.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) eVar10.e.get())), v1.c.e((com.revolut.kompot.navigable.a) eVar10.e.get()), new ami.n(e4m.b.a(eVar10.i), 1), e4m.b.a(eVar10.f179372g), (t80.g) eVar10.f.get(), new nli.a((t80.c) eVar10.f179373h.get(), f60.t.a((com.revolut.kompot.navigable.a) eVar10.e.get())), new i90.b(), eVar10.b(), eVar10.c()), eVar10.c()), f60.x.a(), (rp0.m) eVar10.f179374j.get(), (e60.t) eVar10.f179375l.get());
                    case 2:
                        f80.a aVarX = eVar9.x();
                        vc.s.j(aVarX);
                        return new t80.x(aVarX, new i90.b());
                    case 3:
                        com.revolut.kompot.navigable.a aVar24 = (com.revolut.kompot.navigable.a) eVar10.e.get();
                        f60.y.a(aVar24);
                        return pli.c.a(new ks0.n(aVar24));
                    case 4:
                        vyc.e.Companion.getClass();
                        return new t80.c(new e.a(null), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.z.a();
                    case 7:
                        aii.o oVar = (aii.o) eVar10.k.get();
                        y80.a aVarR = eVar9.r();
                        vc.s.j(aVarR);
                        return new e60.y(oVar, aVarR, eVar10.b(), Optional.empty());
                    case 8:
                        e60.t tVar = (e60.t) eVar10.f179375l.get();
                        f60.w.a(tVar);
                        return tVar;
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                k26.c cVar3 = (k26.c) this.f177578b;
                k26.d dVar8 = (k26.d) this.d;
                int i32 = this.f177579c;
                switch (i32) {
                    case 0:
                        zq.a provider = cVar3.f180373a.a();
                        w7j.a model = (w7j.a) dVar8.e.get();
                        DeFiAssetDetailsScreen view = (DeFiAssetDetailsScreen) dVar8.f.get();
                        n26.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(view, "screen");
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(view, "view");
                        return new aah.g(view, model);
                    case 1:
                        zq.a provider2 = cVar3.f180373a.a();
                        w7j.b dataSource = (w7j.b) dVar8.d.get();
                        n26.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                        eVar = new e8j.e(dataSource, (e8j.b) provider2.f324335b, (f80.a) provider2.f324336c);
                        return eVar;
                    case 2:
                        g26.b bVarA2 = cVar3.f180374b.a();
                        vc.s.j(bVarA2);
                        aVar = new m26.a(bVarA2);
                        return aVar;
                    case 3:
                        ViewController screen = dVar8.f180379a;
                        r26.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (DeFiAssetDetailsScreen) screen;
                    case 4:
                        f4h.a provider3 = cVar3.f180373a.b();
                        c8j.c model2 = (c8j.c) dVar8.i.get();
                        DeFiAssetDetailsScreen view2 = (DeFiAssetDetailsScreen) dVar8.f.get();
                        t26.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        Intrinsics.checkNotNullParameter(model2, "model");
                        Intrinsics.checkNotNullParameter(view2, "screen");
                        Intrinsics.checkNotNullParameter(model2, "model");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        return new aah.g(view2, model2);
                    case 5:
                        f4h.a provider4 = cVar3.f180373a.b();
                        c8j.a dataSource2 = (c8j.a) dVar8.f180383h.get();
                        t26.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider4, "provider");
                        Intrinsics.checkNotNullParameter(dataSource2, "dataSource");
                        b.a statsExtraItemsExtension = b.a.f22237l;
                        Intrinsics.checkNotNullParameter(dataSource2, "dataSource");
                        Intrinsics.checkNotNullParameter(statsExtraItemsExtension, "statsExtraItemsExtension");
                        return new k8j.c(dataSource2, (k8j.f) provider4.f132229b, statsExtraItemsExtension);
                    case 6:
                        g26.b bVarA3 = cVar3.f180374b.a();
                        vc.s.j(bVarA3);
                        aVar = new s26.a(bVarA3);
                        return aVar;
                    case 7:
                        ev5.d dVarD = ((ku5.f) cVar3.f180375c).d();
                        vc.s.j(dVarD);
                        return qt5.h.a(dVarD, (pt5.s) dVar8.f180385l.get());
                    case 8:
                        ev5.d dVarD2 = ((ku5.f) cVar3.f180375c).d();
                        vc.s.j(dVarD2);
                        ev5.d dVarD3 = ((ku5.f) dVar8.f180381c.f180375c).d();
                        vc.s.j(dVarD3);
                        ev5.a activityWidgetTransactionsFilterProviderProvider = dVar8.f180381c.d.a();
                        r26.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(activityWidgetTransactionsFilterProviderProvider, "activityWidgetTransactionsFilterProviderProvider");
                        return qt5.g.a(dVarD2, qt5.f.a(dVarD3, Optional.of((d76.b) activityWidgetTransactionsFilterProviderProvider.f129738b)), (pt5.r) dVar8.f.get(), (pt5.m) dVar8.k.get());
                    case 9:
                        ev5.d dVarD4 = ((ku5.f) cVar3.f180375c).d();
                        vc.s.j(dVarD4);
                        ev5.a activityWidgetTransactionsFilterProviderProvider2 = dVar8.f180381c.d.a();
                        r26.a aVar25 = r26.b.Companion;
                        aVar25.getClass();
                        Intrinsics.checkNotNullParameter(activityWidgetTransactionsFilterProviderProvider2, "activityWidgetTransactionsFilterProviderProvider");
                        Optional optionalOf = Optional.of((d76.b) activityWidgetTransactionsFilterProviderProvider2.f129738b);
                        aVar25.getClass();
                        lt5.a aVar26 = lt5.a.DEFI;
                        vc.s.k(aVar26);
                        return qt5.i.a(dVarD4, optionalOf, Optional.of(aVar26));
                    case 10:
                        return new aah.g((p26.f) dVar8.f180388p.get(), (y7j.a) dVar8.f.get());
                    case 11:
                        DeFiAssetDetailsScreenContract$InputData deFiAssetDetailsScreenContract$InputData = dVar8.f180380b;
                        p26.c cVar4 = (p26.c) dVar8.f180387n.get();
                        g26.b bVarA4 = cVar3.f180374b.a();
                        vc.s.j(bVarA4);
                        a8j.a aVar27 = (a8j.a) dVar8.o.get();
                        o9j.b bVar7 = (o9j.b) cVar3.f180376g.f.get();
                        vc.s.j(bVar7);
                        return new p26.n(deFiAssetDetailsScreenContract$InputData, cVar4, bVarA4, aVar27, bVar7, new p26.e());
                    case 12:
                        e26.a aVar28 = (e26.a) cVar3.f180374b.k.get();
                        vc.s.j(aVar28);
                        t46.a aVar29 = (t46.a) cVar3.e.i.get();
                        vc.s.j(aVar29);
                        xv5.c cVarA2 = cVar3.f.a();
                        vc.s.j(cVarA2);
                        eVar = new p26.c(aVar28, aVar29, cVarA2, dVar8.f180380b);
                        return eVar;
                    case 13:
                        DeFiAssetDetailsScreenContract$InputData inputData3 = dVar8.f180380b;
                        Intrinsics.checkNotNullParameter(inputData3, "inputData");
                        nd.o provider5 = new nd.o();
                        q26.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider5, "provider");
                        j2 j2VarC = vkm.q.c(a8j.b.LINE);
                        od0.h hVar4 = od0.i.Companion;
                        qta.f fVar3 = qta.f.DAY;
                        hVar4.getClass();
                        return new a8j.a(j2VarC, vkm.q.c(od0.h.a(fVar3)), vkm.q.c(od0.i.f224256b), vkm.q.c(inputData3.f71679a));
                    case 14:
                        return new aah.g((o26.b) dVar8.f.get(), (o26.a) dVar8.f180390r.get());
                    case 15:
                        eVar = new o26.g(dVar8.f180380b, cVar3.f180377h.a(), new f8j.a());
                        return eVar;
                    case 16:
                        l26.h hVar5 = new l26.h(dVar8.f180380b, (pt5.f) dVar8.f180392t.get());
                        DeFiAssetDetailsScreenContract$InputData deFiAssetDetailsScreenContract$InputData2 = dVar8.f180380b;
                        g26.b bVarA5 = cVar3.f180374b.a();
                        vc.s.j(bVarA5);
                        p26.f fVar4 = (p26.f) dVar8.f180388p.get();
                        p26.c cVar5 = (p26.c) dVar8.f180387n.get();
                        c8j.c cVar6 = (c8j.c) dVar8.i.get();
                        w7j.a aVar30 = (w7j.a) dVar8.e.get();
                        sh5.d dVarF = cVar3.i.f();
                        vc.s.j(dVarF);
                        o26.a aVar31 = (o26.a) dVar8.f180390r.get();
                        pt5.m mVar = (pt5.m) dVar8.k.get();
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) cVar3.f180378j).c();
                        vc.s.j(aVarC2);
                        aVar = new l26.f(hVar5, deFiAssetDetailsScreenContract$InputData2, bVarA5, fVar4, cVar5, cVar6, aVar30, dVarF, aVar31, mVar, aVarC2);
                        return aVar;
                    case 17:
                        ev5.d dVarD5 = ((ku5.f) cVar3.f180375c).d();
                        vc.s.j(dVarD5);
                        return qt5.e.a(dVarD5);
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                return a();
            case 9:
                k2e.j jVar = (k2e.j) this.f177578b;
                k2e.l lVar = (k2e.l) this.d;
                int i33 = this.f177579c;
                if (i33 == 0) {
                    Object extension6 = (mub.b) lVar.d.get();
                    Intrinsics.checkNotNullParameter(extension6, "extension");
                    yji.n nVar4 = (yji.n) extension6;
                    vc.s.k(nVar4);
                    return nVar4;
                }
                if (i33 != 1) {
                    if (i33 == 2) {
                        return new com.revolut.feature.store.impl.ui.home.b(new com.revolut.feature.store.impl.ui.home.c(lVar.f180530b.d()), lVar.f180529a, jVar.d(), (g2e.b) jVar.z.get(), (g2e.e) jVar.A.get(), (mub.b) lVar.d.get());
                    }
                    throw new AssertionError(i33);
                }
                jid.z factory5 = jVar.f180511b.h();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Object obj2 = ((phm.a) factory5.f174461b).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                mub.b bVar8 = (mub.b) obj2;
                vc.s.k(bVar8);
                return bVar8;
            case 10:
                return b();
            case 11:
                return c();
            case 12:
                return d();
            case 13:
                return e();
            case 14:
                return f();
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case 20:
                return l();
            case 21:
                return m();
            case 22:
                return n();
            case 23:
                return o();
            case 24:
                return p();
            case 25:
                return q();
            case 26:
                return r();
            case 27:
                int i43 = this.f177579c;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new vs9.a();
                    }
                    throw new AssertionError(i43);
                }
                kr9.d dVar9 = (kr9.d) this.d;
                GroupChatTrustedScreenContract$InputData groupChatTrustedScreenContract$InputData = dVar9.f188713a;
                jki.p pVar = (jki.p) dVar9.f188714b.get();
                mq9.f fVarC = ((kr9.l) this.f177578b).f188757b.c();
                vc.s.j(fVarC);
                return new vs9.l(groupChatTrustedScreenContract$InputData, pVar, fVarC);
            case 28:
                return s();
            default:
                kr9.l lVar2 = (kr9.l) this.f177578b;
                kr9.f fVar5 = (kr9.f) this.d;
                int i59 = this.f177579c;
                switch (i59) {
                    case 0:
                        return f0k.d.o((e60.a) fVar5.f188734m.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar32 = (com.revolut.kompot.navigable.a) fVar5.e.get();
                        g60.a aVarA10 = f60.n.a((com.revolut.kompot.navigable.a) fVar5.e.get());
                        Activity activityA2 = f60.l.a((com.revolut.kompot.navigable.a) fVar5.e.get());
                        t80.g gVar3 = (t80.g) fVar5.f.get();
                        com.revolut.kompot.navigable.a aVar33 = (com.revolut.kompot.navigable.a) fVar5.e.get();
                        f60.q.a(aVar33);
                        d4m.a aVarA11 = e4m.b.a(fVar5.f188730g);
                        nli.a aVar34 = new nli.a((t80.c) fVar5.f188731h.get(), f60.l.a((com.revolut.kompot.navigable.a) fVar5.e.get()));
                        t80.g gVar4 = (t80.g) fVar5.f.get();
                        zk0.b bVarL2 = fVar5.f188729c.f188760h.l();
                        vc.s.j(bVarL2);
                        return f0k.d.u(aVar32, new t80.v(aVarA10, activityA2, gVar3, aVar33, aVarA11, aVar34, new oli.c(gVar4, bVarL2, new nli.a((t80.c) fVar5.f188731h.get(), f60.l.a((com.revolut.kompot.navigable.a) fVar5.e.get())), f60.n.a((com.revolut.kompot.navigable.a) fVar5.e.get()), fVar5.e()), new oli.g(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) fVar5.e.get())), pli.b.a(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) fVar5.e.get()))), new ami.n(e4m.b.a(fVar5.i), 1), e4m.b.a(fVar5.f188730g), (t80.g) fVar5.f.get(), new nli.a((t80.c) fVar5.f188731h.get(), f60.l.a((com.revolut.kompot.navigable.a) fVar5.e.get())), new i90.b(), fVar5.d(), fVar5.e()), fVar5.e()), f60.p.a(), (rp0.m) fVar5.f188732j.get(), (e60.t) fVar5.f188733l.get(), new nji.b());
                    case 2:
                        f80.a aVarX2 = lVar2.f188760h.x();
                        vc.s.j(aVarX2);
                        xVar = new t80.x(aVarX2, new i90.b());
                        return xVar;
                    case 3:
                        com.revolut.kompot.navigable.a aVar35 = (com.revolut.kompot.navigable.a) fVar5.e.get();
                        f60.q.a(aVar35);
                        return pli.c.a(new ks0.n(aVar35));
                    case 4:
                        at9.a.Companion.getClass();
                        return new t80.c(new e.a("PaymentsGroups_Customization"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.r.a();
                    case 7:
                        aii.o oVar2 = (aii.o) fVar5.k.get();
                        y80.a aVarR2 = lVar2.f188760h.r();
                        vc.s.j(aVarR2);
                        yVar = new e60.y(oVar2, aVarR2, fVar5.d(), Optional.empty());
                        return yVar;
                    case 8:
                        return kxa.j.l((j60.a) fVar5.f188736p.get());
                    case 9:
                        return h30.l.p((com.revolut.kompot.navigable.a) fVar5.e.get(), (rp0.m) fVar5.o.get());
                    case 10:
                        return new rp0.m();
                    case 11:
                        e60.t tVar2 = (e60.t) fVar5.f188733l.get();
                        f60.o.a(tVar2);
                        return tVar2;
                    case 12:
                        GroupCustomizationScreenContract$InputData groupCustomizationScreenContract$InputData = fVar5.f188727a;
                        kr9.l lVar3 = fVar5.f188729c;
                        mq9.f fVarC2 = lVar3.f188757b.c();
                        vc.s.j(fVarC2);
                        fk3.a aVarA12 = lVar3.f188772y.a();
                        vc.s.j(aVarA12);
                        pak.h hVar6 = new pak.h(aVarA12);
                        wsg.n nVarB3 = lVar3.z.b();
                        bn2.p pVarB = lVar3.A.b();
                        vc.s.j(pVarB);
                        zs9.e eVar11 = new zs9.e(fVarC2, hVar6, nVarB3, pVarB);
                        vr9.a aVar36 = new vr9.a();
                        g2j.f fVar6 = lVar2.B;
                        l2j.a aVar37 = new l2j.a();
                        j60.a aVar38 = (j60.a) fVar5.f188736p.get();
                        e60.a aVar39 = (e60.a) fVar5.f188734m.get();
                        f01.a aVar40 = (f01.a) fVar5.f188739s.get();
                        nq9.c cVarC = lVar3.f188765p.c();
                        vc.s.j(cVarC);
                        wr9.e eVar12 = new wr9.e(cVarC);
                        jki.p pVar2 = (jki.p) fVar5.f188740t.get();
                        n8b.a aVarA13 = lVar2.C.a();
                        vc.s.j(aVarA13);
                        yVar = new zs9.z(groupCustomizationScreenContract$InputData, eVar11, aVar36, aVar37, aVar38, aVar39, aVar40, eVar12, pVar2, aVarA13);
                        return yVar;
                    case 13:
                        BaseScreen screen2 = fVar5.f188728b;
                        at9.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen2, "screen");
                        xVar = new f01.c(screen2.m2());
                        return xVar;
                    case 14:
                        Intrinsics.checkNotNullParameter(new tr9.h(), "mapper");
                        return new zs9.g();
                    default:
                        throw new AssertionError(i59);
                }
        }
    }
}
