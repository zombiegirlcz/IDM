package lrd;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsj.g f199500a;

    public i(tsj.g customAssetsInteractor) {
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        this.f199500a = customAssetsInteractor;
    }

    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // cli.n
    public final o c(j jVar) {
        LayeredImage.Companion companion;
        ?? r2;
        LayeredImage.Companion companion2;
        int i;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_total_wealth_add_new_revolut_account_title, null, null, 14);
        LayeredImage.Companion companion3 = LayeredImage.INSTANCE;
        eVarB.add(new RowDelegate.Model("revolut_account_option", new RowDelegate.Model.MainImage.Image40(companion3.i(R$drawable.uikit_icn_24_logo_revolut, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, a.REVOLUT_ACCOUNT, null, 0, 0, 0, 0, 532676600));
        if (domainState.f199494a) {
            companion = companion3;
            r2 = 0;
            eVarB.add(new RowDelegate.Model("link_external_account_option", new RowDelegate.Model.MainImage.Image40(companion3.i(R$drawable.uikit_icn_24_link, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.analytics_total_wealth_add_new_link_external_account_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.analytics_total_wealth_add_new_link_external_account_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, a.LINK_EXTERNAL_ACCOUNT, null, 0, 0, 0, 0, 532676568));
        } else {
            companion = companion3;
            r2 = 0;
        }
        CustomAssetCategoryDefinition customAssetCategoryDefinition = domainState.f199495b;
        if (customAssetCategoryDefinition != null && customAssetCategoryDefinition.f99226c && this.f199500a.e()) {
            companion2 = companion;
            i = 14;
            eVarB.add(new RowDelegate.Model("property_option", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_utilities, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.analytics_total_wealth_add_new_property_title, r2, r2, 14), null, 0, new TextLocalisedClause(R$string.analytics_total_wealth_add_new_property_subtitle, r2, r2, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, a.PROPERTY, null, 0, 0, 0, 0, 532676568));
        } else {
            companion2 = companion;
            i = 14;
        }
        eVarB.add(new RowDelegate.Model("other_assets_option", new RowDelegate.Model.MainImage.Image40(companion2.i(R$drawable.uikit_icn_24_business_basic, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.analytics_total_wealth_add_new_other_assets_title, r2, r2, i), null, 0, new TextLocalisedClause(R$string.analytics_total_wealth_add_new_other_assets_subtitle, r2, r2, i), null, null, 0, null, false, null, false, null, null, null, null, null, null, a.OTHER_ASSETS, null, 0, 0, 0, 0, 532676568));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new d(eVarA);
    }
}
