package f2j;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreen;
import kotlin.jvm.internal.Intrinsics;
import l1j.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof d)) {
            return null;
        }
        d dVar = (d) descriptor;
        return dVar.a(new DualChooserScreen(dVar.c(), dVar.b()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CurrencyChooserFlowDestination) {
            return new CurrencyChooserFlow((CurrencyChooserFlowDestination.InputData) ((CurrencyChooserFlowDestination) destination).f98300a);
        }
        return null;
    }
}
