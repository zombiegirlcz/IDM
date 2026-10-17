package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f275179b;

    public l() {
        this(null, 7);
    }

    @Override // tx0.b
    public final int a() {
        return this.f275179b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f275178a, lVar.f275178a) && this.f275179b == lVar.f275179b;
    }

    @Override // tx0.r
    public final String getId() {
        return this.f275178a;
    }

    public final int hashCode() {
        return j6.a.b(this.f275179b, this.f275178a.hashCode() * 31, 31);
    }

    public l(String id10, int i) {
        id10 = (i & 1) != 0 ? "" : id10;
        int i2 = (i & 2) != 0 ? 4 : 0;
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f275178a = id10;
        this.f275179b = i2;
    }
}
