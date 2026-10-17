package wrb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final del.a f299538a;

    public e(del.a instrumentBalance) {
        Intrinsics.checkNotNullParameter(instrumentBalance, "instrumentBalance");
        this.f299538a = instrumentBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f299538a, ((e) obj2).f299538a);
    }

    public final int hashCode() {
        return this.f299538a.hashCode();
    }
}
