package lf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f194673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f194674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f194675c;

    public j(k minimumAge, k maximumAge, Integer num) {
        Intrinsics.checkNotNullParameter(minimumAge, "minimumAge");
        Intrinsics.checkNotNullParameter(maximumAge, "maximumAge");
        this.f194673a = minimumAge;
        this.f194674b = maximumAge;
        this.f194675c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f194673a, jVar.f194673a) && Intrinsics.f(this.f194674b, jVar.f194674b) && Intrinsics.f(this.f194675c, jVar.f194675c);
    }

    public final int hashCode() {
        int iHashCode = (this.f194674b.hashCode() + (this.f194673a.hashCode() * 31)) * 31;
        Integer num = this.f194675c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
