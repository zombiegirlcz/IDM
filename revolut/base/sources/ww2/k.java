package ww2;

import com.revolut.data.model.Data;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f300584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f300585c;
    public final o5l.g d;

    public k(Data card, RevolutCardOtp cardOtp, Data designConfig, o5l.g screenDensity) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        this.f300583a = card;
        this.f300584b = cardOtp;
        this.f300585c = designConfig;
        this.d = screenDensity;
    }

    public static k a(k kVar, Data card, Data designConfig, int i) {
        if ((i & 1) != 0) {
            card = kVar.f300583a;
        }
        RevolutCardOtp cardOtp = kVar.f300584b;
        if ((i & 4) != 0) {
            designConfig = kVar.f300585c;
        }
        o5l.g screenDensity = kVar.d;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        return new k(card, cardOtp, designConfig, screenDensity);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f300583a, kVar.f300583a) && Intrinsics.f(this.f300584b, kVar.f300584b) && Intrinsics.f(this.f300585c, kVar.f300585c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f300585c, (this.f300584b.hashCode() + (this.f300583a.hashCode() * 31)) * 31, 31);
    }
}
