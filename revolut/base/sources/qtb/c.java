package qtb;

import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.runtime.DisposableEffectScope;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.beneficiary.BeneficiarySortingStrategy;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.AutoPayAction;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingResponse;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import efm.d0;
import ip0.gu;
import ip0.sy;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.u0;
import nii.y0;
import nii.z;
import org.jmrtd.lds.LDSFile;
import pyc.h0;
import pyc.t;
import qc0.e1;
import qu4.u;
import qyc.q;
import r08.a;
import te0.w;
import y20.i1;
import y20.r;
import y20.s;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f249065b;

    public /* synthetic */ c(CreditCardAutopayPayments creditCardAutopayPayments, u uVar) {
        this.f249064a = 4;
        this.f249065b = creditCardAutopayPayments;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        qwf.p pVar;
        switch (this.f249064a) {
            case 0:
                c cVar = (c) this.f249065b;
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ptb.g gVar = update.f249070a;
                ptb.g menuState = (ptb.g) cVar.f249065b;
                Intrinsics.checkNotNullParameter(menuState, "menuState");
                return new h(menuState);
            case 1:
                return (ptb.g) this.f249065b;
            case 2:
                qu1.p pVar2 = (qu1.p) this.f249065b;
                Alias alias = (Alias) obj2;
                Intrinsics.checkNotNullParameter(alias, "alias");
                pVar2.l2(new e1(pVar2, alias, null, 29), new yi5.b(26));
                return Unit.f186387a;
            case 3:
                ym4.a aVar = (ym4.a) this.f249065b;
                qu4.i update2 = (qu4.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return aVar != null ? qu4.i.a(update2, null, null, false, null, aVar.f314856a, aVar.f314857b, aVar.f314858c, false, aVar.d, null, null, 1551) : qu4.i.a(update2, null, null, false, null, null, null, false, false, null, null, null, 1915);
            case 4:
                CreditCardAutopayPayments creditCardAutopayPayments = (CreditCardAutopayPayments) this.f249065b;
                qu4.i iVar = (qu4.i) obj2;
                if (creditCardAutopayPayments == null) {
                    return qu4.i.a(iVar, null, null, false, null, null, null, false, false, null, AutoPayAction.NOT_AVAILABLE, new Data(null, null, false, 7, null), 511);
                }
                return qu4.i.a(iVar, null, null, false, null, null, null, false, false, null, creditCardAutopayPayments.d.isEmpty() ? AutoPayAction.SETUP : AutoPayAction.MANAGE, new Data(creditCardAutopayPayments, null, false, 6, null), 511);
            case 5:
                qu9.b bVar = (qu9.b) this.f249065b;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                boolean z = false;
                if (throwable instanceof NoSuchElementException) {
                    bVar.f249280n.getClass();
                    bVar.L2(new y0(null, new z(new TextLocalisedClause(R$string.chat_bottom_sheet_profile_not_found_title, null, null, 14), new TextLocalisedClause(R$string.chat_bottom_sheet_profile_not_found_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, u0.SAD, null, null, 28660), false, 5));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                AccountClosureFeedbackChoice accountClosureFeedbackChoice = (AccountClosureFeedbackChoice) this.f249065b;
                qug.e update3 = (qug.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                TradingAccount account = update3.f249443a;
                Intrinsics.checkNotNullParameter(account, "account");
                return new qug.e(account, accountClosureFeedbackChoice);
            case 7:
                qul.b bVar2 = (qul.b) this.f249065b;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (bw0.h) bVar2.f.getValue();
            case 8:
                qv4.f fVar = (qv4.f) this.f249065b;
                qv4.g update4 = (qv4.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return qv4.g.a(update4, fVar, null, 2);
            case 9:
                qvh.g gVar2 = (qvh.g) this.f249065b;
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                gVar2.f249704q.getClass();
                yji.l.a1(gVar2, gVar2.X1(new y0("ERROR_DIALOG_ID", qvh.h.a(), false, 4)), null, null, new qvh.f(gVar2, null), 3);
                return Boolean.TRUE;
            case 10:
                return (qwd.m) this.f249065b;
            case 11:
                TransitTicketRevPointOption transitTicketRevPointOption = (TransitTicketRevPointOption) this.f249065b;
                qwf.o updateState = (qwf.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data data2 = updateState.f249919g;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        qwf.p pVar3 = (qwf.p) content;
                        List options = pVar3.f249922a;
                        dj0.d totalPriceForPoints = pVar3.f249924c;
                        Intrinsics.checkNotNullParameter(options, "options");
                        Intrinsics.checkNotNullParameter(totalPriceForPoints, "totalPriceForPoints");
                        pVar = new qwf.p(options, transitTicketRevPointOption, totalPriceForPoints);
                    } else {
                        pVar = null;
                    }
                    data = new Data(pVar, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return qwf.o.a(updateState, 0L, null, null, null, data, null, null, null, 959);
            case 12:
                uwf.i iVar2 = (uwf.i) this.f249065b;
                qwf.o updateState2 = (qwf.o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return qwf.o.a(updateState2, 0L, iVar2.f283661a, null, null, null, null, null, null, 1019);
            case 13:
                return (qwf.o) this.f249065b;
            case 14:
                AirportLoungesDisclaimer airportLoungesDisclaimer = (AirportLoungesDisclaimer) this.f249065b;
                AirportLoungePassDetailsFlowContract$State update5 = (AirportLoungePassDetailsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return AirportLoungePassDetailsFlowContract$State.a(update5, false, null, airportLoungesDisclaimer, null, 47);
            case 15:
                qxb.c cVar2 = (qxb.c) this.f249065b;
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (RevPointsPersonalisationTargetingOnboardingResponse) cVar2.f250061c.get("TARGETING_ONBOARDING_MEM_KEY");
            case 16:
                q qVar = (q) this.f249065b;
                CharSequence it11 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                pyc.f fVar2 = qVar.f250280j;
                String description = it11.toString();
                t tVar = (t) fVar2;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(description, "description");
                ((h0) tVar.f240799b).y0().set(description);
                return Unit.f186387a;
            case 17:
                qz5.b bVar3 = (qz5.b) this.f249065b;
                String accessToken = (String) obj2;
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                return new pfm.h(new phc.d(bVar3, accessToken, 22), 2).f(d0.m(accessToken));
            case 18:
                r08.c cVar3 = (r08.c) this.f249065b;
                r08.a action = (r08.a) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                f08.e eVar = cVar3.f250723b;
                fx7.f fVar3 = cVar3.f250722a;
                String petId = (String) ((f08.k) eVar).d().get();
                if (Intrinsics.f(action, a.C1381a.f250720a)) {
                    Intrinsics.checkNotNullParameter(petId, "petId");
                    kx7.y0 y0Var = (kx7.y0) fVar3.f138760a;
                    y0Var.getClass();
                    Intrinsics.checkNotNullParameter(petId, "petId");
                    pfm.a aVarE = y0Var.f190501a.deletePetPicture(petId).e(y0Var.a().g(Unit.f186387a, false));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    return w.g0(aVarE);
                }
                if (!(action instanceof r08.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                File file = ((r08.b) action).f250721a;
                Intrinsics.checkNotNullParameter(petId, "petId");
                Intrinsics.checkNotNullParameter(file, "file");
                pfm.a aVar2 = new pfm.a(r80.c.a(fVar3.f138762c, file, 70), new fwj.h(new fpk.b(fVar3, petId, 16), 5), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 19:
                return r0a.i.a((r0a.i) obj2, null, null, null, (r0a.j) this.f249065b, null, null, LDSFile.EF_SOD_TAG);
            case 20:
                return BasicTextContextMenuProviderKt.basicTextContextMenuProvider$lambda$1$0((BasicTextContextMenuProvider) this.f249065b, (DisposableEffectScope) obj2);
            case 21:
                FeedFilter.ByRef byRef = (FeedFilter.ByRef) this.f249065b;
                x08.i feedState = (x08.i) obj2;
                Intrinsics.checkNotNullParameter(feedState, "feedState");
                return new a18.a(feedState, new FeedFilter.ByRef(byRef.f76424a));
            case 22:
                a18.d dVar = (a18.d) this.f249065b;
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                int i = dVar.f559a;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(new sy(a0.d.n("recent-insights-loading-", i2), null, 62));
                }
                return yp0.b.h(arrayList, new gu("WIDGET_LIST_ID_RECENT_INSIGHTS_HEADER", 0, 0, 30), null, 0, 126);
            case 23:
                BeneficiarySortingStrategy beneficiarySortingStrategy = (BeneficiarySortingStrategy) this.f249065b;
                List beneficiaryList = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaryList, "beneficiaryList");
                ArrayList arrayListA = n61.j.a("", beneficiaryList);
                int i3 = r21.e.f251033a[beneficiarySortingStrategy.ordinal()];
                if (i3 == 1) {
                    return n61.j.h(arrayListA);
                }
                if (i3 == 2) {
                    return arrayListA;
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                r24.d dVar2 = (r24.d) this.f249065b;
                String applicationId = (String) obj2;
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                return (ky3.a) v1.c.s("current_address_", applicationId, dVar2.f251050c);
            case 25:
                AlertsWidgetContext alertsWidgetContext = (AlertsWidgetContext) this.f249065b;
                List assetTypeKeysOrdered = (List) obj2;
                Intrinsics.checkNotNullParameter(assetTypeKeysOrdered, "assetTypeKeysOrdered");
                List list = alertsWidgetContext.i;
                AssetIdWithSymbol assetIdWithSymbol = alertsWidgetContext.d;
                List listC = assetIdWithSymbol != null ? zhm.u.c(assetIdWithSymbol.f86861a) : null;
                String str = alertsWidgetContext.f86009h;
                return new mgd.g(assetTypeKeysOrdered, list, listC, str != null ? zhm.u.c(str) : null, Integer.valueOf(alertsWidgetContext.e), alertsWidgetContext.f, (List) null, 160);
            case 26:
                i1 i1Var = (i1) this.f249065b;
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new v30.h0(it13, it13.size() >= i1Var.getCount());
            case 27:
                r rVar = (r) this.f249065b;
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                int size = it14.size();
                rVar.getClass();
                return new v30.h0(it14, size >= 100);
            case 28:
                y20.q qVar2 = (y20.q) this.f249065b;
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                int size2 = it15.size();
                qVar2.getClass();
                return new v30.h0(it15, size2 >= 100);
            default:
                s sVar = (s) this.f249065b;
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                int size3 = it16.size();
                sVar.getClass();
                return new v30.h0(it16, size3 >= 100);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f249064a = i;
        this.f249065b = obj2;
    }

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f249064a = i;
        this.f249065b = obj3;
    }
}
