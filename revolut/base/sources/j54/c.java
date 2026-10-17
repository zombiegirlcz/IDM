package j54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.i f171497a;

    public c(it3.i creditProductEligibility) {
        Intrinsics.checkNotNullParameter(creditProductEligibility, "creditProductEligibility");
        this.f171497a = creditProductEligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f171497a, ((c) obj2).f171497a);
    }

    public final int hashCode() {
        return this.f171497a.hashCode();
    }
}
