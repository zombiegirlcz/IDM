package hg4;

import ael.y;
import android.net.Uri;
import aw0.d8;
import bjl.e0;
import bjl.g0;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.data.model.Data;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details.PersonalDetailsScreen;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$Step;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlowContract$Step;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.a;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlowContract$InputData;
import hk9.a0;
import hm3.e;
import ip3.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.f0;
import lbk.c;
import nii.y0;
import s7a.c0;
import skm.p0;
import te8.z;
import vkm.j2;
import we6.v0;
import we6.z0;
import xn6.j;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f152085b;

    public /* synthetic */ a(hp2.m mVar, hp2.f fVar) {
        this.f152084a = 25;
        this.f152085b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        String str;
        String str2;
        AccountDetails.LinkedAccount linkedAccount;
        int i = this.f152084a;
        int i2 = 6;
        int i3 = 18;
        int i5 = 5;
        int i6 = 3;
        int i21 = 0;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj4 = this.f152085b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                KProperty[] kPropertyArr = PersonalDetailsScreen.W;
                u uVar = (u) ((PersonalDetailsScreen) obj4).R2();
                uVar.H2(uVar.f152106r, new g7b.q(zBooleanValue, 13));
                return Unit.f186387a;
            case 1:
                return hgb.k.a((hgb.k) obj2, null, (do3.g) obj4, false, 5);
            case 2:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                ((com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b) obj4).C2(new a.C0612a(false));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferConfirmationOrchestratorFlowModel", null, e, h0Var);
                return Boolean.FALSE;
            case 3:
                z0 result = (z0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ((hh6.p) obj4).x2(new ch6.l(result, 1));
                return Unit.f186387a;
            case 4:
                WatchlistAddAssetFlowContract$LaunchMode watchlistAddAssetFlowContract$LaunchMode = (WatchlistAddAssetFlowContract$LaunchMode) obj4;
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Iterator it9 = it8.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((Watchlist) next).f86895a, ((WatchlistAddAssetFlowContract$LaunchMode.WatchlistSelection) watchlistAddAssetFlowContract$LaunchMode).f86944a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Watchlist watchlist = (Watchlist) next;
                if (watchlist != null) {
                    return watchlist.d;
                }
                return null;
            case 5:
                ogd.e eVar = (ogd.e) obj4;
                hhd.h update = (hhd.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LinkedHashMap linkedHashMapZ = r0.z(update.f152394c);
                Iterable iterable = (Set) linkedHashMapZ.get(eVar.f225109a.d);
                if (iterable == null) {
                    iterable = h0.f322473a;
                }
                Set setH1 = d0.h1(iterable);
                if (!setH1.add(eVar)) {
                    setH1.remove(eVar);
                }
                linkedHashMapZ.put(eVar.f225109a.d, setH1);
                return hhd.h.a(update, null, null, linkedHashMapZ, null, null, 27);
            case 6:
                hi2.e update2 = (hi2.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return hi2.e.a(update2, null, null, ((hi2.e) ((j2) ((hi2.n) obj4).f152469t.f22677a).getValue()).f152454c + 1, 3);
            case 7:
                return hi2.e.a((hi2.e) obj2, null, (hi2.f) obj4, 0, 5);
            case 8:
                com.revolut.feature.shops.impl.flow.checkout.b bVar = (com.revolut.feature.shops.impl.flow.checkout.b) obj4;
                hub.b it10 = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (it10.f155599b) {
                    bVar.H2(bVar.f87093r, new hhd.n(i2));
                    oki.h.w2(bVar.f87092q, new ModalCheckoutFlowContract$Step.CampaignCheckout(bVar.o.f87088a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 9:
                hje.i iVar = (hje.i) obj4;
                List notificationSettingsList = (List) obj2;
                Intrinsics.checkNotNullParameter(notificationSettingsList, "notificationSettingsList");
                Iterator it11 = notificationSettingsList.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next3 = it11.next();
                        if (((soa.b) next3).f264801a == soa.c.CRYPTOCURRENCY_VOLATILITY) {
                            obj3 = next3;
                        }
                    }
                }
                soa.b bVar2 = (soa.b) obj3;
                if (bVar2 == null) {
                    return efm.d0.m(Boolean.TRUE);
                }
                ufm.c cVar = new ufm.c(new fag.g(bVar2, iVar, 9), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return new ufm.i(cVar, new hje.e(new hhd.n(11), i5), 1);
            case 10:
                hje.n nVar = (hje.n) obj4;
                Boolean deeplinkWasHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkWasHandled, "deeplinkWasHandled");
                return deeplinkWasHandled.booleanValue() ? efm.d0.m(Boolean.TRUE) : te0.w.o0(p0.f264003c, new hg0.n(nVar, objArr == true ? 1 : 0, i2));
            case 11:
                hk4.b bVar3 = (hk4.b) obj4;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList<io3.d> arrayList = new ArrayList();
                for (Object obj5 : pockets) {
                    io3.d dVar = (io3.d) obj5;
                    if (dVar.f == io3.k.ACTIVE && h30.l.D(xi0.b.Companion, dVar.f163147c)) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (io3.d dVar2 : arrayList) {
                    List list = dVar2.f163157s;
                    String str3 = dVar2.f163147c;
                    Iterator it12 = list.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next2 = it12.next();
                            LinkedHashMap linkedHashMap = ((io3.e) next2).f163162c;
                            if (linkedHashMap.get("ROUTING_NUMBER") != null || linkedHashMap.get("ROUTING") != null) {
                                if (linkedHashMap.get("ACCOUNT_NUMBER") != null) {
                                }
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    io3.e eVar2 = (io3.e) next2;
                    if (eVar2 == null) {
                        linkedAccount = null;
                    } else {
                        LinkedHashMap linkedHashMap2 = eVar2.f163162c;
                        String str4 = (String) linkedHashMap2.get("ACCOUNT_NUMBER");
                        if (str4 == null) {
                            m70.a.c(t0.f186434a);
                            str4 = "";
                        }
                        String strV0 = f0.V0(4, str4);
                        xi0.b.Companion.getClass();
                        xi0.b bVarA = xi0.a.a(str3);
                        String str5 = dVar2.f163154p;
                        if (str5 == null) {
                            m70.a.c(t0.f186434a);
                            str = "";
                        } else {
                            str = str5;
                        }
                        Image imageB = ((di6.a) bVar3.f152848b).b(dVar2.f163156r);
                        if (imageB == null) {
                            imageB = new CountryImage(str3, (Integer) null, (ez0.e) null, 14);
                        }
                        Image image = imageB;
                        String str6 = (String) linkedHashMap2.get("ROUTING_NUMBER");
                        if (str6 == null) {
                            String str7 = (String) linkedHashMap2.get("ROUTING");
                            if (str7 == null) {
                                m70.a.c(t0.f186434a);
                                str2 = "";
                            } else {
                                str2 = str7;
                            }
                        } else {
                            str2 = str6;
                        }
                        m70.a.c(t0.f186434a);
                        linkedAccount = new AccountDetails.LinkedAccount(str, dVar2, bVarA, strV0, image, str2, str4, "");
                    }
                    if (linkedAccount != null) {
                        arrayList2.add(linkedAccount);
                    }
                }
                return arrayList2;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                m70.a.c(t0.f186434a);
                eVarB.add(new CenteredAmountDelegate.Model("INPUT_AMOUNT_ID", null, new bw0.h("", null, null, true, zhm.u.c(((a0) obj4).f152870b), Boolean.TRUE, false, false, bw0.e.Calculator, null, null, null, 31172), null, new bw0.m(null, bw0.l.LOADING, null, false, null, 24), null, null, false, false, null, null, 1898));
                return new hk9.l(zhm.u.a(eVarB), hk9.g.f152874a);
            case 13:
                return hl6.g.a((hl6.g) obj2, null, null, null, (hl6.i) obj4, null, 23);
            case 14:
                return hl6.g.a((hl6.g) obj2, null, null, null, null, (hl6.h) obj4, 15);
            case 15:
                hle.a aVar = (hle.a) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar2 = (od0.i) pair.f186385a;
                TradingAccounts tradingAccounts = (TradingAccounts) pair.f186386b;
                String str8 = (String) iVar2.g();
                List list2 = tradingAccounts.f105278a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list2) {
                    if (!Intrinsics.f(((TradingAccount) obj6).getF105264c(), str8)) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList<TradingAccount.Portfolio> arrayList4 = new ArrayList();
                Iterator it13 = arrayList3.iterator();
                while (it13.hasNext()) {
                    zhm.a0.x(((TradingAccount) it13.next()).J(), arrayList4);
                }
                if (arrayList4.isEmpty()) {
                    return zi0.c.i(zhm.f0.f322471a);
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                for (TradingAccount.Portfolio portfolio : arrayList4) {
                    ybl.d dVar3 = aVar.f153452c;
                    String string = portfolio.f105210a.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    arrayList5.add(((y) dVar3).e(string, w4l.j.f294644c));
                }
                return u0.k(arrayList5);
            case 16:
                hm3.j jVar = (hm3.j) obj4;
                lbk.c result2 = (lbk.c) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!Intrinsics.f(result2, c.a.f193705a)) {
                    if (!Intrinsics.f(result2, c.b.f193706a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.r2().M0(e.a.f153528b);
                }
                return Unit.f186387a;
            case 17:
                hma.g gVar = (hma.g) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    return nim.a.w(gVar.f153598a.q(), new hhd.n(27));
                }
                efm.r rVarJust = efm.r.just(new Data(Boolean.FALSE, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return rVarJust;
            case 18:
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                return soa.b.a((soa.b) obj4, false, null, (Boolean) optional.f224257a, 47);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new d8((ola.b) obj4);
            case 20:
                com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d dVar4 = (com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d) obj4;
                xn6.j result3 = (xn6.j) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof xn6.h) {
                    ExternalInstitution externalInstitution = ((xn6.h) result3).f307323a;
                    Collection collection = externalInstitution.d;
                    if (collection == null) {
                        collection = zhm.f0.f322471a;
                    }
                    if (!collection.isEmpty()) {
                        oki.h.t2(dVar4, dVar4.v, new PennyTopUpFlowContract$Step.Branches(externalInstitution), true, null, false, 12);
                    } else if (c6d.b.B(externalInstitution)) {
                        oki.h.t2(dVar4, dVar4.v, new PennyTopUpFlowContract$Step.PaymentInitiationService(externalInstitution, null, null), true, null, false, 12);
                    } else {
                        oki.h.t2(dVar4, dVar4.v, new PennyTopUpFlowContract$Step.AccountInformationService(externalInstitution, null, null), true, null, false, 12);
                    }
                } else if (result3 instanceof xn6.i) {
                    dVar4.C2(v0.f296684a);
                } else if (result3 instanceof xn6.g) {
                    int i22 = jli.h.f175850a;
                } else {
                    if (!Intrinsics.f(result3, j.a.f307325a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar4.B2();
                }
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (od0.i) ((hng.b) obj4).f154093b.get("SELECTED_REGISTERED_IDENTITY_ID");
            case 22:
                ho2.j jVar2 = (ho2.j) obj4;
                cli.y yVar = jVar2.f154216q;
                s7a.a0 data = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                c0 c0Var = data.f260599a;
                c8a.a aVar2 = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                String str9 = aVar2 != null ? aVar2.f22154a : null;
                if (str9 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected result when changing country: resultType=".concat(data.f260599a.getClass().getSimpleName()));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                    return Unit.f186387a;
                }
                wi0.b.Companion.getClass();
                wi0.b bVarA2 = wi0.a.a(str9);
                if (!bVarA2.equals(((ho2.e) ((j2) yVar.f22677a).getValue()).f154204a)) {
                    jVar2.H2(yVar, new ho2.i(0, jVar2.f154215p.j(bVarA2), bVarA2));
                }
                return Unit.f186387a;
            case 23:
                ho8.j jVar3 = (ho8.j) obj4;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                z zVar = jVar3.f154249q;
                CoparentsSettingsScreenContract$InputData coparentsSettingsScreenContract$InputData = jVar3.f154248p;
                efm.r rVarB = z.b(zVar, coparentsSettingsScreenContract$InputData.f77300a, true, 4);
                ao.h hVar = jVar3.f154251s;
                String userId = coparentsSettingsScreenContract$InputData.f77300a;
                efm.r rVarM = hVar.m(userId, true);
                hj8.a aVar3 = jVar3.f154252t;
                w4l.h hVar2 = w4l.h.f294642c;
                akg.n nVarA = hj8.a.a(aVar3, userId, hVar2);
                kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                efm.r rVarC = rd0.e.c(nVarA, gVar2);
                efm.r rVarO = jVar3.v.O(false);
                efm.r rVarK = jVar3.u.k(false);
                te8.e eVar3 = jVar3.f154250r;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(userId, "userId");
                return te0.w.r(rVarB, rVarM, rVarC, rVarO, rVarK, rd0.e.c(nim.a.v(te8.e.b(eVar3, hVar2), new te8.a(userId, i21)), gVar2), rd0.e.c(nim.a.v(hVar.q(vd8.g.d), new hmc.a(19)), gVar2), rd0.e.c(nim.a.v(hVar.q(vd8.i.d), new hmc.a(i3)), gVar2));
            case 24:
                List taxResidencies = (List) obj2;
                Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                efm.d0<ioe.k> certifications = ((joe.o) ((hoe.a) obj4).f154277a).f176939a.getCertifications();
                joe.j jVar4 = joe.j.f;
                joe.e eVar4 = new joe.e(i6);
                certifications.getClass();
                ufm.i iVar3 = new ufm.i(certifications, eVar4, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                int i32 = 23;
                efm.r map = te0.w.i0(iVar3).x().map(new hje.e(new fvk.q(taxResidencies, i32), i32));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new hp2.h(zhm.f0.f322471a, hp2.m.a((hp2.f) obj4), null, false, false);
            case 26:
                CorporateEventsHomeScreen.Companion aVar4 = CorporateEventsHomeScreen.INSTANCE;
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return Boolean.valueOf(((CorporateEventsHomeScreen) obj4).d3().f307592b.f59421x0);
            case 27:
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar4 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) obj4;
                ip3.h it14 = (ip3.h) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                if (it14 instanceof ip3.i) {
                    bVar4.A.onNext(((ip3.i) it14).f167634a);
                } else if (!Intrinsics.f(it14, h.a.f167633a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 28:
                hql.e eVar5 = (hql.e) obj4;
                bjl.h0 result4 = (bjl.h0) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                SignInWithRevolutIdFlowContract$InputData signInWithRevolutIdFlowContract$InputData = eVar5.o;
                yki.a aVar5 = eVar5.f154743q;
                Uri uri2 = Uri.parse(signInWithRevolutIdFlowContract$InputData.d);
                if (result4 instanceof g0) {
                    g0 g0Var = (g0) result4;
                    String string2 = uri2.buildUpon().appendQueryParameter("code", g0Var.f16167a).appendQueryParameter("state", g0Var.f16168b).build().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    eVar5.C1(new ExternalDestination.Browser(string2, null));
                    oki.h.D2(aVar5);
                } else if (Intrinsics.f(result4, e0.f16164a)) {
                    String string3 = uri2.buildUpon().appendQueryParameter("error", "user_cancelled").appendQueryParameter("state", signInWithRevolutIdFlowContract$InputData.e).build().toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    eVar5.C1(new ExternalDestination.Browser(string3, null));
                    oki.h.D2(aVar5);
                } else {
                    if (!Intrinsics.f(result4, bjl.f0.f16165a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.b1(eVar5, eVar5.X1(new y0("DIALOG_ID_SOMETHING_WENT_WRONG", new nii.z(new TextLocalisedClause(R$string.revolut_sso_core_challenge_popup_failed_general, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_merchant_permissions_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, new hql.d(uri2, eVar5, null), 3);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.terminated_users.impl.ui.logout_confirmation.b bVar5 = (com.revolut.feature.terminated_users.impl.ui.logout_confirmation.b) obj4;
                dii.g result5 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof dii.f) {
                    bVar5.l2(new hg0.n(bVar5, bVar5.f90353q.e, objArr2 == true ? 1 : 0, i3), new yi5.b(26));
                } else {
                    if (!(result5 instanceof dii.e)) {
                        if ((result5 instanceof dii.b) || (result5 instanceof dii.c) || (result5 instanceof dii.d)) {
                            throw new IllegalStateException("Action is not supported");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar5.C2(a.C0558a.f90351a);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f152084a = i;
        this.f152085b = obj2;
    }
}
