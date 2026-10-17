package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f321959b;

    public c0(String reference, y selectedRange) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(selectedRange, "selectedRange");
        this.f321958a = reference;
        this.f321959b = selectedRange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f321958a, c0Var.f321958a) && Intrinsics.f(this.f321959b, c0Var.f321959b);
    }

    public final int hashCode() {
        return this.f321959b.hashCode() + (this.f321958a.hashCode() * 31);
    }
}
