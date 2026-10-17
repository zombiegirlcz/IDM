package ch6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f24137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f24138b;

    public n(dj0.d limitPerTransfer, dj0.d limitPerMonth) {
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        this.f24137a = limitPerTransfer;
        this.f24138b = limitPerMonth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f24137a, nVar.f24137a) && Intrinsics.f(this.f24138b, nVar.f24138b);
    }

    public final int hashCode() {
        return this.f24138b.hashCode() + (this.f24137a.hashCode() * 31);
    }
}
