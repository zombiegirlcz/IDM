package b67;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextClause("Toolbox", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // csh.d
    public final List c() {
        return u.c("ProToolbox");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextClause("Toolbox", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        String str = availableWidgetTypes.contains("ProToolbox") ? "ProToolbox" : null;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
