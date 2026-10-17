package jq9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f177496a;

    public b0(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f177496a = group;
    }

    @Override // jq9.t
    public final String a() {
        return this.f177496a.f79286b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f177496a, ((b0) obj2).f177496a);
    }

    public final int hashCode() {
        return this.f177496a.hashCode();
    }
}
