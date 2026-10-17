package fjd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135593b;

    public r(String carouselTitle, String carouselId) {
        Intrinsics.checkNotNullParameter(carouselTitle, "carouselTitle");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        this.f135592a = carouselTitle;
        this.f135593b = carouselId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f135592a, rVar.f135592a) && Intrinsics.f(this.f135593b, rVar.f135593b);
    }

    public final int hashCode() {
        return this.f135593b.hashCode() + (this.f135592a.hashCode() * 31);
    }
}
