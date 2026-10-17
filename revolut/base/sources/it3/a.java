package it3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f168321a;

    public a(i creditProductEligibility) {
        Intrinsics.checkNotNullParameter(creditProductEligibility, "creditProductEligibility");
        this.f168321a = creditProductEligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f168321a, ((a) obj2).f168321a);
    }

    public final int hashCode() {
        return this.f168321a.hashCode();
    }
}
