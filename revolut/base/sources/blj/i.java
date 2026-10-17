package blj;

import dej.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f16711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16712b;

    public i(a1 targetStrategy, String portingId) {
        Intrinsics.checkNotNullParameter(targetStrategy, "targetStrategy");
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        this.f16711a = targetStrategy;
        this.f16712b = portingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f16711a == iVar.f16711a && Intrinsics.f(this.f16712b, iVar.f16712b);
    }

    public final int hashCode() {
        return this.f16712b.hashCode() + (this.f16711a.hashCode() * 31);
    }
}
