package zdi;

import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static ObjectCarouselNavBarContentView.CarouselItemModel a(RevPointsPocketBenefit revPointsPocketBenefit) {
        return new ObjectCarouselNavBarContentView.CarouselItemModel(j6.a.q("REV_POINTS_POCKET_CAROUSEL_ITEM_ID_", revPointsPocketBenefit.f97779a), new UrlImage(revPointsPocketBenefit.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
    }
}
