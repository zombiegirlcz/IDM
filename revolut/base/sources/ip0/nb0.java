package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nb0 {
    private nb0() {
    }

    public static pb0 a(nb0 nb0Var, String listId, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        g4c.i iVar = (i & 4) != 0 ? null : g4c.i.f140477a;
        nb0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        ob0 ob0Var = ob0.DP_24;
        int i2 = R$attr.uikit_dp12;
        int i3 = R$attr.uikit_dp18;
        int i5 = R$attr.uikit_dp16;
        return new pb0(listId, ob0Var, false, z3, iVar, i2, i3, i5, i5, 17344);
    }

    public static pb0 b(nb0 nb0Var, String listId, boolean z, int i, boolean z3, int i2) {
        boolean z4 = (i2 & 2) != 0 ? true : z;
        int i3 = (i2 & 4) != 0 ? R$attr.uikit_dp18 : i;
        boolean z6 = (i2 & 8) != 0 ? true : z3;
        String str = (i2 & 16) != 0 ? null : "PAGINATION_LOADING_ROW_LIST_ID";
        nb0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        ob0 ob0Var = ob0.DP_40;
        int i5 = R$attr.uikit_dp16;
        return new pb0(listId, ob0Var, z4, z6, str, i3, i3, i5, i5, 17344);
    }
}
