package jn0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176645a;

    public b(String identityId) {
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        this.f176645a = identityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f176645a, ((b) obj2).f176645a);
    }

    public final int hashCode() {
        return this.f176645a.hashCode();
    }
}
