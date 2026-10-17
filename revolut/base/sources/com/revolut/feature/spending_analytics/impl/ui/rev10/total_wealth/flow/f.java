package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import aii.m;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import frd.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import wsg.n;
import yji.l;
import yrd.g;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements yrd.e {

    @NotNull
    private static final g Companion = new g();
    public final TotalWealthFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f87999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tsj.g f88000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f88001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dtd.a f88002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nqj.c f88003t;
    public final yki.i u;

    public f(TotalWealthFlowContract$InputData inputData, i totalWealthEventRouter, tsj.g customAssetsInteractor, n walletInteractor, dtd.a smartEstimationProductArticleProvider, nqj.c balanceHistoryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(totalWealthEventRouter, "totalWealthEventRouter");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(smartEstimationProductArticleProvider, "smartEstimationProductArticleProvider");
        Intrinsics.checkNotNullParameter(balanceHistoryInteractor, "balanceHistoryInteractor");
        this.o = inputData;
        this.f87999p = totalWealthEventRouter;
        this.f88000q = customAssetsInteractor;
        this.f88001r = walletInteractor;
        this.f88002s = smartEstimationProductArticleProvider;
        this.f88003t = balanceHistoryInteractor;
        this.u = d8l.d.a(this, new yi3.d(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f r15, com.revolut.retail.feature.api.custom_assets.models.CustomAsset r16, com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition r17, xi0.b r18, boolean r19, com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f.I2(com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f, com.revolut.retail.feature.api.custom_assets.models.CustomAsset, com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition, xi0.b, boolean, com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess, gim.c):java.lang.Object");
    }

    public final void J2(int i) {
        l.b1(this, X1(new k("custom_asset_success", new TextLocalisedClause(i, null, null, 14), null, null, null, 28)), null, null, 7);
    }

    @Override // yki.j
    public final void M0() {
        TotalWealthFlowContract$InputData totalWealthFlowContract$InputData = this.o;
        boolean z = totalWealthFlowContract$InputData instanceof TotalWealthFlowContract$InputData.Selection;
        yki.i iVar = this.u;
        if (z) {
            TotalWealthFlowContract$InputData.Selection selection = (TotalWealthFlowContract$InputData.Selection) totalWealthFlowContract$InputData;
            dj0.d dVar = selection.f87960a;
            h.w2(iVar, new TotalWealthFlowContract$Step.SelectType(selection.f87961b, selection.d, dVar, selection.f87962c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (totalWealthFlowContract$InputData instanceof TotalWealthFlowContract$InputData.Direct) {
            TotalWealthFlowContract$InputData.Direct direct = (TotalWealthFlowContract$InputData.Direct) totalWealthFlowContract$InputData;
            h.t2(this, iVar, new TotalWealthFlowContract$Step.TotalWealth(direct.f87957a, direct.f87958b, direct.f87959c, direct.d), false, null, false, 12);
            return;
        }
        if (totalWealthFlowContract$InputData instanceof TotalWealthFlowContract$InputData.AddOtherAsset) {
            h.t2(this, iVar, new TotalWealthFlowContract$Step.AddOtherAsset(((TotalWealthFlowContract$InputData.AddOtherAsset) totalWealthFlowContract$InputData).f87955a), false, null, false, 12);
            return;
        }
        if (!(totalWealthFlowContract$InputData instanceof TotalWealthFlowContract$InputData.CustomAssetDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((TotalWealthFlowContract$InputData.CustomAssetDetails) totalWealthFlowContract$InputData).f87956a;
        tsj.g gVar = this.f88000q;
        w4l.i iVar2 = w4l.i.f294643c;
        l.b1(this, rd0.e.e(q.P(mo3.a.g(u0.m(gVar.f(iVar2), gVar.g(iVar2)), null, new ypg.h(11), 1), 1), h0.f322473a, new a0e.n(this, (Continuation) null, 20)), null, new d(this, str, null), 3);
    }

    @Override // yji.l
    public final aii.n o2(m event) {
        xi0.b bVar;
        xi0.b bVar2;
        FlowStep customAssetDetails;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof TotalWealthContract$Events.ShowAddNewOptions;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        yki.i iVar = this.u;
        if (z) {
            h.w2(iVar, new TotalWealthFlowContract$Step.AddNewOptions(((TotalWealthContract$Events.ShowAddNewOptions) event).f88015b), bottom_dialog);
            return null;
        }
        if (event instanceof TotalWealthContract$Events.NavigateToAddOtherAsset) {
            h.t2(this, this.u, new TotalWealthFlowContract$Step.AddOtherAsset(((TotalWealthContract$Events.NavigateToAddOtherAsset) event).f88008b), true, null, false, 12);
            return null;
        }
        if (event instanceof TotalWealthContract$Events.NavigateToCustomAssetDetails) {
            if (this.f88000q.e()) {
                TotalWealthContract$Events.NavigateToCustomAssetDetails navigateToCustomAssetDetails = (TotalWealthContract$Events.NavigateToCustomAssetDetails) event;
                customAssetDetails = new TotalWealthFlowContract$Step.CustomAssetDetailsV2(navigateToCustomAssetDetails.f88009b, navigateToCustomAssetDetails.f88010c, navigateToCustomAssetDetails.d);
            } else {
                TotalWealthContract$Events.NavigateToCustomAssetDetails navigateToCustomAssetDetails2 = (TotalWealthContract$Events.NavigateToCustomAssetDetails) event;
                customAssetDetails = new TotalWealthFlowContract$Step.CustomAssetDetails(navigateToCustomAssetDetails2.f88009b, navigateToCustomAssetDetails2.f88010c, navigateToCustomAssetDetails2.d);
            }
            h.t2(this, this.u, customAssetDetails, true, null, false, 12);
            return null;
        }
        if (event instanceof TotalWealthContract$Events.NavigateToEditAsset) {
            TotalWealthContract$Events.NavigateToEditAsset navigateToEditAsset = (TotalWealthContract$Events.NavigateToEditAsset) event;
            CustomAsset customAsset = navigateToEditAsset.f88011b;
            TotalWealthFlowContract$Step totalWealthFlowContract$Step = (TotalWealthFlowContract$Step) iVar.d();
            if (totalWealthFlowContract$Step instanceof TotalWealthFlowContract$Step.CustomAssetDetails) {
                bVar = ((TotalWealthFlowContract$Step.CustomAssetDetails) totalWealthFlowContract$Step).f87969c;
            } else if (totalWealthFlowContract$Step instanceof TotalWealthFlowContract$Step.CustomAssetDetailsV2) {
                bVar = ((TotalWealthFlowContract$Step.CustomAssetDetailsV2) totalWealthFlowContract$Step).f87972c;
            }
            dj0.d dVar = customAsset.f99218c;
            h.t2(this, this.u, new TotalWealthFlowContract$Step.AddEditAsset(new AddEditAssetContract$InputData$Mode.Edit((dVar == null || (bVar2 = dVar.f115083b) == null) ? bVar : bVar2, customAsset, navigateToEditAsset.f88012c, navigateToEditAsset.d, navigateToEditAsset.e)), true, null, false, 12);
            return null;
        }
        boolean z3 = event instanceof TotalWealthContract$Events.AdjustCurrentValue;
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        if (z3) {
            TotalWealthContract$Events.AdjustCurrentValue adjustCurrentValue = (TotalWealthContract$Events.AdjustCurrentValue) event;
            h.w2(iVar, new TotalWealthFlowContract$Step.AdjustAssetValue(new AdjustAssetValueContract$InputData.CurrentValue(adjustCurrentValue.f88005c, adjustCurrentValue.f88004b, adjustCurrentValue.d)), fullscreen_fade);
            return null;
        }
        if (event instanceof TotalWealthContract$Events.AdjustHistoricalValue) {
            TotalWealthContract$Events.AdjustHistoricalValue adjustHistoricalValue = (TotalWealthContract$Events.AdjustHistoricalValue) event;
            h.w2(iVar, new TotalWealthFlowContract$Step.AdjustAssetValue(new AdjustAssetValueContract$InputData.HistoricalValue(adjustHistoricalValue.f88006b, adjustHistoricalValue.f88007c)), fullscreen_fade);
            return null;
        }
        if (event instanceof TotalWealthContract$Events.NavigateToHistoricalValues) {
            TotalWealthContract$Events.NavigateToHistoricalValues navigateToHistoricalValues = (TotalWealthContract$Events.NavigateToHistoricalValues) event;
            h.t2(this, this.u, new TotalWealthFlowContract$Step.CustomAssetHistoricalValues(navigateToHistoricalValues.f88013b, navigateToHistoricalValues.f88014c), true, null, false, 12);
            return null;
        }
        if (Intrinsics.f(event, a.C0550a.f87988b)) {
            this.f88003t.c(true);
            return null;
        }
        if (event instanceof yrd.c) {
            yrd.c cVar = (yrd.c) event;
            h.w2(iVar, new TotalWealthFlowContract$Step.SmartEstimationBottomSheet(cVar.f316273b, cVar.f316274c), bottom_dialog);
            return null;
        }
        if (event instanceof yrd.b) {
            yrd.b bVar3 = (yrd.b) event;
            h.w2(iVar, new TotalWealthFlowContract$Step.RemoveAssetConfirmationBottomSheet(bVar3.f316271b, bVar3.f316272c), bottom_dialog);
            return null;
        }
        if (!(event instanceof yrd.d)) {
            return super.o2(event);
        }
        yrd.d dVar2 = (yrd.d) event;
        CustomAsset customAsset2 = dVar2.f316275b;
        CustomAssetCategoryDefinition customAssetCategoryDefinition = dVar2.f316276c;
        xi0.b bVar4 = dVar2.d;
        boolean z4 = dVar2.e;
        SmartEstimationAccess smartEstimationAccess = dVar2.f;
        if (customAssetCategoryDefinition.f99226c) {
            A1(new e(z4, this, customAsset2, customAssetCategoryDefinition, bVar4, smartEstimationAccess, null), new yi5.b(25));
            return null;
        }
        return null;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
