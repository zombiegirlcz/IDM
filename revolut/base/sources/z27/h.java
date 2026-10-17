package z27;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.q f318982a;

    public h(ds6.q taxAuthority) {
        Intrinsics.checkNotNullParameter(taxAuthority, "taxAuthority");
        this.f318982a = taxAuthority;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f318982a, ((h) obj2).f318982a);
    }

    public final int hashCode() {
        return this.f318982a.hashCode();
    }
}
