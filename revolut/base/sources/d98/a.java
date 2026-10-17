package d98;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112354b;

    public a(String requestId, String cardId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f112353a = requestId;
        this.f112354b = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f112353a, aVar.f112353a) && Intrinsics.f(this.f112354b, aVar.f112354b);
    }

    public final int hashCode() {
        return this.f112354b.hashCode() + (this.f112353a.hashCode() * 31);
    }
}
