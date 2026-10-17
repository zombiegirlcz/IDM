package nq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw.m f218307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f218309c;

    public l(vw.m artifact, String str, Integer num) {
        Intrinsics.checkNotNullParameter(artifact, "artifact");
        this.f218307a = artifact;
        this.f218308b = str;
        this.f218309c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f218307a, lVar.f218307a) && Intrinsics.f(this.f218308b, lVar.f218308b) && Intrinsics.f(this.f218309c, lVar.f218309c);
    }

    public final int hashCode() {
        int iHashCode = this.f218307a.hashCode() * 31;
        String str = this.f218308b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f218309c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
