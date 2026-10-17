package qd9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244893b;

    public a(String cardId, String str) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f244892a = cardId;
        this.f244893b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f244892a, aVar.f244892a) && Intrinsics.f(this.f244893b, aVar.f244893b);
    }

    public final int hashCode() {
        int iHashCode = this.f244892a.hashCode() * 31;
        String str = this.f244893b;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
    }
}
