package i4b;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4b.g f158353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MarginQuote f158354b;

    public l(a4b.g positionsOutcome, MarginQuote quote) {
        Intrinsics.checkNotNullParameter(positionsOutcome, "positionsOutcome");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f158353a = positionsOutcome;
        this.f158354b = quote;
    }

    @Override // i4b.m
    public final MarginQuote a() {
        return this.f158354b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f158353a == lVar.f158353a && Intrinsics.f(this.f158354b, lVar.f158354b);
    }

    public final int hashCode() {
        return this.f158354b.hashCode() + (this.f158353a.hashCode() * 31);
    }
}
