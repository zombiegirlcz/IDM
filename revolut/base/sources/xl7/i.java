package xl7;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.ck0;
import ip0.qd0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final SelectableDelegate.Model a(TextLocalisedClause label, String listId, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        return new SelectableDelegate.Model(listId, new TextDelegate.Model("CHECKABLE_INNER_ITEM_".concat(listId), label, false, new ck0(0), null, null, 0, 0, 0, 0, 2036), z ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
    }
}
