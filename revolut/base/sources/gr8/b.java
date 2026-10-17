package gr8;

import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Junior f145944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Mode f145945b;

    public b(JuniorBlockInboundTransferNavigation$Junior junior, JuniorBlockInboundTransferNavigation$Mode mode) {
        Intrinsics.checkNotNullParameter(junior, "junior");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f145944a = junior;
        this.f145945b = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f145944a, bVar.f145944a) && Intrinsics.f(this.f145945b, bVar.f145945b);
    }

    public final int hashCode() {
        return this.f145945b.hashCode() + (this.f145944a.hashCode() * 31);
    }
}
