package c19;

import aii.u;
import com.revolut.feature.licenses.api.LicensesDestination;
import com.revolut.feature.licenses.impl.ui.licenses.LicensesController;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseController;
import com.revolut.feature.licenses.impl.ui.licenses.offline.declaration.OfflineLicenseDestination;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof LicensesDestination) {
            return new LicensesController();
        }
        if (destination instanceof OfflineLicenseDestination) {
            return new OfflineLicenseController(((OfflineLicenseDestination) destination).f78047b);
        }
        return null;
    }
}
