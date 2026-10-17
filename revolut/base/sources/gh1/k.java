package gh1;

import com.revolut.data.model.Data;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f143824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f143825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f143826c;
    public final o5l.g d;

    public k(Data cardWrapper, RevolutCardOtp cardOtp, Data designConfig, o5l.g screenDensity) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        this.f143824a = cardWrapper;
        this.f143825b = cardOtp;
        this.f143826c = designConfig;
        this.d = screenDensity;
    }

    public static k a(k kVar, Data cardWrapper, Data designConfig, int i) {
        if ((i & 1) != 0) {
            cardWrapper = kVar.f143824a;
        }
        RevolutCardOtp cardOtp = kVar.f143825b;
        if ((i & 4) != 0) {
            designConfig = kVar.f143826c;
        }
        o5l.g screenDensity = kVar.d;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        return new k(cardWrapper, cardOtp, designConfig, screenDensity);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f143824a, kVar.f143824a) && Intrinsics.f(this.f143825b, kVar.f143825b) && Intrinsics.f(this.f143826c, kVar.f143826c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f143826c, (this.f143825b.hashCode() + (this.f143824a.hashCode() * 31)) * 31, 31);
    }
}
