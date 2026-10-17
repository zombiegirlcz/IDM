package beh;

import aii.e;
import com.revolut.feature.wealth.mutual_funds.api.ui.details.MutualFundDetailsContract$MutualFundDetailsScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutualFundDetailsContract$MutualFundDetailsScreenConfig f14852a;

    public a(MutualFundDetailsContract$MutualFundDetailsScreenConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14852a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f14852a, ((a) obj2).f14852a);
    }

    public final int hashCode() {
        return this.f14852a.hashCode();
    }
}
