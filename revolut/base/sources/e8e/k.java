package e8e;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6e.c f123637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f123638b;

    public k(h6e.c card, Set billsIds) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(billsIds, "billsIds");
        this.f123637a = card;
        this.f123638b = billsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f123637a, kVar.f123637a) && Intrinsics.f(this.f123638b, kVar.f123638b);
    }

    public final int hashCode() {
        return this.f123638b.hashCode() + (this.f123637a.f149628a.hashCode() * 31);
    }
}
