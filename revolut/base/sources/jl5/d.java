package jl5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f175597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175598b;

    public d(int i, xi0.b selectedCurrency) {
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        this.f175597a = selectedCurrency;
        this.f175598b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f175597a, dVar.f175597a) && this.f175598b == dVar.f175598b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175598b) + (this.f175597a.hashCode() * 31);
    }
}
