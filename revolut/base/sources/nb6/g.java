package nb6;

import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharityTransactionsParams f213994a;

    public g(CharityTransactionsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f213994a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f213994a, ((g) obj2).f213994a);
    }

    public final int hashCode() {
        return this.f213994a.hashCode();
    }
}
