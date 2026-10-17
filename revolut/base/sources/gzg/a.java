package gzg;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f148098a;

    public a(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f148098a = analyticsProduct;
    }

    public static RowDelegate.Model.MainImage.Image40 a(int i, boolean z) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccentNeutral;
        Color.Solid solid = new Color.Solid(i2);
        return new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i2), 0.1f, companion, i, solid), d8l.d.b(z), null, false, null, false, 60);
    }
}
