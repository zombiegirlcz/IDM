package m73;

import aii.r;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f203299a;

    public a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f203299a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f203299a, ((a) obj2).f203299a);
    }

    public final int hashCode() {
        return this.f203299a.hashCode();
    }
}
