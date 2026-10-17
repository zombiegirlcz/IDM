package f97;

import aii.u;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$CryptoRevolutStablecoins;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$GlobalSearchMergeCrypto;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$GlobalSearchRecentQueries;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$SmartTileExchangeResolveFromCode;
import com.revolut.feature.globalsearch.api.navigation.GlobalSearchScreenDestination;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(GlobalSearchApi$Toggles$CryptoRevolutStablecoins.f74613c, GlobalSearchApi$Toggles$GlobalSearchMergeCrypto.f74614c, GlobalSearchApi$Toggles$GlobalSearchRecentQueries.f74615c, GlobalSearchApi$Toggles$SmartTileExchangeResolveFromCode.f74616c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof GlobalSearchScreenDestination) {
            return new GlobalSearchScreen(((GlobalSearchScreenDestination) destination).f74617b);
        }
        return null;
    }
}
