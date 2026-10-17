package is2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168085a;

    public h(String transactionGroupId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f168085a = transactionGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f168085a, ((h) obj2).f168085a);
    }

    public final int hashCode() {
        return this.f168085a.hashCode();
    }
}
