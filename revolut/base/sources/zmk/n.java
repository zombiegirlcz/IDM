package zmk;

import aw0.o9;
import aw0.v1;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.u7;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheetFooter;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheetItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$HyperText;
import ip0.ak0;
import ip0.ck0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f323614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dnk.l f323615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qfk.a f323616c;

    public n(c90.c uiResources, dnk.l iconMapper, qfk.a descriptorMapper) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(descriptorMapper, "descriptorMapper");
        this.f323614a = uiResources;
        this.f323615b = iconMapper;
        this.f323616c = descriptorMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause compositeClause;
        Click click;
        qv0.o model;
        Media urlVideo;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet = domainState.f323600a;
        CircleBadgeModel circleBadgeModel = domainState.f323601b;
        String str = plansDashboardLayout$PlanPageLayout$BottomSheet.f102758a;
        lw0.b bVar = str != null ? new lw0.b(new UrlImage(str, null, null, null, 0L, null, null, Integer.valueOf(R$attr.uikit_colorTransparent), null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507646), circleBadgeModel) : null;
        TextClause textClause = new TextClause(plansDashboardLayout$PlanPageLayout$BottomSheet.f102759b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = plansDashboardLayout$PlanPageLayout$BottomSheet.f102760c;
        lw0.a aVar = new lw0.a(textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, bVar, null, false, 24);
        PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet2 = domainState.f323600a;
        Iterable iterable = plansDashboardLayout$PlanPageLayout$BottomSheet2.d;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
        int i = 0;
        for (Object obj2 : iterable2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            PlansDashboardLayout$PlanPageLayout$BottomSheetItem plansDashboardLayout$PlanPageLayout$BottomSheetItem = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem) obj2;
            if (plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Cell) {
                String strN = a0.d.n("ITEM_ID_PREFIX_", i);
                PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Cell cell = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Cell) plansDashboardLayout$PlanPageLayout$BottomSheetItem;
                TextClause textClause2 = new TextClause(cell.f102764b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = cell.f102763a;
                model = new RowDelegate.Model(strN, str3 != null ? new RowDelegate.Model.MainImage.Image24(this.f323615b.c(str3), false, false, 6) : null, textClause2, null, 0, new TextClause(cell.f102765c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
            } else if (plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Details) {
                PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Details details = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Details) plansDashboardLayout$PlanPageLayout$BottomSheetItem;
                model = new CellDetailsDelegate.Model(a0.d.n("ITEM_ID_PREFIX_", i), new TextClause(details.f102766a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(details.f102767b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            } else if (plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Media) {
                String strN2 = a0.d.n("ITEM_ID_PREFIX_", i);
                PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Media media = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Media) plansDashboardLayout$PlanPageLayout$BottomSheetItem;
                int i3 = m.f323613a[media.f102769a.ordinal()];
                if (i3 == 1) {
                    urlVideo = new UrlVideo(media.f102770b, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    urlVideo = new UrlImage(media.f102770b, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
                }
                model = new LightPromptDelegate.Model(strN2, urlVideo, this.f323614a.d() ? new u7(v1.DARK) : new u7(v1.LIGHT));
            } else {
                if (!(plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Text)) {
                    throw new NoWhenBranchMatchedException();
                }
                model = new TextDelegate.Model(a0.d.n("ITEM_ID_PREFIX_", i), new TextClause(((PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Text) plansDashboardLayout$PlanPageLayout$BottomSheetItem).f102772a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
            }
            arrayList.add(model);
            i = i2;
        }
        TextDelegate.Model model2 = null;
        yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
        PlansDashboardLayout$PlanPageLayout$BottomSheetFooter plansDashboardLayout$PlanPageLayout$BottomSheetFooter = plansDashboardLayout$PlanPageLayout$BottomSheet2.e;
        if (plansDashboardLayout$PlanPageLayout$BottomSheetFooter != null) {
            String str4 = plansDashboardLayout$PlanPageLayout$BottomSheetFooter.f102761a;
            Iterable iterable3 = plansDashboardLayout$PlanPageLayout$BottomSheetFooter.f102762b;
            if (iterable3 == null) {
                iterable3 = f0.f322471a;
            }
            Iterable<PlansDashboardLayout$PlanPageLayout$HyperText> iterable4 = iterable3;
            ArrayList arrayList2 = new ArrayList(w.t(iterable4, 10));
            for (PlansDashboardLayout$PlanPageLayout$HyperText plansDashboardLayout$PlanPageLayout$HyperText : iterable4) {
                arrayList2.add(new eha.a(plansDashboardLayout$PlanPageLayout$HyperText.f102776a, plansDashboardLayout$PlanPageLayout$HyperText.f102777b));
            }
            List listA = this.f323616c.a(str4, arrayList2);
            if (listA.isEmpty()) {
                compositeClause = new TextClause(plansDashboardLayout$PlanPageLayout$BottomSheetFooter.f102761a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                List<PricingPlanTextDescriptor> list = listA;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                for (PricingPlanTextDescriptor pricingPlanTextDescriptor : list) {
                    String str5 = pricingPlanTextDescriptor.f81148a;
                    PricingPlanTextDescriptor.Action action = pricingPlanTextDescriptor.f81149b;
                    if (action == null) {
                        click = null;
                    } else {
                        if (!(action instanceof PricingPlanTextDescriptor.Action.UrlNavigation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        click = new Click(28, (Integer) null, (Object) action, ((PricingPlanTextDescriptor.Action.UrlNavigation) action).f81150a, false);
                    }
                    arrayList3.add(new TextClause(str5, (Style) click, (Integer) null, false, (o9) null, (List) null, 124));
                }
                compositeClause = new CompositeClause(arrayList3, null, null, null, 14);
            }
            model2 = new TextDelegate.Model("FOOTER_ID", compositeClause, false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        }
        return new c(d0.E0(v.l(model2), arrayList), aVar);
    }
}
