package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynd.i f323982a;

    public e(ynd.i budget) {
        Intrinsics.checkNotNullParameter(budget, "budget");
        this.f323982a = budget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f323982a, ((e) obj2).f323982a);
    }

    public final int hashCode() {
        return this.f323982a.hashCode();
    }
}
