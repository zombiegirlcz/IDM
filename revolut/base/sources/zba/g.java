package zba;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f320858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320859b;

    public g(dj0.d amount, String description) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f320858a = amount;
        this.f320859b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f320858a, gVar.f320858a) && Intrinsics.f(this.f320859b, gVar.f320859b);
    }

    public final int hashCode() {
        return this.f320859b.hashCode() + (this.f320858a.hashCode() * 31);
    }
}
