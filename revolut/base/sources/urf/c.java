package urf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f282307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f282308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f282309c;

    public c(Data transferLimits, long j2, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(transferLimits, "transferLimits");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f282307a = transferLimits;
        this.f282308b = j2;
        this.f282309c = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f282307a, cVar.f282307a) && this.f282308b == cVar.f282308b && Intrinsics.f(this.f282309c, cVar.f282309c);
    }

    public final int hashCode() {
        return this.f282309c.hashCode() + a0.d.c(this.f282307a.hashCode() * 31, 31, this.f282308b);
    }
}
