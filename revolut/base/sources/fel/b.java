package fel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f134650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f134651c;

    public b(String ref2, a assetType, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f134649a = ref2;
        this.f134650b = assetType;
        this.f134651c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f134649a, bVar.f134649a) && this.f134650b == bVar.f134650b && Intrinsics.f(this.f134651c, bVar.f134651c);
    }

    public final int hashCode() {
        int iHashCode = (this.f134650b.hashCode() + (this.f134649a.hashCode() * 31)) * 31;
        xi0.b bVar = this.f134651c;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
