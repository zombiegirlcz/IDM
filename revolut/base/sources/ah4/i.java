package ah4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv3.a f4897a;

    public i(lv3.a aVar) {
        this.f4897a = aVar;
    }

    @Override // ah4.k
    public final lv3.a d() {
        return this.f4897a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f4897a, ((i) obj2).f4897a);
    }

    public final int hashCode() {
        lv3.a aVar = this.f4897a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
