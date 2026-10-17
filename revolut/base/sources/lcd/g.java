package lcd;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f193844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193845c;

    public g(String period, String explanationDeeplink, Instant maturityDate) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(maturityDate, "maturityDate");
        Intrinsics.checkNotNullParameter(explanationDeeplink, "explanationDeeplink");
        this.f193843a = period;
        this.f193844b = maturityDate;
        this.f193845c = explanationDeeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f193843a, gVar.f193843a) && Intrinsics.f(this.f193844b, gVar.f193844b) && Intrinsics.f(this.f193845c, gVar.f193845c);
    }

    public final int hashCode() {
        return this.f193845c.hashCode() + r6.b.c(this.f193843a.hashCode() * 31, 31, this.f193844b);
    }
}
