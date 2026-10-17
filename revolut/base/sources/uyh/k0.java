package uyh;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.MutableWindowInsets;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.sqlite.SQLiteConnection;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$State;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlowContract$Step;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.FreelancerCreateSubaccountPromptFlowContract$Step;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.RevPointsSpareChangeFullBannerGridController;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f284376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f284377c;

    public /* synthetic */ k0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, Object obj2, int i) {
        this.f284375a = i;
        this.f284376b = dVar;
        this.f284377c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d1 d1Var;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails;
        UUID agentId;
        UUID uuid;
        v2e.u uVar;
        int i = this.f284375a;
        int i2 = 6;
        int i3 = 0;
        v2e.t tVar = null;
        Object obj3 = this.f284376b;
        Object obj4 = this.f284377c;
        switch (i) {
            case 0:
                h1j.b bVar = (h1j.b) obj4;
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3;
                a1 a1Var = dVar.f96748s;
                CryptoOrderDraft cryptoOrderDraft = (CryptoOrderDraft) obj2;
                if (!(bVar instanceof h1j.d)) {
                    if (!(bVar instanceof h1j.c)) {
                        return cryptoOrderDraft;
                    }
                    xi0.a aVar = xi0.b.Companion;
                    String str = ((h1j.c) bVar).f148579a;
                    aVar.getClass();
                    return a1Var.k(cryptoOrderDraft, xi0.a.a(str), new CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket(AccountId.Personal.f51414a, null));
                }
                h1j.d dVar2 = (h1j.d) bVar;
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                k1j.a aVar2 = dVar2.d;
                String str2 = dVar2.f148580a;
                if (c1.f284358a[aVar2.ordinal()] == 1) {
                    RevPoints.INSTANCE.getClass();
                    d1Var = new d1(RevPoints.f83959b, new CryptoExchangeContract$MoneyDetails.BalanceIdentifier.LoyaltyAccount(str2));
                } else {
                    d1Var = new d1(dVar2.f148581b, new CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket(dVar2.f148582c, str2));
                }
                CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier = d1Var.f284363b;
                if (oyh.b.c(balanceIdentifier)) {
                    Set set = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
                    if (!dVar.N2()) {
                        return cryptoOrderDraft;
                    }
                }
                return a1Var.k(cryptoOrderDraft, d1Var.f284362a, balanceIdentifier);
            case 1:
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar3 = (com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3;
                String amount = (String) obj4;
                CryptoOrderDraft draft = (CryptoOrderDraft) obj2;
                kyh.g gVar = draft.d;
                int[] iArr = n0.f284383a;
                int i5 = iArr[gVar.ordinal()];
                if (i5 == 1) {
                    cryptoExchangeContract$MoneyDetails = draft.f96689a;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cryptoExchangeContract$MoneyDetails = draft.f96690b;
                }
                fzh.a aVar3 = dVar3.v;
                a1 a1Var2 = dVar3.f96748s;
                xi0.b currency = cryptoExchangeContract$MoneyDetails.f96683a;
                w80.b bVar2 = aVar3.f139203a;
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(currency, "currency");
                boolean zA = fzh.a.a(currency);
                String str3 = currency.f306286a;
                long jA = zA ? bVar2.a(amount, 6, str3) : bVar2.b(amount, str3);
                int i6 = iArr[draft.d.ordinal()];
                if (i6 == 1) {
                    a1Var2.getClass();
                    Intrinsics.checkNotNullParameter(draft, "draft");
                    return a1.j(a1Var2, draft, Long.valueOf(jA), null, false, false, 8);
                }
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a1Var2.getClass();
                Intrinsics.checkNotNullParameter(draft, "draft");
                return a1.j(a1Var2, draft, null, Long.valueOf(jA), false, false, 4);
            case 2:
                return ((com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3).f96748s.m((CryptoOrderDraft) obj2, (wd6.h) obj4);
            case 3:
                String facilityId = (String) obj4;
                tz4.b it8 = (tz4.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                r10.f networkUrlBuilder = ((uz4.c) obj3).d;
                Intrinsics.checkNotNullParameter(it8, "<this>");
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
                List<tz4.a> documents = it8.getDocuments();
                ArrayList arrayList = new ArrayList(zhm.w.t(documents, 10));
                for (tz4.a aVar4 : documents) {
                    String name = aVar4.getName();
                    String displayName = aVar4.getDisplayName();
                    String string = r10.f.q(networkUrlBuilder, j6.a.s("/credit-application/loan-facility/", facilityId, "/forbearance/agreement/", aVar4.getName(), "/html")).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    String string2 = r10.f.q(networkUrlBuilder, j6.a.s("/credit-application/loan-facility/", facilityId, "/forbearance/agreement/", aVar4.getName(), "/pdf")).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    arrayList.add(new du3.a(name, displayName, null, string, string2, false));
                }
                return arrayList;
            case 4:
                v03.e update = (v03.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v03.e.a(update, new dj0.d(((v03.m) obj4).o.b((String) obj3, update.e.f159568a.f306286a), update.e.f159568a));
            case 5:
                t61.j jVar = (t61.j) obj4;
                v0f.u uVar2 = (v0f.u) obj2;
                String postcode = ((Address) obj3).getPostcode();
                if (postcode == null) {
                    postcode = "";
                }
                return v0f.u.a(uVar2, null, null, null, postcode, jVar, null, null, null, false, false, false, false, false, false, 16359);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((v0k.d) obj4).getClass();
                return v0k.d.c((qzj.a) obj3);
            case 7:
                return DrawerKt.Scrim_Bx497Mc$lambda$1$0((String) obj4, (Function0) obj3, (SemanticsPropertyReceiver) obj2);
            case 8:
                return ScaffoldKt.Scaffold_u4IkXBM$lambda$1$0$0((MutableWindowInsets) obj4, (WindowInsets) obj3, (WindowInsets) obj2);
            case 9:
                v17.k updateState = (v17.k) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return v17.k.a(updateState, (FreelancerSalesFilters$CompoundFreelancerSalesFilter) ((Function1) obj4).invoke(((v17.k) ((v17.r) obj3).t2()).f285244a), null, 62);
            case 10:
                aii.u uVar3 = (aii.u) obj3;
                RevPointsSpareChangeControllerApi$Result result = (RevPointsSpareChangeControllerApi$Result) obj2;
                int i21 = v1c.d.f285291a;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.kompot.navigable.a aVar5 = ((RevPointsSpareChangeFullBannerGridController) obj4).f98405m;
                if (aVar5 != null) {
                    aVar5.F2();
                }
                Function1 function1 = ((RevPointsSpareChangeFullBannerGridControllerApi$Destination) uVar3).f84138b;
                if (function1 != null) {
                    function1.invoke(result);
                }
                return Unit.f186387a;
            case 11:
                v20.f0 f0Var = (v20.f0) obj3;
                Map agentInfoMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(agentInfoMap, "agentInfoMap");
                List<u10.f> list = (List) obj4;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                for (u10.f fVar : list) {
                    y10.h hVar = f0Var.f;
                    u10.k kVar = fVar.v;
                    AgentInfo agentInfo = (kVar == null || (uuid = kVar.e) == null) ? null : (AgentInfo) agentInfoMap.get(uuid);
                    u10.c cVar = fVar.u;
                    arrayList2.add(hVar.d(fVar, agentInfo, (cVar == null || (agentId = cVar.getAgentId()) == null) ? null : (AgentInfo) agentInfoMap.get(agentId)));
                }
                return arrayList2;
            case 12:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                w4l.f fVar2 = ((v20.f0) obj4).f285399y;
                od0.i.Companion.getClass();
                return fVar2.g(od0.h.a((UUID) obj3), false);
            case 13:
                com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.a aVar6 = (com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.a) obj4;
                yki.l lVar = (yki.l) obj3;
                d67.u result2 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, d67.q.f111462a)) {
                    oki.h.D2(lVar);
                } else if (Intrinsics.f(result2, d67.s.f111464a)) {
                    oki.h.t2(aVar6, lVar, FreelancerCreateSubaccountPromptFlowContract$Step.Onboarding.f74229a, false, null, false, 12);
                }
                return Unit.f186387a;
            case 14:
                StoreCampaignOffer storeCampaignOffer = (StoreCampaignOffer) obj4;
                Data data = (Data) obj3;
                v2e.l lVar2 = (v2e.l) obj2;
                if (storeCampaignOffer == null) {
                    Data data2 = lVar2.i;
                    v2e.u uVar4 = lVar2.f285714a;
                    if ((data2.getLoading() && (uVar4 instanceof v2e.t)) || !(uVar4 instanceof v2e.t)) {
                        uVar = uVar4;
                    }
                    return v2e.l.a(lVar2, uVar, null, null, false, false, false, false, null, null, data, null, 1534);
                }
                tVar = new v2e.t(storeCampaignOffer);
                uVar = tVar;
                return v2e.l.a(lVar2, uVar, null, null, false, false, false, false, null, null, data, null, 1534);
            case 15:
                return v2e.l.a((v2e.l) obj2, (v2e.s) obj4, (VoucherProduct) obj3, null, false, false, false, false, null, null, null, null, 2044);
            case 16:
                v3a.h hVar2 = (v3a.h) obj4;
                v3a.e recipientType = (v3a.e) obj2;
                Intrinsics.checkNotNullParameter(recipientType, "recipientType");
                efm.d0 d0VarFirstOrError = m70.a.g(zi0.c.J(xx9.p.c(hVar2.f285872a, false, null, 3)), null, null, 3).firstOrError();
                v20.t tVar2 = new v20.t(new w(hVar2, i2, recipientType, (jf0.c) obj3), 23);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, tVar2, 0);
            case 17:
                smd.s sVar = (smd.s) obj4;
                String str4 = (String) obj3;
                d2k.i countries = (d2k.i) obj2;
                Intrinsics.checkNotNullParameter(countries, "countries");
                List listU = zhm.d0.U(zhm.d0.E0(countries.f110881b, countries.f110880a));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : listU) {
                    d2k.h hVar3 = (d2k.h) obj5;
                    sVar.getClass();
                    String str5 = hVar3.f110878a.f297794a;
                    if (jli.g.d(com.google.android.gms.internal.mlkit_vision_face.a.p(str5, " ", hVar3.f110879b, " ", ((o8b.g) ((n8b.b) sVar.f264433b)).a(str5)), str4)) {
                        arrayList3.add(obj5);
                    }
                }
                return new d2k.i(zhm.f0.f322471a, arrayList3);
            case 18:
                ((v46.a) obj4).f285982b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 19:
                WhoToTransferFilter whoToTransferFilter = (WhoToTransferFilter) obj4;
                v4a.m mVar = (v4a.m) obj3;
                v4a.e eVar = (v4a.e) obj2;
                z4a.e eVar2 = (z4a.e) eVar.f285998b.getContent();
                return v4a.e.a(eVar, null, null, whoToTransferFilter, v4a.m.y2(mVar, whoToTransferFilter, eVar2 != null ? eVar2.d : null), false, false, null, Constants.TAG_F3_BUILD_CONFIGURATION);
            case 20:
                v4g.g update2 = (v4g.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                a.C0564a travellers = new a.C0564a(!((a.C0564a) obj4).f93248a);
                zhm.h0 selectedBaggageTokens = zhm.h0.f322473a;
                Data payment = new Data(((com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b) obj3).o.f93245a.f, null, false, 6, null);
                update2.getClass();
                Intrinsics.checkNotNullParameter(travellers, "travellers");
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(selectedBaggageTokens, "selectedBaggageTokens");
                return new v4g.g(travellers, payment, selectedBaggageTokens);
            case 21:
                Intrinsics.checkNotNullParameter((BirthPlaceRootFlowContract$State) obj2, "$this$update");
                return BirthPlaceRootFlowContract$State.a((BirthPlaceRootFlowContract$State) ((j2) ((com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a) obj4).f67176t.f22677a).getValue(), null, ((y54.h) ((y54.g) obj3)).f310985a, 1);
            case 22:
                qki.d dVar4 = ((com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a) obj3).f67176t;
                BirthPlaceRootFlowContract$State update3 = (BirthPlaceRootFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                wi0.b chosenCountry = ((a64.f) ((a64.e) obj4)).f1538a;
                if (Intrinsics.f(chosenCountry, update3.f67165a)) {
                    return BirthPlaceRootFlowContract$State.a((BirthPlaceRootFlowContract$State) ((j2) dVar4.f22677a).getValue(), chosenCountry, null, 2);
                }
                BirthPlaceRootFlowContract$State birthPlaceRootFlowContract$State = (BirthPlaceRootFlowContract$State) ((j2) dVar4.f22677a).getValue();
                BirthCity.INSTANCE.getClass();
                BirthCity city = BirthCity.f66300c;
                birthPlaceRootFlowContract$State.getClass();
                Intrinsics.checkNotNullParameter(chosenCountry, "chosenCountry");
                Intrinsics.checkNotNullParameter(city, "city");
                return new BirthPlaceRootFlowContract$State(chosenCountry, city);
            case 23:
                Intrinsics.checkNotNullParameter((BirthPlaceRootFlowContract$State) obj2, "$this$update");
                BirthPlaceRootFlowContract$State birthPlaceRootFlowContract$State2 = (BirthPlaceRootFlowContract$State) ((j2) ((com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a) obj4).f67176t.f22677a).getValue();
                wi0.b.Companion.getClass();
                return BirthPlaceRootFlowContract$State.a(birthPlaceRootFlowContract$State2, wi0.a.a((String) obj3), null, 2);
            case 24:
                com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar7 = (com.revolut.feature.defi.remittances.impl.ui.send.flow.a) obj4;
                DeFiSendFlowContract$Step.AmountInput amountInput = (DeFiSendFlowContract$Step.AmountInput) obj3;
                s56.r output = (s56.r) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof s56.p) {
                    oki.h.t2(aVar7, aVar7.f71850p, new DeFiSendFlowContract$Step.Review(((s56.p) output).f259980a, amountInput.f71843b), false, null, false, 14);
                } else {
                    if (!(output instanceof s56.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar7.J2(((s56.q) output).f259982a);
                }
                return Unit.f186387a;
            case 25:
                ((v5d.a) obj4).f286198b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 26:
                ((v5d.a) obj4).f286198b.insert((SQLiteConnection) obj2, (w5d.a) obj3);
                return null;
            case 27:
                List list2 = (List) obj4;
                v6l.h0 h0Var = (v6l.h0) obj3;
                p6l.q fetchedCard = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(fetchedCard, "fetchedCard");
                Intrinsics.h(list2);
                int size = list2.size();
                ArrayList arrayListF1 = zhm.d0.f1(list2);
                Iterator it9 = arrayListF1.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        i3 = -1;
                    } else if (!Intrinsics.f(((p6l.q) it9.next()).getId(), ((v6l.i0) h0Var).f286454a)) {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    arrayListF1.set(i3, fetchedCard);
                } else {
                    arrayListF1.add(size, fetchedCard);
                }
                return arrayListF1;
            case 28:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.P(((v6l.b1) obj4).e(v6l.b1.q(it10, (b93.k) obj3)), false, null, 3);
            default:
                v6l.b1 b1Var = (v6l.b1) obj4;
                v6l.h0 h0Var2 = (v6l.h0) obj3;
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                List list3 = cards;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it11 = list3.iterator();
                    while (it11.hasNext()) {
                        if (Intrinsics.f(((p6l.q) it11.next()).getId(), ((v6l.i0) h0Var2).f286454a)) {
                            return te0.w.j(cards);
                        }
                    }
                }
                efm.d0<p6l.q> cardById = b1Var.f286424a.getCardById(((v6l.i0) h0Var2).f286454a);
                v6l.a0 a0Var = new v6l.a0(i2, new k0(cards, h0Var2, 27));
                cardById.getClass();
                return new ufm.i(cardById, a0Var, 1);
        }
    }

    public /* synthetic */ k0(Object obj2, Object obj3, int i) {
        this.f284375a = i;
        this.f284377c = obj2;
        this.f284376b = obj3;
    }
}
