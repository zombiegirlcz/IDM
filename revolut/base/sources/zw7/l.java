package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f325812b;

    public l(String monthlyPayment, int i) {
        Intrinsics.checkNotNullParameter(monthlyPayment, "monthlyPayment");
        this.f325811a = monthlyPayment;
        this.f325812b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f325811a, lVar.f325811a) && this.f325812b == lVar.f325812b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f325812b) + (this.f325811a.hashCode() * 31);
    }
}
