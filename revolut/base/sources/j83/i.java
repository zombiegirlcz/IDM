package j83;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172109a;

    public i(List transactionIds) {
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f172109a = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f172109a, ((i) obj2).f172109a);
    }

    public final int hashCode() {
        return this.f172109a.hashCode();
    }
}
