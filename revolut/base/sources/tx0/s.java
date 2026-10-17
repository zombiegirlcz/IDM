package tx0;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements u {
    @Override // tx0.u
    public final void a(ActionsView actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        mx0.p pVarA = mx0.p.a(actions.getMoreActionState(), "MORE_ACTION_ITEM_ID", null, 4);
        if (Intrinsics.f(actions.getMoreActionState(), pVarA)) {
            return;
        }
        actions.moreActionState = pVarA;
        actions.f();
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof s);
    }

    public final int hashCode() {
        return (-896526824) * 31;
    }
}
