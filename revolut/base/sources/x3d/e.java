package x3d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f302727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f302728b;

    public e(d valueVariant, boolean z) {
        Intrinsics.checkNotNullParameter(valueVariant, "valueVariant");
        this.f302727a = valueVariant;
        this.f302728b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f302727a, eVar.f302727a) && this.f302728b == eVar.f302728b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302728b) + (this.f302727a.hashCode() * 31);
    }
}
