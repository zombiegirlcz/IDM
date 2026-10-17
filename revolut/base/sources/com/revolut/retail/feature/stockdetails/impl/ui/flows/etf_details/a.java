package com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details;

import ael.k;
import android.os.Parcelable;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$ModalStep;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$Page;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewControllerContract$InputData;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import grl.k9;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import oki.h;
import oqk.c;
import otk.d;
import otk.f;
import otk.n;
import otk.r;
import vkm.j2;
import ybl.b;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements d {
    public final EtfDetailsFlowControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c3h.a f103842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f103843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f103844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n2h.a f103845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l1d.a f103846t;
    public final u1d.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ali.b f103847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f103848x;

    public a(EtfDetailsFlowControllerContract$InputData inputData, r stateMapper, c3h.a assetDetailsHeaderMapper, gte.a featureToggleInteractor, b instrumentTickerInteractor, n2h.a actionsPanelControllerModelExtension, l1d.a alertsQuickActionsControllerModelExtension, u1d.a watchlistQuickActionsControllerModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(assetDetailsHeaderMapper, "assetDetailsHeaderMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(alertsQuickActionsControllerModelExtension, "alertsQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsControllerModelExtension, "watchlistQuickActionsControllerModelExtension");
        this.o = inputData;
        this.f103842p = assetDetailsHeaderMapper;
        this.f103843q = featureToggleInteractor;
        this.f103844r = instrumentTickerInteractor;
        this.f103845s = actionsPanelControllerModelExtension;
        this.f103846t = alertsQuickActionsControllerModelExtension;
        this.u = watchlistQuickActionsControllerModelExtension;
        final int i = 0;
        this.v = mra.d.b(this, new f(null, u.c(EtfDetailsFlowControllerContract$Page.OVERVIEW), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), (n2h.f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue()), stateMapper, null, false, 12);
        this.f103847w = s.b(this, new Function2(this) { // from class: otk.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a f229738b;

            {
                this.f229738b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar = this.f229738b;
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        EtfDetailsFlowControllerContract$Page tab2 = (EtfDetailsFlowControllerContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        if (m.f229739a[tab2.ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = aVar.o;
                        return new EtfDetailsOverviewController(new EtfDetailsOverviewControllerContract$InputData(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103839c, etfDetailsFlowControllerContract$InputData.d));
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        EtfDetailsFlowControllerContract$ModalStep modalStep = (EtfDetailsFlowControllerContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                        if (!(modalStep instanceof EtfDetailsFlowControllerContract$ModalStep.LeveragedInfo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((f4h.d) aVar.f103842p).getClass();
                        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.wealth_trading_instrument_details_leverage_info_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_instrument_details_leverage_info_description, null, null, 14), null, null, false, 20);
                        k9 value = k9.Wealth;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        return new ActionsBottomSheetController(new dii.a(aVar2, null, new AnalyticsProduct.Retail(value), null, null, 24));
                }
            }
        });
        final int i2 = 1;
        this.f103848x = e.a(this, new Function2(this) { // from class: otk.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a f229738b;

            {
                this.f229738b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar = this.f229738b;
                switch (i22) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        EtfDetailsFlowControllerContract$Page tab2 = (EtfDetailsFlowControllerContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        if (m.f229739a[tab2.ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = aVar.o;
                        return new EtfDetailsOverviewController(new EtfDetailsOverviewControllerContract$InputData(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103839c, etfDetailsFlowControllerContract$InputData.d));
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        EtfDetailsFlowControllerContract$ModalStep modalStep = (EtfDetailsFlowControllerContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                        if (!(modalStep instanceof EtfDetailsFlowControllerContract$ModalStep.LeveragedInfo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((f4h.d) aVar.f103842p).getClass();
                        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.wealth_trading_instrument_details_leverage_info_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_instrument_details_leverage_info_description, null, null, 14), null, null, false, 20);
                        k9 value = k9.Wealth;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        return new ActionsBottomSheetController(new dii.a(aVar2, null, new AnalyticsProduct.Retail(value), null, null, 24));
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f103847w;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f103848x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = this.o;
        String str = etfDetailsFlowControllerContract$InputData.f103837a;
        b bVar = this.f103844r;
        l.b1(this, rd0.e.b(((k) bVar).f(str)), null, new n(this, null, 1), 3);
        String str2 = etfDetailsFlowControllerContract$InputData.f103837a;
        b.Companion.getClass();
        l.b1(this, ((k) bVar).p(str2, w4l.h.f294642c, InstrumentTickerInteractor$Companion.f105074b.a()), null, new n(this, null, 3), 3);
        l.b1(this, boh.f.e(rd0.e.b(((k) bVar).f(etfDetailsFlowControllerContract$InputData.f103837a)), new c(this, 14)), null, new n(this, null, 2), 3);
        l.b1(this, (j2) ((m3h.a) this.f103845s).f202569p.f22677a, null, new n(this, null, 0), 3);
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.v;
    }
}
