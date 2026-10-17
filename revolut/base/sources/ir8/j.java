package ir8;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f168018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f168019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f168020c;
    public final xi0.b d;

    public j(long j2, long j3, xi0.b sourceCurrency, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f168018a = j2;
        this.f168019b = j3;
        this.f168020c = sourceCurrency;
        this.d = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f168018a == jVar.f168018a && this.f168019b == jVar.f168019b && Intrinsics.f(this.f168020c, jVar.f168020c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.j(this.f168020c, a0.d.c(Long.hashCode(this.f168018a) * 31, 31, this.f168019b), 31);
    }
}
