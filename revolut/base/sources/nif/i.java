package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215856a;

    public i(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f215856a = provider;
    }

    public final String a() {
        return this.f215856a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f215856a, ((i) obj2).f215856a);
    }

    public final int hashCode() {
        return this.f215856a.hashCode();
    }
}
