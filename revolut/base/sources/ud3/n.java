package ud3;

import android.os.Parcelable;
import android.os.SystemClock;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$SandboxAppearance;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputScreen;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureConfig;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ip0.xi0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;
import nii.y0;
import org.bouncycastle.asn1.eac.CertificateBody;
import vkm.j2;
import zhm.a1;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f279118b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f279117a = i;
        this.f279118b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object value;
        int i = 14;
        int i2 = 2;
        switch (this.f279117a) {
            case 0:
                CashbackBySources cashbackBySources = (CashbackBySources) this.f279118b;
                cl4.a details = (cl4.a) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                cl4.d cashback = cashbackBySources.b(uc3.d.CREDIT) ? details.f24928a : cl4.b.f24931a;
                xi0.b currency = details.f24929b;
                wi0.b countryCode = details.f24930c;
                boolean z = details.d;
                dj0.d creditLimit = details.e;
                boolean z3 = details.f;
                Intrinsics.checkNotNullParameter(cashback, "cashback");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
                return new ed3.b(new cl4.a(cashback, currency, countryCode, z, creditLimit, z3));
            case 1:
                ud6.i iVar = (ud6.i) this.f279118b;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                iVar.getClass();
                return zhm.u.c(new xi0("loadingItemId"));
            case 2:
                udk.z zVar = (udk.z) this.f279118b;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                zVar.H2(zVar.f279283x, new nd8.l(error, 11));
                return Boolean.TRUE;
            case 3:
                return udk.d.a((udk.d) obj2, new Data((xck.t) this.f279118b, null, false, 6, null), null, null, 6);
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b) this.f279118b;
                rv3.b it9 = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                bVar.K2(null);
                return Unit.f186387a;
            case 5:
                uec.e eVar = (uec.e) this.f279118b;
                AddressFlowContract$OutputData it10 = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                eVar.f279339n.k(new pec.f(it10.f60940a));
                return Unit.f186387a;
            case 6:
                uee.d dVar = (uee.d) this.f279118b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                String str2 = (String) pair.f186386b;
                sri.m mVar = dVar.f279348j;
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                Intrinsics.h(str);
                mVar.c(com.revolut.retail.core.navigation.a.c(finishCommand, new FeatureCommand(new CardDeliveryTroubleshootingFeatureConfig(str, CardDeliveryTroubleshootingFeatureFlow.CARD_TROUBLESHOOTING, str2, (AccountId) null, dVar.f279349l, 16))));
                return Unit.f186387a;
            case 7:
                uef.l lVar = (uef.l) this.f279118b;
                uef.e updateState = (uef.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return lVar.f279361r;
            case 8:
                ueg.c cVar = (ueg.c) this.f279118b;
                hha.d pricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                cVar.getClass();
                CashbackDetails.INSTANCE.getClass();
                vei.a aVarA = CashbackDetails.Companion.a(pricingPlan);
                return aVarA == null ? vei.a.STANDARD : aVarA;
            case 9:
                dgi.c cVar2 = (dgi.c) this.f279118b;
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                if (lowerPage.d == null) {
                    return null;
                }
                Intrinsics.h(cVar2);
                return new vfi.a(cVar2, lowerPage.d);
            case 10:
                ueg.e eVar2 = (ueg.e) this.f279118b;
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new rzc.b(eVar2, pagedData, 25), i2);
            case 11:
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = (TravelHotelsSearchResultsMapScreen) this.f279118b;
                KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                ueg.f0 f0VarJ3 = travelHotelsSearchResultsMapScreen.R2();
                h.b event = h.b.f196176a;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) f0VarJ3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                bVar2.I.onNext(event);
                return Unit.f186387a;
            case 12:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) this.f279118b;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof a.C0572a) {
                    bVar3.H2(bVar3.W, new n(output, i));
                    if (((a.C0572a) output).f94029a) {
                        bVar3.P2();
                    }
                }
                return Unit.f186387a;
            case 13:
                dgi.i iVar2 = (dgi.i) this.f279118b;
                ueg.v update = (ueg.v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ueg.v.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, iVar2.f114695h, 4194303);
            case 14:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a aVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a) this.f279118b;
                ueg.v update2 = (ueg.v) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ueg.v.a(update2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, ((a.C0572a) aVar).f94030b, 4194303);
            case 15:
                ueg.i0 i0Var = (ueg.i0) this.f279118b;
                ueg.v update3 = (ueg.v) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ueg.v.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, i0Var, null, null, null, null, null, false, null, null, null, null, 8384511);
            case 16:
                uek.g gVar = (uek.g) this.f279118b;
                uek.f update4 = (uek.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return uek.f.a(update4, gVar, null, 2);
            case 17:
                uf9.d dVar2 = (uf9.d) this.f279118b;
                dm1.d outputData = (dm1.d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dm1.c) {
                    j2 j2Var = dVar2.o;
                    do {
                        value = j2Var.getValue();
                    } while (!j2Var.h(value, uf9.f.a((uf9.f) value, ((dm1.c) outputData).f115817a, null, 2)));
                } else {
                    if (!(outputData instanceof dm1.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2.f279632p.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 18:
                ugb.f fVar = (ugb.f) this.f279118b;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                bib.a aVar2 = fVar.f279994p;
                TextLocalisedClause customErrorTitle = new TextLocalisedClause(R$string.salary_account_income_insurance_claim_error_title, null, null, 14);
                TextLocalisedClause customErrorDescription = new TextLocalisedClause(R$string.salary_account_income_insurance_claim_error_subtitle, null, null, 14);
                TextLocalisedClause customErrorPrimaryButtonText = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(customErrorTitle, "customErrorTitle");
                Intrinsics.checkNotNullParameter(customErrorDescription, "customErrorDescription");
                Intrinsics.checkNotNullParameter(customErrorPrimaryButtonText, "customErrorPrimaryButtonText");
                fVar.X1(new y0(null, tj0.a.a(throwable) ? new nii.e0((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (Parcelable) null, false, (AnalyticsProduct) null, 1012) : new nii.z(customErrorTitle, customErrorDescription, customErrorPrimaryButtonText, null, null, null, false, null, null, null, null, new nii.y(2, throwable.toString(), null), null, 24564), false, 5));
                return Boolean.TRUE;
            case 19:
                ugb.b bVar4 = (ugb.b) this.f279118b;
                ugb.a update5 = (ugb.a) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Set set = update5.f279990a;
                LinkedHashSet selectedCriteria = set.contains(bVar4) ? a1.j(set, bVar4) : a1.m(set, bVar4);
                Intrinsics.checkNotNullParameter(selectedCriteria, "selectedCriteria");
                return new ugb.a(selectedCriteria);
            case 20:
                ((oa2.b) this.f279118b).invoke();
                return Unit.f186387a;
            case 21:
                uh7.l lVar2 = (uh7.l) this.f279118b;
                Optional it11 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                NaviCommand naviCommand = (NaviCommand) gj7.b.m(it11);
                if (naviCommand != null) {
                    lVar2.f280120a.b(naviCommand);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "InstrumentsTrendCollectionsFeedWidgetEventHandler", "onboarding navi command is null", null, null, 16);
                }
                return pfm.m.f235744a;
            case 22:
                BidCustomInputScreen bidCustomInputScreen = (BidCustomInputScreen) this.f279118b;
                String it12 = (String) obj2;
                int i3 = BidCustomInputScreen.X;
                Intrinsics.checkNotNullParameter(it12, "it");
                bidCustomInputScreen.R.k(it12);
                return Unit.f186387a;
            case 23:
                uif.a aVar3 = (uif.a) this.f279118b;
                Long it13 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.longValue() == aVar3.a());
            case 24:
                uif.g gVar2 = (uif.g) this.f279118b;
                gVar2.f280434a.getClass();
                gVar2.f280438h = SystemClock.elapsedRealtime();
                return Unit.f186387a;
            case 25:
                oj6.f fVar2 = (oj6.f) this.f279118b;
                return uj6.k.a((uj6.k) obj2, new Data(null, null, true, 3, null), new uj6.j(fVar2.f225740a, fVar2.f225741b, fVar2.f225742c), null, r0.g(), r0.g(), 4);
            case 26:
                uk2.y yVar = (uk2.y) this.f279118b;
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                yVar.getClass();
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 27:
                ukh.q qVar = (ukh.q) this.f279118b;
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (List) qVar.f280769c.getValue();
            case 28:
                qha.a aVar4 = (qha.a) this.f279118b;
                ulk.g update6 = (ulk.g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                dj0.d dVar3 = aVar4.f246565a;
                if (dVar3 == null) {
                    dj0.d.Companion.getClass();
                    dVar3 = dj0.d.e;
                }
                List list = aVar4.f246567c;
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i5 = 0;
                for (Object obj3 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarO = i5 == 0 ? ((qha.b) obj3).f246575b : pyd.c.O(dVarO, ((qha.b) obj3).f246575b);
                    i5 = i6;
                }
                long j2 = dVar3.f115082a;
                long j3 = dVarO.f115082a;
                return ulk.g.a(update6, null, null, null, zi0.c.P(j2 == j3 ? new ulk.l(dVar3.f115083b) : j2 > j3 ? new ulk.k(pyd.c.H(dVar3, dVarO)) : new ulk.j(pyd.c.H(dVarO, dVar3)), false, null, 3), 15);
            default:
                return um2.a.a((um2.a) obj2, null, null, null, null, false, null, null, (ThemeCustomisationContract$SandboxAppearance) this.f279118b, CertificateBody.profileType);
        }
    }

    public /* synthetic */ n(oki.h hVar, Object obj2, int i) {
        this.f279117a = i;
        this.f279118b = obj2;
    }
}
