package p46;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements j {
    @Override // csh.j
    public final List a(WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        return u.c("transactions");
    }
}
