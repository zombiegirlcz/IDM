package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f323977a;

    public b0(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f323977a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f323977a, ((b0) obj2).f323977a);
    }

    @Override // zod.c0
    public final dj0.d f() {
        return this.f323977a;
    }

    public final int hashCode() {
        return this.f323977a.hashCode();
    }
}
