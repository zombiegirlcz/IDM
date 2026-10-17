package jc6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172718b;

    public k(String charityName, String shareLink) {
        Intrinsics.checkNotNullParameter(charityName, "charityName");
        Intrinsics.checkNotNullParameter(shareLink, "shareLink");
        this.f172717a = charityName;
        this.f172718b = shareLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f172717a, kVar.f172717a) && Intrinsics.f(this.f172718b, kVar.f172718b);
    }

    public final int hashCode() {
        return this.f172718b.hashCode() + (this.f172717a.hashCode() * 31);
    }
}
