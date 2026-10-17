package iq4;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f167798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f167799b;

    public d(dj0.d repaymentAmount, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f167798a = repaymentAmount;
        this.f167799b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f167798a, dVar.f167798a) && Intrinsics.f(this.f167799b, dVar.f167799b);
    }

    public final int hashCode() {
        return this.f167799b.f297794a.hashCode() + (this.f167798a.hashCode() * 31);
    }
}
