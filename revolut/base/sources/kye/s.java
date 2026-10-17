package kye;

import com.revolut.feature.topup_screen.common.CardDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardDetails f190826c;

    public s(String cardId, String currencyCode, CardDetails cardDetails) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f190824a = cardId;
        this.f190825b = currencyCode;
        this.f190826c = cardDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f190824a, sVar.f190824a) && Intrinsics.f(this.f190825b, sVar.f190825b) && Intrinsics.f(this.f190826c, sVar.f190826c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f190824a.hashCode() * 31, 31, this.f190825b);
        CardDetails cardDetails = this.f190826c;
        return iC + (cardDetails == null ? 0 : cardDetails.hashCode());
    }
}
