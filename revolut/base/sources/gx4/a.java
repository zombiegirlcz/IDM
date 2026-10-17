package gx4;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.credit.core.ui.info.CreditInfoController;
import fy4.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof s)) {
            return null;
        }
        s sVar = (s) descriptor;
        return sVar.a(new CreditInfoController(sVar.f138907a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
