package ff4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bv3.b f134727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5l.c f134728b;

    public l(bv3.b offerDetails, p5l.c cardsConfig) {
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
        Intrinsics.checkNotNullParameter(cardsConfig, "cardsConfig");
        this.f134727a = offerDetails;
        this.f134728b = cardsConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f134727a, lVar.f134727a) && Intrinsics.f(this.f134728b, lVar.f134728b);
    }

    public final int hashCode() {
        return this.f134728b.f233195a.hashCode() + (this.f134727a.hashCode() * 31);
    }
}
