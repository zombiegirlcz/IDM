package s6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f260220a;

    public e(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f260220a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f260220a, ((e) obj2).f260220a);
    }

    @Override // s6c.g
    public final dj0.d f() {
        return this.f260220a;
    }

    public final int hashCode() {
        return this.f260220a.hashCode();
    }
}
