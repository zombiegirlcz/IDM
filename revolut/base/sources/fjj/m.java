package fjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135663a;

    public m(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f135663a = subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f135663a, ((m) obj2).f135663a);
    }

    public final int hashCode() {
        return this.f135663a.hashCode();
    }
}
