package s1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f259118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dj0.d perPersonAmount) {
        super("SPLIT_BILL_LINK_SPLIT_EQUALLY_BUTTON_TAG");
        Intrinsics.checkNotNullParameter(perPersonAmount, "perPersonAmount");
        this.f259118b = perPersonAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f259118b, ((c) obj2).f259118b);
    }

    public final int hashCode() {
        return this.f259118b.hashCode();
    }
}
