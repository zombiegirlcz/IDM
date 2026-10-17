package hu6;

import kotlin.jvm.internal.Intrinsics;
import nr6.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f155566a;

    public d(w payments) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f155566a = payments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f155566a, ((d) obj2).f155566a);
    }

    public final int hashCode() {
        return this.f155566a.hashCode();
    }
}
