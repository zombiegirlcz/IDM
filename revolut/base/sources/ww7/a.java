package ww7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_home.impl.R$string;
import csh.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.insurance_home_interactive_widget_catalogue_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("InsuranceMedium");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.insurance_home_interactive_widget_catalogue_description, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        return "InsuranceMedium";
    }
}
