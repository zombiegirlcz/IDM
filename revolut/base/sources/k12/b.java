package k12;

import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final ApmProduct a(ApmTransferRecipient apmTransferRecipient) {
        Intrinsics.checkNotNullParameter(apmTransferRecipient, "<this>");
        if (apmTransferRecipient instanceof ApmTransferRecipient.Contact) {
            return c8g.a.o(((ApmTransferRecipient.Contact) apmTransferRecipient).f62299a);
        }
        if (apmTransferRecipient instanceof ApmTransferRecipient.OpenRequest) {
            return ((ApmTransferRecipient.OpenRequest) apmTransferRecipient).f62301b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
