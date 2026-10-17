package as6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8810a;

    public i(c fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f8810a = fee2;
    }

    @Override // as6.l
    public final c a() {
        return this.f8810a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f8810a, ((i) obj2).f8810a);
    }

    public final int hashCode() {
        return this.f8810a.hashCode();
    }
}
