package t17;

import ip0.z;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f267202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f267203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f267204c;
    public final g d;

    public k(d chipsFilterProvider, h dateRangeFilterProvider, c amountFilterProvider, g currencyFilterProvider) {
        Intrinsics.checkNotNullParameter(chipsFilterProvider, "chipsFilterProvider");
        Intrinsics.checkNotNullParameter(dateRangeFilterProvider, "dateRangeFilterProvider");
        Intrinsics.checkNotNullParameter(amountFilterProvider, "amountFilterProvider");
        Intrinsics.checkNotNullParameter(currencyFilterProvider, "currencyFilterProvider");
        this.f267202a = chipsFilterProvider;
        this.f267203b = dateRangeFilterProvider;
        this.f267204c = amountFilterProvider;
        this.d = currencyFilterProvider;
    }

    public final z a(ArrayList allFilters, ArrayList selectedFilters, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(allFilters, "allFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return this.f267202a.a(allFilters, selectedFilters, groupId);
    }
}
