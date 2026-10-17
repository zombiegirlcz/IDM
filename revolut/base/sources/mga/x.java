package mga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205222a;

    public x(String transactionGroupId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f205222a = transactionGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f205222a, ((x) obj2).f205222a);
    }

    public final int hashCode() {
        return this.f205222a.hashCode();
    }
}
