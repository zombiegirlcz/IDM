package iw8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168995a;

    public i(String closingUrl) {
        Intrinsics.checkNotNullParameter(closingUrl, "closingUrl");
        this.f168995a = closingUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f168995a, ((i) obj2).f168995a);
    }

    public final int hashCode() {
        return this.f168995a.hashCode();
    }
}
