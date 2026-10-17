package ux9;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.j f283929b;

    public i(String sourceAddress, jq9.j paymentItem) {
        Intrinsics.checkNotNullParameter(sourceAddress, "sourceAddress");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283928a = sourceAddress;
        this.f283929b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283929b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f283928a.equals(iVar.f283928a) && this.f283929b.equals(iVar.f283929b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, y.f(this.f283929b.f177504a, this.f283928a.hashCode() * 31, 31), 31);
    }
}
