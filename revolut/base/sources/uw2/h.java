package uw2;

import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f283532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f283533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f283534c;

    public h(f0 card, RevolutCardOtp cardOtp, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        this.f283532a = card;
        this.f283533b = cardOtp;
        this.f283534c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f283532a, hVar.f283532a) && Intrinsics.f(this.f283533b, hVar.f283533b) && this.f283534c == hVar.f283534c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283534c) + ((this.f283533b.hashCode() + (this.f283532a.hashCode() * 31)) * 31);
    }
}
