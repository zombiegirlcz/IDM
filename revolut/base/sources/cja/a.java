package cja;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlow;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof kja.a)) {
            return null;
        }
        kja.a aVar = (kja.a) descriptor;
        return aVar.a(new ProductLifecycleFlow(new ProductLifecycleFlowContract$InputData("ACCOUNT", "PERSONAL", null, aVar.f184344a, aVar.f184345b, aVar.f184346c)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
