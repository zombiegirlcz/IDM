package v6l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286454a;

    public i0(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f286454a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f286454a, ((i0) obj2).f286454a);
    }

    public final int hashCode() {
        return this.f286454a.hashCode();
    }
}
