package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f190877b;

    public y(dj0.d dVar, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f190876a = currency;
        this.f190877b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f190876a, yVar.f190876a) && Intrinsics.f(this.f190877b, yVar.f190877b);
    }

    public final int hashCode() {
        int iHashCode = this.f190876a.hashCode() * 31;
        dj0.d dVar = this.f190877b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
