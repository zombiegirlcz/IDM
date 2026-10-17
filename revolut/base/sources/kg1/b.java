package kg1;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f183898a;

    public b(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f183898a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f183898a, ((b) obj2).f183898a);
    }

    public final int hashCode() {
        return this.f183898a.hashCode();
    }
}
