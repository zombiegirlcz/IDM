package ewk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f130319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f130320b;

    public a(Float f, Float f4) {
        this.f130319a = f;
        this.f130320b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f130319a, aVar.f130319a) && Intrinsics.f(this.f130320b, aVar.f130320b);
    }

    public final int hashCode() {
        Float f = this.f130319a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f4 = this.f130320b;
        return iHashCode + (f4 != null ? f4.hashCode() : 0);
    }
}
