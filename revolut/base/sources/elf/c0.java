package elf;

import com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends yji.n implements s0 {
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        TransactionCryptoRemittanceAction transactionCryptoRemittanceAction = obj2 instanceof TransactionCryptoRemittanceAction ? (TransactionCryptoRemittanceAction) obj2 : null;
        if (transactionCryptoRemittanceAction == null) {
            return Boolean.FALSE;
        }
        BlockchainExplorerTarget blockchainExplorerTarget = transactionCryptoRemittanceAction.f70931a;
        if (blockchainExplorerTarget instanceof BlockchainExplorerTarget.DirectUrl) {
            ulm.w0 w0Var = ulm.x0.Companion;
            String str2 = ((BlockchainExplorerTarget.DirectUrl) blockchainExplorerTarget).f70930a;
            w0Var.getClass();
            if (ulm.w0.d(str2) == null) {
                return Boolean.FALSE;
            }
        } else if (!(blockchainExplorerTarget instanceof BlockchainExplorerTarget.Config)) {
            throw new NoWhenBranchMatchedException();
        }
        yji.n.P2(this, o2(new rj5.a(transactionCryptoRemittanceAction)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Boolean.TRUE;
    }
}
