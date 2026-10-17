package kye;

import com.revolut.feature.topup_screen.common.CardDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f190722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f190723c;
    public final CardDetails d;

    public d0(String cardId, List appliedLimits, String currencyCode, CardDetails cardDetails) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(appliedLimits, "appliedLimits");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f190721a = cardId;
        this.f190722b = appliedLimits;
        this.f190723c = currencyCode;
        this.d = cardDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f190721a, d0Var.f190721a) && Intrinsics.f(this.f190722b, d0Var.f190722b) && Intrinsics.f(this.f190723c, d0Var.f190723c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(this.f190721a.hashCode() * 31, 31, this.f190722b), 31, this.f190723c);
        CardDetails cardDetails = this.d;
        return iC + (cardDetails == null ? 0 : cardDetails.hashCode());
    }
}
