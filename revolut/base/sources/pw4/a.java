package pw4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.credit_additional_cardholders_widget_catalogue_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("CreditCardAdditionalCardholders");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.credit_additional_cardholders_widget_catalogue_description, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        return (String) d0.b0(availableWidgetTypes);
    }
}
