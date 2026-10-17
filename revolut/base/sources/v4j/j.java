package v4j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f286116a;

    public j(wi0.b preselectedCountry) {
        Intrinsics.checkNotNullParameter(preselectedCountry, "preselectedCountry");
        this.f286116a = preselectedCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f286116a, ((j) obj2).f286116a);
    }

    public final int hashCode() {
        return this.f286116a.f297794a.hashCode();
    }
}
