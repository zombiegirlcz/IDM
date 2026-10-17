package t17;

import ip0.z;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public d(p selectableFilterHeaderProvider, e chipsItemsProvider) {
        Intrinsics.checkNotNullParameter(selectableFilterHeaderProvider, "selectableFilterHeaderProvider");
        Intrinsics.checkNotNullParameter(chipsItemsProvider, "chipsItemsProvider");
    }

    public final z a(ArrayList allFilters, ArrayList selectedFilters, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(allFilters, "allFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return e.a(groupId, allFilters, selectedFilters);
    }
}
