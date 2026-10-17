package g23;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(String listId, TextLocalisedClause title, Clause subtitle, int i, int i2, List tags, Object obj2, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tags, "tags");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_rounded_background, Integer.valueOf(i2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(i, Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), null, null, false, null, false, 62);
        int i3 = R$attr.uikit_dp12;
        return new RowDelegate.Model(listId, image40, title, null, 0, subtitle, null, null, 0, null, false, null, false, null, tags, null, null, null, null, obj2, analyticsContext, i3, i3, 0, 0, 473923544);
    }

    public static RowDelegate.Model b(l0 l0Var, String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i, int i2, List list, int i3) {
        if ((i3 & 32) != 0) {
            list = zhm.f0.f322471a;
        }
        l0Var.getClass();
        return a(str, textLocalisedClause, textLocalisedClause2, i, i2, list, null, null);
    }

    public static pc c() {
        return new pc("card-limit-reached-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.card_design_tag_limit_reached, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorWidgetBackground), R$attr.uikit_colorTransparent, null, 1000), null);
    }

    public static pc d(wi0.b bVar) {
        return new pc("free-delivery-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_present, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.bumptech.glide.d.x(bVar) ? R$string.card_tag_complimentary_delivery : R$string.card_tag_free_delivery, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorWidgetBackground), R$attr.uikit_colorTransparent, null, 1000), null);
    }
}
