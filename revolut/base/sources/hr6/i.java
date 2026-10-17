package hr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154781a;

    public i(String taxProfileId) {
        Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
        this.f154781a = taxProfileId;
    }

    public final String b() {
        return this.f154781a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f154781a, ((i) obj2).f154781a);
    }

    public final int hashCode() {
        return this.f154781a.hashCode();
    }
}
