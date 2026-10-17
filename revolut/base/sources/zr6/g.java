package zr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f324616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f324617b;

    public g(c cVar, d fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f324616a = cVar;
        this.f324617b = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f324616a, gVar.f324616a) && Intrinsics.f(this.f324617b, gVar.f324617b);
    }

    public final int hashCode() {
        c cVar = this.f324616a;
        return this.f324617b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
