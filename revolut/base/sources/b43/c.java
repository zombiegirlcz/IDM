package b43;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import h93.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketWithSubaccount f12160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f12161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12162c;
    public final boolean d;

    public c(PocketWithSubaccount pocketWithSubaccount, f0 card, List cardSubscriptions, boolean z) {
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardSubscriptions, "cardSubscriptions");
        this.f12160a = pocketWithSubaccount;
        this.f12161b = card;
        this.f12162c = cardSubscriptions;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f12160a, cVar.f12160a) && Intrinsics.f(this.f12161b, cVar.f12161b) && Intrinsics.f(this.f12162c, cVar.f12162c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d((this.f12161b.hashCode() + (this.f12160a.hashCode() * 31)) * 31, 31, this.f12162c);
    }
}
