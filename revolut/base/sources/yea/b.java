package yea;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f312832a;

    public b(xi0.b selectedCurrency) {
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        this.f312832a = selectedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f312832a, ((b) obj2).f312832a);
    }

    public final int hashCode() {
        return this.f312832a.hashCode();
    }
}
