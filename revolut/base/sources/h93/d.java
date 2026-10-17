package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150105b;

    public d(String cardId, String imageUrl) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f150104a = cardId;
        this.f150105b = imageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f150104a, dVar.f150104a) && Intrinsics.f(this.f150105b, dVar.f150105b);
    }

    public final int hashCode() {
        return this.f150105b.hashCode() + (this.f150104a.hashCode() * 31);
    }
}
