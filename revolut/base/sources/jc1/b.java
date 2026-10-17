package jc1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PairingInfo f172690a;

    public b(PairingInfo pairingInfo) {
        Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
        this.f172690a = pairingInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f172690a, ((b) obj2).f172690a);
    }

    public final int hashCode() {
        return this.f172690a.hashCode();
    }
}
