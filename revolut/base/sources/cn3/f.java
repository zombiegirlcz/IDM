package cn3;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f25348a;

    public f(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f25348a = group;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f25348a, ((f) obj2).f25348a);
    }

    public final int hashCode() {
        return this.f25348a.hashCode();
    }
}
