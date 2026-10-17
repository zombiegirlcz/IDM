package v9f;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInInstrument f287035a;

    public h(TransferInInstrument transferInstrument) {
        Intrinsics.checkNotNullParameter(transferInstrument, "transferInstrument");
        this.f287035a = transferInstrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f287035a, ((h) obj2).f287035a);
    }

    public final int hashCode() {
        return this.f287035a.hashCode();
    }
}
