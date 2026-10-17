package fce;

import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringSplit f133708a;

    public j(RecurringSplit split) {
        Intrinsics.checkNotNullParameter(split, "split");
        this.f133708a = split;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f133708a, ((j) obj2).f133708a);
    }

    public final int hashCode() {
        return this.f133708a.hashCode();
    }
}
