package m2b;

import akl.f0;
import akl.o0;
import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlowContract$InputData;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.p2m.registration.WeroP2MRegistrationFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlowContract$InputData;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreenContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.JuniorPaymentsSettingsExplanatoryControllerContract$Input;
import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$InputData;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreenContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheetContract$InputData;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f201894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f201895c;

    public /* synthetic */ r(Object obj2, qji.b bVar, int i) {
        this.f201893a = i;
        this.f201894b = obj2;
        this.f201895c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f201893a) {
            case 0:
                return new m4b.g(((v) this.f201894b).A.a(), new m4b.f(((s) this.f201895c).f201896a));
            case 1:
                p pVar = (p) this.f201894b;
                return new q4b.j(pVar.q(), ((e0) this.f201895c).f201816b, (t2b.f) pVar.k.get(), new q4b.h());
            case 2:
                m mVar = (m) this.f201894b;
                return new q4b.j(mVar.q(), ((e0) this.f201895c).f201816b, (t2b.f) mVar.f201857l.get(), new q4b.h());
            case 3:
                return new com.revolut.feature.cash_topup.impl.ui.flow.select_store.a(((mb3.u) this.f201895c).f204105a, new nb3.c(), ((mb3.p) this.f201894b).f204092b.a());
            case 4:
                gc3.c cVar = ((mb3.z) this.f201895c).f204118a;
                mb3.p pVar2 = (mb3.p) this.f201894b;
                dj3.a aVarA = pVar2.f204091a.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.cash_topup.impl.ui.flow.select.a(cVar, aVarA, pVar2.f204092b.a(), new nb3.c());
            case 5:
                oj2.j jVar = new oj2.j();
                ArticleWebViewScreenContract$InputData articleWebViewScreenContract$InputData = ((mj2.a) this.f201895c).f205899a;
                mj2.b bVar = (mj2.b) this.f201894b;
                y69.a aVar = (y69.a) bVar.f205901a.C.get();
                vc.s.j(aVar);
                return new oj2.i(jVar, articleWebViewScreenContract$InputData, aVar, ((s41.a) bVar.f205902b).d());
            case 6:
                uj8.k kVar = new uj8.k();
                hj8.a aVarA2 = ((mj8.h) this.f201894b).f205966b.a();
                vc.s.j(aVarA2);
                return new uj8.i(kVar, aVarA2, ((mj8.c) this.f201895c).f205953a);
            case 7:
                sj8.c cVar2 = ((mj8.d) this.f201895c).f205955a;
                mj8.h hVar = (mj8.h) this.f201894b;
                til.m mVarA = hVar.f205965a.a();
                vc.s.j(mVarA);
                mj8.b bVar2 = hVar.f205966b;
                qj8.l lVar = (qj8.l) bVar2.f205952p.get();
                CoroutineScope coroutineScopeA = bVar2.f.a();
                vc.s.j(coroutineScopeA);
                return new com.revolut.feature.junior_profile.impl.ui.flow.details.a(cVar2, mVarA, new kge.d(lVar, coroutineScopeA));
            case 8:
                mj8.e eVar = (mj8.e) this.f201895c;
                wj8.b detailsMapper = new wj8.b();
                wj8.d0 juniorProfileDynamicFieldsMapper = new wj8.d0();
                Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
                Intrinsics.checkNotNullParameter(juniorProfileDynamicFieldsMapper, "juniorProfileDynamicFieldsMapper");
                wj8.v vVar = new wj8.v();
                wj8.i iVar = eVar.f205958a;
                mj8.h hVar2 = (mj8.h) this.f201894b;
                mj8.b bVar3 = hVar2.f205966b;
                hj8.a aVarA3 = bVar3.a();
                vc.s.j(aVarA3);
                qj8.l lVar2 = (qj8.l) bVar3.f205952p.get();
                CoroutineScope coroutineScopeA2 = bVar3.f.a();
                vc.s.j(coroutineScopeA2);
                kge.d dVar = new kge.d(lVar2, coroutineScopeA2);
                mj8.h hVar3 = eVar.f205959b;
                wsg.n nVarB = hVar3.f205967c.b();
                kd8.e eVarA = hVar3.d.a();
                vc.s.j(eVarA);
                nj8.a aVar2 = new nj8.a(nVarB, eVarA);
                jvh.a aVarA4 = hVar2.e.a();
                vc.s.j(aVarA4);
                return new wj8.c0(vVar, iVar, aVarA3, dVar, aVar2, aVarA4);
            case 9:
                yj8.j jVar2 = new yj8.j();
                yj8.d dVar2 = ((mj8.f) this.f201895c).f205961a;
                hj8.a aVarA5 = ((mj8.h) this.f201894b).f205966b.a();
                vc.s.j(aVarA5);
                return new yj8.h(jVar2, dVar2, aVarA5);
            case 10:
                mj8.g gVar = (mj8.g) this.f201895c;
                bk8.b.Companion.getClass();
                ak8.l lVar3 = new ak8.l(new zzl.c());
                ak8.f fVar = gVar.f205963a;
                hj8.a aVarA6 = ((mj8.h) this.f201894b).f205966b.a();
                vc.s.j(aVarA6);
                return new ak8.k(lVar3, fVar, aVarA6);
            case 11:
                AccountDetailsScreenContract$InputData accountDetailsScreenContract$InputData = ((mjl.a) this.f201895c).f206066a;
                mjl.m mVar2 = (mjl.m) this.f201894b;
                return new bpl.j(accountDetailsScreenContract$InputData, (o0) mVar2.D.get(), mVar2.f206102l.a(), new bpl.m(new tll.r()));
            case 12:
                ConnectedClientDisconnectBottomSheetContract$InputData connectedClientDisconnectBottomSheetContract$InputData = ((mjl.g) this.f201895c).f206081a;
                return new opl.d(connectedClientDisconnectBottomSheetContract$InputData, (f0) ((mjl.m) this.f201894b).H.get(), new opl.f(connectedClientDisconnectBottomSheetContract$InputData));
            case 13:
                mjl.m mVar3 = (mjl.m) this.f201894b;
                akl.b0 b0VarB = mVar3.b();
                RevolutIDFlowContract$InputData revolutIDFlowContract$InputData = ((mjl.n) this.f201895c).f206113a;
                zja.a aVarA7 = ((ika.b) mVar3.f206108s).a();
                vc.s.j(aVarA7);
                bjl.o0 o0Var = (bjl.o0) mVar3.O.get();
                qqk.b bVar4 = mVar3.f206102l;
                return new com.revolut.sso.impl.ui.revolut_id.c(b0VarB, revolutIDFlowContract$InputData, aVarA7, o0Var, bVar4.a(), bVar4.b());
            case 14:
                wzg.a aVarE = ((mkh.s) this.f201894b).d.e();
                vc.s.j(aVarE);
                return new com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.c(aVarE, ((mkh.d) this.f201895c).f206318a);
            case 15:
                JuniorAuthQrScannerFlowContract$InputData juniorAuthQrScannerFlowContract$InputData = ((mn8.i) this.f201895c).f207438a;
                mn8.o oVar = (mn8.o) this.f201894b;
                hj8.a aVarA8 = oVar.f.a();
                vc.s.j(aVarA8);
                q06.d dVarA = oVar.f207475t.a();
                vc.s.j(dVarA);
                return new com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b(juniorAuthQrScannerFlowContract$InputData, aVarA8, dVarA);
            case 16:
                JuniorPaymentsSettingsExplanatoryControllerContract$Input juniorPaymentsSettingsExplanatoryControllerContract$Input = ((mn8.j) this.f201895c).f207440a;
                po8.j jVar3 = new po8.j(juniorPaymentsSettingsExplanatoryControllerContract$Input);
                mn8.o oVar2 = (mn8.o) this.f201894b;
                t1 t1VarA = oVar2.f207464c.a();
                kd8.e eVarA2 = oVar2.d.a();
                vc.s.j(eVarA2);
                return new po8.h(jVar3, juniorPaymentsSettingsExplanatoryControllerContract$Input, t1VarA, eVarA2);
            case 17:
                mn8.n nVar = (mn8.n) this.f201895c;
                qd0.b bVarN = nVar.f207460b.f207462a.n();
                vc.s.j(bVarN);
                i3g.k kVar2 = new i3g.k(new vn8.f(bVarN));
                mo8.e eVar2 = nVar.f207459a;
                mn8.o oVar3 = (mn8.o) this.f201894b;
                hj8.a aVarA9 = oVar3.f.a();
                vc.s.j(aVarA9);
                return new mo8.h(kVar2, eVar2, aVarA9, oVar3.f207464c.a());
            case 18:
                mn8.b bVar5 = ((mn8.o) this.f201894b).f207464c;
                kgm.c cVarC = bVar5.c();
                k18.c cVarB = bVar5.b();
                mn8.p pVar3 = (mn8.p) this.f201895c;
                no8.g gVar2 = pVar3.f207477a;
                z80.b bVarS = pVar3.f207478b.f207462a.s();
                vc.s.j(bVarS);
                return new com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b(cVarC, cVarB, gVar2, new com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.a(bVarS));
            case 19:
                mn8.o oVar4 = (mn8.o) this.f201894b;
                return new ro8.j(oVar4.f207464c.b(), oVar4.f207474s.a(), ((mn8.q) this.f201895c).f207480a, new ro8.k());
            case 20:
                mtb.b bVar6 = (mtb.b) this.f201895c;
                nbb.d provider = ((nbb.a) bVar6.f208791b.f208799a).a();
                vc.s.j(provider);
                stb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return new qtb.g(((mtb.d) this.f201894b).f208800b.b(), bVar6.c(), bVar6.b(), new qtb.k());
            case 21:
                mtb.c cVar3 = (mtb.c) this.f201895c;
                return new com.revolut.feature.rev10_main_screen.impl.ui.slide.a(cVar3.f208796a, (jtb.b) ((mtb.d) this.f201894b).f208802g.get(), new t1j.b(cVar3.f208797b), l70.u.a());
            case 22:
                mva.c cVar4 = (mva.c) this.f201895c;
                PaymentHistoryContract$InputData paymentHistoryContract$InputData = cVar4.f209202a;
                whf.n nVarB2 = cVar4.f209203b.f209205a.b();
                vc.s.j(nVarB2);
                rva.h hVar4 = new rva.h(nVarB2);
                anf.b bVar7 = new anf.b(new j9l.a(), 2);
                mva.d dVar3 = (mva.d) this.f201894b;
                whf.b bVarA = dVar3.f209205a.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a(paymentHistoryContract$InputData, hVar4, bVar7, bVarA, ((ku5.f) dVar3.f209206b).c(), new nva.a());
            case 23:
                PayToTopupFlowContract$InputData payToTopupFlowContract$InputData = ((nb2.d) this.f201895c).f213970a;
                xg6.b0 b0Var = (xg6.b0) ((xf6.t) ((nb2.b) this.f201894b).f213963h).f305063d0.get();
                vc.s.j(b0Var);
                return new com.revolut.feature.apm.payto.impl.screen.topup.flow.b(payToTopupFlowContract$InputData, b0Var);
            case 24:
                yb2.e eVar3 = ((nb2.f) this.f201895c).f213976a;
                nb2.b bVar8 = (nb2.b) this.f201894b;
                wj0.a aVarI = ((nj0.d) bVar8.f213964j).i();
                vc.s.j(aVarI);
                u51.a aVarA10 = bVar8.k.a();
                vc.s.j(aVarA10);
                oe6.a aVarA11 = bVar8.f213965l.a();
                vc.s.j(aVarA11);
                xg6.b0 b0Var2 = (xg6.b0) ((xf6.t) bVar8.f213963h).f305063d0.get();
                vc.s.j(b0Var2);
                return new yb2.r(eVar3, aVarI, aVarA10, aVarA11, b0Var2, new yb2.k());
            case 25:
                nh2.q qVar = (nh2.q) this.f201895c;
                WeroNavigation$InputData weroNavigation$InputData = qVar.f215337a;
                nh2.o oVar5 = (nh2.o) this.f201894b;
                qh2.a aVarA12 = oVar5.f215314b.a();
                vc.s.j(aVarA12);
                nh2.o oVar6 = qVar.f215338b;
                return new com.revolut.feature.apm.wero.impl.ui.flow.b(weroNavigation$InputData, aVarA12, new sh2.d((c12.f) oVar6.f215328x.get()), new f62.o((c12.z) oVar6.f215329y.get(), 1), (d12.b) oVar5.v.get(), (c12.r) oVar5.f215327w.get());
            case 26:
                WeroP2MFlowContract$InputData weroP2MFlowContract$InputData = ((nh2.t) this.f201895c).f215351a;
                nh2.o oVar7 = (nh2.o) this.f201894b;
                return new com.revolut.feature.apm.wero.impl.ui.p2m.b(weroP2MFlowContract$InputData, (d12.b) oVar7.v.get(), (c12.r) oVar7.f215327w.get());
            case 27:
                WeroP2MRegistrationFlowContract$InputData weroP2MRegistrationFlowContract$InputData = ((nh2.u) this.f201895c).f215353a;
                nh2.o oVar8 = (nh2.o) this.f201894b;
                qh2.a aVarA13 = oVar8.f215314b.a();
                vc.s.j(aVarA13);
                wj0.a aVarI2 = ((nj0.d) oVar8.e).i();
                vc.s.j(aVarI2);
                return new com.revolut.feature.apm.wero.impl.ui.p2m.registration.a(weroP2MRegistrationFlowContract$InputData, aVarA13, aVarI2);
            case 28:
                WeroRegistrationFlowContract$InputData weroRegistrationFlowContract$InputData = ((nh2.y) this.f201895c).f215362a;
                nh2.o oVar9 = (nh2.o) this.f201894b;
                qh2.a aVarA14 = oVar9.f215314b.a();
                vc.s.j(aVarA14);
                wj0.a aVarI3 = ((nj0.d) oVar9.e).i();
                vc.s.j(aVarI3);
                return new com.revolut.feature.apm.wero.impl.ui.registration.a(weroRegistrationFlowContract$InputData, aVarA14, aVarI3);
            default:
                WeroNavigation$InputData weroNavigation$InputData2 = ((nh2.b0) this.f201895c).f215274a;
                uw1.c cVarD = ((lz1.m) ((nh2.o) this.f201894b).f215313a).d();
                vc.s.j(cVarD);
                return new com.revolut.feature.apm.wero.impl.ui.wrapper.b(weroNavigation$InputData2, cVarD);
        }
    }
}
