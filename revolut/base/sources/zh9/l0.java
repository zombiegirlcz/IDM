package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f322300b;

    public l0(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f322299a = amount;
        this.f322300b = amount;
    }

    @Override // zh9.n0
    public final dj0.d a() {
        return this.f322300b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f322299a, ((l0) obj2).f322299a);
    }

    public final int hashCode() {
        return this.f322299a.hashCode();
    }
}
