package b4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12321b;

    public c0(String offerId, String searchSessionId) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(searchSessionId, "searchSessionId");
        this.f12320a = offerId;
        this.f12321b = searchSessionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f12320a, c0Var.f12320a) && Intrinsics.f(this.f12321b, c0Var.f12321b);
    }

    public final int hashCode() {
        return this.f12321b.hashCode() + (this.f12320a.hashCode() * 31);
    }
}
