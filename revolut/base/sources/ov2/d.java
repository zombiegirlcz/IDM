package ov2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t61.g f229956a;

    public d(t61.g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f229956a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f229956a, ((d) obj2).f229956a);
    }

    public final int hashCode() {
        return this.f229956a.hashCode();
    }
}
