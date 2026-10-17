package a3b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f1081a;

    public d(dj0.d amountToWithdraw) {
        Intrinsics.checkNotNullParameter(amountToWithdraw, "amountToWithdraw");
        this.f1081a = amountToWithdraw;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f1081a, ((d) obj2).f1081a);
    }

    public final int hashCode() {
        return this.f1081a.hashCode();
    }
}
