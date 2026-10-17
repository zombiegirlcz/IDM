package jlk;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import ip0.ck0;
import ip0.n8;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PricingPlanCancelScreenConfig pricingPlanCancelScreenConfig = domainState.f175855a;
        aim.e eVarB = u.b();
        List list = pricingPlanCancelScreenConfig.d;
        PricingPlanCancelScreenConfig.Header header = pricingPlanCancelScreenConfig.f81160b;
        PricingPlanCancelScreenConfig.ActionButton actionButton = pricingPlanCancelScreenConfig.f;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            PricingPlanCancelScreenConfig.FeeAndRefundItem feeAndRefundItem = (PricingPlanCancelScreenConfig.FeeAndRefundItem) it8.next();
            String str = feeAndRefundItem.f81169a;
            PricingPlanCancelScreenConfig.DetailDialogScreenConfig detailDialogScreenConfig = feeAndRefundItem.f81171c;
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            boolean z = detailDialogScreenConfig != null;
            ResourceImage resourceImage = detailDialogScreenConfig != null ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null;
            String str2 = feeAndRefundItem.f81170b;
            arrayList.add(new CellDetailsDelegate.Model(str, textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, resourceImage, false, 0, null, feeAndRefundItem, null, null, 0, null, z, null, 0, 0, 0, 0, 1031656));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        PricingPlanCancelScreenConfig.SimpleTextItem simpleTextItem = pricingPlanCancelScreenConfig.f81161c;
        if (simpleTextItem != null) {
            String str3 = simpleTextItem.f81175a;
            TextClause textClause2 = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str4 = simpleTextItem.f81176b;
            List listC = u.c(new n8(textClause2, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str3));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB.addAll(listC);
        }
        PricingPlanCancelScreenConfig.Footer footer = pricingPlanCancelScreenConfig.f81162g;
        if (footer != null) {
            List list3 = footer.f81172a;
            if (!list3.isEmpty()) {
                TextDelegate.Model model = new TextDelegate.Model("ID_FOOTER", dok.b.a(list3), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
                yp0.b.r(model, 0, R$attr.uikit_dp0, 0, 0, 13);
                eVarB.add(model);
            }
        }
        PricingPlanCancelScreenConfig.ActionButton actionButton2 = pricingPlanCancelScreenConfig.e;
        if (actionButton2 != null) {
            TextClause textClause3 = new TextClause(actionButton2.f81164b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            String str5 = actionButton2.f81163a;
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_PRIMARY_BUTTON", defaultFilledButton, null, textClause3, false, null, null, actionButton2, str5 != null ? new AnalyticsContext(v0.a.b(str5, AnalyticsContext.INSTANCE)) : null, 232);
            yp0.b.r(model2, 0, actionButton != null ? R$attr.uikit_dp8 : R$attr.uikit_dp24, 0, 0, 13);
            eVarB.add(model2);
        }
        if (actionButton != null) {
            TextClause textClause4 = new TextClause(actionButton.f81164b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
            String str6 = actionButton.f81163a;
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_SECONDARY_BUTTON", defaultFilledButton2, null, textClause4, false, null, null, actionButton, str6 != null ? new AnalyticsContext(v0.a.b(str6, AnalyticsContext.INSTANCE)) : null, 232);
            yp0.b.r(model3, 0, R$attr.uikit_dp24, 0, 0, 13);
            eVarB.add(model3);
        }
        return new l(u.a(eVarB), new TextClause(header.f81173a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), dok.b.a(header.f81174b));
    }
}
