package k4a;

import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v {
    public static WrapperFlowImpl a(v vVar, Set availableFilters, TransferDestinationParcel transferDestinationParcel, g3a.e entryPoint, int i) {
        if ((i & 2) != 0) {
            transferDestinationParcel = null;
        }
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            entryPoint = g3a.e.PAYMENTS;
        }
        vVar.getClass();
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return gc0.c.b(new NewTransferScreen(new NewTransferScreenContract$InputData(availableFilters, transferDestinationParcel, z, entryPoint)), new aab.b(17));
    }
}
