package yz2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318024a;

    public d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f318024a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f318024a, ((d) obj2).f318024a);
    }

    public final int hashCode() {
        return this.f318024a.hashCode();
    }
}
