package awk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {
    public m(zvk.d assetStatsUIMapper) {
        Intrinsics.checkNotNullParameter(assetStatsUIMapper, "assetStatsUIMapper");
    }

    public final RowDelegate.Model a(AssetStatsId assetStatsId, boolean z) {
        int iB = zvk.d.b(assetStatsId);
        return new RowDelegate.Model("stats-item-" + assetStatsId, null, new TextLocalisedClause(iB, null, null, 14), null, 0, null, null, null, 0, new tf(new yy0.h(new TextLocalisedClause(iB, null, null, 14), z ? new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, new n(assetStatsId), null, 0, 0, 0, 0, 532673530);
    }
}
