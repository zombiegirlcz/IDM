package nze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f221027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221028b;

    public c(dj0.d amount, String mandateId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        this.f221027a = amount;
        this.f221028b = mandateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f221027a, cVar.f221027a) && Intrinsics.f(this.f221028b, cVar.f221028b);
    }

    public final int hashCode() {
        return this.f221028b.hashCode() + (this.f221027a.hashCode() * 31);
    }
}
