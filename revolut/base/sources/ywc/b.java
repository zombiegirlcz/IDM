package ywc;

import kotlin.jvm.internal.Intrinsics;
import t61.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f317414a;

    public b(g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f317414a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f317414a, ((b) obj2).f317414a);
    }

    public final int hashCode() {
        return this.f317414a.hashCode();
    }
}
