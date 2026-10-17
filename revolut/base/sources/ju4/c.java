package ju4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f178578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178579b;

    public c(dj0.d amount, String pocketId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f178578a = amount;
        this.f178579b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f178578a, cVar.f178578a) && Intrinsics.f(this.f178579b, cVar.f178579b);
    }

    public final int hashCode() {
        return this.f178579b.hashCode() + (this.f178578a.hashCode() * 31);
    }
}
