package kwa;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190315b;

    public b(String referrerName, String referralCode) {
        Intrinsics.checkNotNullParameter(referrerName, "referrerName");
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        this.f190314a = referrerName;
        this.f190315b = referralCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f190314a, bVar.f190314a) && Intrinsics.f(this.f190315b, bVar.f190315b);
    }

    public final int hashCode() {
        return this.f190315b.hashCode() + (this.f190314a.hashCode() * 31);
    }
}
