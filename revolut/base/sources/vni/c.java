package vni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290815a;

    public c(String otpCode) {
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        this.f290815a = otpCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f290815a, ((c) obj2).f290815a);
    }

    public final int hashCode() {
        return this.f290815a.hashCode();
    }
}
