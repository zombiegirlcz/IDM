package ro1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f255806c;

    public e(String transactionId, String counterpartyId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f255805b = transactionId;
        this.f255806c = counterpartyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f255805b, eVar.f255805b) && Intrinsics.f(this.f255806c, eVar.f255806c);
    }

    public final int hashCode() {
        return this.f255806c.hashCode() + (this.f255805b.hashCode() * 31);
    }
}
