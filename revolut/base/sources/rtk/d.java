package rtk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257302a;

    public d(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f257302a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f257302a, ((d) obj2).f257302a);
    }

    public final int hashCode() {
        return this.f257302a.hashCode();
    }
}
