package hwe;

import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDetailsScreenDescriptor$OutputData$CardData f156139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156140b;

    public g(CardDetailsScreenDescriptor$OutputData$CardData newCardData, String currencyCode) {
        Intrinsics.checkNotNullParameter(newCardData, "newCardData");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f156139a = newCardData;
        this.f156140b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f156139a, gVar.f156139a) && Intrinsics.f(this.f156140b, gVar.f156140b);
    }

    public final int hashCode() {
        return this.f156140b.hashCode() + (this.f156139a.hashCode() * 31);
    }
}
