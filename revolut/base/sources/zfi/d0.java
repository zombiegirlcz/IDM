package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321964b;

    public d0(String reference, String selectedOptionValue) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(selectedOptionValue, "selectedOptionValue");
        this.f321963a = reference;
        this.f321964b = selectedOptionValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f321963a, d0Var.f321963a) && Intrinsics.f(this.f321964b, d0Var.f321964b);
    }

    public final int hashCode() {
        return this.f321964b.hashCode() + (this.f321963a.hashCode() * 31);
    }
}
