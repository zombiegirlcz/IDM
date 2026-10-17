package nq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f218289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f218291c;

    public f(w scanType, String str, Integer num) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        this.f218289a = scanType;
        this.f218290b = str;
        this.f218291c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f218289a == fVar.f218289a && Intrinsics.f(this.f218290b, fVar.f218290b) && Intrinsics.f(this.f218291c, fVar.f218291c);
    }

    public final int hashCode() {
        int iHashCode = this.f218289a.hashCode() * 31;
        String str = this.f218290b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f218291c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
