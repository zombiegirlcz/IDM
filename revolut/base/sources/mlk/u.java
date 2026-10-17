package mlk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f207025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f207026b;

    public u(h93.f0 card, int i) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f207025a = card;
        this.f207026b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f207025a, uVar.f207025a) && this.f207026b == uVar.f207026b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207026b) + (this.f207025a.hashCode() * 31);
    }
}
