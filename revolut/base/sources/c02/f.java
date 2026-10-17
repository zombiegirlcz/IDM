package c02;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lrf.a f20104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f20105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f20106c;

    public f(lrf.a rate, dj0.d billAmount, h charges) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        Intrinsics.checkNotNullParameter(charges, "charges");
        this.f20104a = rate;
        this.f20105b = billAmount;
        this.f20106c = charges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f20104a, fVar.f20104a) && Intrinsics.f(this.f20105b, fVar.f20105b) && Intrinsics.f(this.f20106c, fVar.f20106c);
    }

    public final int hashCode() {
        return this.f20106c.hashCode() + v7.c(this.f20104a.hashCode() * 31, 31, this.f20105b);
    }
}
