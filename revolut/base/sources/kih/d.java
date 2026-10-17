package kih;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f184236a;

    public d(xi0.b selectedCurrency) {
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        this.f184236a = selectedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f184236a, ((d) obj2).f184236a);
    }

    public final int hashCode() {
        return this.f184236a.hashCode();
    }
}
