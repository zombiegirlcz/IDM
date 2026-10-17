package x33;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketWithSubaccount f302630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f302631b;

    public a(PocketWithSubaccount pocketWithSubaccount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        this.f302630a = pocketWithSubaccount;
        this.f302631b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f302630a, aVar.f302630a) && Intrinsics.f(this.f302631b, aVar.f302631b);
    }

    public final int hashCode() {
        int iHashCode = this.f302630a.hashCode() * 31;
        dj0.d dVar = this.f302631b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
