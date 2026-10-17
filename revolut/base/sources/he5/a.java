package he5;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.crypto.currency_pair.picker.api.navigation.destinations.CryptoCurrencyPairPickerDestination;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import ee5.b;
import je5.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof b) {
            b bVar = (b) descriptor;
            return bVar.a(new CryptoCurrencyPairPickerScreen(new h(bVar.f125076a)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoCurrencyPairPickerDestination) {
            return new CryptoCurrencyPairPickerScreen(new h(((CryptoCurrencyPairPickerDestination) destination).f70782a));
        }
        return null;
    }
}
