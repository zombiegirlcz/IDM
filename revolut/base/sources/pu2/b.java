package pu2;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f239805a;

    public b(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f239805a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f239805a, ((b) obj2).f239805a);
    }

    public final int hashCode() {
        return this.f239805a.hashCode();
    }
}
