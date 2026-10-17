package au2;

import aii.u;
import com.revolut.feature.call_security_info.api.navigation.CallDetectionDestination;
import com.revolut.feature.call_security_info.impl.ui.call_detection.CallDetectionScreen;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CallDetectionDestination) {
            return new CallDetectionScreen();
        }
        return null;
    }
}
