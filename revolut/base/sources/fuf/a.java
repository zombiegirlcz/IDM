package fuf;

import a0.d;
import h30.l;
import hrf.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f138199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f138200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f138201c;
    public final xi0.b d;
    public final c e;

    public a(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, c cVar) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f138199a = j2;
        this.f138200b = j3;
        this.f138201c = targetCurrency;
        this.d = sourceCurrency;
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f138199a == aVar.f138199a && this.f138200b == aVar.f138200b && Intrinsics.f(this.f138201c, aVar.f138201c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iJ = l.j(this.d, l.j(this.f138201c, d.c(Long.hashCode(this.f138199a) * 31, 31, this.f138200b), 31), 31);
        c cVar = this.e;
        return iJ + (cVar == null ? 0 : cVar.hashCode());
    }
}
