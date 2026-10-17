package hu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155578c;

    public f(String insuranceProduct, String planId, boolean z) {
        Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f155576a = insuranceProduct;
        this.f155577b = planId;
        this.f155578c = z;
    }

    public final String a() {
        return j6.a.s("insurance-details-layout-", this.f155576a, "-", this.f155577b, this.f155578c ? "-activateSalaryInsurance" : "");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f155576a, fVar.f155576a) && Intrinsics.f(this.f155577b, fVar.f155577b) && this.f155578c == fVar.f155578c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f155578c) + p.a.c(this.f155576a.hashCode() * 31, 31, this.f155577b);
    }
}
