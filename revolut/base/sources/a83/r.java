package a83;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f2081a;

    public r(h93.f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f2081a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f2081a, ((r) obj2).f2081a);
    }

    public final int hashCode() {
        return this.f2081a.hashCode();
    }
}
