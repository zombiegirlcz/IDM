package qei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f245172b;

    public h(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f245171a = cardId;
        this.f245172b = i.CARD;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f245171a, ((h) obj2).f245171a);
    }

    public final int hashCode() {
        return this.f245171a.hashCode();
    }
}
