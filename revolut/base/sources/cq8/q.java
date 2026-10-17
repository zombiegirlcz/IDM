package cq8;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.s7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    public static CellDetailsDelegate.Model a(Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        return new CellDetailsDelegate.Model(str, textLocalisedClause, clause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static s7 b(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new s7(listId, 0, 0, 0, 0, false, null, 126);
    }
}
