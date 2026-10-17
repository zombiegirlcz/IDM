package lhb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dda.d f195233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195234b;

    public c(dda.d accountDetails, String userLegalName) {
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        Intrinsics.checkNotNullParameter(userLegalName, "userLegalName");
        this.f195233a = accountDetails;
        this.f195234b = userLegalName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f195233a, cVar.f195233a) && Intrinsics.f(this.f195234b, cVar.f195234b);
    }

    public final int hashCode() {
        return this.f195234b.hashCode() + (this.f195233a.hashCode() * 31);
    }
}
