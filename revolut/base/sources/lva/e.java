package lva;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200351a;

    public e(String recurringBuyId) {
        Intrinsics.checkNotNullParameter(recurringBuyId, "recurringBuyId");
        this.f200351a = recurringBuyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f200351a, ((e) obj2).f200351a);
    }

    public final int hashCode() {
        return this.f200351a.hashCode();
    }
}
