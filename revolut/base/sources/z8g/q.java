package z8g;

import a9g.v1;
import a9g.w1;
import android.os.Parcelable;
import androidx.sqlite.SQLiteConnection;
import aw0.o9;
import baf.j;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.ec;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.MultiSelectionItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.ChangePlayStoreCountryContract$OutputData;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.TransferInFlowContract$State;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.TransferInFlowContract$Step;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.TransferOutFlowContract$State;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.TransferOutFlowContract$Step;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_pdf_view.Source;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerCustomization;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import eaf.i;
import grl.k9;
import ip0.iq;
import ip0.q7;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import yc0.d;
import z8k.d0;
import z8k.y;
import zbj.t0;
import zc0.s3;
import zc0.x;
import zc0.y2;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f320122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f320123c;

    public /* synthetic */ q(Object obj2, Object obj3, int i) {
        this.f320121a = i;
        this.f320122b = obj2;
        this.f320123c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r11v3, types: [z8h.g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted$MarginBorrowingLimit$AccountMarginBorrowingLimit] */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted$MarginBorrowingLimit] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Set] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        dj0.d dVar;
        FlowStep assetSelection;
        Image image;
        Image imageA;
        String str;
        ProductSelectionDelegate.a dcVar;
        HtmlClause htmlClauseO;
        Data paymentSummary;
        q6c.o oVarA;
        int i = this.f320121a;
        SelectableDelegate.b aVar = SelectableDelegate.b.C0424b.f53319a;
        final int i2 = 1;
        ?? accountMarginBorrowingLimit = 0;
        HtmlClause htmlClauseO2 = null;
        HtmlClause htmlClauseO3 = null;
        HtmlClause htmlClauseO4 = null;
        HtmlClause htmlClauseO5 = null;
        HtmlClause htmlClauseO6 = null;
        PeerToPeerCustomization personalisation = null;
        accountMarginBorrowingLimit = 0;
        Object obj3 = this.f320123c;
        Object obj4 = this.f320122b;
        switch (i) {
            case 0:
                ((r) obj4).f320125b.insert((SQLiteConnection) obj2, (v1) obj3);
                return null;
            case 1:
                ((s) obj4).f320127b.insert((SQLiteConnection) obj2, (w1) obj3);
                return Unit.f186387a;
            case 2:
                ?? r112 = (z8h.g) obj4;
                xi0.b bVar = (xi0.b) obj3;
                Pair pair = (Pair) obj2;
                od0.i iVar = (od0.i) pair.f186385a;
                List list = (List) pair.f186386b;
                WealthMarginStatus wealthMarginStatus = (WealthMarginStatus) iVar.f224257a;
                dj0.d dVar2 = wealthMarginStatus != null ? wealthMarginStatus.f95673a : null;
                if (wealthMarginStatus != null && (dVar = wealthMarginStatus.f95674b) != null) {
                    accountMarginBorrowingLimit = new CombinedBuyingPowerConverted.MarginBorrowingLimit.AccountMarginBorrowingLimit(dVar, wealthMarginStatus.d);
                }
                return r112.c(list, dVar2, accountMarginBorrowingLimit, bVar, null);
            case 3:
                udh.e eVar = (udh.e) obj4;
                xi0.b bVar2 = (xi0.b) obj3;
                od0.i iVar2 = (od0.i) obj2;
                if (((dj0.d) iVar2.f224257a) == null) {
                    hx7.e.n(new IllegalStateException(a0.d.s("Failed to convert instrument borrowing limit from ", eVar.f279205a.f115083b.f306286a, " to ", bVar2.f306286a)));
                }
                dj0.d dVar3 = (dj0.d) iVar2.f224257a;
                CombinedBuyingPowerConverted.MarginBorrowingLimit.InstrumentMarginBorrowingLimit instrumentMarginBorrowingLimit = dVar3 != null ? new CombinedBuyingPowerConverted.MarginBorrowingLimit.InstrumentMarginBorrowingLimit(dVar3, eVar.f279207c) : null;
                od0.i.Companion.getClass();
                return od0.h.a(instrumentMarginBorrowingLimit);
            case 4:
                PeerToPeerTransferData peerToPeerTransferData = (PeerToPeerTransferData) obj4;
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar3 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) obj3;
                g2a.f outputData = (g2a.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof g2a.d) {
                    personalisation = new PeerToPeerCustomization.Gif(((g2a.d) outputData).f139955a);
                } else if (outputData instanceof g2a.e) {
                    personalisation = new PeerToPeerCustomization.Personalisation(((g2a.e) outputData).f139956a);
                } else if (!(outputData instanceof g2a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3.v2(new y(PeerToPeerTransferData.a(peerToPeerTransferData, 0L, null, null, null, null, null, personalisation, null, null, null, null, 261631), bVar3.F2().f320165a));
                return Unit.f186387a;
            case 5:
                z8k.t updateState = (z8k.t) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return z8k.t.a(updateState, (PeerToPeerTransferData) ((Function1) obj4).invoke(((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) obj3).G2()), null, 0, null, false, false, 16375);
            case 6:
                ReferenceData referenceData = (ReferenceData) obj3;
                return z8k.t.a((z8k.t) obj2, (PeerToPeerTransferData) obj4, null, 0, new d0(referenceData, referenceData.f92120a), false, false, 16311);
            case 7:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a aVar2 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a) obj4;
                TransferInFlowContract$Step.BrokerSelection brokerSelection = (TransferInFlowContract$Step.BrokerSelection) obj3;
                final eaf.j output = (eaf.j) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof eaf.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                final int i3 = 0;
                aVar2.H2(aVar2.o, new Function1() { // from class: z9f.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i3) {
                            case 0:
                                TransferInFlowContract$State update = (TransferInFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return TransferInFlowContract$State.a(update, ((i) output).f124237a, null, null, 6);
                            default:
                                TransferOutFlowContract$State update2 = (TransferOutFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return TransferOutFlowContract$State.a(update2, ((i) output).f124237a, null, null, 6);
                        }
                    }
                });
                oki.h.t2(aVar2, aVar2.f91588p, new TransferInFlowContract$Step.AccountInformation(((eaf.i) output).f124237a, brokerSelection.f91581a), true, null, false, 12);
                return Unit.f186387a;
            case 8:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a aVar3 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a) obj4;
                qki.d dVar4 = aVar3.o;
                TransferInFlowContract$Step.AssetSelection assetSelection2 = (TransferInFlowContract$Step.AssetSelection) obj3;
                iaf.l output2 = (iaf.l) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.H2(dVar4, new z2.a(output2, 27));
                TransferUserAccountInformation transferUserAccountInformation = ((TransferInFlowContract$State) ((j2) dVar4.f22677a).getValue()).f91575b;
                if (transferUserAccountInformation != null) {
                    oki.h.t2(aVar3, aVar3.f91588p, new TransferInFlowContract$Step.ReviewSubmit(assetSelection2.f91579a, transferUserAccountInformation, output2.f160006a, assetSelection2.f91580b), true, null, false, 12);
                } else {
                    r6.b.D("AssetSelection step is completed but no user account information in state!");
                }
                return Unit.f186387a;
            case 9:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a aVar4 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a) obj4;
                TransferInFlowContract$Step.AccountInformation accountInformation = (TransferInFlowContract$Step.AccountInformation) obj3;
                final baf.k output3 = (baf.k) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (!(output3 instanceof baf.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                final int i5 = 0;
                aVar4.H2(aVar4.o, new Function1() { // from class: z9f.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i5) {
                            case 0:
                                TransferInFlowContract$State update = (TransferInFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return TransferInFlowContract$State.a(update, null, ((j) output3).f14057a, null, 5);
                            default:
                                TransferOutFlowContract$State update2 = (TransferOutFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return TransferOutFlowContract$State.a(update2, null, ((j) output3).f14057a, null, 5);
                        }
                    }
                });
                TransferUserAccountInformation transferUserAccountInformation2 = ((baf.j) output3).f14057a;
                if ((transferUserAccountInformation2 instanceof TransferUserAccountInformation.AcatTransferUserAccountInformation) || (transferUserAccountInformation2 instanceof TransferUserAccountInformation.DtcTransferUserAccountInformation)) {
                    TransferBroker transferBroker = accountInformation.f91577a;
                    String string = accountInformation.f91578b.getF105262a().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    assetSelection = new TransferInFlowContract$Step.AssetSelection(transferBroker, string);
                } else {
                    if (!(transferUserAccountInformation2 instanceof TransferUserAccountInformation.TaaTransferUserAccountInformation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    assetSelection = new TransferInFlowContract$Step.IsaReviewSubmit(accountInformation.f91577a, (TransferUserAccountInformation.TaaTransferUserAccountInformation) transferUserAccountInformation2, accountInformation.f91578b);
                }
                oki.h.t2(aVar4, aVar4.f91588p, assetSelection, true, null, false, 12);
                return Unit.f186387a;
            case 10:
                com.revolut.feature.credit.application.plugins.impl.ui.esign.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.esign.a) obj4;
                yki.l lVar = (yki.l) obj3;
                ab4.n outputData2 = (ab4.n) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if ((outputData2 instanceof ab4.k) || (outputData2 instanceof ab4.i)) {
                    c84.t.J2(aVar5, false, null, null, 7);
                    Unit unit = Unit.f186387a;
                } else {
                    int i6 = 26;
                    if (outputData2 instanceof ab4.j) {
                        aVar5.l2(new za4.c(aVar5, accountMarginBorrowingLimit, 0), new yi5.b(i6));
                    } else if (outputData2 instanceof ab4.m) {
                        aVar5.l2(new yv1.k(aVar5, outputData2, accountMarginBorrowingLimit, 27), new yi5.b(i6));
                    } else {
                        if (!(outputData2 instanceof ab4.l)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wu3.g gVar = ((ab4.l) outputData2).f2877a;
                        wu3.f fVar = gVar.f300059c;
                        if (fVar instanceof wu3.d) {
                            Source.Remote remote = new Source.Remote(((wu3.d) fVar).f300055a);
                            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_e_signature_document_pdf_title, zhm.u.c(gVar.f300057a), null, 12);
                            k9 k9Var = k9.Credit;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            aVar5.C1(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(remote, textLocalisedClause, true, false, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), true, SyslogConstants.LOG_LOCAL7))));
                        } else {
                            if (!(fVar instanceof wu3.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.w2(lVar, new ESignatureFlowContract$Step.Prompt(((wu3.e) fVar).f300056a), ModalDestination.Style.POPUP.f98311a);
                            Unit unit2 = Unit.f186387a;
                        }
                    }
                }
                return Unit.f186387a;
            case 11:
                IndiaAppRedirectionFlowContract$Step indiaAppRedirectionFlowContract$Step = (IndiaAppRedirectionFlowContract$Step) obj4;
                com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a aVar6 = (com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) obj3;
                ChangePlayStoreCountryContract$OutputData it8 = (ChangePlayStoreCountryContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, ChangePlayStoreCountryContract$OutputData.Close.f78445a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!((IndiaAppRedirectionFlowContract$Step.ChangeCountry) indiaAppRedirectionFlowContract$Step).f78441a) {
                    aVar6.B2();
                }
                return Unit.f186387a;
            case 12:
                ?? r113 = (kotlin.jvm.internal.q) obj4;
                zab.t tVar = (zab.t) obj3;
                iu2.b bVar4 = (iu2.b) ((od0.i) obj2).f224257a;
                r113.invoke(bVar4 != null ? bVar4.f168458a : null);
                zab.i iVar3 = (zab.i) tVar.L();
                if (iVar3 != null) {
                    SignSmsStepFragment signSmsStepFragment = (SignSmsStepFragment) iVar3;
                    if (signSmsStepFragment.I().getVisibility() == 0) {
                        kli.c.d(signSmsStepFragment.L(), 500L);
                    }
                }
                return Unit.f186387a;
            case 13:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a aVar7 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a) obj4;
                TransferOutFlowContract$Step.BrokerSelection brokerSelection2 = (TransferOutFlowContract$Step.BrokerSelection) obj3;
                final eaf.j output4 = (eaf.j) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (!(output4 instanceof eaf.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar7.H2(aVar7.o, new Function1() { // from class: z9f.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i2) {
                            case 0:
                                TransferInFlowContract$State update = (TransferInFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return TransferInFlowContract$State.a(update, ((i) output4).f124237a, null, null, 6);
                            default:
                                TransferOutFlowContract$State update2 = (TransferOutFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return TransferOutFlowContract$State.a(update2, ((i) output4).f124237a, null, null, 6);
                        }
                    }
                });
                oki.h.t2(aVar7, aVar7.f91636p, new TransferOutFlowContract$Step.AccountInformation(((eaf.i) output4).f124237a, brokerSelection2.f91631a), true, null, false, 12);
                return Unit.f186387a;
            case 14:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a aVar8 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a) obj4;
                TransferOutFlowContract$Step.AssetSelection assetSelection3 = (TransferOutFlowContract$Step.AssetSelection) obj3;
                abf.k output5 = (abf.k) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                if (!(output5 instanceof abf.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList = ((abf.j) output5).f2954a;
                qki.d dVar5 = aVar8.o;
                aVar8.H2(dVar5, new ua2.r(19, arrayList));
                j2 j2Var = (j2) dVar5.f22677a;
                TransferBroker transferBroker2 = ((TransferOutFlowContract$State) j2Var.getValue()).f91625a;
                TransferUserAccountInformation transferUserAccountInformation3 = ((TransferOutFlowContract$State) j2Var.getValue()).f91626b;
                if (transferBroker2 == null || transferUserAccountInformation3 == null) {
                    r6.b.D("Asset selection completed without broker or account information");
                } else {
                    oki.h.t2(aVar8, aVar8.f91636p, new TransferOutFlowContract$Step.Review(transferBroker2, transferUserAccountInformation3, arrayList, assetSelection3.f91630a), true, null, false, 12);
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a aVar9 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a) obj4;
                Intrinsics.checkNotNullParameter((aii.q) obj2, "it");
                oki.h.t2(aVar9, aVar9.f91636p, new TransferOutFlowContract$Step.BrokerSelection((TradingAccount) obj3), true, null, false, 12);
                return Unit.f186387a;
            case 16:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a aVar10 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a) obj4;
                TransferOutFlowContract$Step.AccountInformation accountInformation2 = (TransferOutFlowContract$Step.AccountInformation) obj3;
                final baf.k output6 = (baf.k) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                if (!(output6 instanceof baf.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar10.H2(aVar10.o, new Function1() { // from class: z9f.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i2) {
                            case 0:
                                TransferInFlowContract$State update = (TransferInFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return TransferInFlowContract$State.a(update, null, ((j) output6).f14057a, null, 5);
                            default:
                                TransferOutFlowContract$State update2 = (TransferOutFlowContract$State) obj5;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return TransferOutFlowContract$State.a(update2, null, ((j) output6).f14057a, null, 5);
                        }
                    }
                });
                oki.h.t2(aVar10, aVar10.f91636p, new TransferOutFlowContract$Step.AssetSelection(accountInformation2.f91629b), true, null, false, 12);
                return Unit.f186387a;
            case 17:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a aVar11 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) obj4;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking.DialogScenario dialogScenario = ((TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking) ((TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep) obj3)).f93800a;
                aVar11.getClass();
                if (Intrinsics.f(result, dii.e.f115068a)) {
                    aVar11.J2(dialogScenario.d);
                } else if (Intrinsics.f(result, dii.f.f115069a)) {
                    aVar11.J2(dialogScenario.e);
                }
                return Unit.f186387a;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                bc6.a aVar12 = ((zb6.n) obj4).f320815a;
                nqi.c cVar = (nqi.c) ((zb6.h) obj3).d.getContent();
                if (cVar == null) {
                    nqi.c.Companion.getClass();
                    cVar = nqi.c.f218470c;
                }
                return new zb6.m(false, null, zhm.u.c(aVar12.a(cVar)));
            case 19:
                com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar13 = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) obj4;
                String str2 = (String) obj3;
                zb6.h update = (zb6.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                xi0.b bVar5 = (xi0.b) update.f320806b.getContent();
                return zb6.h.a(update, null, null, null, bVar5 != null ? zi0.c.P(new nqi.c(new dj0.d(aVar13.f72088p.b(str2, bVar5.f306286a), bVar5), str2), false, null, 3) : update.d, null, null, LDSFile.EF_SOD_TAG);
            case 20:
                zba.f update2 = (zba.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                w80.b bVar6 = ((zba.i) obj4).o;
                xi0.b.Companion.getClass();
                xi0.b bVar7 = xi0.b.D;
                return zba.f.a(update2, new dj0.d(bVar6.b((String) obj3, bVar7.f306286a), bVar7), null, null, 6);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((t0) obj4).f320940a.e(((zbj.q) obj3).f320926b, false);
            case 22:
                MultiSelectionItem selectionItem = (MultiSelectionItem) obj3;
                SelectionItem.Option option = (SelectionItem.Option) obj2;
                Intrinsics.checkNotNullParameter(option, "option");
                ad0.s sVar = ((zc0.c) obj4).f321025n;
                Intrinsics.checkNotNullParameter(selectionItem, "selectionItem");
                Intrinsics.checkNotNullParameter(option, "option");
                s3 s3Var = new s3(selectionItem, option.getF63622a(), false);
                ?? r72 = selectionItem.f63544g;
                if (!(option instanceof SelectionItem.Option.WithTitle)) {
                    if (option instanceof SelectionItem.Option.WithLabels) {
                        throw new IllegalStateException("MultiSelectionItem does not support selection items with labels");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                SelectionItem.Option.WithTitle withTitle = (SelectionItem.Option.WithTitle) option;
                HtmlStringItem item = withTitle.d;
                String str3 = withTitle.f63622a;
                boolean z = withTitle.f;
                SelectionItem.Option.Image image2 = withTitle.f63623b;
                if (image2 != null) {
                    if (image2 instanceof SelectionItem.Option.Image.Asset) {
                        imageA = new UrlImage(((SelectionItem.Option.Image.Asset) image2).f63617a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    } else {
                        if (!(image2 instanceof SelectionItem.Option.Image.Icon)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        imageA = yc0.e.a(sVar.f3226a, ((SelectionItem.Option.Image.Icon) image2).f63618a, d.a.f312415a, null, 4);
                    }
                    image = imageA;
                } else {
                    image = null;
                }
                if (image == null) {
                    String str4 = withTitle.f63622a;
                    TextClause textClause = new TextClause(withTitle.f63624c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    if (item != null) {
                        Intrinsics.checkNotNullParameter(item, "item");
                        htmlClauseO6 = v04.b.o(item, null);
                    }
                    return new InputChecklistDelegate.Model(str4, textClause, r72.contains(str3), !z, new InputChecklistDelegate.a.b(htmlClauseO6), iq.CHECK_BUTTON, null, null, s3Var, null, 0, 0, 0, 523968);
                }
                String str5 = withTitle.f63622a;
                qd0 qd0Var = r72.contains(str5) ? qd0.SELECTED : qd0.UNSELECTED;
                if (z) {
                    aVar = new SelectableDelegate.b.a(false);
                }
                vd0 vd0Var = vd0.CHECKBOX;
                String strQ = j6.a.q("inner_", str3);
                TextClause textClause2 = new TextClause(withTitle.f63624c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (item != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    htmlClauseO5 = v04.b.o(item, null);
                }
                return new SelectableDelegate.Model(str5, new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 60), textClause2, null, 0, htmlClauseO5, null, null, 0, null, !z, null, false, null, null, null, null, null, null, s3Var, null, 0, 0, 0, 0, 532674520), qd0Var, aVar, vd0Var, false, null, null, null, false, 32736);
            case 23:
                SingleSelectionItem selectionItem2 = (SingleSelectionItem) obj3;
                SelectionItem.Option option2 = (SelectionItem.Option) obj2;
                Intrinsics.checkNotNullParameter(option2, "option");
                ad0.t tVar2 = ((zc0.c) obj4).f321024m;
                Intrinsics.checkNotNullParameter(selectionItem2, "selectionItem");
                Intrinsics.checkNotNullParameter(option2, "option");
                s3 s3Var2 = new s3(selectionItem2, option2.getF63622a(), option2.getE());
                SingleSelectionItem.Style style = selectionItem2.i;
                ?? r87 = selectionItem2.f63640g;
                boolean zF = Intrinsics.f(style, SingleSelectionItem.Style.CellSelection.f63651a);
                RowDelegate.Model.b.c cVar2 = RowDelegate.Model.b.c.f53268a;
                RowDelegate.Model.b.a aVar14 = RowDelegate.Model.b.a.f53266a;
                if (zF) {
                    if (!(option2 instanceof SelectionItem.Option.WithTitle)) {
                        if (option2 instanceof SelectionItem.Option.WithLabels) {
                            throw new IllegalStateException("CellSelection style does not support selection items with labels");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    SelectionItem.Option.WithTitle withTitle2 = (SelectionItem.Option.WithTitle) option2;
                    boolean z3 = withTitle2.f;
                    SelectionItem.Option.Image image3 = withTitle2.f63623b;
                    Image imageA2 = image3 != null ? tVar2.a(image3) : null;
                    boolean zContains = r87.contains(withTitle2.f63622a);
                    String str6 = withTitle2.f63622a;
                    TextClause textClause3 = new TextClause(withTitle2.f63624c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    HtmlStringItem item2 = withTitle2.d;
                    if (item2 != null) {
                        Intrinsics.checkNotNullParameter(item2, "item");
                        htmlClauseO = v04.b.o(item2, null);
                    } else {
                        htmlClauseO = null;
                    }
                    return new RowDelegate.Model(str6, imageA2 != null ? new RowDelegate.Model.MainImage.Image40(imageA2, d8l.d.b(zContains), null, false, null, false, 60) : null, textClause3, null, 0, htmlClauseO, null, null, 0, null, !z3, null, zContains, z3 ? aVar14 : cVar2, null, null, null, null, null, s3Var2, null, 0, 0, 0, 0, 532649944);
                }
                if (!Intrinsics.f(style, SingleSelectionItem.Style.ContinueButton.f63652a)) {
                    if (!Intrinsics.f(style, SingleSelectionItem.Style.RadioButton.f63653a) && !(style instanceof SingleSelectionItem.Style.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (option2 instanceof SelectionItem.Option.WithTitle) {
                        SelectionItem.Option.WithTitle withTitle3 = (SelectionItem.Option.WithTitle) option2;
                        String str7 = withTitle3.f63622a;
                        TextClause textClause4 = new TextClause(withTitle3.f63624c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        HtmlStringItem item3 = withTitle3.d;
                        if (item3 != null) {
                            Intrinsics.checkNotNullParameter(item3, "item");
                            htmlClauseO4 = v04.b.o(item3, null);
                        }
                        return new InputChecklistDelegate.Model(str7, textClause4, r87.contains(withTitle3.f63622a), !withTitle3.f, new InputChecklistDelegate.a.b(htmlClauseO4), iq.RADIO_BUTTON, null, null, s3Var2, null, 0, 0, 0, 523968);
                    }
                    if (!(option2 instanceof SelectionItem.Option.WithLabels)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SelectionItem.Option.WithLabels withLabels = (SelectionItem.Option.WithLabels) option2;
                    String str8 = withLabels.f63619a;
                    qd0 qd0Var2 = r87.contains(str8) ? qd0.SELECTED : qd0.UNSELECTED;
                    if (withLabels.e) {
                        aVar = new SelectableDelegate.b.a(false);
                    }
                    SelectableDelegate.b bVar8 = aVar;
                    vd0 vd0Var2 = vd0.RADIO;
                    String strQ2 = j6.a.q("inner_", withLabels.f63619a);
                    SelectionItem.Option.Image.Asset asset = withLabels.f63620b;
                    UrlImage urlImage = (asset == null || (str = asset.f63617a) == null) ? null : new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    ArrayList<SelectionItem.Label> arrayList2 = withLabels.f63621c;
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    for (SelectionItem.Label label : arrayList2) {
                        arrayList3.add(new q7(new TextClause(label.f63615a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), yc0.e.a(tVar2.f3227a, label.f63616b, null, null, 6)));
                    }
                    return new SelectableDelegate.Model(str8, new CellDetailsListDelegate.Model(strQ2, urlImage, arrayList3, null, null, null, 2040), qd0Var2, bVar8, vd0Var2, false, null, s3Var2, null, false, 32480);
                }
                if (!(option2 instanceof SelectionItem.Option.WithTitle)) {
                    if (option2 instanceof SelectionItem.Option.WithLabels) {
                        throw new IllegalStateException("ContinueButton style does not support selection items with labels");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                SelectionItem.Option.WithTitle withTitle4 = (SelectionItem.Option.WithTitle) option2;
                boolean z4 = withTitle4.f;
                HtmlStringItem item4 = withTitle4.d;
                SelectionItem.Option.Image image4 = withTitle4.f63623b;
                Image imageA3 = image4 != null ? tVar2.a(image4) : null;
                if (imageA3 == null) {
                    String str9 = withTitle4.f63622a;
                    TextClause textClause5 = new TextClause(withTitle4.f63624c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    if (item4 != null) {
                        Intrinsics.checkNotNullParameter(item4, "item");
                        htmlClauseO3 = v04.b.o(item4, null);
                    }
                    return RowDelegate.Model.x(new RowDelegate.Model(str9, null, textClause5, null, 0, htmlClauseO3, null, null, 0, null, !z4, null, false, z4 ? aVar14 : cVar2, null, null, null, null, null, s3Var2, null, 0, 0, 0, 0, 532658138), null, null, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, null, 0, 0, 0, 0, null, -1025, 15);
                }
                String str10 = withTitle4.f63622a;
                TextClause textClause6 = new TextClause(withTitle4.f63624c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (item4 != null) {
                    Intrinsics.checkNotNullParameter(item4, "item");
                    htmlClauseO2 = v04.b.o(item4, null);
                }
                HtmlClause htmlClause = htmlClauseO2;
                boolean z6 = !z4;
                SingleSelectionItem.AssetStyle assetStyle = selectionItem2.k;
                if (Intrinsics.f(assetStyle, SingleSelectionItem.AssetStyle.RoundedSquare.f63645a)) {
                    dcVar = new ec(imageA3);
                } else {
                    if (!Intrinsics.f(assetStyle, SingleSelectionItem.AssetStyle.Square.f63646a) && !(assetStyle instanceof SingleSelectionItem.AssetStyle.Unknown) && assetStyle != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dcVar = new dc(imageA3);
                }
                return new ProductSelectionDelegate.Model(str10, dcVar, textClause6, htmlClause, null, s3Var2, null, false, z6, z6, 208);
            case 24:
                ((BackendScreenFragment) obj4).K0.onNext(new Pair((Date) obj2, ((InputTextDelegate.Model) obj3).f52580a));
                return Unit.f186387a;
            case 25:
                String flowId = (String) obj2;
                Intrinsics.checkNotNullParameter(flowId, "flowId");
                return rd0.e.c(oc0.f.b(((y2) obj4).u, new oc0.b(flowId, ((CardSelectionItem) obj3).f63345a)), kotlin.coroutines.g.f186406a);
            case 26:
                y2 y2Var = (y2) obj4;
                zc0.i iVar4 = (zc0.i) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                BackendScreen backendScreen = (BackendScreen) rVar.f314201a;
                boolean zBooleanValue = ((Boolean) rVar.f314202b).booleanValue();
                String str11 = (String) rVar.f314203c;
                if (uc0.b.t(backendScreen) || uc0.b.q(backendScreen)) {
                    return pfm.m.f235744a;
                }
                ufm.c cVar3 = new ufm.c(new b7c.b(backendScreen, y2Var, zBooleanValue, str11, 7), 2);
                Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
                pfm.a aVar15 = new pfm.a(o70.a.i(cVar3), new x(18, new zc0.w(iVar4, i2)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar15, "flatMapCompletable(...)");
                return o70.a.d(aVar15);
            case 27:
                CardCellItem cardCellItem = (CardCellItem) obj3;
                String flowId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(flowId2, "flowId");
                return rd0.e.c(oc0.f.a(((y2) obj4).u, new oc0.a(flowId2, cardCellItem.f63340b, cardCellItem.f63341c)), kotlin.coroutines.g.f186406a);
            case 28:
                BackendEntityItem backendEntityItem = (BackendEntityItem) obj3;
                BackendFlow flow = (BackendFlow) obj2;
                Intrinsics.checkNotNullParameter(flow, "flow");
                return rd0.e.c(fc0.f.b(((y2) obj4).v, flow.f63264b, backendEntityItem.getId(), flow.f63267h, ebm.a.o(backendEntityItem), backendEntityItem.getF63424b()), kotlin.coroutines.g.f186406a);
            default:
                Data orderDetails = (Data) obj4;
                zdc.i iVar5 = (zdc.i) obj3;
                zdc.g gVar2 = (zdc.g) obj2;
                try {
                    Object content = orderDetails.getContent();
                    if (content != null) {
                        zcc.a aVar16 = iVar5.f321449p;
                        SplitBillPaymentParams splitBillPaymentParams = iVar5.f321450q.f84717b;
                        aVar16.getClass();
                        oVarA = zcc.a.a((q6c.h) content, splitBillPaymentParams);
                    } else {
                        oVarA = null;
                    }
                    paymentSummary = new Data(oVarA, orderDetails.getError(), orderDetails.getLoading());
                    break;
                } catch (Throwable th10) {
                    paymentSummary = new Data(null, th10, orderDetails.getLoading());
                }
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
                Intrinsics.checkNotNullParameter(paymentSummary, "paymentSummary");
                return new zdc.g(orderDetails, paymentSummary);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q(Function1 function1, zab.t tVar) {
        this.f320121a = 12;
        this.f320122b = (kotlin.jvm.internal.q) function1;
        this.f320123c = tVar;
    }
}
