package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        TextInputItem targetItem = (TextInputItem) inputItem;
        g1 updatedValue = (g1) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (updatedValue instanceof d1) {
            return TextInputItem.d(targetItem, null, ((d1) updatedValue).f2727a, null, false, 131007);
        }
        if (!(updatedValue instanceof e1)) {
            if (updatedValue instanceof f1) {
                return TextInputItem.d(targetItem, null, false, ((f1) updatedValue).f2731a, false, 122879);
            }
            throw new NoWhenBranchMatchedException();
        }
        e1 e1Var = (e1) updatedValue;
        String str = e1Var.f2728a;
        if (str.length() <= 0) {
            str = null;
        }
        return TextInputItem.d(targetItem, str, e1Var.f2729b, null, targetItem.k == null || e1Var.f2730c, 114615);
    }
}
