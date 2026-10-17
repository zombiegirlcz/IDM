package sw2;

import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f266083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f266084b;

    public l(f0 card, RevolutCardOtp cardOtp) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        this.f266083a = card;
        this.f266084b = cardOtp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f266083a, lVar.f266083a) && Intrinsics.f(this.f266084b, lVar.f266084b);
    }

    public final int hashCode() {
        return this.f266084b.hashCode() + (this.f266083a.hashCode() * 31);
    }
}
