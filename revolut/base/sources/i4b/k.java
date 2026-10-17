package i4b;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y49.b f158350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MarginQuote f158351b;

    public k(y49.b positionPerformance, MarginQuote quote) {
        Intrinsics.checkNotNullParameter(positionPerformance, "positionPerformance");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f158350a = positionPerformance;
        this.f158351b = quote;
    }

    @Override // i4b.m
    public final MarginQuote a() {
        return this.f158351b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f158350a, kVar.f158350a) && Intrinsics.f(this.f158351b, kVar.f158351b);
    }

    public final int hashCode() {
        return this.f158351b.hashCode() + (this.f158350a.hashCode() * 31);
    }
}
