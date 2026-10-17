package ojk;

import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.ej;
import com.revolut.core.ui_kit.delegates.gj;
import com.revolut.core.ui_kit.delegates.p1;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.a3;
import ip0.ck0;
import ip0.go0;
import ip0.h4;
import ip0.i4;
import ip0.n4;
import ip0.os;
import ip0.ps;
import ip0.qe0;
import ip0.qs;
import ip0.re0;
import ip0.tm0;
import ip0.ue0;
import ip0.ve0;
import ip0.we0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 {

    @NotNull
    public static final d0 Companion = new d0();
    public static final aw0.d0 f = new aw0.d0(167, StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final aw0.d0 f225816g = new aw0.d0(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnk.l f225817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f225818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f225819c;
    public final gte.a d;
    public final UrlImageDrawable.Shimmering.Transformable e;

    public g0(dnk.l iconMapper, t accessoryMapper, p0 badgeMapper, s cellBannerTitleClauseMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(accessoryMapper, "accessoryMapper");
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(cellBannerTitleClauseMapper, "cellBannerTitleClauseMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f225817a = iconMapper;
        this.f225818b = accessoryMapper;
        this.f225819c = badgeMapper;
        this.d = featureToggleInteractor;
        this.e = new UrlImageDrawable.Shimmering.Transformable(new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG));
    }

    public static CompositeClause a(int i, List list) {
        Click click;
        if (list.isEmpty()) {
            return null;
        }
        List<PricingPlanTextDescriptor> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (PricingPlanTextDescriptor pricingPlanTextDescriptor : list2) {
            List listC = zhm.u.c(pricingPlanTextDescriptor.f81148a);
            PricingPlanTextDescriptor.Action action = pricingPlanTextDescriptor.f81149b;
            if (action == null) {
                click = null;
            } else {
                if (!(action instanceof PricingPlanTextDescriptor.Action.UrlNavigation)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((PricingPlanTextDescriptor.Action.UrlNavigation) action).f81150a;
                click = new Click(28, (Integer) null, (Object) new u(str), str, false);
            }
            arrayList.add(new TextLocalisedClause(i, listC, click, 8));
        }
        return new CompositeClause(arrayList, null, null, null, 14);
    }

    public static List c() {
        List listK = zhm.v.k(new a3("loading_1"), new a3("loading_2"), new a3("loading_3"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public static CellDetailsDelegate.Model h(PlanScreenElementView.CellTuple cellTuple) {
        String str;
        String strQ = j6.a.q("list_id_cell_tuple_", cellTuple.f81038b);
        PlanScreenElementView.DescriptionOptions descriptionOptions = cellTuple.f81039c;
        if (descriptionOptions == null || (str = descriptionOptions.f81040a) == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pricing_plan_template_engine_cell_tuple_text, zhm.u.c(str), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pricing_plan_template_engine_cell_tuple_title, zhm.u.c(cellTuple.f81038b), null, 12);
        String str2 = cellTuple.f81037a;
        return new CellDetailsDelegate.Model(strQ, textLocalisedClause2, textLocalisedClause, 0, null, str2 != null ? new AnalyticsContext(r(str2)) : null, null, null, null, false, 0, 0, 32728);
    }

    public static we0 m(PlanScreenElementView.Media media) {
        ve0 qe0Var;
        String strQ = media.f81090a;
        if (strQ == null) {
            strQ = j6.a.q("media_", media.f81092c);
        }
        int i = f0.f225813a[media.f81091b.ordinal()];
        if (i == 1) {
            qe0Var = new qe0(-2, new UrlImage(media.f81092c, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, 320, 343, false, false, 425470));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qe0Var = new ue0(new UrlVideo(media.f81092c, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG), new re0(320, 343));
        }
        return new we0(strQ, qe0Var);
    }

    public static TextDelegate.Model n(PlanScreenElementView.PlainText plainText) {
        CompositeClause compositeClauseA = a(R$string.pricing_plan_template_engine_plain_text, plainText.f81098b);
        if (compositeClauseA == null) {
            return null;
        }
        PricingPlanTextDescriptor pricingPlanTextDescriptor = (PricingPlanTextDescriptor) zhm.d0.d0(plainText.f81098b);
        String str = pricingPlanTextDescriptor != null ? pricingPlanTextDescriptor.f81148a : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ck0 ck0Var = new ck0(yj0.START);
        String str3 = plainText.f81097a;
        return new TextDelegate.Model(str2, compositeClauseA, false, ck0Var, null, str3 != null ? new AnalyticsContext(r(str3)) : null, 0, 0, 0, 0, 1972);
    }

    public static LargeActionButtonDelegate.Model o(PlanScreenElementView.PrimaryButton primaryButton, String str) {
        String str2;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pricing_plan_template_engine_button_primary_text, zhm.u.c(primaryButton.f81100b), null, 12);
        PlanScreenElementView.Action action = primaryButton.f81101c;
        Object uVar = (action == null || (str2 = action.f81005a) == null) ? w.f225844a : new u(str2);
        String str3 = primaryButton.f81099a;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, textLocalisedClause, false, null, null, uVar, str3 != null ? new AnalyticsContext(r(str3)) : null, 232);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    public static LargeActionButtonDelegate.Model p(PlanScreenElementView.SecondaryButton secondaryButton, String str) {
        String str2;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pricing_plan_template_engine_button_secondary_text, zhm.u.c(secondaryButton.f81103b), null, 12);
        PlanScreenElementView.Action action = secondaryButton.f81104c;
        Object uVar = (action == null || (str2 = action.f81005a) == null) ? w.f225844a : new u(str2);
        String str3 = secondaryButton.f81102a;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, textLocalisedClause, false, null, null, uVar, str3 != null ? new AnalyticsContext(r(str3)) : null, 232);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    public static w0 r(String str) {
        return v0.a.b(str, AnalyticsContext.INSTANCE);
    }

    public static tm0 s(PlanScreenElementView.HorizontalButtons.Button button) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        int i;
        com.revolut.feature.pricingplans.models.c cVar = button.d;
        int[] iArr = f0.f225814b;
        int i2 = iArr[cVar.ordinal()];
        if (i2 == 1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        int i3 = iArr[cVar.ordinal()];
        if (i3 == 1) {
            i = R$string.pricing_plan_template_engine_button_primary_text;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.pricing_plan_template_engine_button_secondary_text;
        }
        return new tm0(defaultFilledButton, null, new TextLocalisedClause(i, zhm.u.c(button.f81071b), null, 12), false, null, button.f81070a, 24);
    }

    public static Image u(Image image, int i, int i2) {
        return image instanceof ResourceImage ? ResourceImage.a((ResourceImage) image, 0, Integer.valueOf(i), new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 7), new CustomColors(2, new Color.Solid(i2), null), gz0.b.Center, null, null, null, 113), 183) : image instanceof UrlImage ? UrlImage.a((UrlImage) image, null, null, null, Integer.valueOf(i2), new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 515967) : image;
    }

    public final ArrayList b(List content, a0 itemsExtraData) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        e0 e0Var = new e0();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = content.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(q((PlanScreenElementView) it8.next(), itemsExtraData, e0Var), arrayList);
        }
        return arrayList;
    }

    public final UrlImage d(String str) {
        return new UrlImage(str, (String) null, (UrlImageDrawable) this.e, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), Integer.valueOf(R$attr.uikit_colorGreyTone8), false, 4), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
    }

    public final ActionWidgetDelegate.Model e(PlanScreenElementView.ActionWidget actionWidget) {
        Image image;
        ActionWidgetDelegate.Model.a jVar;
        Image imageC;
        PlanScreenElementView.Icon icon = actionWidget.d;
        String str = actionWidget.f81008a;
        if (icon != null) {
            String str2 = icon.f81076a;
            String str3 = icon.f81077b;
            if (str3 == null) {
                if (str2 != null) {
                    imageC = this.f225817a.c(str2);
                }
                return null;
            }
            imageC = new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            image = imageC;
        } else {
            image = null;
        }
        PlanScreenElementView.ActionButton actionButton = actionWidget.e;
        PlanScreenElementView.ActionButton actionButton2 = actionWidget.f;
        if (actionButton != null && actionButton2 != null) {
            jVar = new com.revolut.core.ui_kit.delegates.k(new TextClause(actionButton.f81006a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(actionButton2.f81006a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, Constants.TAG_FC_SPEED_MODE);
        } else {
            if (actionButton == null) {
                if (actionButton2 != null) {
                    jVar = new com.revolut.core.ui_kit.delegates.j(new TextClause(actionButton2.f81006a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 14);
                }
                return null;
            }
            jVar = new com.revolut.core.ui_kit.delegates.i(14, new TextClause(actionButton.f81006a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false);
        }
        ActionWidgetDelegate.Model.a aVar = jVar;
        String str4 = str == null ? actionWidget.f81009b : str;
        TextClause textClause = new TextClause(actionWidget.f81009b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str5 = actionWidget.f81010c;
        return new ActionWidgetDelegate.Model(str4, textClause, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, image, null, aVar, null, actionWidget, str != null ? new AnalyticsContext(r(str)) : null, 1232);
    }

    public final VoucherSmallTileDelegate.Model f(PlanScreenElementView.Card card) {
        String str = card.f81014a;
        if (str == null) {
            str = card.f81015b;
        }
        String strQ = j6.a.q("list_id_card_", str);
        zi ziVar = new zi(new UrlImage(card.d.f81017a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507902), go0.PROGRESSIVE_BLUR);
        Image imageT = t(card.e);
        Image imageU = imageT != null ? u(imageT, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10) : null;
        TextClause textClause = new TextClause(card.f81015b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        gj gjVar = new gj(1);
        TextClause textClause2 = new TextClause(card.f81016c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ej ejVar = new ej(2);
        u uVar = new u(card.f.f81005a);
        String str2 = card.f81014a;
        return new VoucherSmallTileDelegate.Model(strQ, ziVar, textClause, gjVar, ejVar, textClause2, imageU, null, null, null, null, false, null, str2 != null ? new AnalyticsContext(r(str2)) : null, uVar, 130880);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model g(com.revolut.feature.pricingplans.models.PlanScreenElementView.CellBanner r42) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ojk.g0.g(com.revolut.feature.pricingplans.models.PlanScreenElementView$CellBanner):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.EsimDelegate.Model i(com.revolut.feature.pricingplans.models.PlanScreenElementView.FeaturedActionWidget r26) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ojk.g0.i(com.revolut.feature.pricingplans.models.PlanScreenElementView$FeaturedActionWidget):com.revolut.core.ui_kit.delegates.EsimDelegate$Model");
    }

    public final qs j(PlanScreenElementView.HeroCard heroCard) {
        String str = heroCard.e.f81065b.f81076a;
        if (str == null) {
            return null;
        }
        return new qs(j6.a.q("hero_card_", heroCard.f81061a), new ps(new UrlImage(heroCard.f81063c.f81067a, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774)), null, null, new TextClause(heroCard.f81061a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(heroCard.f81062b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new os(new ResourceImage(this.f225817a.a(str), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, new TextClause(heroCard.e.f81064a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LDSFile.EF_DG4_TAG)), heroCard, 1868);
    }

    public final BigTileDelegate.Model k(PlanScreenElementView.LargeCard largeCard) {
        TagViewData tagViewData;
        String str;
        String str2;
        PlanScreenElementView.Action action = largeCard.f81082g;
        String str3 = largeCard.f81079a;
        String str4 = action != null ? action.f81005a : null;
        PlanScreenElementView.Badge badge = largeCard.e;
        if (badge == null || (str = badge.f81013c) == null) {
            tagViewData = null;
        } else {
            PlanScreenElementView.Icon icon = badge.f81011a;
            tagViewData = new TagViewData((icon == null || (str2 = icon.f81076a) == null) ? null : new ResourceImage(this.f225817a.a(str2), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorWhite), 0.2f), R$attr.uikit_colorTransparent, null, 1000);
        }
        String strQ = j6.a.q("list_id_large_card_", str3 == null ? largeCard.f81080b : str3);
        TextClause textClause = new TextClause(largeCard.f81080b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        UrlImage urlImage = new UrlImage(largeCard.d.f81083a, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
        String str5 = largeCard.f81081c;
        return new BigTileDelegate.Model(strQ, textClause, urlImage, null, str5 != null ? new n4(new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false) : null, str4 != null, null, tagViewData != null ? new BigTileDelegate.b(new p1(tagViewData), null, 2) : null, largeCard.f ? new i4(((jte.d) this.d).c(PricingPlansUiApi$Toggles.MonthlyRewardsLockedBlur.f102632c), 1) : h4.f164503a, null, str4 != null ? new u(str4) : null, str3 != null ? new AnalyticsContext(r(str3)) : null, null, null, null, 33351252);
    }

    public final ArrayList l(ArrayList arrayList, e0 e0Var, a0 a0Var) {
        qv0.o oVarK;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            PlanScreenElementView planScreenElementView = (PlanScreenElementView) it8.next();
            if (planScreenElementView instanceof PlanScreenElementView.CellBanner) {
                oVarK = g((PlanScreenElementView.CellBanner) planScreenElementView);
            } else if (planScreenElementView instanceof PlanScreenElementView.CellTuple) {
                oVarK = h((PlanScreenElementView.CellTuple) planScreenElementView);
            } else if (planScreenElementView instanceof PlanScreenElementView.PrimaryButton) {
                PlanScreenElementView.PrimaryButton item = (PlanScreenElementView.PrimaryButton) planScreenElementView;
                Intrinsics.checkNotNullParameter(item, "item");
                jm.a aVar = e0Var.f225811a;
                int i = aVar.f175890a + 1;
                aVar.f175890a = i;
                oVarK = o(item, aVar.f175891b + i);
            } else if (planScreenElementView instanceof PlanScreenElementView.SecondaryButton) {
                PlanScreenElementView.SecondaryButton item2 = (PlanScreenElementView.SecondaryButton) planScreenElementView;
                Intrinsics.checkNotNullParameter(item2, "item");
                jm.a aVar2 = e0Var.f225812b;
                int i2 = aVar2.f175890a + 1;
                aVar2.f175890a = i2;
                oVarK = p(item2, aVar2.f175891b + i2);
            } else if (planScreenElementView instanceof PlanScreenElementView.PlainText) {
                oVarK = n((PlanScreenElementView.PlainText) planScreenElementView);
            } else if (planScreenElementView instanceof PlanScreenElementView.ActionWidget) {
                oVarK = e((PlanScreenElementView.ActionWidget) planScreenElementView);
            } else if (planScreenElementView instanceof PlanScreenElementView.FeaturedActionWidget) {
                oVarK = i((PlanScreenElementView.FeaturedActionWidget) planScreenElementView);
            } else if (planScreenElementView instanceof PlanScreenElementView.Media) {
                oVarK = m((PlanScreenElementView.Media) planScreenElementView);
            } else if (planScreenElementView instanceof PlanScreenElementView.HeroCard) {
                oVarK = j((PlanScreenElementView.HeroCard) planScreenElementView);
            } else if (planScreenElementView instanceof PlanScreenElementView.LargeCard) {
                oVarK = k((PlanScreenElementView.LargeCard) planScreenElementView);
            } else {
                if (planScreenElementView instanceof PlanScreenElementView.SlotManagerBanner) {
                    List list = (List) a0Var.f225804b.getContent();
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof qv0.i) {
                                arrayList3.add(obj2);
                            }
                        }
                        oVarK = (qv0.i) zhm.d0.d0(arrayList3);
                    }
                } else if (!(planScreenElementView instanceof PlanScreenElementView.Card) && !(planScreenElementView instanceof PlanScreenElementView.ExpansionArea) && !(planScreenElementView instanceof PlanScreenElementView.Footer) && !(planScreenElementView instanceof PlanScreenElementView.Grid) && !(planScreenElementView instanceof PlanScreenElementView.HorizontalButtons) && !(planScreenElementView instanceof PlanScreenElementView.HorizontalScroller) && !(planScreenElementView instanceof PlanScreenElementView.Tile) && !(planScreenElementView instanceof PlanScreenElementView.ListView) && !(planScreenElementView instanceof PlanScreenElementView.Pager) && !(planScreenElementView instanceof PlanScreenElementView.UnorderedList) && !(planScreenElementView instanceof PlanScreenElementView.Timeline)) {
                    throw new NoWhenBranchMatchedException();
                }
                oVarK = null;
            }
            if (oVarK != null) {
                arrayList2.add(oVarK);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06e7  */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [com.revolut.core.ui_kit.internal.views.ProgressStyle] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.revolut.analytics.tracking.v3.AnalyticsContext] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r36v1 */
    /* JADX WARN: Type inference failed for: r36v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2, types: [com.revolut.analytics.tracking.v3.AnalyticsContext] */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r4v72, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.revolut.feature.pricingplans.models.PlanScreenElementView$Tile] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List q(com.revolut.feature.pricingplans.models.PlanScreenElementView r53, ojk.a0 r54, ojk.e0 r55) {
        /*
            Method dump skipped, instruction units count: 2385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ojk.g0.q(com.revolut.feature.pricingplans.models.PlanScreenElementView, ojk.a0, ojk.e0):java.util.List");
    }

    public final Image t(PlanScreenElementView.Icon icon) {
        String str = icon.f81077b;
        if (str != null) {
            return new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        }
        String str2 = icon.f81076a;
        if (str2 != null) {
            return this.f225817a.c(str2);
        }
        return null;
    }
}
