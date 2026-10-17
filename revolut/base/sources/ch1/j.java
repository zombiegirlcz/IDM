package ch1;

import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.shared.cards.model.SharedRevolutCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedRevolutCard f24109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f24110b;

    public j(SharedRevolutCard card, RevolutCardOtp cardOtp) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        this.f24109a = card;
        this.f24110b = cardOtp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f24109a, jVar.f24109a) && Intrinsics.f(this.f24110b, jVar.f24110b);
    }

    public final int hashCode() {
        return this.f24110b.hashCode() + (this.f24109a.hashCode() * 31);
    }
}
