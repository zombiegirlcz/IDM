package dn3;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentGroup f116214b;

    public c(PaymentGroup group, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(group, "group");
        this.f116213a = requestId;
        this.f116214b = group;
    }

    @Override // dn3.d
    public final String a() {
        return this.f116213a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f116213a, cVar.f116213a) && Intrinsics.f(this.f116214b, cVar.f116214b);
    }

    public final int hashCode() {
        return this.f116214b.hashCode() + (this.f116213a.hashCode() * 31);
    }
}
