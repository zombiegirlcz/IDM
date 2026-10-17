package com.revolut.feature.apm.core.ui.impl.ui.breakdown.details;

import aim.e;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeFee;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsContract$InputData;
import h22.d;
import ip0.n8;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import rp0.y;
import v2k.c;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BreakdownDetailsContract$InputData f62348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f62349b;

    public b(BreakdownDetailsContract$InputData inputData, c taxesItemProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        this.f62348a = inputData;
        this.f62349b = taxesItemProvider;
    }

    public static cii.b a(dj0.d dVar, List list) {
        List<ApmQuoteBreakdownItem> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ApmQuoteBreakdownItem apmQuoteBreakdownItem : list2) {
            arrayList.add(new CellDetailsDelegate.Model(apmQuoteBreakdownItem.f62214a, new t0((Clause) new TextClause(apmQuoteBreakdownItem.f62216c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(apmQuoteBreakdownItem.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, apmQuoteBreakdownItem, null, null, 0, null, false, false, null, null, 32696));
        }
        n8 n8Var = new n8(new TextLocalisedClause(R$string.apm_transfer_fee_breakdown_total_title, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), "ID_CHARGES_TOTAL");
        e eVarB = u.b();
        eVarB.addAll(arrayList);
        eVarB.add(n8Var);
        e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new cii.b(null, eVarA, new lw0.a(new TextLocalisedClause(R$string.apm_transfer_fee_breakdown_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // cli.n
    public final o c(j jVar) {
        Clause title;
        Clause title2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BreakdownDetailsContract$InputData breakdownDetailsContract$InputData = this.f62348a;
        if (breakdownDetailsContract$InputData instanceof BreakdownDetailsContract$InputData.ChargesFee) {
            ApmQuoteChargeFee apmQuoteChargeFee = ((BreakdownDetailsContract$InputData.ChargesFee) breakdownDetailsContract$InputData).f62344a;
            return a(apmQuoteChargeFee.f62217a, apmQuoteChargeFee.f62219c);
        }
        if (breakdownDetailsContract$InputData instanceof BreakdownDetailsContract$InputData.ChargesTax) {
            ApmQuoteChargeTax apmQuoteChargeTax = ((BreakdownDetailsContract$InputData.ChargesTax) breakdownDetailsContract$InputData).f62345a;
            return a(apmQuoteChargeTax.f62220a, apmQuoteChargeTax.f62221b);
        }
        if (breakdownDetailsContract$InputData instanceof BreakdownDetailsContract$InputData.ChargesBreakdown) {
            ApmQuoteBreakdownItem apmQuoteBreakdownItem = ((BreakdownDetailsContract$InputData.ChargesBreakdown) breakdownDetailsContract$InputData).f62343a;
            return new cii.b(null, u.c(new PlainTextDelegate.Model("ID_CHARGES_BREAKDOWN", (Clause) null, (Clause) new TextClause(apmQuoteBreakdownItem.f62215b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518)), new lw0.a(new TextClause(apmQuoteBreakdownItem.f62214a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
        }
        boolean z = breakdownDetailsContract$InputData instanceof BreakdownDetailsContract$InputData.Tax;
        c cVar = this.f62349b;
        if (z) {
            y yVarC = cVar.c(((BreakdownDetailsContract$InputData.Tax) breakdownDetailsContract$InputData).f62346a);
            List list = yVarC.f256217a;
            rp0.u uVar = yVarC.f256218b;
            return new cii.b(null, list, (uVar == null || (title2 = uVar.getTitle()) == null) ? null : new lw0.a(title2, null, null, null, false, 30));
        }
        if (!(breakdownDetailsContract$InputData instanceof BreakdownDetailsContract$InputData.TaxBreakdown)) {
            throw new NoWhenBranchMatchedException();
        }
        y yVarB = cVar.b(((BreakdownDetailsContract$InputData.TaxBreakdown) breakdownDetailsContract$InputData).f62347a);
        List list2 = yVarB.f256217a;
        rp0.u uVar2 = yVarB.f256218b;
        return new cii.b(null, list2, (uVar2 == null || (title = uVar2.getTitle()) == null) ? null : new lw0.a(title, null, null, null, false, 30));
    }
}
