package csh;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface d {
    Clause a();

    default Clause b(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return a();
    }

    List c();

    Clause d(String str);

    String e(List list);
}
