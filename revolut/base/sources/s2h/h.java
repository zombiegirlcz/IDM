package s2h;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public interface h {
    static ListSubheaderDelegate.Model a(n instrument, boolean z) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        String assetName = instrument.d;
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        return new ListSubheaderDelegate.Model("bio.header", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_index_details_about_title, u.c(assetName), null, 12), z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, z, false, (Clause) null, false, (Object) (z ? new b(assetName) : null), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 260066);
    }

    static /* synthetic */ ListSubheaderDelegate.Model b(p3h.a aVar, n nVar) {
        aVar.getClass();
        return a(nVar, false);
    }
}
