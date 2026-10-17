package g3a;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g {
    public static final TransferFlowType a(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = f.f140245a[eVar.ordinal()];
        if (i == 1) {
            return TransferFlowType.Crypto.f92256b;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return TransferFlowType.Default.f92257b;
    }
}
