package as6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8807a;

    public g(c fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f8807a = fee2;
    }

    @Override // as6.l
    public final c a() {
        return this.f8807a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f8807a, ((g) obj2).f8807a);
    }

    public final int hashCode() {
        return this.f8807a.hashCode();
    }
}
