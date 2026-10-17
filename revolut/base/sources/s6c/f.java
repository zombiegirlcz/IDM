package s6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f260221a;

    public f(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f260221a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f260221a, ((f) obj2).f260221a);
    }

    @Override // s6c.g
    public final dj0.d f() {
        return this.f260221a;
    }

    public final int hashCode() {
        return this.f260221a.hashCode();
    }
}
