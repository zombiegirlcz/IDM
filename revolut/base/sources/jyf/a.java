package jyf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f179417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179418b;

    public a(b cancellationBreakdown, String cancellationToken) {
        Intrinsics.checkNotNullParameter(cancellationBreakdown, "cancellationBreakdown");
        Intrinsics.checkNotNullParameter(cancellationToken, "cancellationToken");
        this.f179417a = cancellationBreakdown;
        this.f179418b = cancellationToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f179417a, aVar.f179417a) && Intrinsics.f(this.f179418b, aVar.f179418b);
    }

    public final int hashCode() {
        return this.f179418b.hashCode() + (this.f179417a.hashCode() * 31);
    }
}
