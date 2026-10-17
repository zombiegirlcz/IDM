package d6l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111629b;

    public c(String requestId, String cardId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f111628a = requestId;
        this.f111629b = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f111628a, cVar.f111628a) && Intrinsics.f(this.f111629b, cVar.f111629b);
    }

    public final int hashCode() {
        return this.f111629b.hashCode() + (this.f111628a.hashCode() * 31);
    }
}
