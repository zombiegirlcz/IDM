package e8e;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6e.b f123635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f123636b;

    public j(h6e.b card, Set billsIds) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(billsIds, "billsIds");
        this.f123635a = card;
        this.f123636b = billsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f123635a, jVar.f123635a) && Intrinsics.f(this.f123636b, jVar.f123636b);
    }

    public final int hashCode() {
        return this.f123636b.hashCode() + (this.f123635a.hashCode() * 31);
    }
}
