package fc2;

import aii.u;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$Destination;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$InputData;
import com.revolut.feature.apm.qvik.impl.ui.QvikFlow;
import com.revolut.feature.apm.qvik.impl.ui.app_selector.QvikAppSelectorFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof cc2.b)) {
            return null;
        }
        cc2.b bVar = (cc2.b) descriptor;
        return bVar.a(new QvikAppSelectorFlow(bVar.f22921a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof QvikNavigation$Destination) {
            return new QvikFlow((QvikNavigation$InputData) ((QvikNavigation$Destination) destination).f98300a);
        }
        return null;
    }
}
