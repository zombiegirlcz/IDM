package kye;

import com.revolut.feature.topup_screen.common.CardDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardDetails f190837c;

    public t(String cardId, String currencyCode, CardDetails cardDetails) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f190835a = cardId;
        this.f190836b = currencyCode;
        this.f190837c = cardDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f190835a, tVar.f190835a) && Intrinsics.f(this.f190836b, tVar.f190836b) && Intrinsics.f(this.f190837c, tVar.f190837c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f190835a.hashCode() * 31, 31, this.f190836b);
        CardDetails cardDetails = this.f190837c;
        return iC + (cardDetails == null ? 0 : cardDetails.hashCode());
    }
}
