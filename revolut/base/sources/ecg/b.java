package ecg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f124728a;

    public b(dj0.d total) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f124728a = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f124728a, ((b) obj2).f124728a);
    }

    public final int hashCode() {
        return this.f124728a.hashCode();
    }
}
