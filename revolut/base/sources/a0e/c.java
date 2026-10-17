package a0e;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static Set a(Set requestedIds, Set displayedIds) {
        Intrinsics.checkNotNullParameter(requestedIds, "requestedIds");
        Intrinsics.checkNotNullParameter(displayedIds, "displayedIds");
        Set setH0 = d0.h0(requestedIds, displayedIds);
        if (!setH0.isEmpty()) {
            displayedIds = setH0;
        }
        return displayedIds;
    }
}
