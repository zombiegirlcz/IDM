package b6k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f12846a;

    public b(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f12846a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f12846a, ((b) obj2).f12846a);
    }

    public final int hashCode() {
        return this.f12846a.hashCode();
    }
}
