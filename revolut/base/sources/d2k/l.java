package d2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f110884a;

    public l(h country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f110884a = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f110884a, ((l) obj2).f110884a);
    }

    public final int hashCode() {
        return this.f110884a.hashCode();
    }
}
