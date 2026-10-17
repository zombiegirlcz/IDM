package j2c;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlow;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$OutputData;
import com.revolut.camerakit.revolut.ui.barcode.models.BarcodeReaderScreenSettings;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$color;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.AddressSearchListResult;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.onboarding.countries.restriction.impl.disclaimer.CountryOfResidenceRevolutXDisclaimerScreen;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.PixQrCodeTransactionFlowContract$Step;
import com.revolut.feature.rev_points.api.extension.earning_rates.RevPointsEarningRateAggregate;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.rev_points.models.RevPointsEarningRateCardAction;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.UpcomingPaymentsPocketInfo;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreenContract$InputData;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import dp4.y0;
import e3i.m;
import efm.d0;
import ix6.l0;
import j54.p0;
import j54.r0;
import j54.u0;
import j54.x0;
import j54.z0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k3k.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import le.u1;
import m1c.f1;
import m1c.j0;
import m1c.m0;
import org.joda.time.DateTime;
import tof.a3;
import vkm.j2;
import yhm.m;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f170821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170822c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj2, int i, Object obj3, Object obj4) {
        this.f170820a = i;
        this.f170821b = obj2;
        this.f170822c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        ji1.g gVar;
        RevPointsEarningRateCardAction revPointsEarningRateCardAction;
        efm.k kVarG;
        Object value;
        int i = this.f170820a;
        int i2 = 6;
        final int i3 = 0;
        ?? eVar = 0;
        ProductAccount.ValueItem.Discover discover = null;
        ProductAccount.ValueItem.Discover discover2 = null;
        Object obj3 = this.d;
        Object obj4 = this.f170822c;
        Object obj5 = this.f170821b;
        switch (i) {
            case 0:
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) obj5;
                yvh.b bVar = (yvh.b) obj4;
                l lVar = (l) obj3;
                AutoInvestMoveControllerApi$Result result = (AutoInvestMoveControllerApi$Result) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof AutoInvestMoveControllerApi$Result.Cancel)) {
                    if (!(result instanceof AutoInvestMoveControllerApi$Result.Move)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.l2(new y0(aVar, bVar, lVar.a(), (Continuation) null, 6), new p(aVar, 1));
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar2 = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) obj5;
                hw0.q limitType = (hw0.q) obj4;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                e3i.m output = (e3i.m) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, m.a.f122304a)) {
                    if (!(output instanceof e3i.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float fFloatValue = new BigDecimal(BigInteger.valueOf(((e3i.n) output).f122306b), ref$IntRef.f186408a).floatValue();
                    Intrinsics.checkNotNullParameter(limitType, "limitType");
                    bVar2.H2(bVar2.v, new j3i.n(limitType, fFloatValue, i3));
                }
                return Unit.f186387a;
            case 2:
                Boolean bool = (Boolean) obj4;
                Intrinsics.h(bool);
                return j53.i.a((j53.i) obj5, null, false, bool.booleanValue(), (Data) obj3, 7);
            case 3:
                r0 r0Var = (r0) obj5;
                PluginPayload pluginPayload = (PluginPayload) obj4;
                h54.o oVar = (h54.o) obj3;
                c84.p outputData = (c84.p) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                Continuation continuation = null;
                if (outputData instanceof c84.m) {
                    r0Var.T2(new p0(r0Var, pluginPayload, outputData, continuation, 0), new yi5.b(27));
                } else if (outputData instanceof c84.n) {
                    r0Var.T2(new p0(r0Var, pluginPayload, outputData, continuation, 1), new yi5.b(27));
                } else if (outputData instanceof c84.o) {
                    r0Var.T2(new p0(outputData, pluginPayload, r0Var, null), new yi5.b(27));
                } else if (outputData instanceof c84.j) {
                    r0Var.T2(new p0(r0Var, pluginPayload, outputData, continuation, 3), new yi5.b(27));
                } else if (outputData instanceof c84.l) {
                    r0Var.T2(new p0(r0Var, pluginPayload, outputData, continuation, 4), new yi5.b(27));
                } else {
                    if (!(outputData instanceof c84.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r0Var.T2(new l0(r0Var, oVar, outputData, continuation, 8), new yi5.b(27));
                }
                return Unit.f186387a;
            case 4:
                j54.y0 y0Var = (j54.y0) obj5;
                String str = (String) obj4;
                z0 z0Var = (z0) obj3;
                til.r it8 = (til.r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Continuation continuation2 = null;
                if (it8 instanceof til.q) {
                    y0Var.V2(new u0(y0Var, str, continuation2, i3), new yi5.b(29));
                } else if (it8 instanceof til.n) {
                    y0Var.V2(new l0(y0Var, str, it8, continuation2, 9), new yi5.b(29));
                } else if (!(it8 instanceof til.o)) {
                    if (!(it8 instanceof til.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y0Var.V2(new x0(y0Var, str, z0Var, continuation2, 1), new yi5.b(29));
                } else if (((til.o) it8).f271582a) {
                    y0Var.V2(new x0(y0Var, str, z0Var, continuation2, 0), new yi5.b(29));
                } else {
                    y0Var.V2(new u0(y0Var, str, continuation2, 1), new yi5.b(29));
                }
                return Unit.f186387a;
            case 5:
                String str2 = (String) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new pfm.n(new g31.d((Data) rVar.f314201a, (DateTime) obj5, (j6k.o) obj4, (Set) rVar.f314202b, (od0.i) rVar.f314203c, str2), 1);
            case 6:
                return jc6.j.a((jc6.j) obj2, (Data) obj5, (Data) obj4, (nqi.c) obj3, null, null, null, 113);
            case 7:
                jg9.l lVar2 = (jg9.l) obj5;
                final BillFormField billFormField = (BillFormField) obj4;
                final rf9.a aVar2 = (rf9.a) obj3;
                eii.k outputData2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof eii.i) {
                    Object obj6 = ((eii.i) outputData2).f126655a;
                    tg9.c cVar = tg9.c.QR;
                    ModalDestination.Style.FULLSCREEN_IMMEDIATE fullscreen_immediate = ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a;
                    if (obj6 == cVar) {
                        lVar2.getClass();
                        lVar2.N2(lVar2.o2(new g12.k(new QrScannerInputData(), lVar2.f173950m)), fullscreen_immediate, new Function1() { // from class: jg9.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                String value2;
                                int i5 = i3;
                                BillFormField billFormField2 = billFormField;
                                rf9.a aVar3 = aVar2;
                                switch (i5) {
                                    case 0:
                                        g12.q output2 = (g12.q) obj7;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        if (output2 instanceof g12.p) {
                                            String fieldId = billFormField2.f61274a;
                                            g12.m mVar = ((g12.p) output2).f139527a;
                                            tg9.b bVar3 = mVar instanceof tg9.b ? (tg9.b) mVar : null;
                                            String str3 = bVar3 != null ? bVar3.f271111a : null;
                                            value2 = str3 != null ? str3 : "";
                                            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
                                            Intrinsics.checkNotNullParameter(value2, "value");
                                            aVar3.f253709b.q3(fieldId, value2);
                                            Unit unit = Unit.f186387a;
                                        }
                                        break;
                                    default:
                                        BarcodeReaderFlowContract$OutputData output3 = (BarcodeReaderFlowContract$OutputData) obj7;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        if (output3 instanceof BarcodeReaderFlowContract$OutputData.Success) {
                                            String fieldId2 = billFormField2.f61274a;
                                            String str4 = ((BarcodeReaderFlowContract$OutputData.Success) output3).f50756a.f51390a;
                                            value2 = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(fieldId2, "fieldId");
                                            Intrinsics.checkNotNullParameter(value2, "value");
                                            aVar3.f253709b.q3(fieldId2, value2);
                                            Unit unit2 = Unit.f186387a;
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        });
                    } else if (obj6 == tg9.c.BARCODE) {
                        lVar2.getClass();
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_action_button, null, null, 14);
                        rz.m mVar = rz.m.FIT;
                        int i5 = R$color.camera_kit_white;
                        BarcodeReaderFlow barcodeReaderFlow = new BarcodeReaderFlow(new BarcodeReaderFlowContract$InputData(new BarcodeReaderScreenSettings(textLocalisedClause, textLocalisedClause2, new Mask.Barcode(mVar, i5, i5, i5, 16), null)));
                        final int i6 = 1;
                        lVar2.N2(barcodeReaderFlow, fullscreen_immediate, new Function1() { // from class: jg9.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                String value2;
                                int i59 = i6;
                                BillFormField billFormField2 = billFormField;
                                rf9.a aVar3 = aVar2;
                                switch (i59) {
                                    case 0:
                                        g12.q output2 = (g12.q) obj7;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        if (output2 instanceof g12.p) {
                                            String fieldId = billFormField2.f61274a;
                                            g12.m mVar2 = ((g12.p) output2).f139527a;
                                            tg9.b bVar3 = mVar2 instanceof tg9.b ? (tg9.b) mVar2 : null;
                                            String str3 = bVar3 != null ? bVar3.f271111a : null;
                                            value2 = str3 != null ? str3 : "";
                                            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
                                            Intrinsics.checkNotNullParameter(value2, "value");
                                            aVar3.f253709b.q3(fieldId, value2);
                                            Unit unit = Unit.f186387a;
                                        }
                                        break;
                                    default:
                                        BarcodeReaderFlowContract$OutputData output3 = (BarcodeReaderFlowContract$OutputData) obj7;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        if (output3 instanceof BarcodeReaderFlowContract$OutputData.Success) {
                                            String fieldId2 = billFormField2.f61274a;
                                            String str4 = ((BarcodeReaderFlowContract$OutputData.Success) output3).f50756a.f51390a;
                                            value2 = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(fieldId2, "fieldId");
                                            Intrinsics.checkNotNullParameter(value2, "value");
                                            aVar3.f253709b.q3(fieldId2, value2);
                                            Unit unit2 = Unit.f186387a;
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        });
                    }
                }
                return Unit.f186387a;
            case 8:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b) obj5;
                hha.d dVar = (hha.d) obj4;
                hha.d dVar2 = (hha.d) obj3;
                phk.j result2 = (phk.j) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3.n2(new fc0.e(11, dVar2, bVar3, dVar, result2.f236326a, result2.f236327b, (Continuation) null), new whi.b(i2));
                return Unit.f186387a;
            case 9:
                com.revolut.feature.address.common.impl.flow.screen.find.b bVar4 = (com.revolut.feature.address.common.impl.flow.screen.find.b) obj5;
                Data data = (Data) obj4;
                String str3 = (String) obj3;
                ji1.e eVar2 = (ji1.e) obj2;
                if (data.getLoading()) {
                    gVar = new ji1.g(data, bVar4.I2());
                } else {
                    AddressSearchListResult addressSearchListResult = (AddressSearchListResult) data.getContent();
                    gVar = new ji1.g(data, addressSearchListResult != null ? addressSearchListResult.getSessionId() : null);
                }
                return ji1.e.a(eVar2, null, gVar, str3, 1);
            case 10:
                wi0.b bVar5 = (wi0.b) obj3;
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.h(bVar5);
                return ((jof.d) obj5).a((a3) obj4, it9, bVar5);
            case 11:
                a3 a3Var = (a3) obj4;
                jof.d dVar3 = (jof.d) obj3;
                wi0.b countryCode = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                int i21 = jof.c.f176949a[((jof.g) obj5).ordinal()];
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ufm.c cVar2 = new ufm.c(new fag.g(dVar3, a3Var, 18), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                    return cVar2;
                }
                if (k71.k.M0(a3Var)) {
                    ufm.b bVarM = d0.m(dVar3.a(a3Var, f0.f322471a, countryCode));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                d0 d0VarFirstOrError = m70.a.g(dVar3.f176952a.o(), null, null, 3).firstOrError();
                jof.a aVar3 = new jof.a(2, new o(dVar3, 10, a3Var, countryCode));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, aVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 12:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return ael.q.c((ael.q) ((r10.v) obj5).f250863b, (ArrayList) obj4, (List) pair.f186385a, (List) pair.f186386b, (xi0.b) obj3);
            case 13:
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                b21.a aVar4 = ((jpk.d) obj5).f177314c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n            SELECT `chart`.`from`, `chart`.`to`, `chart`.startClose, `chart`.endClose,\n            `points`.timestampStart, `points`.timestampEnd, `points`.open, `points`.close, `points`.high, `points`.low\n            FROM `candles_cryptocommodities_chart` as chart\n            INNER JOIN `candles_cryptocommodities_point` as points\n            ON `chart`.graph_id = `points`.graph_id\n            WHERE `chart`.symbol = ? AND `chart`.duration = ?\n        ");
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str4);
                    }
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str5);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new jpk.e(b21.a.i(sQLiteStatementPrepare.isNull(0) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(0))), b21.a.i(sQLiteStatementPrepare.isNull(1) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(1))), b21.a.g(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2)), b21.a.g(sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3)), b21.a.i(sQLiteStatementPrepare.isNull(4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(4))), b21.a.i(sQLiteStatementPrepare.isNull(5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(5))), b21.a.g(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6)), b21.a.g(sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7)), b21.a.g(sQLiteStatementPrepare.isNull(8) ? null : sQLiteStatementPrepare.getText(8)), b21.a.g(sQLiteStatementPrepare.isNull(9) ? null : sQLiteStatementPrepare.getText(9))));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 14:
                return jpk.d.e((jpk.d) obj5, (jpk.a) obj4, (ArrayList) obj3);
            case 15:
                xi0.b bVar6 = (xi0.b) obj3;
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                d0 d0VarB = ((jsd.a) obj5).f178169a.B((List) obj4, bVar6, exchangeRates, false);
                jof.a aVar5 = new jof.a(21, new i5f.g(i2, bVar6));
                d0VarB.getClass();
                ufm.i iVar2 = new ufm.i(d0VarB, aVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 16:
                nel.n nVar = (nel.n) obj4;
                o4l.a aVar6 = (o4l.a) obj3;
                InstrumentTicker ticker = (InstrumentTicker) obj2;
                Intrinsics.checkNotNullParameter(ticker, "ticker");
                if (ticker.f105119n < ((nel.u) obj5).f214625b.toEpochMilli()) {
                    String str6 = nVar.d;
                    String str7 = nVar.e;
                    Instant instant = aVar6.f222296b.toInstant();
                    Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
                    Instant instantPlus = aVar6.f222296b.toInstant().plus((TemporalAmount) jtk.o.f);
                    Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                    eVar = new jtk.e(str6, str7, instant, instantPlus);
                }
                return u1.a(eVar);
            case 17:
                return jvc.i.a((jvc.i) obj2, false, null, ((ha3.x) ((com.revolut.feature.security_hub.impl.ui.security_hub.c) obj5).f85644q).H((List) obj4, (ArrayList) obj3, null), null, null, null, false, null, null, false, null, 65527);
            case 18:
                vim.e selectedDatesRange = (vim.e) obj5;
                LocalDate presentedMonth = (LocalDate) obj4;
                jvj.c update = (jvj.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                boolean z = !((jvj.c) obj3).f178890c;
                update.getClass();
                Intrinsics.checkNotNullParameter(selectedDatesRange, "selectedDatesRange");
                Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
                return new jvj.c(selectedDatesRange, presentedMonth, z);
            case 19:
                RevPointsEarningRateAggregate revPointsEarningRateAggregate = (RevPointsEarningRateAggregate) obj4;
                do3.n nVar2 = (do3.n) obj3;
                RevPointsEarningRate earningRate = (RevPointsEarningRate) obj2;
                Intrinsics.checkNotNullParameter(earningRate, "earningRate");
                fub.d dVar4 = ((jzb.r) obj5).f179718a;
                f1 product = earningRate.f83975a;
                revPointsEarningRateAggregate.getClass();
                Intrinsics.checkNotNullParameter(product, "product");
                Map map = revPointsEarningRateAggregate.d;
                if (map == null || (revPointsEarningRateCardAction = (RevPointsEarningRateCardAction) map.get(product)) == null) {
                    revPointsEarningRateCardAction = RevPointsEarningRateCardAction.NoAction.f83979a;
                }
                RevPointsEarningRateCardAction revPointsEarningRateCardAction2 = revPointsEarningRateCardAction;
                f1 f1Var = earningRate.f83975a;
                f1 f1Var2 = f1.REVOLUT_CARD;
                return ((pyb.e) dVar4).a(earningRate, revPointsEarningRateCardAction2, nVar2, (f1Var == f1Var2 && revPointsEarningRateAggregate.f83473a.f83972a) || f1Var != f1Var2, true);
            case 20:
                k1c.g gVar2 = (k1c.g) obj5;
                RevPointsRimWidgetContext revPointsRimWidgetContext = (RevPointsRimWidgetContext) obj4;
                String id10 = (String) obj3;
                m0 challengesBreakdown = (m0) obj2;
                Intrinsics.checkNotNullParameter(challengesBreakdown, "challengesBreakdown");
                ArrayList challenges = zhm.d0.E0(challengesBreakdown.f201410c, challengesBreakdown.f201408a);
                if (revPointsRimWidgetContext instanceof RevPointsRimWidgetContext.CreditCardTab) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : challenges) {
                        if (((m1c.l0) obj7).f201396s.contains(j0.CREDIT_CARD)) {
                            arrayList2.add(obj7);
                        }
                    }
                    challenges = arrayList2;
                } else if (!(revPointsRimWidgetContext instanceof RevPointsRimWidgetContext.HomeTab) && !(revPointsRimWidgetContext instanceof RevPointsRimWidgetContext.LifestyleTab)) {
                    throw new NoWhenBranchMatchedException();
                }
                k1c.f fVar = gVar2.f180213b;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(challenges, "challenges");
                BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel = new BaseDynamicWidgetDelegate.BigHeaderModel(id10, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenge_v3_widget_title, null, null, 14), null, false, null, 56);
                if (challenges.isEmpty()) {
                    return RowsWidgetDelegate.Model.Companion.d(RowsWidgetDelegate.Model.INSTANCE, id10, bigHeaderModel, zhm.u.c(new RowDelegate.Model("EMPTY_STATE_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_trophy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenge_v3_widget_empty, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856)), null, null, null, null, SyslogConstants.LOG_CLOCK);
                }
                RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
                n3 n3Var = new n3(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenge_v3_widget_see_all, null, null, 14), null);
                List listV0 = zhm.d0.V0(challenges, 3);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(listV0, 10));
                Iterator it10 = listV0.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(fVar.f180211a.a((m1c.l0) it10.next()));
                }
                return RowsWidgetDelegate.Model.Companion.d(companion, id10, bigHeaderModel, arrayList3, n3Var, null, null, null, 112);
            case 21:
                k25.u uVar = (k25.u) obj5;
                ft3.g product2 = (ft3.g) obj4;
                wp3.e entryPoint = (wp3.e) obj3;
                od0.h hVar = od0.i.Companion;
                q25.a header = (q25.a) ((od0.i) obj2).f224257a;
                if (header != null) {
                    m25.l lVar3 = uVar.f180350c;
                    Intrinsics.checkNotNullParameter(product2, "product");
                    Intrinsics.checkNotNullParameter(entryPoint, "entryPoints");
                    Intrinsics.checkNotNullParameter(header, "header");
                    m25.q qVar = lVar3.f201708b;
                    Intrinsics.checkNotNullParameter(product2, "product");
                    Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                    Intrinsics.checkNotNullParameter(header, "header");
                    ProductAccountId productAccountIdC = com.revolut.feature.credit.models.a.c(product2);
                    AccountListItemModel accountListItemModel = new AccountListItemModel(qVar.f201715c.a(entryPoint.f), (Clause) new TextClause(entryPoint.f299019a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(entryPoint.f299020b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION);
                    ProductAccountValue.Text text = new ProductAccountValue.Text(6, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_discover_v2_credit_card_header_title, zhm.u.c(header.f241539a), null, 12), (TextLocalisedClause) null);
                    AccountWidgetItemModel accountWidgetItemModelA = qVar.a(header);
                    it3.k kVar = product2.f137827b;
                    int i22 = kVar == null ? -1 : m25.p.f201712a[kVar.ordinal()];
                    discover2 = new ProductAccount.ValueItem.Discover(productAccountIdC, text, accountListItemModel, accountWidgetItemModelA, new ProductAccountMetadata(null, true), i22 != 1 ? i22 != 2 ? ufe.b.CREDIT_CARD : ufe.b.CC_BUILDER : ufe.b.CC_SECURED, 32);
                }
                hVar.getClass();
                return od0.h.a(discover2);
            case 22:
                k25.u uVar2 = (k25.u) obj5;
                ft3.g product3 = (ft3.g) obj4;
                al4.i iVar3 = (al4.i) obj3;
                od0.h hVar2 = od0.i.Companion;
                q25.a header2 = (q25.a) ((od0.i) obj2).f224257a;
                if (header2 != null) {
                    m25.l lVar4 = uVar2.f180350c;
                    cl4.a details = ((al4.g) iVar3).f6142a;
                    Intrinsics.checkNotNullParameter(product3, "product");
                    Intrinsics.checkNotNullParameter(details, "details");
                    Intrinsics.checkNotNullParameter(header2, "header");
                    m25.q qVar2 = lVar4.f201708b;
                    Intrinsics.checkNotNullParameter(product3, "product");
                    Intrinsics.checkNotNullParameter(details, "details");
                    Intrinsics.checkNotNullParameter(header2, "header");
                    ProductAccountId productAccountIdC2 = com.revolut.feature.credit.models.a.c(product3);
                    LayeredImage layeredImageA = g25.j.a(qVar2.f201714b, product3.f137828c);
                    it3.k kVar2 = product3.f137827b;
                    int i32 = kVar2 == null ? -1 : m25.p.f201712a[kVar2.ordinal()];
                    TextLocalisedClause textLocalisedClause3 = i32 != 1 ? i32 != 2 ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_discover_credit_card_switcher_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_discover_credit_builder_card_switcher_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_discover_secured_credit_card_switcher_title, null, null, 14);
                    int i33 = kVar2 == null ? -1 : m25.p.f201712a[kVar2.ordinal()];
                    AccountListItemModel accountListItemModel2 = new AccountListItemModel((Image) layeredImageA, (Clause) textLocalisedClause3, (Clause) (i33 != 1 ? i33 != 2 ? qVar2.f201713a.a(details, ll4.k.DISCOVER) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_discover_credit_builder_card_switcher_subtitle, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_discover_secured_credit_card_switcher_subtitle, null, null, 14)), (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION);
                    ProductAccountValue.Text text2 = new ProductAccountValue.Text(6, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_discover_v2_credit_card_header_title, zhm.u.c(header2.f241539a), null, 12), (TextLocalisedClause) null);
                    AccountWidgetItemModel accountWidgetItemModelA2 = qVar2.a(header2);
                    int i43 = kVar2 == null ? -1 : m25.p.f201712a[kVar2.ordinal()];
                    discover = new ProductAccount.ValueItem.Discover(productAccountIdC2, text2, accountListItemModel2, accountWidgetItemModelA2, new ProductAccountMetadata(null, true), i43 != 1 ? i43 != 2 ? ufe.b.CREDIT_CARD : ufe.b.CC_BUILDER : ufe.b.CC_SECURED, 32);
                }
                hVar2.getClass();
                return od0.h.a(discover);
            case 23:
                FundingSource fundingSource = (FundingSource) obj5;
                return RemittanceTransferData.a((RemittanceTransferData) obj2, 0L, null, fundingSource.f92241b, fundingSource, (AccountId) obj3, null, null, null, null, null, t0.y2((t0) obj4, fundingSource), 4067);
            case 24:
                js7.c cVar3 = (js7.c) obj5;
                StatusViewConfiguration.LoadingIndefinite loadingIndefinite = (StatusViewConfiguration.LoadingIndefinite) obj4;
                k3l.b bVar7 = (k3l.b) obj3;
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                Object content = data2.getContent();
                Throwable error = data2.getError();
                if (content != null) {
                    kVarG = o70.a.h((efm.k) cVar3.invoke(content));
                } else if (error != null) {
                    kVarG = te0.w.g(null);
                } else if (data2.getLoading()) {
                    kVarG = efm.k.g(StatusViewConfiguration.LoadingIndefinite.c(loadingIndefinite, 255));
                    Intrinsics.checkNotNullExpressionValue(kVarG, "just(...)");
                } else {
                    kVarG = rfm.h.f253943a;
                }
                int i59 = 1;
                return new rfm.s(new rfm.x(new rfm.f(kVarG, new k3k.l(new k3k.k(bVar7, i59), 4), i59))).D(data2);
            case 25:
                k8k.a update2 = (k8k.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                y7k.w wVar = (y7k.w) ((y7k.x) obj5);
                dj0.d dVar5 = wVar.f311582a;
                String str8 = wVar.f311583b;
                String link = ((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b) obj4).f102227p.a(dVar5, ((PaymentLinkQrScreenContract$InputData) obj3).f102223a, str8);
                update2.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                return new k8k.a(dVar5, link, str8);
            case 26:
                r39.a aVar7 = (r39.a) obj5;
                CountryOfResidenceRevolutXDisclaimerScreen countryOfResidenceRevolutXDisclaimerScreen = (CountryOfResidenceRevolutXDisclaimerScreen) obj4;
                ot1.p pVar = (ot1.p) obj3;
                k99.f screenResult = (k99.f) obj2;
                Intrinsics.checkNotNullParameter(screenResult, "screenResult");
                if (screenResult instanceof k99.d) {
                    aVar7.getClass();
                    countryOfResidenceRevolutXDisclaimerScreen.m2().onBackPressed();
                } else {
                    if (!(screenResult instanceof k99.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar.invoke();
                }
                return Unit.f186387a;
            case 27:
                com.revolut.feature.pix.impl.flow.qr_code_transaction.a aVar8 = (com.revolut.feature.pix.impl.flow.qr_code_transaction.a) obj5;
                MainScreenFeatureConfig.WithInnerConfiguration withInnerConfiguration = aVar8.f80697q;
                yki.l lVar5 = (yki.l) obj4;
                PixQrCodeTransactionFlowContract$Step pixQrCodeTransactionFlowContract$Step = (PixQrCodeTransactionFlowContract$Step) obj3;
                wba.r result3 = (wba.r) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean z3 = result3 instanceof wba.k;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z3) {
                    oki.h.w2(lVar5, PixQrCodeTransactionFlowContract$Step.AdditionalInformationRequested.f80687a, bottom_dialog);
                } else if (result3 instanceof wba.n) {
                    oki.h.w2(lVar5, PixQrCodeTransactionFlowContract$Step.PixChangeAmountRequested.f80692a, ModalDestination.Style.POPUP.f98311a);
                } else if (result3 instanceof wba.m) {
                    oki.h.w2(lVar5, PixQrCodeTransactionFlowContract$Step.InterestAndFeeRequested.f80691a, bottom_dialog);
                } else if (result3 instanceof wba.l) {
                    oki.h.w2(lVar5, PixQrCodeTransactionFlowContract$Step.AddressRequested.f80688a, bottom_dialog);
                } else if (result3 instanceof wba.q) {
                    aVar8.C1(zh9.u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(withInnerConfiguration), gc0.c.f(new TransactionsFeatureConfig.Details(new k71.c(((wba.q) result3).f296088a), null, null, null, 126)))));
                } else if (result3 instanceof wba.p) {
                    aVar8.C1(zh9.u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(withInnerConfiguration), zh9.u0.f(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3)))));
                } else if (result3 instanceof wba.j) {
                    aVar8.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, ((PixQrCodeTransactionFlowContract$Step.Review) pixQrCodeTransactionFlowContract$Step).f80694b.f115083b, null, null, null, 30)));
                } else {
                    if (!(result3 instanceof wba.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 j2Var = aVar8.f80696p;
                    do {
                        value = j2Var.getValue();
                    } while (!j2Var.h(value, ((wba.o) result3).f296086a));
                }
                return Unit.f186387a;
            case 28:
                String searchQuery = (String) obj4;
                RecurringPaymentFilter recurringPaymentFilter = (RecurringPaymentFilter) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                b9e.c recurringPayments = (b9e.c) pair2.f186385a;
                UpcomingPaymentsPocketInfo upcomingPaymentsPocketInfo = (UpcomingPaymentsPocketInfo) pair2.f186386b;
                dhf.b bVar8 = ((kgf.e) obj5).f183984c;
                boolean z4 = searchQuery.length() == 0 && recurringPaymentFilter == null;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                b9e.e eVar3 = recurringPayments.f13735b;
                ard.t tVar = new ard.t(bVar8, upcomingPaymentsPocketInfo, searchQuery, z4, 3);
                return b9e.c.a(recurringPayments, new b9e.e(eVar3.f13737a, (List) tVar.invoke(eVar3.f13738b), (List) tVar.invoke(eVar3.f13739c), (List) tVar.invoke(eVar3.d), (List) tVar.invoke(eVar3.e), (List) tVar.invoke(eVar3.f), (List) tVar.invoke(eVar3.f13740g), (List) tVar.invoke(eVar3.f13741h), (List) tVar.invoke(eVar3.i), (List) tVar.invoke(eVar3.f13742j), (List) tVar.invoke(eVar3.k), (List) tVar.invoke(eVar3.f13743l), (List) tVar.invoke(eVar3.f13744m), (List) tVar.invoke(eVar3.f13745n), (List) tVar.invoke(eVar3.o)));
            default:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar9 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b) obj5;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = (CreditToRefinanceSelectionScreen) obj4;
                yki.l lVar6 = (yki.l) obj3;
                mh4.o outputData3 = (mh4.o) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof mh4.l) {
                    bVar9.n2(new com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.a(outputData3, bVar9, creditToRefinanceSelectionScreen, lVar6, null), new whi.b(i2));
                } else if (outputData3 instanceof mh4.n) {
                    try {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        throw new IllegalStateException("Skip outputData is not supported by RefinancingOffer plugin");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th11) {
                        m.Companion companion3 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th11));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                } else {
                    if (!(outputData3 instanceof mh4.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditApplicationKompotFeatureConfig.RefinancingOffer.Config config = bVar9.f68292p.f68285b;
                    if (config instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup) {
                        bVar9.n2(new kh4.j(bVar9, eVar, i3), new whi.b(i2));
                    } else {
                        if (!(config instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.FinalOffer)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(bVar9, lVar6, RefinancingOfferFlowContract$Step.FinalOffer.f68287a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                    }
                }
                return Unit.f186387a;
        }
    }
}
