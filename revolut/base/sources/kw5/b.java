package kw5;

import aii.u;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerDestination;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoTradeDestination;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlow;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoSortingPickerScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof dw5.c) {
            return ((dw5.c) descriptor).a(new CryptoTradeFlow(new CryptoTradeFlowContract$InputData(null)));
        }
        if (!(descriptor instanceof dw5.a)) {
            return null;
        }
        dw5.a aVar = (dw5.a) descriptor;
        return aVar.a(new CryptoSortingPickerScreen(aVar.f120334a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoTradeDestination) {
            return new CryptoTradeFlow(new CryptoTradeFlowContract$InputData(((CryptoTradeDestination) destination).f71516a));
        }
        if (destination instanceof CryptoSortingPickerDestination) {
            return new CryptoSortingPickerScreen(((CryptoSortingPickerDestination) destination).f71511b);
        }
        return null;
    }
}
