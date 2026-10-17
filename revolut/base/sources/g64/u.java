package g64;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f140867a;

    public u(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f140867a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f140867a, ((u) obj2).f140867a);
    }

    public final int hashCode() {
        return this.f140867a.hashCode();
    }
}
