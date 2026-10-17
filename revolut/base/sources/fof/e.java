package fof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136950b;

    public e(String transactionId, String counterpartyDetailsId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(counterpartyDetailsId, "counterpartyDetailsId");
        this.f136949a = transactionId;
        this.f136950b = counterpartyDetailsId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f136949a, eVar.f136949a) && Intrinsics.f(this.f136950b, eVar.f136950b);
    }

    public final int hashCode() {
        return this.f136950b.hashCode() + (this.f136949a.hashCode() * 31);
    }
}
