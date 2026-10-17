package rtl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f257330a;

    public m(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f257330a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f257330a, ((m) obj2).f257330a);
    }

    public final int hashCode() {
        return this.f257330a.hashCode();
    }
}
