package ivi;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static MoneyClause a(d dVar) {
        o9 sensitivity = o9.NON_SENSITIVE;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, sensitivity, 4);
    }
}
