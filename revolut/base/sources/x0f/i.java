package x0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t61.g f301589a;

    public i(t61.g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f301589a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f301589a, ((i) obj2).f301589a);
    }

    public final int hashCode() {
        return this.f301589a.hashCode();
    }
}
