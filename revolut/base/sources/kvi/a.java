package kvi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.asft_widget_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("AirportFastTrackPassMedium");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.asft_widget_description, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        String str = availableWidgetTypes.contains("AirportFastTrackPassMedium") ? "AirportFastTrackPassMedium" : null;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
