package zjc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322783a;

    public e(String subscriptionUrl) {
        Intrinsics.checkNotNullParameter(subscriptionUrl, "subscriptionUrl");
        this.f322783a = subscriptionUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f322783a, ((e) obj2).f322783a);
    }

    public final int hashCode() {
        return this.f322783a.hashCode();
    }
}
