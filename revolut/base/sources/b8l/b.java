package b8l;

import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegacyOrderQuoteParams f13290a;

    public b(LegacyOrderQuoteParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f13290a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f13290a, ((b) obj2).f13290a);
    }

    public final int hashCode() {
        return this.f13290a.hashCode();
    }
}
