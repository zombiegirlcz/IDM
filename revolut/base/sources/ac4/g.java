package ac4;

import aw0.ka;
import aw0.o9;
import aw0.x4;
import bq5.k1;
import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.r5;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.FlagCircleBadge;
import com.revolut.core.ui_kit.models.p0;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content.CreditHealthContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.FinancialSituationDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationControllerContract$InputData;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreenContract$InputData;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientContract$InputData;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.airportlounges.impl.R$plurals;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import era.l;
import g75.m;
import gyi.g0;
import gyi.i;
import gyi.k;
import hui.p;
import hui.t;
import j7j.h;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.f;
import mx4.x;
import mx4.z;
import svi.b1;
import svi.c1;
import svi.d1;
import svi.q;
import svi.r;
import svi.s0;
import ue0.e;
import z0h.q1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3030a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3032c;

    public g(iic.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f3031b = inputData;
        this.f3032c = new lw0.a(new TextLocalisedClause(R$string.perks_availability_title, null, null, 14), null, null, null, false, 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o b(cli.j r139) {
        /*
            Method dump skipped, instruction units count: 3172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac4.g.b(cli.j):cli.o");
    }

    private final o d(j jVar) {
        AirportLoungesDisclaimer airportLoungesDisclaimer;
        Object next;
        Clause textClause;
        Instant instant;
        Object textLocalisedQuantityClause;
        gyi.a domainState = (gyi.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f147862a;
        String str = domainState.f147864c;
        List passes = (List) data.getContent();
        if (passes == null) {
            passes = f0.f322471a;
        }
        Iterator it8 = passes.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((r) it8.next()).f265969a, str)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        Clause textLocalisedClause = null;
        if (i < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        r rVar = (r) d0.e0(iIntValue, passes);
        TextLocalisedClause textLocalisedClause2 = ((rVar != null ? rVar.f265970b : null) == q.UNLIMITED && (airportLoungesDisclaimer = domainState.e) != null && airportLoungesDisclaimer.d == s0.STRICT && !airportLoungesDisclaimer.f98914c) ? new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_pass_list_button_activate_my_plan_pass, null, null, 14) : null;
        gyi.n nVar = (gyi.n) this.f3031b;
        Data passesData = domainState.f147862a;
        Data pricingPlanData = domainState.f147863b;
        r rVar2 = (r) d0.e0(iIntValue, passes);
        String str2 = rVar2 != null ? rVar2.f265969a : null;
        AnimationRequest animationRequest = domainState.f;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(passesData, "passesData");
        Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
        i iVar = (i) iii.c.f(t1.t(passesData, pricingPlanData), new gwe.d(nVar, 8), new ghl.c(nVar, 26), new a0i.a(nVar, 20, animationRequest, str2));
        Intrinsics.checkNotNullParameter(passes, "passes");
        Iterator it9 = passes.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (Intrinsics.f(((r) next).f265969a, str)) {
                break;
            }
        }
        r rVar3 = (r) next;
        if (rVar3 == null || (instant = rVar3.f265972g) == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            long epochMilli = instant.toEpochMilli() - System.currentTimeMillis();
            if (epochMilli < 0) {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                int i2 = com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_passes_title_pass;
                if (epochMilli < TimeUnit.DAYS.toMillis(1L)) {
                    textLocalisedQuantityClause = new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_passes_title, u.c(new TimeClause(epochMilli, new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0.MINUTES)), null, null, 12)), null, 12);
                } else {
                    long days = TimeUnit.MILLISECONDS.toDays(epochMilli);
                    textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.airport_lounges_passes_title_days, Long.valueOf(days), u.c(Long.valueOf(days)), (Style) null, 24);
                }
                textClause = new TextLocalisedClause(i2, u.c(textLocalisedQuantityClause), null, 12);
            }
        }
        if (textLocalisedClause2 == null) {
            gyi.f0 f0Var = (gyi.f0) this.f3032c;
            d1 d1Var = domainState.d;
            if (d1Var instanceof b1) {
                textLocalisedClause = nd7.d.a(f0Var.f147885a, ((b1) d1Var).f265882a.f98926a);
            } else if (d1Var instanceof c1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_passes_terms_title, u.c(new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_passes_terms_link, null, new Click(28, (Integer) null, (Object) new HyperTextClickData(((c1) d1Var).f265890a), "id_terms_and_conditions", false), 10)), null, 12);
            } else if (d1Var != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new k(iVar, iIntValue, textClause, textLocalisedClause, textLocalisedClause2);
    }

    private final o e(j jVar) {
        hui.k domainState = (hui.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        final iui.d dVar = (iui.d) this.f3031b;
        Data activePassesData = domainState.f155681b;
        Data termsUrlData = domainState.e;
        Intrinsics.checkNotNullParameter(activePassesData, "activePassesData");
        Intrinsics.checkNotNullParameter(termsUrlData, "termsUrlData");
        int i = 2;
        final int i2 = 1;
        eVarB.addAll((List) iii.c.f(t1.t(activePassesData, termsUrlData), new iui.a(dVar, i), new iui.b(dVar, i), new Function3() { // from class: iui.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                List list;
                hg hgVar;
                AsftPass asftPass;
                wi0.b bVar;
                Instant instant;
                Object oVar;
                TextLocalisedClause textLocalisedClause;
                int i3 = i2;
                d dVar2 = dVar;
                switch (i3) {
                    case 0:
                        List nearYouAirports = (List) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(nearYouAirports, "nearYouAirports");
                        if (nearYouAirports.isEmpty()) {
                            return f0.f322471a;
                        }
                        List list2 = nearYouAirports;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(dVar2.f168621a.a((bti.a) it8.next()));
                        }
                        return yp0.b.g(arrayList, d.b(), null, 0, 0, 126);
                    default:
                        Pair pair = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        List list3 = (List) pair.f186385a;
                        String str = (String) pair.f186386b;
                        boolean zIsEmpty = list3.isEmpty();
                        x4.c cVar = x4.c.f10604a;
                        if (zIsEmpty) {
                            ReferralContactDelegate.Model model = new ReferralContactDelegate.Model("list_id_add_pass", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_active_passes_empty_state_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_active_passes_empty_state_description, null, null, 14), null, ke.MATCH_PARENT, false, null, null, 440784);
                            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                            List listC = u.c(model);
                            gg.b bVar2 = new gg.b(false, 2);
                            int i5 = R$attr.uikit_dp24;
                            hgVar = new hg("item_id_pass_scroller", listC, 1, cVar, null, bVar2, false, false, null, null, i5, i5, 0, 0, 26576);
                            int i6 = R$attr.uikit_dp0;
                            yp0.b.l(hgVar, i6, i6, 0, 0, null, false, 60);
                            list = list3;
                        } else {
                            List list4 = list3;
                            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                            Iterator it9 = list4.iterator();
                            while (it9.hasNext()) {
                                AsftPass asftPass2 = (AsftPass) it9.next();
                                f fVar = (f) dVar2.f168623c;
                                Instant instantB = fVar.b();
                                bti.n nVar = asftPass2.f98714b;
                                wi0.b bVar3 = asftPass2.f98722p;
                                Instant instant2 = asftPass2.d;
                                bti.n nVar2 = bti.n.CREATED;
                                p pVar = p.f155688a;
                                if (nVar == nVar2 || e.n(asftPass2.f98726t)) {
                                    asftPass = asftPass2;
                                    bVar = bVar3;
                                    instant = instant2;
                                    oVar = pVar;
                                } else if (instantB.compareTo(instant2) >= 0) {
                                    oVar = new hui.q(asftPass2.f98713a);
                                    asftPass = asftPass2;
                                    bVar = bVar3;
                                    instant = instant2;
                                } else {
                                    instant = instant2;
                                    asftPass = asftPass2;
                                    bVar = bVar3;
                                    oVar = new hui.o(asftPass2.f98723q, new AsftManageBookingPayload(str, asftPass2.f98713a, asftPass2.i, asftPass2.o, asftPass2.u));
                                }
                                String str2 = asftPass.f98713a;
                                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_common_template_comma, v.k(asftPass.e, dVar2.f168622b.i(bVar)), null, 12);
                                CompositeClause compositeClause = new CompositeClause(v.k(new TextClause(asftPass.f98717h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(asftPass.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                                Instant instantB2 = fVar.b();
                                ZoneId zoneId = asftPass.f98718j.toZoneId();
                                Iterator it10 = it9;
                                r5 r5Var = new r5(new TextLocalisedQuantityClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$plurals.asft_checkout_top_block_travellers_value, Integer.valueOf(asftPass.f98725s), (List) null, (Style) null, 28), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_travellers, null, null, 14));
                                List list5 = list3;
                                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_date_and_time, null, null, 14);
                                int i21 = com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_checkout_top_block_date_and_time;
                                Instant instant3 = asftPass.f98715c;
                                TimeClause timeClause = new TimeClause(instant3.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, zoneId, 4);
                                long epochMilli = instant3.toEpochMilli();
                                TimeClause.Format.TimeDefault timeDefault = TimeClause.Format.TimeDefault.f57977b;
                                r5 r5Var2 = new r5(new TextLocalisedClause(i21, v.k(timeClause, new TimeClause(epochMilli, timeDefault, null, zoneId, 4), new TimeClause(instant3.plusSeconds(1800L).toEpochMilli(), timeDefault, null, zoneId, 4)), null, 12), textLocalisedClause3);
                                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_status, null, null, 14);
                                if (oVar.equals(pVar)) {
                                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_preparing_pass, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
                                } else if (oVar instanceof hui.o) {
                                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_available_in, u.c(new TimeClause(instant.toEpochMilli() - instantB2.toEpochMilli(), new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0.MINUTES)), null, null, 12)), null, 12);
                                } else {
                                    if (!(oVar instanceof hui.q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_ready_to_use, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 10);
                                }
                                EsimDelegate.Model model2 = new EsimDelegate.Model(str2, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_qr_code, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorElevatedWidgetBackground, 10.0f, null, null, 48), null, textLocalisedClause2, compositeClause, null, v.k(r5Var, r5Var2, new r5(textLocalisedClause, textLocalisedClause4)), null, false, new FlagCircleBadge(bVar.f297794a), false, oVar, null, 11172);
                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                arrayList2.add(model2);
                                it9 = it10;
                                list3 = list5;
                            }
                            list = list3;
                            hgVar = new hg("item_id_pass_scroller", arrayList2, 1, cVar, null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
                        }
                        return v.k(d.a(list.size()), hgVar);
                }
            }
        }));
        Data nearYouAirportsData = domainState.f155682c;
        Intrinsics.checkNotNullParameter(nearYouAirportsData, "nearYouAirportsData");
        final int i3 = 0;
        eVarB.addAll((List) iii.c.f(nearYouAirportsData, new iui.a(dVar, i3), new iui.b(dVar, i3), new Function3() { // from class: iui.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                List list;
                hg hgVar;
                AsftPass asftPass;
                wi0.b bVar;
                Instant instant;
                Object oVar;
                TextLocalisedClause textLocalisedClause;
                int i32 = i3;
                d dVar2 = dVar;
                switch (i32) {
                    case 0:
                        List nearYouAirports = (List) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(nearYouAirports, "nearYouAirports");
                        if (nearYouAirports.isEmpty()) {
                            return f0.f322471a;
                        }
                        List list2 = nearYouAirports;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(dVar2.f168621a.a((bti.a) it8.next()));
                        }
                        return yp0.b.g(arrayList, d.b(), null, 0, 0, 126);
                    default:
                        Pair pair = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        List list3 = (List) pair.f186385a;
                        String str = (String) pair.f186386b;
                        boolean zIsEmpty = list3.isEmpty();
                        x4.c cVar = x4.c.f10604a;
                        if (zIsEmpty) {
                            ReferralContactDelegate.Model model = new ReferralContactDelegate.Model("list_id_add_pass", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_active_passes_empty_state_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_active_passes_empty_state_description, null, null, 14), null, ke.MATCH_PARENT, false, null, null, 440784);
                            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                            List listC = u.c(model);
                            gg.b bVar2 = new gg.b(false, 2);
                            int i5 = R$attr.uikit_dp24;
                            hgVar = new hg("item_id_pass_scroller", listC, 1, cVar, null, bVar2, false, false, null, null, i5, i5, 0, 0, 26576);
                            int i6 = R$attr.uikit_dp0;
                            yp0.b.l(hgVar, i6, i6, 0, 0, null, false, 60);
                            list = list3;
                        } else {
                            List list4 = list3;
                            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                            Iterator it9 = list4.iterator();
                            while (it9.hasNext()) {
                                AsftPass asftPass2 = (AsftPass) it9.next();
                                f fVar = (f) dVar2.f168623c;
                                Instant instantB = fVar.b();
                                bti.n nVar = asftPass2.f98714b;
                                wi0.b bVar3 = asftPass2.f98722p;
                                Instant instant2 = asftPass2.d;
                                bti.n nVar2 = bti.n.CREATED;
                                p pVar = p.f155688a;
                                if (nVar == nVar2 || e.n(asftPass2.f98726t)) {
                                    asftPass = asftPass2;
                                    bVar = bVar3;
                                    instant = instant2;
                                    oVar = pVar;
                                } else if (instantB.compareTo(instant2) >= 0) {
                                    oVar = new hui.q(asftPass2.f98713a);
                                    asftPass = asftPass2;
                                    bVar = bVar3;
                                    instant = instant2;
                                } else {
                                    instant = instant2;
                                    asftPass = asftPass2;
                                    bVar = bVar3;
                                    oVar = new hui.o(asftPass2.f98723q, new AsftManageBookingPayload(str, asftPass2.f98713a, asftPass2.i, asftPass2.o, asftPass2.u));
                                }
                                String str2 = asftPass.f98713a;
                                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_common_template_comma, v.k(asftPass.e, dVar2.f168622b.i(bVar)), null, 12);
                                CompositeClause compositeClause = new CompositeClause(v.k(new TextClause(asftPass.f98717h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(asftPass.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                                Instant instantB2 = fVar.b();
                                ZoneId zoneId = asftPass.f98718j.toZoneId();
                                Iterator it10 = it9;
                                r5 r5Var = new r5(new TextLocalisedQuantityClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$plurals.asft_checkout_top_block_travellers_value, Integer.valueOf(asftPass.f98725s), (List) null, (Style) null, 28), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_travellers, null, null, 14));
                                List list5 = list3;
                                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_date_and_time, null, null, 14);
                                int i21 = com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_checkout_top_block_date_and_time;
                                Instant instant3 = asftPass.f98715c;
                                TimeClause timeClause = new TimeClause(instant3.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, zoneId, 4);
                                long epochMilli = instant3.toEpochMilli();
                                TimeClause.Format.TimeDefault timeDefault = TimeClause.Format.TimeDefault.f57977b;
                                r5 r5Var2 = new r5(new TextLocalisedClause(i21, v.k(timeClause, new TimeClause(epochMilli, timeDefault, null, zoneId, 4), new TimeClause(instant3.plusSeconds(1800L).toEpochMilli(), timeDefault, null, zoneId, 4)), null, 12), textLocalisedClause3);
                                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_status, null, null, 14);
                                if (oVar.equals(pVar)) {
                                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_preparing_pass, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
                                } else if (oVar instanceof hui.o) {
                                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_available_in, u.c(new TimeClause(instant.toEpochMilli() - instantB2.toEpochMilli(), new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0.MINUTES)), null, null, 12)), null, 12);
                                } else {
                                    if (!(oVar instanceof hui.q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_section_ready_to_use, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 10);
                                }
                                EsimDelegate.Model model2 = new EsimDelegate.Model(str2, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_qr_code, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorElevatedWidgetBackground, 10.0f, null, null, 48), null, textLocalisedClause2, compositeClause, null, v.k(r5Var, r5Var2, new r5(textLocalisedClause, textLocalisedClause4)), null, false, new FlagCircleBadge(bVar.f297794a), false, oVar, null, 11172);
                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                arrayList2.add(model2);
                                it9 = it10;
                                list3 = list5;
                            }
                            list = list3;
                            hgVar = new hg("item_id_pass_scroller", arrayList2, 1, cVar, null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
                        }
                        return v.k(d.a(list.size()), hgVar);
                }
            }
        }));
        eVarB.addAll(domainState.f);
        eVarB.addAll(zjh.j.v((zjh.j) this.f3032c, domainState.f155683g));
        aim.e eVarA = u.a(eVarB);
        Data configData = domainState.d;
        Data revPointsAccount = domainState.f155680a;
        Intrinsics.checkNotNullParameter(configData, "configData");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Float fValueOf = Float.valueOf(16.0f);
        AsftConfig asftConfig = (AsftConfig) configData.getContent();
        Pair pair = (asftConfig == null || !asftConfig.f98711b) ? new Pair(null, new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10)) : new Pair(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(R$drawable.uikit_icn_24_premium, Integer.valueOf(R$attr.uikit_colorForeground), fValueOf, fValueOf, 16), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_common_dot_separator, u.c(asftConfig.f98710a), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8))), null);
        Clause clause = (Clause) pair.f186385a;
        Clause clause2 = (Clause) pair.f186386b;
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        int i5 = 17;
        t tVar = new t((NavBarMenuItem) iii.c.f(revPointsAccount, new gs2.t(i5), new gug.c(i), new fq7.k(28)), clause, clause2);
        Intrinsics.checkNotNullParameter(configData, "configData");
        return new hui.u(eVarA, tVar, (Clause) iii.c.f(configData, new iui.a(i2), new iui.b(i2), new i6j.q(i5)));
    }

    private final o f(j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.who_to_pay_new_recipient_title, null, null, 14), null, null, null, false, 30);
        List list = ((AddRecipientContract$InputData) this.f3031b).f80118a;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            qv0.i iVarE = ((com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a) this.f3032c).e((WhoToTransferActionItem) it8.next());
            if (iVarE != null) {
                arrayList.add(iVarE);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }

    private final o g(j jVar) throws Throwable {
        int i;
        AccountCellItemDelegate.Model modelA;
        int i2;
        int i3;
        int i5;
        int i6;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AnalyticsContext analyticsContext = new AnalyticsContext(((AnalyticsContext) ((y6j.a) this.f3031b).f311315a.getValue()).f50296a);
        j7j.a aVar = (j7j.a) this.f3032c;
        xi0.b baseCurrency = domainState.f171930a;
        wd6.h selectedOrderType = domainState.f171932c;
        wd6.e exchangeMode = domainState.f171931b;
        Set availableOrderTypes = domainState.d;
        Set disabledOrderTypes = domainState.e;
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(selectedOrderType, "selectedOrderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(disabledOrderTypes, "disabledOrderTypes");
        List<wd6.h> listP0 = d0.P0(availableOrderTypes, new fad.i(aVar, 29));
        ArrayList arrayList = new ArrayList();
        for (wd6.h hVar : listP0) {
            boolean z = hVar == selectedOrderType;
            boolean z3 = !disabledOrderTypes.contains(hVar);
            j7j.b bVar = new j7j.b(hVar, exchangeMode);
            switch (j7j.c.f171925b[hVar.ordinal()]) {
                case 1:
                    int i21 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_market_order_title;
                    int i22 = j7j.c.f171924a[exchangeMode.ordinal()];
                    if (i22 == 1) {
                        i = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_market_order_description_buy;
                    } else {
                        if (i22 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_market_order_description_sell;
                    }
                    modelA = j7j.a.a("MARKET_ORDER_DIALOG_ITEM_ID", i21, i, R$drawable.uikit_icn_24_market_order, baseCurrency, z, z3, bVar);
                    break;
                case 2:
                    int i32 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_limit_order_title;
                    int[] iArr = j7j.c.f171924a;
                    int i33 = iArr[exchangeMode.ordinal()];
                    if (i33 == 1) {
                        i2 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_limit_order_description_buy;
                    } else {
                        if (i33 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_limit_order_description_sell;
                    }
                    int i43 = iArr[exchangeMode.ordinal()];
                    if (i43 == 1) {
                        i3 = R$drawable.uikit_icn_24_order_downwards;
                    } else {
                        if (i43 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = R$drawable.uikit_icn_24_order_upwards;
                    }
                    modelA = j7j.a.a("LIMIT_ORDER_DIALOG_ITEM_ID", i32, i2, i3, baseCurrency, z, z3, bVar);
                    break;
                case 3:
                    int i59 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_stop_order_title;
                    int[] iArr2 = j7j.c.f171924a;
                    int i66 = iArr2[exchangeMode.ordinal()];
                    if (i66 == 1) {
                        i5 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_stop_order_description_buy;
                    } else {
                        if (i66 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_stop_order_description_sell;
                    }
                    int i74 = iArr2[exchangeMode.ordinal()];
                    if (i74 == 1) {
                        i6 = R$drawable.uikit_icn_24_order_upwards;
                    } else {
                        if (i74 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i6 = R$drawable.uikit_icn_24_order_downwards;
                    }
                    modelA = j7j.a.a("STOP_ORDER_DIALOG_ITEM_ID", i59, i5, i6, baseCurrency, z, z3, bVar);
                    break;
                case 4:
                    modelA = j7j.a.a("RECURRING_ORDER_DIALOG_ITEM_ID", com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_recurring_buy_title, com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_order_type_selection_dialog_cell_recurring_buy_description, R$drawable.uikit_icn_24_calendar_recurring, baseCurrency, z, z3, bVar);
                    break;
                case 5:
                case 6:
                case 7:
                    hx7.e.n(new IllegalStateException(hVar + " order type is not supported"));
                    modelA = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new j7j.j(analyticsContext, arrayList);
    }

    private final o h(j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = com.revolut.feature.credit.core.R$string.credit_application_credit_health_prompt_title;
        CreditHealthContentScreenContract$InputData creditHealthContentScreenContract$InputData = (CreditHealthContentScreenContract$InputData) this.f3031b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(creditHealthContentScreenContract$InputData.f67391a), null, 12);
        String str = creditHealthContentScreenContract$InputData.f67392b;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_credit_health_prompt_description, u.c(str), null, 12) : null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_credit_health_prompt_primary_button, u.c(creditHealthContentScreenContract$InputData.d), null, 12);
        String str2 = creditHealthContentScreenContract$InputData.e;
        return new j84.i(((z) this.f3032c).b(creditHealthContentScreenContract$InputData.f67393c, new ax4.b(0)), textLocalisedClause, textLocalisedClause2, textLocalisedClause3, str2 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_credit_health_prompt_secondary_button, u.c(str2), null, 12) : null);
    }

    private final o i(j jVar) {
        int i;
        List list;
        List list2;
        jph.f domainState = (jph.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        uqh.z extensionState = domainState.f177279a;
        t5d.d dVar = (t5d.d) this.f3032c;
        Data data = domainState.f177281c;
        fn2.c cVar = (fn2.c) this.f3031b;
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        ScreenerSortingOptions screenerSortingOptions = extensionState.f;
        uqh.t tVar = extensionState.f282183a;
        List listC = dVar.c(data, ryc.a.g((ryc.a) cVar.f136517b, extensionState, (screenerSortingOptions == null && (tVar == null || (list2 = tVar.f282176b) == null || !(list2.isEmpty() ^ true))) ? false : true, false, true, 12));
        boolean z = extensionState.f282186g;
        if (tVar == null || (list = tVar.f282176b) == null || !(!list.isEmpty())) {
            zel.f fVar = tVar != null ? tVar.f282175a : null;
            int i2 = fVar == null ? -1 : jph.i.f177286a[fVar.ordinal()];
            if (i2 == -1) {
                i = com.revolut.retail.wealth.resources.R$string.screener_results_header_title;
            } else if (i2 == 1) {
                i = com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_stocks;
            } else if (i2 == 2) {
                i = z ? com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_etps : com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_etfs;
            } else if (i2 == 3) {
                i = com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_bonds;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_cfds;
            }
        } else {
            i = com.revolut.retail.wealth.resources.R$string.screener_results_header_title;
        }
        return new jph.h(i, listC, domainState.f177280b);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o j(cli.j r23) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac4.g.j(cli.j):cli.o");
    }

    private final o k(j jVar) {
        kv7.e domainState = (kv7.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_scheme_insurance_eligible_cards_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_scheme_insurance_activation_primary_action_button_text, u.c(((InsuranceEligibleCardsScreenContract$InputData) this.f3031b).f76101b.f75969a), null, 12);
        List list = (List) iii.c.f(domainState.f189984a, new ksk.h(29), new ku1.f0(11), new kcg.j(this, 15));
        yp0.b.k(list, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, 28);
        return new kv7.f(textLocalisedClause, textLocalisedClause2, list);
    }

    public static g75.h l(m mVar) {
        return new g75.h(mVar.f141125c, mVar.f141123a, mVar.f141124b, mVar.d, mVar.e);
    }

    public TextLocalisedClause a(wi0.b bVar) {
        int i = com.revolut.feature.kyc.api.R$string.kyc_select_document_right_to_remain_short_subtitle;
        String lowerCase = bVar.f297794a.toLowerCase(Locale.ROOT);
        return new TextLocalisedClause(i, u.c(new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "country_name_with_article.", lowerCase), (List) null, (Clause) new TextClause(((o8b.c) ((n8b.a) this.f3032c)).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22)), null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0b68  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r72) {
        /*
            Method dump skipped, instruction units count: 3100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac4.g.c(cli.j):cli.o");
    }

    public g(lvk.a financialChartsListMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(financialChartsListMapper, "financialChartsListMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f3031b = financialChartsListMapper;
        this.f3032c = wealthDisclaimersMapper;
    }

    public g(FinancialSituationDetailsScreenContract$InputData inputData, x contentListItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        this.f3031b = inputData;
        this.f3032c = contentListItemMapper;
    }

    public g(ebh.b toolbarMapper, ebh.c transactionsMapper, ebh.a footerMapper) {
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f3031b = transactionsMapper;
        this.f3032c = footerMapper;
    }

    public g(ey4.g inputData, z constructorMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(constructorMapper, "constructorMapper");
        this.f3031b = inputData;
        this.f3032c = constructorMapper;
    }

    public g(y6j.a analyticsContextProvider, j7j.a itemsMapper) {
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f3031b = analyticsContextProvider;
        this.f3032c = itemsMapper;
    }

    public g(hb0.h inputData, eb0.a paginationMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paginationMapper, "paginationMapper");
        this.f3031b = inputData;
        this.f3032c = paginationMapper;
    }

    public g(i6a.b paymentsMigrationDetailsStateMapper, i6a.d searchResultStateMapper) {
        Intrinsics.checkNotNullParameter(paymentsMigrationDetailsStateMapper, "paymentsMigrationDetailsStateMapper");
        Intrinsics.checkNotNullParameter(searchResultStateMapper, "searchResultStateMapper");
        this.f3031b = paymentsMigrationDetailsStateMapper;
        this.f3032c = searchResultStateMapper;
    }

    public g(iui.d itemsMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f3031b = itemsMapper;
        this.f3032c = legalEntityDisclaimerMapper;
    }

    public g(CreditHealthContentScreenContract$InputData inputData, z creditScreenConstructorMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        this.f3031b = inputData;
        this.f3032c = creditScreenConstructorMapper;
    }

    public g(SelectSolicitorControllerContract$InputData inputData, z creditScreenConstructorMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        this.f3031b = inputData;
        this.f3032c = creditScreenConstructorMapper;
    }

    public g(AddRecipientContract$InputData inputData, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a itemsFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        this.f3031b = inputData;
        this.f3032c = itemsFactory;
    }

    public g(p4j.a backendFieldsMapper, n4j.a backendDefinitionsValidator) {
        Intrinsics.checkNotNullParameter(backendFieldsMapper, "backendFieldsMapper");
        Intrinsics.checkNotNullParameter(backendDefinitionsValidator, "backendDefinitionsValidator");
        this.f3031b = backendFieldsMapper;
        this.f3032c = backendDefinitionsValidator;
    }

    public g(fn2.c instrumentItemsMapper, jph.j titleMapper, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(instrumentItemsMapper, "instrumentItemsMapper");
        Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f3031b = instrumentItemsMapper;
        this.f3032c = swipeAssetTradeActionsMapper;
    }

    public g(bq5.g cryptoCreateBeneficiaryItemProvider, bq5.c cryptoCreateBeneficiaryDialogProvider, jp5.b cryptoWithdrawAddBeneficiaryDisclaimerMapper, k1 cryptoRecipientDetailsFieldsProvider) {
        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryItemProvider, "cryptoCreateBeneficiaryItemProvider");
        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryDialogProvider, "cryptoCreateBeneficiaryDialogProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawAddBeneficiaryDisclaimerMapper, "cryptoWithdrawAddBeneficiaryDisclaimerMapper");
        Intrinsics.checkNotNullParameter(cryptoRecipientDetailsFieldsProvider, "cryptoRecipientDetailsFieldsProvider");
        this.f3031b = cryptoCreateBeneficiaryItemProvider;
        this.f3032c = cryptoRecipientDetailsFieldsProvider;
    }

    public g(era.x tabsMapper, era.c cardNumberFieldMapper, era.j nameFieldsMapper, era.a buttonMapper, era.k navBarMapper, l nfcSuggestionMapper) {
        Intrinsics.checkNotNullParameter(tabsMapper, "tabsMapper");
        Intrinsics.checkNotNullParameter(cardNumberFieldMapper, "cardNumberFieldMapper");
        Intrinsics.checkNotNullParameter(nameFieldsMapper, "nameFieldsMapper");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(nfcSuggestionMapper, "nfcSuggestionMapper");
        this.f3031b = cardNumberFieldMapper;
        this.f3032c = nfcSuggestionMapper;
    }

    public g(hwc.j transactionWalletLimitsItemsMapper, hwc.g transactionLimitsItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionWalletLimitsItemsMapper, "transactionWalletLimitsItemsMapper");
        Intrinsics.checkNotNullParameter(transactionLimitsItemsMapper, "transactionLimitsItemsMapper");
        this.f3031b = transactionWalletLimitsItemsMapper;
        this.f3032c = transactionLimitsItemsMapper;
    }

    public g(klh.c commoditiesUIMapper, t5d.d swipeTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(commoditiesUIMapper, "commoditiesUIMapper");
        Intrinsics.checkNotNullParameter(swipeTradeActionsMapper, "swipeTradeActionsMapper");
        this.f3031b = commoditiesUIMapper;
        this.f3032c = swipeTradeActionsMapper;
    }

    public g(CreateMandateConfirmationControllerContract$InputData inputData, g75.n createMandateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(createMandateMapper, "createMandateMapper");
        this.f3031b = inputData;
        this.f3032c = createMandateMapper;
    }

    public g(CardClaimsScreenContract$InputData inputData, ou7.c cardItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardItemMapper, "cardItemMapper");
        this.f3031b = inputData;
        this.f3032c = cardItemMapper;
    }

    public g(gyi.n itemsMapper, gyi.f0 termsClauseMapper, g0 toolbarTitleMapper, egk.e pricingPlansUiInteractor) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(termsClauseMapper, "termsClauseMapper");
        Intrinsics.checkNotNullParameter(toolbarTitleMapper, "toolbarTitleMapper");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        this.f3031b = itemsMapper;
        this.f3032c = termsClauseMapper;
    }

    public g(InsuranceEligibleCardsScreenContract$InputData inputData, ou7.c cardItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardItemMapper, "cardItemMapper");
        this.f3031b = inputData;
        this.f3032c = cardItemMapper;
    }

    public g(TravelHotelsTravellerInformationEditScreenContract$InputData inputData, kag.a itemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f3031b = inputData;
        this.f3032c = itemMapper;
    }

    public g(fh3.e checklistCollectionHeaderMapper, fh3.a checklistCollectionContentItemsMapper, fh3.f checklistCollectionLoadingItemsMapper, fh3.c checklistCollectionFooterMapper, fh3.b checklistCollectionDisclaimerMapper, kh3.a checklistUiScreenErrorMapper) {
        Intrinsics.checkNotNullParameter(checklistCollectionHeaderMapper, "checklistCollectionHeaderMapper");
        Intrinsics.checkNotNullParameter(checklistCollectionContentItemsMapper, "checklistCollectionContentItemsMapper");
        Intrinsics.checkNotNullParameter(checklistCollectionLoadingItemsMapper, "checklistCollectionLoadingItemsMapper");
        Intrinsics.checkNotNullParameter(checklistCollectionFooterMapper, "checklistCollectionFooterMapper");
        Intrinsics.checkNotNullParameter(checklistCollectionDisclaimerMapper, "checklistCollectionDisclaimerMapper");
        Intrinsics.checkNotNullParameter(checklistUiScreenErrorMapper, "checklistUiScreenErrorMapper");
        this.f3031b = checklistCollectionHeaderMapper;
        this.f3032c = checklistCollectionContentItemsMapper;
    }

    public g(r10.d availableToOnboardAccountsMapper) {
        Intrinsics.checkNotNullParameter(availableToOnboardAccountsMapper, "availableToOnboardAccountsMapper");
        this.f3031b = availableToOnboardAccountsMapper;
        this.f3032c = te0.w.y0(new aj0.o(9));
    }

    public g(c8e.b rowsFactory, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(rowsFactory, "rowsFactory");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f3031b = rowsFactory;
        this.f3032c = legalEntityDisclaimerMapper;
    }

    public g(d1c.a chartMapper, d1c.h collapsibleSectionsMapper, d1c.l highlightsMapper) {
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(collapsibleSectionsMapper, "collapsibleSectionsMapper");
        Intrinsics.checkNotNullParameter(highlightsMapper, "highlightsMapper");
        this.f3031b = collapsibleSectionsMapper;
        this.f3032c = highlightsMapper;
    }

    public g(AsftTimeSlotPickerScreenContract$InputData inputData, nd.n filteredTimeSlotsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(filteredTimeSlotsProvider, "filteredTimeSlotsProvider");
        this.f3031b = inputData;
        this.f3032c = filteredTimeSlotsProvider;
    }

    public g(RefinancingAccountDetailsInputScreenContract$InputData inputData, z mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f3031b = inputData;
        this.f3032c = mapper;
    }

    public g(ChooseDocumentScreenContract$InputData inputData, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f3031b = inputData;
        this.f3032c = countryInteractor;
    }
}
