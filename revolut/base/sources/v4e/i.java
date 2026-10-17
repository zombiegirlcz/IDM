package v4e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286053a;

    public i(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f286053a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f286053a, ((i) obj2).f286053a);
    }

    public final int hashCode() {
        return this.f286053a.hashCode();
    }
}
