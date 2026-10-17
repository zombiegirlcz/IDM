package jua;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.recurring_buys.schedule.impl.ui.RecurringSettingsController;
import iua.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof c)) {
            return null;
        }
        c cVar = (c) descriptor;
        return cVar.a(new RecurringSettingsController(cVar.f168543a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
