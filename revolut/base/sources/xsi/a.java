package xsi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f308520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f308521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f308522c;

    public a(long j2, long j3, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f308520a = j2;
        this.f308521b = j3;
        this.f308522c = currency;
    }

    public static a a(a aVar, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j2 = aVar.f308520a;
        }
        xi0.b currency = aVar.f308522c;
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new a(j2, j3, currency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f308520a == aVar.f308520a && this.f308521b == aVar.f308521b && Intrinsics.f(this.f308522c, aVar.f308522c);
    }

    public final int hashCode() {
        return this.f308522c.hashCode() + a0.d.c(Long.hashCode(this.f308520a) * 31, 31, this.f308521b);
    }
}
