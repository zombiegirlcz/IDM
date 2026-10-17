package nq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.u f218329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f218331c;

    public s(xv.u snapshot, String str, Integer num) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f218329a = snapshot;
        this.f218330b = str;
        this.f218331c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f218329a, sVar.f218329a) && Intrinsics.f(this.f218330b, sVar.f218330b) && Intrinsics.f(this.f218331c, sVar.f218331c);
    }

    public final int hashCode() {
        int iHashCode = this.f218329a.hashCode() * 31;
        String str = this.f218330b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f218331c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
