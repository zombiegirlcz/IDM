package jl5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f175594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175595b;

    public b(int i, xi0.b selectedCurrency) {
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        this.f175594a = selectedCurrency;
        this.f175595b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f175594a, bVar.f175594a) && this.f175595b == bVar.f175595b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175595b) + (this.f175594a.hashCode() * 31);
    }
}
