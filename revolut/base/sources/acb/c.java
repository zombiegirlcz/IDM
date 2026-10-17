package acb;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f3109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f3110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3111c;

    public c(long j2, xi0.b sourceCurrency, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f3109a = sourceCurrency;
        this.f3110b = targetCurrency;
        this.f3111c = j2;
    }

    @Override // acb.e
    public final xi0.b a() {
        return this.f3109a;
    }

    @Override // acb.e
    public final xi0.b b() {
        return this.f3110b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f3109a, cVar.f3109a) && Intrinsics.f(this.f3110b, cVar.f3110b) && this.f3111c == cVar.f3111c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3111c) + l.j(this.f3110b, this.f3109a.hashCode() * 31, 31);
    }
}
