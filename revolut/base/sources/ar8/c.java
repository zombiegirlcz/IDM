package ar8;

import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Junior f8527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Mode f8528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f8529c;

    public c(JuniorBlockInboundTransferNavigation$Junior junior, JuniorBlockInboundTransferNavigation$Mode mode, f launchMode) {
        Intrinsics.checkNotNullParameter(junior, "junior");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.f8527a = junior;
        this.f8528b = mode;
        this.f8529c = launchMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f8527a, cVar.f8527a) && Intrinsics.f(this.f8528b, cVar.f8528b) && Intrinsics.f(this.f8529c, cVar.f8529c);
    }

    public final int hashCode() {
        return this.f8529c.hashCode() + ((this.f8528b.hashCode() + (this.f8527a.hashCode() * 31)) * 31);
    }
}
