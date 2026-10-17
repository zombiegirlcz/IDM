package gcj;

import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.ReturnCryptoDepositFlowContract$Step;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f142493a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ReturnCryptoDepositFlowContract$Step step = (ReturnCryptoDepositFlowContract$Step) obj2;
        Intrinsics.checkNotNullParameter(step, "step");
        return Boolean.valueOf(step instanceof ReturnCryptoDepositFlowContract$Step.AddressList);
    }
}
