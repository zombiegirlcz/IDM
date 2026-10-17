package m79;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f203359c;

    public f(String str, String str2, b bVar) {
        this.f203357a = str;
        this.f203358b = str2;
        this.f203359c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f203357a, fVar.f203357a) && Intrinsics.f(this.f203358b, fVar.f203358b) && Intrinsics.f(this.f203359c, fVar.f203359c);
    }

    public final int hashCode() {
        String str = this.f203357a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f203358b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.f203359c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
