package ah4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv3.a f4898a;

    public j(lv3.a aVar) {
        this.f4898a = aVar;
    }

    @Override // ah4.k
    public final lv3.a d() {
        return this.f4898a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f4898a, ((j) obj2).f4898a);
    }

    public final int hashCode() {
        lv3.a aVar = this.f4898a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
