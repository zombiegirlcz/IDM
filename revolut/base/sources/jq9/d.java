package jq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oq9.i f177498a;

    public d(oq9.i bill) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f177498a = bill;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177498a.b().getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return !Intrinsics.f(oi0.d.k(this.f177498a.c()), userCode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f177498a, ((d) obj2).f177498a);
    }

    public final int hashCode() {
        return this.f177498a.hashCode();
    }
}
