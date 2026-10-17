package hx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156368a;

    public j(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f156368a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f156368a, ((j) obj2).f156368a);
    }

    public final int hashCode() {
        return this.f156368a.hashCode();
    }
}
