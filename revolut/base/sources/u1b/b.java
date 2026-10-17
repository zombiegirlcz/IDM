package u1b;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.retail.beneficiary.impl.cop.ConfirmationOfPayeeScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof f6d.e)) {
            return null;
        }
        f6d.e eVar = (f6d.e) descriptor;
        return eVar.a(new ConfirmationOfPayeeScreen(eVar.f132418a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
