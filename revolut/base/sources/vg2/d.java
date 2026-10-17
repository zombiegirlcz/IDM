package vg2;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d {
    public static final MoneyClause a(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }
}
