package dij;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public b(vnj.a esimAnalyticsContextBuilder) {
        Intrinsics.checkNotNullParameter(esimAnalyticsContextBuilder, "esimAnalyticsContextBuilder");
    }

    public final CellDetailsChevronDelegate.Model a(TextLocalisedClause textLocalisedClause, EsimProfile esimProfile) {
        return new CellDetailsChevronDelegate.Model("ID_INSTALL_ESIM_ITEM", textLocalisedClause, f2.INTERNAL, 0, null, new AnalyticsContext(vnj.a.a(esimProfile)), YearClass.CLASS_2008);
    }
}
