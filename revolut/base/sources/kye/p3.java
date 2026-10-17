package kye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f190814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f190815b;

    public p3(dj0.d defaultAmount, List predefinedAmounts) {
        Intrinsics.checkNotNullParameter(defaultAmount, "defaultAmount");
        Intrinsics.checkNotNullParameter(predefinedAmounts, "predefinedAmounts");
        this.f190814a = defaultAmount;
        this.f190815b = predefinedAmounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f190814a, p3Var.f190814a) && Intrinsics.f(this.f190815b, p3Var.f190815b);
    }

    public final int hashCode() {
        return this.f190815b.hashCode() + (this.f190814a.hashCode() * 31);
    }
}
