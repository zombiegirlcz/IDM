package pbj;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.crypto_deposits.api.CryptoDepositsApi$Toggles$DirectDeposits;
import com.revolut.retail.feature.crypto_deposits.api.CryptoDepositsApi$Toggles$DirectDepositsGenericEntryPoint;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.ReturnCryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.impl.ui.bottom_sheet.return_details.CryptoDepositReturnDetailsBottomSheetController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.CryptoDepositFlow;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.ReturnCryptoDepositFlow;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.ReturnCryptoDepositFlowContract$Input;
import hbj.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof hbj.a) {
            hbj.a aVar = (hbj.a) descriptor;
            return aVar.a(new CryptoDepositFlow(aVar.f150753a));
        }
        if (!(descriptor instanceof c)) {
            return null;
        }
        c cVar = (c) descriptor;
        return cVar.a(new CryptoDepositReturnDetailsBottomSheetController(cVar.f150754a));
    }

    @Override // nte.a
    public final List e() {
        return v.k(CryptoDepositsApi$Toggles$DirectDeposits.f100033c, CryptoDepositsApi$Toggles$DirectDepositsGenericEntryPoint.f100034c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoDepositDestination) {
            return new CryptoDepositFlow(((CryptoDepositDestination) destination).f100040a);
        }
        if (destination instanceof ReturnCryptoDepositDestination) {
            return new ReturnCryptoDepositFlow(new ReturnCryptoDepositFlowContract$Input(((ReturnCryptoDepositDestination) destination).f100050a));
        }
        return null;
    }
}
