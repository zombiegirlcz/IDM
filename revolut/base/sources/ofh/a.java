package ofh;

import aii.e;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$FundDetailsScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundDetailsContract$FundDetailsScreenConfig f224856a;

    public a(FundDetailsContract$FundDetailsScreenConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f224856a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f224856a, ((a) obj2).f224856a);
    }

    public final int hashCode() {
        return this.f224856a.f95732a.hashCode();
    }
}
