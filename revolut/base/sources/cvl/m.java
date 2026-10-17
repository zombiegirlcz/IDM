package cvl;

import com.revolut.feature.trading_orders.common.models.SourcePocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SourcePocket f109497a;

    public m(SourcePocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f109497a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f109497a, ((m) obj2).f109497a);
    }

    public final int hashCode() {
        return this.f109497a.hashCode();
    }
}
