package eaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f124237a;

    public i(TransferBroker broker) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        this.f124237a = broker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f124237a, ((i) obj2).f124237a);
    }

    public final int hashCode() {
        return this.f124237a.hashCode();
    }
}
