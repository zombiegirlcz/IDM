package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f150158b;

    public o(String cardId, n contactlessCounter) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(contactlessCounter, "contactlessCounter");
        this.f150157a = cardId;
        this.f150158b = contactlessCounter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f150157a, oVar.f150157a) && Intrinsics.f(this.f150158b, oVar.f150158b);
    }

    public final int hashCode() {
        return this.f150158b.hashCode() + (this.f150157a.hashCode() * 31);
    }
}
