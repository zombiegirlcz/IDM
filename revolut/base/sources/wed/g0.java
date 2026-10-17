package wed;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FavouritesAssetTypeKey f296735b;

    public /* synthetic */ g0(FavouritesAssetTypeKey favouritesAssetTypeKey, int i) {
        this.f296734a = i;
        this.f296735b = favouritesAssetTypeKey;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f296734a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FavouritesAssetTypeKey favouritesAssetTypeKey = this.f296735b;
                String strQ = j6.a.q("ERROR_", favouritesAssetTypeKey.f86866a);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_error_state_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                int i = R$drawable.uikit_icn_24_retry;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf = Float.valueOf(16.0f);
                List listC = zhm.u.c(new RowDelegate.Model(strQ, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null, null, textLocalisedClause, yoj.b.w(yoj.b.w(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_buttons_try_again, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10)), null, null, 0, null, false, false, null, null, null, null, null, favouritesAssetTypeKey, null, 0, 0, 0, 0, 1056964460));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FavouritesAssetTypeKey favouritesAssetTypeKey2 = this.f296735b;
                String strQ2 = j6.a.q("COMPLETED_ALERTS_ERROR_", favouritesAssetTypeKey2.f86866a);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_error_state_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                int i2 = R$drawable.uikit_icn_24_retry;
                Integer numValueOf2 = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf2 = Float.valueOf(16.0f);
                List listC2 = zhm.u.c(new RowDelegate.Model(strQ2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null, null, textLocalisedClause2, yoj.b.w(yoj.b.w(new ImageClause(i2, numValueOf2, fValueOf2, fValueOf2, 16), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_buttons_try_again, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10)), null, null, 0, null, false, false, null, null, null, null, null, favouritesAssetTypeKey2, null, 0, 0, 0, 0, 1056964460));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return listC2;
        }
    }
}
