package hwi;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f156232c;

    public l(String groupKey, long j2, long j3) {
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        this.f156230a = groupKey;
        this.f156231b = j2;
        this.f156232c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f156230a, lVar.f156230a) && kotlin.time.b.d(this.f156231b, lVar.f156231b) && kotlin.time.b.d(this.f156232c, lVar.f156232c);
    }

    public final int hashCode() {
        int iHashCode = this.f156230a.hashCode() * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f156232c) + a0.d.c(iHashCode, 31, this.f156231b);
    }
}
