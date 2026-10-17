package snf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.q f264586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f264587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f264588c;
    public final g0 d;
    public final na7.a e;

    public i0(k71.q transactionsExtraData, Set juniorVaults, Set delistedVisiblePockets, g0 countryProfilesData, na7.a hiddenAccountData) {
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(juniorVaults, "juniorVaults");
        Intrinsics.checkNotNullParameter(delistedVisiblePockets, "delistedVisiblePockets");
        Intrinsics.checkNotNullParameter(countryProfilesData, "countryProfilesData");
        Intrinsics.checkNotNullParameter(hiddenAccountData, "hiddenAccountData");
        this.f264586a = transactionsExtraData;
        this.f264587b = juniorVaults;
        this.f264588c = delistedVisiblePockets;
        this.d = countryProfilesData;
        this.e = hiddenAccountData;
    }
}
