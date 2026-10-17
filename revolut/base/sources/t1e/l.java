package t1e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f267266b;

    public l(String carouselId, Integer num) {
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        this.f267265a = carouselId;
        this.f267266b = num;
    }

    public final boolean equals(Object obj2) {
        Object obj3 = 12;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f267265a, lVar.f267265a) && obj3.equals(obj3) && this.f267266b.equals(lVar.f267266b);
    }

    public final int hashCode() {
        Integer num = 12;
        return this.f267266b.hashCode() + ((num.hashCode() + (this.f267265a.hashCode() * 31)) * 31);
    }
}
