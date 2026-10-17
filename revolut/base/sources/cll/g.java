package cll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25057a;

    public g(String cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        this.f25057a = cardNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f25057a, ((g) obj2).f25057a);
    }

    public final int hashCode() {
        return this.f25057a.hashCode();
    }
}
