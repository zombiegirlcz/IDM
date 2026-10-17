package igj;

import dej.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f161229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161230b;

    public c(a1 targetStrategy, String portingId) {
        Intrinsics.checkNotNullParameter(targetStrategy, "targetStrategy");
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        this.f161229a = targetStrategy;
        this.f161230b = portingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f161229a == cVar.f161229a && Intrinsics.f(this.f161230b, cVar.f161230b);
    }

    public final int hashCode() {
        return this.f161230b.hashCode() + (this.f161229a.hashCode() * 31);
    }
}
