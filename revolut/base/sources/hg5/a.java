package hg5;

import aii.u;
import com.revolut.feature.crypto.features.api.navigation.CryptoFeaturesDestination;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesController;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesControllerContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoFeaturesDestination) {
            return new CryptoFeaturesController(new CryptoFeaturesControllerContract$InputData(((CryptoFeaturesDestination) destination).f70849a));
        }
        return null;
    }
}
