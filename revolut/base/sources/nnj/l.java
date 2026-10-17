package nnj;

import dej.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f217696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f217697c;

    public l(p0 cancellationReason, String userFirstName, String str) {
        Intrinsics.checkNotNullParameter(userFirstName, "userFirstName");
        Intrinsics.checkNotNullParameter(cancellationReason, "cancellationReason");
        this.f217695a = userFirstName;
        this.f217696b = cancellationReason;
        this.f217697c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f217695a, lVar.f217695a) && this.f217696b == lVar.f217696b && Intrinsics.f(this.f217697c, lVar.f217697c);
    }

    public final int hashCode() {
        int iHashCode = (this.f217696b.hashCode() + (this.f217695a.hashCode() * 31)) * 31;
        String str = this.f217697c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
