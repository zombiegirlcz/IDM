package kn1;

import cli.j;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f185970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f185971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f185972c;
    public final dj0.d d;

    public c(dj0.d latePaymentFee, dj0.d additionalCharges, dj0.d discount, dj0.d total) {
        Intrinsics.checkNotNullParameter(latePaymentFee, "latePaymentFee");
        Intrinsics.checkNotNullParameter(additionalCharges, "additionalCharges");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f185970a = latePaymentFee;
        this.f185971b = additionalCharges;
        this.f185972c = discount;
        this.d = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f185970a, cVar.f185970a) && Intrinsics.f(this.f185971b, cVar.f185971b) && Intrinsics.f(this.f185972c, cVar.f185972c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f185970a.hashCode() * 31, 31, this.f185971b), 31, this.f185972c);
    }
}
