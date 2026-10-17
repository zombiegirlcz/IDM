package fxc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t61.g f138797a;

    public k(t61.g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f138797a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f138797a, ((k) obj2).f138797a);
    }

    public final int hashCode() {
        return this.f138797a.hashCode();
    }
}
