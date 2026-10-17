package lxi;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import ip0.kf0;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public static SmallCardDelegate.Model a(svi.b bVar) {
        String str = bVar.f265874a;
        TextClause textClause = new TextClause(bVar.f265875b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        SmallCardDelegate.b.C0425b c0425b = new SmallCardDelegate.b.C0425b(new TextClause(bVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, kf0.SMALL, 2);
        String str2 = bVar.i;
        SmallCardDelegate.Model model = new SmallCardDelegate.Model(str, null, textClause, c0425b, str2 != null ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, null, null, bVar, null, 1044434);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ListSubheaderDelegate.Model b(boolean z) {
        return new ListSubheaderDelegate.Model("ID_SAVED_LOUNGES_LABEL", (Image) null, (Clause) new TextLocalisedClause(R$string.airport_lounges_home_saved_lounges_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.airport_lounges_home_saved_lounges_see_all, null, null, 14) : null), z, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
    }
}
