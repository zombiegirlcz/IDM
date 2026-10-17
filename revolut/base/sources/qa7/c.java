package qa7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243972a;

    public c(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f243972a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f243972a, ((c) obj2).f243972a);
    }

    public final int hashCode() {
        return this.f243972a.hashCode();
    }
}
