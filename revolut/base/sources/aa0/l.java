package aa0;

import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        DateInputItem targetItem = (DateInputItem) inputItem;
        o0 updatedValue = (o0) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (updatedValue instanceof n0) {
            return DateInputItem.d(targetItem, null, ((n0) updatedValue).f2736a, 31);
        }
        if (updatedValue instanceof m0) {
            return DateInputItem.d(targetItem, ((m0) updatedValue).f2735a, false, 55);
        }
        throw new NoWhenBranchMatchedException();
    }
}
