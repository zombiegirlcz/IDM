package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283944c;
    public final jq9.b d;

    public q(String name, String str, String str2, jq9.b paymentItem) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283942a = name;
        this.f283943b = str;
        this.f283944c = str2;
        this.d = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f283942a, qVar.f283942a) && Intrinsics.f(this.f283943b, qVar.f283943b) && Intrinsics.f(this.f283944c, qVar.f283944c) && this.d.equals(qVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f283942a.hashCode() * 31;
        String str = this.f283943b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283944c;
        return Long.hashCode(0L) + j6.a.b(0, (this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
    }
}
