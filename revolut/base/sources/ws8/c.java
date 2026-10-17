package ws8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299680a;

    public c(String providerClosingUri) {
        Intrinsics.checkNotNullParameter(providerClosingUri, "providerClosingUri");
        this.f299680a = providerClosingUri;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f299680a, ((c) obj2).f299680a);
    }

    public final int hashCode() {
        return this.f299680a.hashCode();
    }
}
