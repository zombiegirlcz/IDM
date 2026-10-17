package gs2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f146290a;

    public m(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f146290a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f146290a, ((m) obj2).f146290a);
    }

    public final int hashCode() {
        return this.f146290a.hashCode();
    }
}
