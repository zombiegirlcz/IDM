package o63;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f222491a;

    public b(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f222491a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f222491a, ((b) obj2).f222491a);
    }

    public final int hashCode() {
        return this.f222491a.hashCode();
    }
}
