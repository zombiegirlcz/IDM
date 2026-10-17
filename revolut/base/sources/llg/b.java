package llg;

import aii.u;
import com.revolut.feature.us_send_checks.api.AddRecipientDestination;
import com.revolut.feature.us_send_checks.api.SendChecksApi$Toggles;
import com.revolut.feature.us_send_checks.impl.flow.SendChecksFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return SendChecksApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AddRecipientDestination) {
            return new SendChecksFlow();
        }
        return null;
    }
}
