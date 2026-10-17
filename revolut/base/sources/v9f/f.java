package v9f;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInInstrument f287032a;

    public f(TransferInInstrument transferInstrument) {
        Intrinsics.checkNotNullParameter(transferInstrument, "transferInstrument");
        this.f287032a = transferInstrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f287032a, ((f) obj2).f287032a);
    }

    public final int hashCode() {
        return this.f287032a.hashCode();
    }
}
