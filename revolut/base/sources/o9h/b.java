package o9h;

import aii.q;
import android.view.WindowInsets;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsDashboardState;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowEntitiesPage;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.CantSendRequestDialogContent;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentConfiguration;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsConfiguration;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlowContract$Step;
import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousRecipientWarningDestination;
import dfj.x1;
import efm.d0;
import i31.j;
import i31.l;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k1h.o;
import k1h.p;
import k61.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nii.n1;
import nii.y0;
import nii.z;
import o9k.c0;
import o9k.t0;
import oc0.k;
import oc9.b0;
import oc9.e0;
import oc9.y;
import oi4.n;
import oki.h;
import pej.a;
import pej.b;
import pfm.m;
import q90.u;
import retrofit2.HttpException;
import rfm.f0;
import z0h.o1;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f223278b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f223277a = i;
        this.f223278b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String text;
        int i;
        int i2;
        CantSendRequestDialogContent cantSendRequestDialogContent;
        int i3 = this.f223277a;
        int i5 = 26;
        boolean z = true;
        z = true;
        z = true;
        Continuation continuation = null;
        Object obj3 = this.f223278b;
        switch (i3) {
            case 0:
                g gVar = ((e) obj3).f223283j;
                ty0.a it8 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj4 = it8.d;
                boolean z3 = obj4 instanceof o1;
                m mVar = m.f235744a;
                if (z3) {
                    NaviCommand naviCommandI0 = gVar.f223286b.I0((o1) obj4);
                    if (naviCommandI0 != null) {
                        return gVar.f223285a.a(naviCommandI0);
                    }
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                if (Intrinsics.f(obj4, o.a.f180271a)) {
                    gVar.getClass();
                    return gVar.f223285a.a(new FeatureCommand(DisclosuresFeatureConfig.TradingDisclosuresFeatureConfig.f95197a));
                }
                if (!(obj4 instanceof p)) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                String url2 = ((p) obj4).f180272a;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                return gVar.f223285a.a(u0.f(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(url2, WebViewScreenTitleSource.Html.f98166a, false)), null, true)));
            case 1:
                Intrinsics.checkNotNullParameter((n1) obj2, "it");
                ((c0) obj3).invoke();
                return Unit.f186387a;
            case 2:
                t0 t0Var = (t0) obj3;
                PeerToPeerTransferDescriptor data = (PeerToPeerTransferDescriptor) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                if (data instanceof PeerToPeerTransferDescriptor.Transfer) {
                    ufm.b bVarM = d0.m(data);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (!(data instanceof PeerToPeerTransferDescriptor.Link)) {
                    throw new NoWhenBranchMatchedException();
                }
                f0 f0VarF = ue0.e.v(((l) ((i) t0Var.d).f181611a).f158089j.g(j.a.f158082a, false)).f(d0.m(data));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return f0VarF;
            case 3:
                com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar = (com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof dii.b) && !(result instanceof dii.c) && !(result instanceof dii.d)) {
                    if (result instanceof dii.f) {
                        h.D2(aVar.f95561s);
                    } else {
                        if (!(result instanceof dii.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h.t2(aVar, aVar.f95561s, DualAddMoneyFlowContract$Step.CreateOrUpdateRecurringDeposit.f95556a, false, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 4:
                ob1.f updateState = (ob1.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Map map = updateState.f223848b.f60608a;
                CardReaderProductDetailsScreenContract$ProductDetailsDashboardState cardReaderProductDetailsScreenContract$ProductDetailsDashboardState = new CardReaderProductDetailsScreenContract$ProductDetailsDashboardState(map);
                map.put((CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) obj3, Boolean.valueOf(!updateState.f223848b.a(r11)));
                return ob1.f.a(updateState, null, cardReaderProductDetailsScreenContract$ProductDetailsDashboardState, null, 5);
            case 5:
                Intrinsics.checkNotNullParameter((q) obj2, "<unused var>");
                ((com.revolut.feature.donations.impl.ui.kompot.flow.recurring.a) obj3).I2();
                return Unit.f186387a;
            case 6:
                oc0.h params = (oc0.h) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (BackendFlowEntitiesPage) ((oc0.i) obj3).f224035b.get(params.a());
            case 7:
                oc0.j params2 = (oc0.j) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (BackendEntitiesSummaryItem) ((k) obj3).f224040a.get(params2.a());
            case 8:
                String ticketId = (String) obj2;
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                return (u) ((oc0.m) obj3).f224043a.get(oc0.m.b(ticketId));
            case 9:
                WindowInsets it9 = (WindowInsets) obj2;
                KProperty[] kPropertyArr = CashTopUpLocationsMapScreen.f65677a0;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((CashTopUpLocationsMapScreen) obj3).b3().setAnchoredStateOffset(it9.getStableInsetTop());
                return Unit.f186387a;
            case 10:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                ((oc4.k) obj3).I2(new Data(null, error, false, 5, null));
                return Boolean.TRUE;
            case 11:
                b0 b0Var = (b0) obj3;
                com.revolut.kompot.common.flow.permissions.a output = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, a.C0596a.f98352a)) {
                    b0Var.l2(new nt4.f(b0Var, null, 17), new yi5.b(i5));
                    return Unit.f186387a;
                }
                if ((output instanceof sii.c) || (output instanceof sii.d)) {
                    throw new IllegalStateException("Permission is mandatory, its only possible to have Success or flow closure without result");
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                e0 e0Var = (e0) obj3;
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                QesTermsConfiguration qesTermsConfiguration = e0Var.f224142a.f78549a;
                Clause clause = qesTermsConfiguration.f78154a;
                Clause clause2 = qesTermsConfiguration.f78155b;
                List list = (List) getDefaultLoadingItems.invoke();
                QesTermsConfiguration qesTermsConfiguration2 = e0Var.f224142a.f78549a;
                return new y(clause, clause2, qesTermsConfiguration2.f78160l, qesTermsConfiguration2.f78161m, list, false, false);
            case 13:
                return ocb.g.a((ocb.g) obj2, null, false, null, false, false, null, null, null, null, false, false, false, (rcb.c) obj3, false, null, 28671);
            case 14:
                return od3.l.a((od3.l) obj2, null, null, (od3.f0) obj3, 15);
            case 15:
                hha.d pricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                ((odg.e) obj3).getClass();
                CashbackDetails.INSTANCE.getClass();
                vei.a aVarA = CashbackDetails.Companion.a(pricingPlan);
                return aVarA == null ? vei.a.STANDARD : aVarA;
            case 16:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) obj3;
                dii.g output2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof dii.f) {
                    aVar2.l2(new oe1.l(aVar2, null, 0), new yi5.b(i5));
                }
                return Unit.f186387a;
            case 17:
                pej.b simulation = (pej.b) obj2;
                Intrinsics.checkNotNullParameter(simulation, "simulation");
                boolean zA = ((oej.b) obj3).f224610a.a();
                if (Intrinsics.f(simulation, b.a.f235383a)) {
                    return zA ? a.C1306a.f235381a : a.b.f235382a;
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                String consentId = (String) obj2;
                Intrinsics.checkNotNullParameter(consentId, "consentId");
                return (so6.a) v7.r("BRAZIL_INBOUND_CONSENT_DETAILS_MEMORY_CACHE_KEY", consentId, ((of6.b) obj3).f224740b);
            case 19:
                ofe.b bVar = (ofe.b) obj3;
                od0.i groupIdOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(groupIdOptional, "groupIdOptional");
                if (!groupIdOptional.d()) {
                    return gal.c.f142195a;
                }
                String transactionGroupId = (String) groupIdOptional.c();
                bVar.f224804b.getClass();
                Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
                return new gal.d(new FeatureCommand(new KompotOverlayFeatureConfig(new SuspiciousRecipientWarningDestination(transactionGroupId), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
            case 20:
                ((ofg.d) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_miles_airlines ORDER BY `order` ASC");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "order");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_id");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_name");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_description");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_logoUrl");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_signupUrl");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_account");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_rate");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_unit");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_campaign");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "provider_accountLinkType");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                            text = null;
                            i2 = columnIndexOrThrow2;
                            i = columnIndexOrThrow3;
                        } else {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                            i = columnIndexOrThrow3;
                            i2 = columnIndexOrThrow2;
                        }
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                        int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                        List listB = nfg.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                        int i21 = columnIndexOrThrow15;
                        String text12 = sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21);
                        int i22 = columnIndexOrThrow;
                        int i32 = columnIndexOrThrow16;
                        qfg.a aVarA2 = nfg.b.a(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                        columnIndexOrThrow16 = i32;
                        int i33 = columnIndexOrThrow17;
                        qfg.g gVarA = nfg.d.a(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                        columnIndexOrThrow17 = i33;
                        int i43 = columnIndexOrThrow18;
                        String text13 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                        columnIndexOrThrow18 = i43;
                        int i59 = columnIndexOrThrow19;
                        qfg.e eVarA = nfg.c.a(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                        columnIndexOrThrow19 = i59;
                        int i66 = columnIndexOrThrow20;
                        arrayList.add(new qfg.d(text2, text3, text4, text5, text6, text, z4, i6, listB, text7, new qfg.f(text8, text9, text10, text11, text12, aVarA2, gVarA, text13, eVarA, sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66))));
                        columnIndexOrThrow20 = i66;
                        columnIndexOrThrow2 = i2;
                        columnIndexOrThrow = i22;
                        columnIndexOrThrow15 = i21;
                        columnIndexOrThrow3 = i;
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                og4.d dVar = (og4.d) obj3;
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it10, h0Var);
                yji.l.a1(dVar, dVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_error_subtitle, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, null, 7);
                return Boolean.TRUE;
            case 22:
                lhb.d dVar2 = (lhb.d) obj3;
                ohb.a update = (ohb.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String str = dVar2.f195235a;
                String str2 = dVar2.f195236b;
                String str3 = dVar2.f195237c;
                List contacts = update.f225333a;
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                return new ohb.a(str, str2, str3, contacts);
            case 23:
                ((ohk.g) obj3).o.k((bgk.b) obj2);
                return Unit.f186387a;
            case 24:
                oi4.p pVar = (oi4.p) obj3;
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                if ((error2 instanceof HttpException) && ((HttpException) error2).code() == 406) {
                    RequestConsentConfiguration requestConsentConfiguration = (RequestConsentConfiguration) ((oi4.e) pVar.t2()).f225435a.getContent();
                    if (requestConsentConfiguration != null && (cantSendRequestDialogContent = requestConsentConfiguration.f68454b) != null) {
                        yji.l.a1(pVar, pVar.X1(new y0("STATUS_DIALOG_REQUEST_CAN_NOT_BE_SENT_ERROR_ID", new z(cantSendRequestDialogContent.f68448a, cantSendRequestDialogContent.f68449b, cantSendRequestDialogContent.f68450c, cantSendRequestDialogContent.d, null, null, false, null, null, null, null, null, null, 32724), false, 4)), null, null, new n(pVar, continuation, z ? 1 : 0), 3);
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                return oi4.e.a((oi4.e) obj2, new Data((RequestConsentConfiguration) obj3, null, false, 6, null), null, 2);
            case 26:
                eid.j it11 = (eid.j) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((oid.h) obj3).getClass();
                return lid.c.a(it11, "GiftCardsCheckout", null, null);
            case 27:
                eid.j it12 = (eid.j) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return lid.c.a(it12, ((oid.j) obj3).f225645b, null, null);
            case 28:
                Map.Entry it13 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(((x1) it13.getKey()).f114149b.getF100209b(), (EsimDataPlanCoverageCode) obj3));
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ((ojd.g) obj3).B2();
                return Boolean.TRUE;
        }
    }
}
