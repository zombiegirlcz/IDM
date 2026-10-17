package rk3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254733a;

    public f(String otpCode) {
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        this.f254733a = otpCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f254733a, ((f) obj2).f254733a);
    }

    public final int hashCode() {
        return this.f254733a.hashCode();
    }
}
