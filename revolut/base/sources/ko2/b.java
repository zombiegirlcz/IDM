package ko2;

import aii.q;
import androidx.room.util.DBUtil;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeScreen;
import com.revolut.feature.bank_account_switching.impl.ui.how_it_works.HowOverstapWorksScreen;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits.CardLimitsInfoScreen;
import com.revolut.feature.credit.health.impl.domain.model.ActiveApplication;
import com.revolut.feature.credit.health.impl.domain.model.PreapprovedOffer;
import com.revolut.feature.credit.health.impl.domain.model.ScoreSnapshot;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreen;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeController;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierController;
import com.revolut.feature.sca_prompt.impl.learn_more.ScaLearnMoreScreen;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.IndiaTopupDeclarationScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlow;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreen;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlow;
import com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker.ScreenerProductPickerScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.account_balance_limit.AccountBalanceLimitBottomSheetController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.limits.impl.ui.limits.screen.SettingsLimitController;
import ft3.d1;
import ft3.g1;
import ghk.x;
import gim.i;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kpb.l;
import kqh.u;
import ks9.s0;
import ksc.h;
import ksk.g;
import kzh.f;
import l0g.e;
import m05.b0;
import m05.j;
import m05.m;
import m05.y;
import yhm.o;
import yji.n;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((HowOverstapWorksScreen) this.v, continuation, 0);
            case 1:
                return new b((l) this.v, continuation, 1);
            case 2:
                return new b((ScreenerProductPickerScreen) this.v, continuation, 2);
            case 3:
                return new b((s0) this.v, continuation, 3);
            case 4:
                return new b((ScaLearnMoreScreen) this.v, continuation, 4);
            case 5:
                return new b((g) this.v, continuation, 5);
            case 6:
                return new b((kuc.l) this.v, continuation, 6);
            case 7:
                return new b((AsftPassDetailsScreen) this.v, continuation, 7);
            case 8:
                return new b((com.revolut.feature.kyc.impl.external.app.flow.a) this.v, continuation, 8);
            case 9:
                return new b((kob.a) this.v, continuation, 9);
            case 10:
                return new b((ReferralCodeController) this.v, continuation, 10);
            case 11:
                return new b((kya.b) this.v, continuation, 11);
            case 12:
                return new b((AccountBalanceLimitBottomSheetController) this.v, continuation, 12);
            case 13:
                return new b((SettingsLimitController) this.v, continuation, 13);
            case 14:
                return new b((l05.c) this.v, continuation, 14);
            case 15:
                return new b((l05.g) this.v, continuation, 15);
            case 16:
                return new b((l05.i) this.v, continuation, 16);
            case 17:
                return new b((IndiaTopupDeclarationScreen) this.v, continuation, 17);
            case 18:
                return new b((e) this.v, continuation, 18);
            case 19:
                return new b((l16.e) this.v, continuation, 19);
            case 20:
                return new b((TravelExperiencesAdditionalInformationScreen) this.v, continuation, 20);
            case 21:
                return new b((FreelancerQrShareScreen) this.v, continuation, 21);
            case 22:
                return new b((RevPointsSpareChangeFullMultiplierController) this.v, continuation, 22);
            case 23:
                return new b((TopupRequestDetailsScreen) this.v, continuation, 23);
            case 24:
                return new b((com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) this.v, continuation, 24);
            case 25:
                return new b((CardLimitsInfoScreen) this.v, continuation, 25);
            case 26:
                return new b((TravelFlightsHomeFlow) this.v, continuation, 26);
            case 27:
                return new b((InvestorUpdateHistoryFlow) this.v, continuation, 27);
            case 28:
                return new b((ViaVerdeHomeScreen) this.v, continuation, 28);
            default:
                return new b((CryptoEarningScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v94, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PreapprovedOffer preapprovedOffer;
        int i = this.u;
        Object[] objArr = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((d) ((HowOverstapWorksScreen) obj3).Q.getValue()).C2(q.f5292a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) obj3).C2(kpb.g.f188217a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u) ((ScreenerProductPickerScreen) obj3).R2()).C2(kqh.i.f188413a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(((s0) obj3).f189382l, false, null, 3);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) ((ksc.e) ((ScaLearnMoreScreen) obj3).O.getValue())).B2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) obj3;
                gVar.X2(gVar.f189480q, new x(gVar, 20));
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kuc.l lVar = (kuc.l) obj3;
                if (lVar.f189779n.d("security_hub.gambling_block", null) == bla.c.ENABLED) {
                    n.j2(lVar, rd0.e.b(lVar.f189778m.f181652a.d.f(Unit.f186387a, true)), null, new krc.h(lVar, objArr == true ? 1 : 0, 8), 3);
                }
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AsftPassDetailsScreen) obj3).R2().B2();
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.kyc.impl.external.app.flow.a) obj3).C2(ts8.b.f274053a);
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((kob.a) obj3).invoke();
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ReferralCodeController referralCodeController = (ReferralCodeController) obj3;
                ((kwa.i) referralCodeController.R.getValue()).B2();
                e0m.e.c(referralCodeController.m2());
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(hya.c.class, KTypeProjection.INSTANCE, List.class, ((kya.b) obj3).f190637a, "REF_TROUBLESHOOTER_KEY");
                if (list != null) {
                }
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f) ((kzh.a) ((AccountBalanceLimitBottomSheetController) obj3).S.getValue())).B2();
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((kzj.g) ((kzj.a) ((SettingsLimitController) obj3).Q.getValue())).B2();
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m05.g gVar2 = (m05.g) j6.a.k(m05.g.class, ((l05.c) obj3).f191176c, "credit-score-details-data");
                if (gVar2 != null) {
                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                    List<b0> list2 = gVar2.f201059a;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    for (b0 b0Var : list2) {
                        LocalDate localDate = LocalDate.parse(b0Var.f201053a);
                        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                        arrayList.add(new ScoreSnapshot(localDate, b0Var.f201054b));
                    }
                    List<y> list3 = gVar2.f201060b;
                    ArrayList arrayList2 = new ArrayList();
                    for (y yVar : list3) {
                        String str = yVar.f201085a;
                        String str2 = yVar.d;
                        String str3 = yVar.e;
                        d1 d1VarG = g1.g(str, str2, str3);
                        if (d1VarG == null) {
                            preapprovedOffer = null;
                        } else {
                            long j2 = yVar.f201086b;
                            xi0.a aVar16 = xi0.b.Companion;
                            String str4 = yVar.f201087c;
                            aVar16.getClass();
                            preapprovedOffer = new PreapprovedOffer(d1VarG, new dj0.d(j2, xi0.a.a(str4)), str2, str3);
                        }
                        if (preapprovedOffer != null) {
                            arrayList2.add(preapprovedOffer);
                        }
                    }
                    List<m05.c> list4 = gVar2.f201061c;
                    ArrayList arrayList3 = new ArrayList();
                    for (m05.c cVar : list4) {
                        d1 d1VarG2 = g1.g(cVar.f201055a, null, null);
                        ActiveApplication activeApplication = d1VarG2 == null ? null : new ActiveApplication(d1VarG2, cVar.f201056b);
                        if (activeApplication != null) {
                            arrayList3.add(activeApplication);
                        }
                    }
                }
                break;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) j6.a.k(m.class, ((l05.g) obj3).f191183c, "credit-score-insights-latest");
                if (mVar != null) {
                }
                break;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) j6.a.k(j.class, ((l05.i) obj3).f191186c, "credit-score-data");
                if (jVar != null) {
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    int i2 = jVar.f201063a;
                    String str5 = jVar.f201064b;
                }
                break;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((IndiaTopupDeclarationScreen) obj3).m2().onBackPressed();
                break;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) obj3;
                String str6 = (String) eVar.f191248a.T2("SEARCH_SESSION_ID", String.class);
                if (str6 != null) {
                    eVar.f191249b.f("SEARCH_SESSION_ID", str6);
                }
                break;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h16.a aVar22 = ((l16.e) obj3).f191478c;
                List list5 = (List) DBUtil.performBlocking(aVar22.f148467a, true, false, new gwe.d(aVar22, 15));
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(ksj.b.B((i16.b) it8.next()));
                }
                if (!arrayList4.isEmpty()) {
                }
                break;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TravelExperiencesAdditionalInformationScreen) obj3).m2().onBackPressed();
                break;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l27.i) ((FreelancerQrShareScreen) obj3).P.getValue()).B2();
                break;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) ((RevPointsSpareChangeFullMultiplierController) obj3).R2()).C2(RevPointsSpareChangeControllerApi$Result.Skipped.f84132a);
                break;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TopupRequestDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) obj3).B2();
                break;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l43.m) ((l43.f) ((CardLimitsInfoScreen) obj3).P.getValue())).I2(l43.g.f192053a);
                break;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l4g.l) ((TravelFlightsHomeFlow) obj3).d()).B2();
                break;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b) ((l7f.d) ((InvestorUpdateHistoryFlow) obj3).P.getValue())).B2();
                break;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ViaVerdeHomeScreen) obj3).m2().onBackPressed();
                break;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) ((CryptoEarningScreen) obj3).d()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
