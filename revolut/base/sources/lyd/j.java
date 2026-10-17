package lyd;

import kotlin.jvm.internal.Intrinsics;
import wxd.z;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    private j() {
    }

    public static k a(wxd.f customisation) {
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        return customisation.f300859b.contains(z.ACCOUNTS_FILTER) ? k.FILTER : k.PERIOD_RANGE;
    }
}
