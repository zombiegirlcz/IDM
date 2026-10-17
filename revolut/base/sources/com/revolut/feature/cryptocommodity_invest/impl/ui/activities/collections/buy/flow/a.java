package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow;

import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$Step;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.CryptoCommodityBuyCollectionAmountScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreenContract$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteFeeBreakdown;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import dx5.f;
import hsc.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import qv0.i;
import rd0.e;
import rhf.h;
import rp0.g1;
import rp0.l;
import rp0.t;
import rp0.y;
import tof.q6;
import xi0.b;
import xv4.o;
import xw5.d;
import zh9.u0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends g implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f71534t;
    public final vw5.a u;
    public final g1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f71535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionFlowContract$Step.Amount f71536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionFlowContract$State f71537y;

    public a(CryptoCommodityBuyCollectionFlowContract$InputData inputData, j60.a bottomDialogExtension, vw5.a collectionBuyFlowDialogMapper, g1 shotDialogDisplayer, c cryptoScaPromptShotDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(collectionBuyFlowDialogMapper, "collectionBuyFlowDialogMapper");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        this.f71534t = bottomDialogExtension;
        this.u = collectionBuyFlowDialogMapper;
        this.v = shotDialogDisplayer;
        this.f71535w = cryptoScaPromptShotDialogProvider;
        xi0.a aVar = b.Companion;
        String str = inputData.f71525b;
        aVar.getClass();
        dj0.d dVar = new dj0.d(0L, xi0.a.a(str));
        this.f71536x = new CryptoCommodityBuyCollectionFlowContract$Step.Amount(inputData.f71526c, inputData.f71524a, inputData.f71525b, inputData.d);
        this.f71537y = new CryptoCommodityBuyCollectionFlowContract$State(new CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState(dVar, dVar, dVar, f0.f322471a));
    }

    public final void O2() {
        List feeBreakdowns = ((CryptoCommodityBuyCollectionFlowContract$State) A2().f98429a).f71527a.d;
        this.u.getClass();
        Intrinsics.checkNotNullParameter(feeBreakdowns, "feeBreakdowns");
        List<CollectionQuoteFeeBreakdown> list = feeBreakdowns;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown : list) {
            arrayList.add(new CellDetailsDelegate.Model(j6.a.q("FEE_BREAKDOWN_CELL_", collectionQuoteFeeBreakdown.f95271a), new TextClause(collectionQuoteFeeBreakdown.f95272b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(collectionQuoteFeeBreakdown.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, 0, null, collectionQuoteFeeBreakdown, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        this.f71534t.x(new y(arrayList, new t(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_fees_dialog_title, null, null, 14), null, null, 30), l.WINDOW, null, "FEES_BREAKDOWN_DIALOG_ID", null, 984));
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, java.util.List, rp0.x] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void P2() {
        ?? r3;
        int i;
        i model;
        if (!((CryptoCommodityBuyCollectionFlowContract$State) A2().f98429a).f71527a.f71523c.k() && ((CryptoCommodityBuyCollectionFlowContract$State) A2().f98429a).f71527a.d.isEmpty()) {
            throw new IllegalStateException("Fee is not zero but fee breakdowns are missing");
        }
        dj0.d amount = ((CryptoCommodityBuyCollectionFlowContract$State) A2().f98429a).f71527a.f71521a;
        dj0.d fee2 = ((CryptoCommodityBuyCollectionFlowContract$State) A2().f98429a).f71527a.f71523c;
        dj0.d amountAfterFee = ((CryptoCommodityBuyCollectionFlowContract$State) A2().f98429a).f71527a.f71522b;
        this.u.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(amountAfterFee, "amountAfterFee");
        i[] iVarArr = new i[3];
        iVarArr[0] = new CellDetailsDelegate.Model("BREAKDOWN_DIALOG_AMOUNT_CELL_ID", new TextLocalisedClause(R$string.cryptocommodity_invest_collections_fee_breakdown_dialog_amount_cell_title, null, null, 14), new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        if (fee2.k()) {
            r3 = 0;
            i = 14;
            model = new CellDetailsDelegate.Model("BREAKDOWN_DIALOG_FEE_CELL_ID", new TextLocalisedClause(R$string.cryptocommodity_invest_collections_fee_breakdown_dialog_fee_cell_title, null, null, 14), new TextLocalisedClause(R$string.cryptocommodity_invest_collections_fee_breakdown_dialog_no_fee_cell_title, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
        } else {
            r3 = 0;
            i = 14;
            model = new CellDetailsActionDelegate.Model("BREAKDOWN_DIALOG_FEE_CELL_ID", new TextLocalisedClause(R$string.cryptocommodity_invest_collections_fee_breakdown_dialog_fee_cell_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(fee2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
        }
        iVarArr[1] = model;
        iVarArr[2] = new CellDetailsDelegate.Model("BREAKDOWN_DIALOG_NET_AMOUNT_CELL_ID", new TextLocalisedClause(R$string.cryptocommodity_invest_collections_fee_breakdown_dialog_amount_after_fee_cell_title, r3, r3, i), new MoneyClause(amountAfterFee, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        List listK = v.k(iVarArr);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        this.f71534t.x(new y(listK, new t(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_fee_breakdown_dialog_title, r3, r3, i), r3, r3, 30), l.WINDOW, null, null, null, 1016));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, e.b(this.f71534t.t()), null, new o(this, (Continuation) null, 2), 3);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CryptoCommodityBuyCollectionFlowContract$Step step = (CryptoCommodityBuyCollectionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CryptoCommodityBuyCollectionFlowContract$Step.Amount) {
            CryptoCommodityBuyCollectionFlowContract$Step.Amount amount = (CryptoCommodityBuyCollectionFlowContract$Step.Amount) step;
            String str = amount.f71528a;
            CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2 = new CryptoCommodityBuyCollectionAmountScreenV2(new CryptoCommodityBuyCollectionAmountScreenContract$InputData(amount.f71530c, amount.f71529b, str, amount.d));
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: xw5.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a f309331b;

                {
                    this.f309331b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            f data = (f) obj2;
                            Intrinsics.checkNotNullParameter(data, "data");
                            FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
                            String str2 = data.f120874a;
                            BridgeDestination bridgeDestination = new BridgeDestination(com.revolut.retail.core.navigation.a.c(featureCommand, str2 != null ? new FeatureCommand(new TransactionsFeatureConfig.Details(qk.d.e(4, str2, data.f120875b, null), null, null, null, 126)) : u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, (h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)))));
                            com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar = this.f309331b;
                            aVar.C1(bridgeDestination);
                            aVar.I2();
                            return Unit.f186387a;
                        default:
                            zw5.d it8 = (zw5.d) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean z = it8 instanceof zw5.b;
                            com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar2 = this.f309331b;
                            if (z) {
                                aVar2.E2(new CryptoCommodityBuyCollectionFlowContract$Step.Confirmation(((zw5.b) it8).f325729a), true, null, false);
                            } else {
                                if (!(it8 instanceof zw5.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zw5.c cVar = (zw5.c) it8;
                                aVar2.E2(new CryptoCommodityBuyCollectionFlowContract$Step.CryptoScaPrompt(cVar.f325730a, cVar.f325731b), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            cryptoCommodityBuyCollectionAmountScreenV2.H = function1;
            return cryptoCommodityBuyCollectionAmountScreenV2;
        }
        if (step instanceof CryptoCommodityBuyCollectionFlowContract$Step.Confirmation) {
            CryptoCommodityBuyCollectionConfirmationScreen cryptoCommodityBuyCollectionConfirmationScreen = new CryptoCommodityBuyCollectionConfirmationScreen(new CryptoCommodityBuyCollectionConfirmationScreenContract$InputData(((CryptoCommodityBuyCollectionFlowContract$Step.Confirmation) step).f71531a));
            final int i2 = 0;
            Function1 function12 = new Function1(this) { // from class: xw5.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a f309331b;

                {
                    this.f309331b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            f data = (f) obj2;
                            Intrinsics.checkNotNullParameter(data, "data");
                            FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
                            String str2 = data.f120874a;
                            BridgeDestination bridgeDestination = new BridgeDestination(com.revolut.retail.core.navigation.a.c(featureCommand, str2 != null ? new FeatureCommand(new TransactionsFeatureConfig.Details(qk.d.e(4, str2, data.f120875b, null), null, null, null, 126)) : u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, (h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)))));
                            com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar = this.f309331b;
                            aVar.C1(bridgeDestination);
                            aVar.I2();
                            return Unit.f186387a;
                        default:
                            zw5.d it8 = (zw5.d) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean z = it8 instanceof zw5.b;
                            com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar2 = this.f309331b;
                            if (z) {
                                aVar2.E2(new CryptoCommodityBuyCollectionFlowContract$Step.Confirmation(((zw5.b) it8).f325729a), true, null, false);
                            } else {
                                if (!(it8 instanceof zw5.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zw5.c cVar = (zw5.c) it8;
                                aVar2.E2(new CryptoCommodityBuyCollectionFlowContract$Step.CryptoScaPrompt(cVar.f325730a, cVar.f325731b), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            cryptoCommodityBuyCollectionConfirmationScreen.H = function12;
            return cryptoCommodityBuyCollectionConfirmationScreen;
        }
        if (!(step instanceof CryptoCommodityBuyCollectionFlowContract$Step.CryptoScaPrompt)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE1 = e1(new wrc.a(((CryptoCommodityBuyCollectionFlowContract$Step.CryptoScaPrompt) step).f71532a, null, 14));
        xpe.c block = new xpe.c(this, step, 20);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f71537y;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f71536x;
    }
}
