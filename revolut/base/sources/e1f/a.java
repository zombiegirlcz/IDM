package e1f;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f121979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f121980b;

    public a(d currentMonthlyValue, d maxMonthlyLimit) {
        Intrinsics.checkNotNullParameter(currentMonthlyValue, "currentMonthlyValue");
        Intrinsics.checkNotNullParameter(maxMonthlyLimit, "maxMonthlyLimit");
        this.f121979a = currentMonthlyValue;
        this.f121980b = maxMonthlyLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f121979a, aVar.f121979a) && Intrinsics.f(this.f121980b, aVar.f121980b);
    }

    public final int hashCode() {
        return this.f121980b.hashCode() + (this.f121979a.hashCode() * 31);
    }
}
