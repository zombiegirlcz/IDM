package ggd;

import aii.u;
import com.revolut.feature.shared_separate_favourites.api.converter.navigation.SharedConverterDestination;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.SharedConverterFlow;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.SharedConverterFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SharedConverterDestination) {
            return new SharedConverterFlow(new SharedConverterFlowContract$InputData(((SharedConverterDestination) destination).f86787b));
        }
        return null;
    }
}
