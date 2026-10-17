package eaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f124229a;

    public e(TransferBroker broker) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        this.f124229a = broker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f124229a, ((e) obj2).f124229a);
    }

    public final int hashCode() {
        return this.f124229a.hashCode();
    }
}
