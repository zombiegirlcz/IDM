package i0i;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof com.revolut.feature_crypto_picker.api.a)) {
            return null;
        }
        com.revolut.feature_crypto_picker.api.a aVar = (com.revolut.feature_crypto_picker.api.a) descriptor;
        return aVar.a(new CryptoPickerController(aVar.f96808a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoPickerDestination) {
            return new CryptoPickerController(((CryptoPickerDestination) destination).f96801a);
        }
        return null;
    }
}
