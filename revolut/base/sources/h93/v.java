package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f150166c;

    public v(String cardId, String tokenUniqueReference, q0 tokenRequestor) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        Intrinsics.checkNotNullParameter(tokenRequestor, "tokenRequestor");
        this.f150164a = cardId;
        this.f150165b = tokenUniqueReference;
        this.f150166c = tokenRequestor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f150164a, vVar.f150164a) && Intrinsics.f(this.f150165b, vVar.f150165b) && this.f150166c == vVar.f150166c;
    }

    public final int hashCode() {
        return this.f150166c.hashCode() + p.a.c(this.f150164a.hashCode() * 31, 31, this.f150165b);
    }
}
