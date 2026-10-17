package umk;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.jd;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.md;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    public n(tjk.d hyperTextClauseBuilder) {
        Intrinsics.checkNotNullParameter(hyperTextClauseBuilder, "hyperTextClauseBuilder");
    }

    public static Media b(PlanOfferPromptLayout.Asset asset, oz0.c cVar) {
        com.revolut.retail.feature.pricing_plans.ui.api.models.d dVar = asset != null ? asset.f102693a : null;
        int i = dVar == null ? -1 : m.f281330c[dVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return new UrlVideo(asset.f102694b, (String) null, false, oz0.b.CENTER_CROP, false, cVar, 50);
            }
            if (i == 2) {
                return new UrlImage(asset.f102694b, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ColorImage.INSTANCE.getClass();
        return ColorImage.Companion.a();
    }

    public static PromptMarketingContentDelegate.Model.Button d(PricingPlanLayoutButton pricingPlanLayoutButton) {
        LargeActionButton.ButtonStyle buttonStyle;
        TextClause textClause = new TextClause(pricingPlanLayoutButton.f102832b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = m.f281328a[pricingPlanLayoutButton.f102831a.ordinal()];
        if (i == 1) {
            buttonStyle = LargeActionButton.ButtonStyle.f58725a;
        } else if (i == 2) {
            buttonStyle = LargeActionButton.ButtonStyle.f58726b;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            buttonStyle = LargeActionButton.ButtonStyle.o;
        }
        return new PromptMarketingContentDelegate.Model.Button((Clause) textClause, (ResourceImage) null, buttonStyle, false, (String) null, 54);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Footer] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.core.ui_kit.delegates.jd, com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Footer] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final PromptMarketingContentDelegate.Model a(PlanOfferPromptLayout layout) {
        PromptMarketingContentDelegate.Model.Content fullScreenMediaContent;
        PricingPlanLayoutHyperText pricingPlanLayoutHyperText;
        List list;
        PricingPlanLayoutButton pricingPlanLayoutButton;
        List list2;
        PricingPlanLayoutButton pricingPlanLayoutButton2;
        jd jdVar;
        String str;
        Intrinsics.checkNotNullParameter(layout, "layout");
        PlanOfferPromptLayout.Content content = layout.f102691b;
        PricingPlanLayoutFooter pricingPlanLayoutFooter = layout.d;
        ?? footer = 0;
        footer = 0;
        TextClause textClause = new TextClause(content.f102699b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        PlanOfferPromptLayout.Header header = layout.f102690a;
        TextClause textClause2 = (header == null || (str = header.f102701a) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClauseA = tjk.d.a(content.f102700c);
        ld ldVar = ld.CAPTION;
        PlanOfferPromptLayout.Content content2 = layout.f102691b;
        PlanOfferPromptLayout.Asset asset = content2.d;
        PlanOfferPromptLayout.Style style = content2.f102698a;
        PlanOfferPromptLayout.Background background = layout.f102692c;
        if (background != null) {
            Media mediaB = b(background.f102697c, oz0.c.DISABLED);
            com.revolut.retail.feature.pricing_plans.ui.api.models.f fVar = style != null ? style.f102702a : null;
            int i = fVar == null ? -1 : m.f281329b[fVar.ordinal()];
            int i2 = 2;
            if (i == -1) {
                jdVar = jd.BOTTOM;
                fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(mediaB, footer, jdVar, i2);
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jdVar = jd.BOTTOM;
                } else {
                    jdVar = jd.CENTER;
                }
                fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(mediaB, footer, jdVar, i2);
            }
        } else if (asset != null) {
            fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(b(asset, oz0.c.ENABLED), null);
        } else {
            ColorImage.INSTANCE.getClass();
            fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(ColorImage.Companion.a(), footer, footer, 6);
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        pd pdVar = pd.BLACK;
        PromptMarketingContentDelegate.Model.Button buttonD = (pricingPlanLayoutFooter == null || (list2 = pricingPlanLayoutFooter.f102834a) == null || (pricingPlanLayoutButton2 = (PricingPlanLayoutButton) d0.e0(0, list2)) == null) ? null : d(pricingPlanLayoutButton2);
        PromptMarketingContentDelegate.Model.Button buttonD2 = (pricingPlanLayoutFooter == null || (list = pricingPlanLayoutFooter.f102834a) == null || (pricingPlanLayoutButton = (PricingPlanLayoutButton) d0.e0(1, list)) == null) ? null : d(pricingPlanLayoutButton);
        if (pricingPlanLayoutFooter != null && (pricingPlanLayoutHyperText = pricingPlanLayoutFooter.f102835b) != null) {
            footer = new PromptMarketingContentDelegate.Model.Footer(tjk.d.a(pricingPlanLayoutHyperText), md.BELOW_BUTTONS);
        }
        return new PromptMarketingContentDelegate.Model("id_plan_offer_prompt", textClause, textClauseA, fullScreenMediaContent, null, pdVar, resourceImage, ldVar, null, buttonD, buttonD2, null, footer, null, null, null, null, null, null, null, textClause2, 1042704);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k(((Boolean) iii.c.f(domainState.f281323a, new umc.c(1), new uj8.j(17), new u3b.h(20))).booleanValue(), (List) iii.c.f(domainState.f281323a, new umc.c(this, 2), new uj8.j(18), new w(this, 8)));
    }
}
