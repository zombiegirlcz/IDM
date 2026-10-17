package naf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestPosition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferRequestPosition f213892a;

    public f(TransferRequestPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f213892a = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f213892a, ((f) obj2).f213892a);
    }

    public final int hashCode() {
        return this.f213892a.hashCode();
    }
}
