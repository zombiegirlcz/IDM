package h5a;

import c5a.n;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.kompot.common.ParcelableDestination;
import dy0.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static ParcelableDestination a(n mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = c.f149520a[mode.ordinal()];
        if (i == 1) {
            return new MainContainerScreenDestination.Slide(o.LEFT, false);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return u0.b(vhi.c.c(new TransferDestination.NewTransfer(com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a, (g3a.e) null, 6), yhi.b.POPUP, null, false, 12));
    }
}
