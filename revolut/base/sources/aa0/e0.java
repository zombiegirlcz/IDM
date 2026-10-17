package aa0;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        PhoneInputItem targetItem = (PhoneInputItem) inputItem;
        y0 updatedValue = (y0) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (updatedValue instanceof x0) {
            return PhoneInputItem.d(targetItem, 0, ((x0) updatedValue).f2749a, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
        }
        if (!(updatedValue instanceof w0)) {
            throw new NoWhenBranchMatchedException();
        }
        w0 w0Var = (w0) updatedValue;
        return PhoneInputItem.d(targetItem, w0Var.f2748b, null, w0Var.f2747a, 351);
    }
}
