package nnj;

import dej.e3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f217698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217699b;

    public m(e3 refundReason, String str) {
        Intrinsics.checkNotNullParameter(refundReason, "refundReason");
        this.f217698a = refundReason;
        this.f217699b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f217698a == mVar.f217698a && Intrinsics.f(this.f217699b, mVar.f217699b);
    }

    public final int hashCode() {
        int iHashCode = this.f217698a.hashCode() * 31;
        String str = this.f217699b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
