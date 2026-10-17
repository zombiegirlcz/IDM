package f7d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f132596b;

    public g(String userName, e timeOfDay) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        this.f132595a = userName;
        this.f132596b = timeOfDay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f132595a, gVar.f132595a) && this.f132596b == gVar.f132596b;
    }

    public final int hashCode() {
        return this.f132596b.hashCode() + (this.f132595a.hashCode() * 31);
    }
}
