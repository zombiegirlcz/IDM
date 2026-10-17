package d83;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112115b;

    public d(String cardId, String str) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f112114a = cardId;
        this.f112115b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f112114a, dVar.f112114a) && Intrinsics.f(this.f112115b, dVar.f112115b);
    }

    public final int hashCode() {
        int iHashCode = this.f112114a.hashCode() * 31;
        String str = this.f112115b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
