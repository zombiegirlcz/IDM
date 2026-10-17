package zw7;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f325808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f325809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f325810c;

    public k1(LocalDate renewalDate, boolean z, dj0.d monthlyPayment) {
        Intrinsics.checkNotNullParameter(renewalDate, "renewalDate");
        Intrinsics.checkNotNullParameter(monthlyPayment, "monthlyPayment");
        this.f325808a = renewalDate;
        this.f325809b = z;
        this.f325810c = monthlyPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f325808a, k1Var.f325808a) && this.f325809b == k1Var.f325809b && Intrinsics.f(this.f325810c, k1Var.f325810c);
    }

    public final int hashCode() {
        return this.f325810c.hashCode() + j6.a.c(this.f325808a.hashCode() * 31, 31, this.f325809b);
    }
}
