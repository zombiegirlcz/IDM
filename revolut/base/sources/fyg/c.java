package fyg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f138988a;

    public c(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f138988a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f138988a, ((c) obj2).f138988a);
    }

    @Override // fyg.e
    public final dj0.d f() {
        return this.f138988a;
    }

    public final int hashCode() {
        return this.f138988a.hashCode();
    }
}
