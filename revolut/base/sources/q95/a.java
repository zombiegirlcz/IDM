package q95;

import com.revolut.feature.credit.overdraft.api.OverdraftApi$Toggles$OverdraftHomeScreen;
import com.revolut.feature.credit.overdraft.api.navigation.OverdraftDetailsDestination;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreenContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return u.c(OverdraftApi$Toggles$OverdraftHomeScreen.f70634c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof OverdraftDetailsDestination) {
            return new OverdraftDetailsScreen(new OverdraftDetailsScreenContract$InputData(((OverdraftDetailsDestination) destination).f70635a));
        }
        return null;
    }
}
