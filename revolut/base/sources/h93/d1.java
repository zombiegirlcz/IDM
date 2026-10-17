package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f150106a;

    public d1(c1 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f150106a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && Intrinsics.f(this.f150106a, ((d1) obj2).f150106a);
    }

    public final int hashCode() {
        return this.f150106a.hashCode();
    }
}
