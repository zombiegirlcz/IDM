package uba;

import cli.j;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f278792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f278793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f278794c;
    public final dj0.d d;

    public c(dj0.d interest, dj0.d lateFee, dj0.d discount, dj0.d rebate) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        Intrinsics.checkNotNullParameter(lateFee, "lateFee");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(rebate, "rebate");
        this.f278792a = interest;
        this.f278793b = lateFee;
        this.f278794c = discount;
        this.d = rebate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f278792a, cVar.f278792a) && Intrinsics.f(this.f278793b, cVar.f278793b) && Intrinsics.f(this.f278794c, cVar.f278794c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f278792a.hashCode() * 31, 31, this.f278793b), 31, this.f278794c);
    }
}
