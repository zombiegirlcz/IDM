package aq;

import aii.p;
import aii.u;
import com.revolut.appupdate.navigation.AppUpdateDestination;
import com.revolut.appupdate.ui.AppUpdateFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AppUpdateDestination) {
            return new AppUpdateFlow(((AppUpdateDestination) destination).getF50360a());
        }
        return null;
    }
}
