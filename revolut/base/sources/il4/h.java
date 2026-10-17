package il4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162083a;

    public h(String cashbackPocketId) {
        Intrinsics.checkNotNullParameter(cashbackPocketId, "cashbackPocketId");
        this.f162083a = cashbackPocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f162083a, ((h) obj2).f162083a);
    }

    public final int hashCode() {
        return this.f162083a.hashCode();
    }
}
