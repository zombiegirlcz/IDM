package a97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f2371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f2372c;

    public e(Long l2, String str, xi0.b bVar) {
        this.f2370a = str;
        this.f2371b = bVar;
        this.f2372c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f2370a, eVar.f2370a) && Intrinsics.f(this.f2371b, eVar.f2371b) && Intrinsics.f(this.f2372c, eVar.f2372c);
    }

    public final int hashCode() {
        String str = this.f2370a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        xi0.b bVar = this.f2371b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l2 = this.f2372c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }
}
