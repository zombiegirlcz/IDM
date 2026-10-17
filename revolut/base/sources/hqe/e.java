package hqe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f154669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f154670b;

    public e(io3.d pocket, d action) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f154669a = pocket;
        this.f154670b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154669a, eVar.f154669a) && Intrinsics.f(this.f154670b, eVar.f154670b);
    }

    public final int hashCode() {
        return this.f154670b.hashCode() + (this.f154669a.hashCode() * 31);
    }
}
