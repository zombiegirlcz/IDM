package wc6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296348a;

    public c(String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.f296348a = region;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f296348a, ((c) obj2).f296348a);
    }

    public final int hashCode() {
        return this.f296348a.hashCode();
    }
}
