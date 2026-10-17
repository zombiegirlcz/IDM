package hee;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151697a;

    public m(List transactionIds) {
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f151697a = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f151697a, ((m) obj2).f151697a);
    }

    public final int hashCode() {
        return this.f151697a.hashCode();
    }
}
