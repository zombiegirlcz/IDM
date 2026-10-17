package hpg;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketWithSubaccount f154524a;

    public d(PocketWithSubaccount pocketWithSubaccount) {
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        this.f154524a = pocketWithSubaccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f154524a, ((d) obj2).f154524a);
    }

    public final int hashCode() {
        return this.f154524a.hashCode();
    }
}
