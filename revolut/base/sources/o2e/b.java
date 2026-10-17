package o2e;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static RowDelegate.Model a(String listId, TextLocalisedClause title, TextLocalisedClause subtitle, int i, StoreCampaignOffer storeCampaignOffer, String str) {
        m2e.a aVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        String str2 = str == null ? storeCampaignOffer != null ? storeCampaignOffer.f88460t : null : str;
        if (str2 != null) {
            aVar = new m2e.a(24, null, storeCampaignOffer != null ? storeCampaignOffer.f88459s : null, storeCampaignOffer != null ? storeCampaignOffer.u : null, str2);
        } else {
            aVar = null;
        }
        return new RowDelegate.Model(listId, new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f, LayeredImage.INSTANCE, i, new Color.Solid(R$attr.uikit_colorForeground)), null, null, false, null, false, 62), title, null, 0, subtitle, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar != null ? new m2e.b(null, aVar) : null, aVar != null ? new AnalyticsContext(c2e.a.a(aVar, null)) : null, 0, 0, 0, 0, 524285912);
    }
}
