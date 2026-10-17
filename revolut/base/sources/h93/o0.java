package h93;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150159a;

    public o0(List transactionIds) {
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f150159a = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f150159a, ((o0) obj2).f150159a);
    }

    public final int hashCode() {
        return this.f150159a.hashCode();
    }
}
