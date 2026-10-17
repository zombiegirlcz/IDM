package q50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f242283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f242284b;

    public v(y50.b config, Integer num) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f242283a = config;
        this.f242284b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f242283a, vVar.f242283a) && Intrinsics.f(this.f242284b, vVar.f242284b);
    }

    public final int hashCode() {
        int iHashCode = this.f242283a.hashCode() * 31;
        Integer num = this.f242284b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
