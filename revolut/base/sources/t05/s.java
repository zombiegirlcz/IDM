package t05;

import com.revolut.feature.credit.health.impl.domain.model.PreapprovedOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreapprovedOffer f266930a;

    public s(PreapprovedOffer offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        this.f266930a = offer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f266930a, ((s) obj2).f266930a);
    }

    public final int hashCode() {
        return this.f266930a.hashCode();
    }
}
