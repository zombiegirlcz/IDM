package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151868a;

    public n(String iataCode) {
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        this.f151868a = iataCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f151868a, ((n) obj2).f151868a);
    }

    public final int hashCode() {
        return this.f151868a.hashCode();
    }
}
