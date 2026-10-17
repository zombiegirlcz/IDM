package ood;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227061a;

    public n(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f227061a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f227061a, ((n) obj2).f227061a);
    }

    public final int hashCode() {
        return this.f227061a.hashCode();
    }
}
