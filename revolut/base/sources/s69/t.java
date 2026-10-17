package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f260184c;

    public t(String id10, String str, u uVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f260182a = id10;
        this.f260183b = str;
        this.f260184c = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f260182a, tVar.f260182a) && Intrinsics.f(this.f260183b, tVar.f260183b) && Intrinsics.f(this.f260184c, tVar.f260184c);
    }

    public final int hashCode() {
        int iHashCode = this.f260182a.hashCode() * 31;
        String str = this.f260183b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.f260184c;
        return iHashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }
}
