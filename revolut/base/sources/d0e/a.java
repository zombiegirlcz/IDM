package d0e;

import a0e.e;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.r7;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import yp0.r;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public final j a(String listId, TextLocalisedClause label, Clause clause, e eVar, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model(listId, clause, label, null, false, null, false, null, null, null, null, null, null, false, null, null, false, z, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, eVar, null, r7.SINGLE, 0, 0, 0, 0, -262152, 62975));
        yp0.b.l(modelA, R$attr.uikit_dp16, R$attr.uikit_dp0, 0, 0, null, false, 60);
        return modelA;
    }
}
