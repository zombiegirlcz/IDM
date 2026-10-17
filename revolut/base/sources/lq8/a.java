package lq8;

import aii.e;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Junior f199208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Mode f199209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f199210c;

    public a(JuniorBlockInboundTransferNavigation$Junior junior, JuniorBlockInboundTransferNavigation$Mode mode, boolean z) {
        Intrinsics.checkNotNullParameter(junior, "junior");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f199208a = junior;
        this.f199209b = mode;
        this.f199210c = z;
    }

    public final JuniorBlockInboundTransferNavigation$Junior b() {
        return this.f199208a;
    }

    public final JuniorBlockInboundTransferNavigation$Mode c() {
        return this.f199209b;
    }

    public final boolean d() {
        return this.f199210c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f199208a, aVar.f199208a) && this.f199209b.equals(aVar.f199209b) && this.f199210c == aVar.f199210c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199210c) + ((this.f199209b.hashCode() + (this.f199208a.hashCode() * 31)) * 31);
    }
}
