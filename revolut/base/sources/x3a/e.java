package x3a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f302717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f302718b;

    public e(Integer num, boolean z) {
        this.f302717a = num;
        this.f302718b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f302717a, eVar.f302717a) && this.f302718b == eVar.f302718b;
    }

    public final int hashCode() {
        Integer num = this.f302717a;
        return Boolean.hashCode(this.f302718b) + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
