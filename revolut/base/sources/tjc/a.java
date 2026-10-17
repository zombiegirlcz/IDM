package tjc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271626a;

    public a(String subscriptionUrl) {
        Intrinsics.checkNotNullParameter(subscriptionUrl, "subscriptionUrl");
        this.f271626a = subscriptionUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f271626a, ((a) obj2).f271626a);
    }

    public final int hashCode() {
        return this.f271626a.hashCode();
    }
}
