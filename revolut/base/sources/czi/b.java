package czi;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static MoneyClause a(dj0.d dVar, Custom custom, int i) {
        MoneyClause.Format.Defaults format = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        if ((i & 2) != 0) {
            custom = null;
        }
        o9 sensitivity = o9.NON_SENSITIVE;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return new MoneyClause(dVar, format, custom, sensitivity);
    }
}
