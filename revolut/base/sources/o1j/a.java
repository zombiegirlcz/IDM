package o1j;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreen;
import com.revolut.retail.feature.balance.picker.impl.new_picker.currency.CurrencyChooserScreen;
import kotlin.jvm.internal.Intrinsics;
import l1j.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof g1j.a) {
            g1j.a aVar = (g1j.a) descriptor;
            return aVar.a(new BalancePickerScreen(aVar.f139684a, aVar.f139685b));
        }
        if (!(descriptor instanceof c)) {
            return null;
        }
        c cVar = (c) descriptor;
        return cVar.a(new CurrencyChooserScreen(cVar.f191548a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
