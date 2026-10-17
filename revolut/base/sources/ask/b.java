package ask;

import com.revolut.retail.feature.stockdetails.impl.navigation.destinations.EditKeyStatsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreenContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static EditKeyStatsScreen a(EditKeyStatsDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new EditKeyStatsScreen(new EditKeyStatsScreenContract$Input(destination.f103782b.f103783a));
    }
}
