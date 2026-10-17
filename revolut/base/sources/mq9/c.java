package mq9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f207898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f207900c;

    public c(PaymentGroup group, List bills, List settlements) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(settlements, "settlements");
        this.f207898a = group;
        this.f207899b = bills;
        this.f207900c = settlements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f207898a, cVar.f207898a) && Intrinsics.f(this.f207899b, cVar.f207899b) && Intrinsics.f(this.f207900c, cVar.f207900c);
    }

    public final int hashCode() {
        return this.f207900c.hashCode() + p.a.d(this.f207898a.hashCode() * 31, 31, this.f207899b);
    }
}
