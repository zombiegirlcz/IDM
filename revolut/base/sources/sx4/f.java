package sx4;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class f {
    public static final MoneyClause a(dj0.d dVar, MoneyClause.Format format, Style style) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new MoneyClause(dVar, format, style, null, 8);
    }

    public static /* synthetic */ MoneyClause b(int i, Custom custom, MoneyClause.Format format, dj0.d dVar) {
        if ((i & 1) != 0) {
            format = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        }
        if ((i & 2) != 0) {
            custom = null;
        }
        return a(dVar, format, custom);
    }
}
