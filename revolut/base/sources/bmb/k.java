package bmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncd.g f16793a;

    public k(ncd.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f16793a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f16793a == ((k) obj2).f16793a;
    }

    public final int hashCode() {
        return this.f16793a.hashCode();
    }
}
