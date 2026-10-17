package ood;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227063a;

    public o(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f227063a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f227063a, ((o) obj2).f227063a);
    }

    public final int hashCode() {
        return this.f227063a.hashCode();
    }
}
