package w8b;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.retail.crypto.advanced_charts.impl.ui.currencies_selector.CryptoCurrenciesSelectorScreen;
import kotlin.jvm.internal.Intrinsics;
import z8b.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof t8b.b) {
            t8b.b bVar = (t8b.b) descriptor;
            return bVar.a(new CryptoCurrenciesSelectorScreen(new h(bVar.f268877a, bVar.f268878b)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
