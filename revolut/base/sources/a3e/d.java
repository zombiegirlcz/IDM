package a3e;

import com.revolut.feature.store.api.model.StoreMegaOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreMegaOffer f1107b;

    public d(String offerId, StoreMegaOffer storeMegaOffer) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        this.f1106a = offerId;
        this.f1107b = storeMegaOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f1106a, dVar.f1106a) && Intrinsics.f(this.f1107b, dVar.f1107b);
    }

    public final int hashCode() {
        int iHashCode = this.f1106a.hashCode() * 31;
        StoreMegaOffer storeMegaOffer = this.f1107b;
        return iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode());
    }
}
