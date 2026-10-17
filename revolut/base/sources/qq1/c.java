package qq1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lqq1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProvider", "provider", "Lqq1/b;", "b", "Lqq1/b;", "getBill", "()Lqq1/b;", "bill", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final String provider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bill")
    @NotNull
    private final b bill;

    public c(b bill) {
        Intrinsics.checkNotNullParameter("PAGOPA", "provider");
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.provider = "PAGOPA";
        this.bill = bill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.provider, cVar.provider) && Intrinsics.f(this.bill, cVar.bill);
    }

    public final int hashCode() {
        return this.bill.hashCode() + (this.provider.hashCode() * 31);
    }
}
