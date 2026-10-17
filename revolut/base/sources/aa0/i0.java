package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        SignatureInputItem targetItem = (SignatureInputItem) inputItem;
        g1 updatedValue = (g1) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (updatedValue instanceof d1) {
            return SignatureInputItem.d(targetItem, null, ((d1) updatedValue).f2727a, null, 895);
        }
        if (!(updatedValue instanceof e1)) {
            if (updatedValue instanceof f1) {
                return SignatureInputItem.d(targetItem, null, false, ((f1) updatedValue).f2731a, 511);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = ((e1) updatedValue).f2728a;
        if (str.length() <= 0) {
            str = null;
        }
        return SignatureInputItem.d(targetItem, str, true, null, 893);
    }
}
