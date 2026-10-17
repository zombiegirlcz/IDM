package gca;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f142379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f142381c;
    public final String d;

    public g(dj0.d amount, String groupId, String payerName, String reference) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f142379a = amount;
        this.f142380b = groupId;
        this.f142381c = payerName;
        this.d = reference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f142379a, gVar.f142379a) && Intrinsics.f(this.f142380b, gVar.f142380b) && Intrinsics.f(this.f142381c, gVar.f142381c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f142379a.hashCode() * 31, 31, this.f142380b), 31, this.f142381c);
    }
}
