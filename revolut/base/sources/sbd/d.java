package sbd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261574b;

    public d(String accountId, String currentUserId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        this.f261573a = accountId;
        this.f261574b = currentUserId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261573a, dVar.f261573a) && Intrinsics.f(this.f261574b, dVar.f261574b);
    }

    public final int hashCode() {
        return this.f261574b.hashCode() + (this.f261573a.hashCode() * 31);
    }
}
