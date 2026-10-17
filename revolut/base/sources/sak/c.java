package sak;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f261440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f261441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f261442c;
    public final boolean d;

    public c(g paymentInfo, a balanceData, b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
        Intrinsics.checkNotNullParameter(balanceData, "balanceData");
        this.f261440a = paymentInfo;
        this.f261441b = balanceData;
        this.f261442c = bVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f261440a, cVar.f261440a) && Intrinsics.f(this.f261441b, cVar.f261441b) && Intrinsics.f(this.f261442c, cVar.f261442c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f261441b.hashCode() + (this.f261440a.hashCode() * 31)) * 31;
        b bVar = this.f261442c;
        return Boolean.hashCode(this.d) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
