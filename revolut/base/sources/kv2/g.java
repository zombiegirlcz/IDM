package kv2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189940b;

    public g(String cardId, String currency) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f189939a = cardId;
        this.f189940b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f189939a, gVar.f189939a) && Intrinsics.f(this.f189940b, gVar.f189940b);
    }

    public final int hashCode() {
        return this.f189940b.hashCode() + (this.f189939a.hashCode() * 31);
    }
}
