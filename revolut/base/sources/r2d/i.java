package r2d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f251108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertsWidgetContext f251109c;

    public /* synthetic */ i(k kVar, AlertsWidgetContext alertsWidgetContext, int i) {
        this.f251107a = i;
        this.f251108b = kVar;
        this.f251109c = alertsWidgetContext;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List listC;
        TextLocalisedClause textLocalisedClause;
        switch (this.f251107a) {
            case 0:
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                AlertsWidgetContext alertsWidgetContext = this.f251109c;
                ArrayList arrayListA = this.f251108b.a(content, alertsWidgetContext.f86012m);
                boolean zIsEmpty = arrayListA.isEmpty();
                List listC2 = arrayListA;
                if (zIsEmpty) {
                    listC2 = zhm.u.c(new RowDelegate.Model("ALERTS_WIDGET_EMPTY_STATE", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.shared_alerts_widget_empty_title, f0.f322471a, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 8), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, alertsWidgetContext, null, 0, 0, 0, 0, 532676600));
                }
                return new o1d.c(new TextLocalisedClause(R$string.shared_alerts_alerts_screen_header_title, null, null, 14), listC2);
            default:
                List content2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                boolean zIsEmpty2 = content2.isEmpty();
                k kVar = this.f251108b;
                AlertsWidgetContext alertsWidgetContext2 = this.f251109c;
                if (!zIsEmpty2) {
                    return kVar.a(content2, alertsWidgetContext2.f86012m);
                }
                if (alertsWidgetContext2.f86011l) {
                    kVar.getClass();
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D269", null, null, null, 30), null, null, false, null, false, 62);
                    AssetIdWithSymbol assetIdWithSymbol = alertsWidgetContext2.d;
                    Set set = alertsWidgetContext2.f86005a;
                    if (assetIdWithSymbol != null) {
                        textLocalisedClause = new TextLocalisedClause(R$string.shared_alerts_widget_empty_title_asset_specific, zhm.u.c(assetIdWithSymbol.f86862b), null, 12);
                    } else if (set.size() == 1) {
                        ffd.a aVar = kVar.f251111a;
                        FavouritesAssetTypeKey typeKey = (FavouritesAssetTypeKey) d0.a0(set);
                        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
                        textLocalisedClause = ((p2d.b) aVar).a(typeKey).c();
                    } else {
                        textLocalisedClause = new TextLocalisedClause(R$string.shared_alerts_widget_empty_title_price_variant, null, null, 14);
                    }
                    listC = zhm.u.c(new RowDelegate.Model("ALERTS_WIDGET_EMPTY_STATE", image40, textLocalisedClause, null, 0, null, null, null, 0, new pf(new TextLocalisedClause(R$string.shared_alerts_widget_empty_action_add, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.SEMIACCENT, true, null, null, 496), false, null, false, null, null, null, null, null, null, alertsWidgetContext2, null, 0, 0, 0, 0, 532675576));
                } else {
                    listC = null;
                }
                return listC == null ? f0.f322471a : listC;
        }
    }
}
