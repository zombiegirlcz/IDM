package as6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8806a;

    public f(c fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f8806a = fee2;
    }

    @Override // as6.l
    public final c a() {
        return this.f8806a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f8806a, ((f) obj2).f8806a);
    }

    public final int hashCode() {
        return this.f8806a.hashCode();
    }
}
