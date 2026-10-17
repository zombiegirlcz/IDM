package j71;

import dj0.d;
import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import tof.l1;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f171832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f171833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f171834c;
    public final d d;
    public final z3l.a e;
    public final d f;

    public c(d targetAmount, d sourceAmount, l1 rate, d fee2, z3l.a aVar, d totalSourceAmount) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(sourceAmount, "sourceAmount");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(totalSourceAmount, "totalSourceAmount");
        this.f171832a = targetAmount;
        this.f171833b = sourceAmount;
        this.f171834c = rate;
        this.d = fee2;
        this.e = aVar;
        this.f = totalSourceAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f171832a, cVar.f171832a) && Intrinsics.f(this.f171833b, cVar.f171833b) && Intrinsics.f(this.f171834c, cVar.f171834c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = v7.c((this.f171834c.hashCode() + v7.c(this.f171832a.hashCode() * 31, 31, this.f171833b)) * 31, 31, this.d);
        z3l.a aVar = this.e;
        return this.f.hashCode() + ((iC + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
