package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z80.b;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPortingCancellationScreenContract$InputData f101399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f101400b;

    public a(EsimMobilePlanPortingCancellationScreenContract$InputData inputData, b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f101399a = inputData;
        this.f101400b = phoneToolsProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        lw0.a aVar;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimMobilePlanPortingCancellationScreenContract$InputData esimMobilePlanPortingCancellationScreenContract$InputData = this.f101399a;
        String strB = b.b(this.f101400b, esimMobilePlanPortingCancellationScreenContract$InputData.f101395a, null, null, 6);
        EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant esimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant = esimMobilePlanPortingCancellationScreenContract$InputData.f101396b;
        if (Intrinsics.f(esimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant, EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant.PortInCancellation.f101397a)) {
            aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_cancel_port_in_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_cancel_port_in_subtitle, u.c(strB), null, 12), null, null, false, 28);
        } else {
            if (!Intrinsics.f(esimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant, EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant.PortOutCancellation.f101398a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_cancel_port_out_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_cancel_port_out_subtitle, u.c(strB), null, 12), null, null, false, 28);
        }
        return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_cancel_port_in_cancel_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_cancel_port_in_back_cta, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, aVar);
    }
}
