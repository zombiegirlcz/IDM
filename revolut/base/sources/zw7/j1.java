package zw7;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f325804b;

    public j1(String petId, LocalDate policyStartDate) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
        this.f325803a = petId;
        this.f325804b = policyStartDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f325803a, j1Var.f325803a) && Intrinsics.f(this.f325804b, j1Var.f325804b);
    }

    public final int hashCode() {
        return this.f325804b.hashCode() + (this.f325803a.hashCode() * 31);
    }
}
