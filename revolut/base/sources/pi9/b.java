package pi9;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static MoneyClause a(d dVar, Custom custom, int i) {
        MoneyClause.Format.Defaults format = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        if ((i & 2) != 0) {
            custom = null;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new MoneyClause(dVar, format, custom, null, 8);
    }
}
