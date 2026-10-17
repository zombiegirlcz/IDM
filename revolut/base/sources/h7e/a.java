package h7e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import csh.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.savings_widget_automations_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("VaultAutomationsList");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.savings_sheets_automations_title, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        String str = availableWidgetTypes.contains("VaultAutomationsList") ? "VaultAutomationsList" : null;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
