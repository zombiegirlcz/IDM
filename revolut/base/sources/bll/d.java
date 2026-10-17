package bll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16742b;

    public d(String cardNumber, String cardPIN) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(cardPIN, "cardPIN");
        this.f16741a = cardNumber;
        this.f16742b = cardPIN;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f16741a, dVar.f16741a) && Intrinsics.f(this.f16742b, dVar.f16742b);
    }

    public final int hashCode() {
        return this.f16742b.hashCode() + (this.f16741a.hashCode() * 31);
    }
}
