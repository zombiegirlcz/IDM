package uy9;

import aii.e;
import aii.g;
import com.revolut.feature.payments.send_from_clipboard.api.SendFromClipboardApi$Toggles$TransferFromClipboard;
import com.revolut.feature.payments.send_from_clipboard.api.navigation.SendFromClipboardNavigation$InputData;
import com.revolut.feature.payments.send_from_clipboard.impl.flow.SendFromClipboardFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof sy9.a)) {
            return null;
        }
        sy9.a aVar = (sy9.a) descriptor;
        return aVar.a(new SendFromClipboardFlow(new SendFromClipboardNavigation$InputData(aVar.f266641a)));
    }

    @Override // nte.a
    public final List e() {
        return u.c(SendFromClipboardApi$Toggles$TransferFromClipboard.f79687c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
