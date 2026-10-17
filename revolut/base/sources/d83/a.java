package d83;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112112b;

    public a(String cardId, String str) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f112111a = cardId;
        this.f112112b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f112111a, aVar.f112111a) && Intrinsics.f(this.f112112b, aVar.f112112b);
    }

    public final int hashCode() {
        int iHashCode = this.f112111a.hashCode() * 31;
        String str = this.f112112b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
