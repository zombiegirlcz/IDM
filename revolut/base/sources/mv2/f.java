package mv2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t61.g f209099a;

    public f(t61.g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f209099a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f209099a, ((f) obj2).f209099a);
    }

    public final int hashCode() {
        return this.f209099a.hashCode();
    }
}
