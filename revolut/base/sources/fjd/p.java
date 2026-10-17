package fjd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135590b;

    public p(String carouselTitle, String carouselId) {
        Intrinsics.checkNotNullParameter(carouselTitle, "carouselTitle");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        this.f135589a = carouselTitle;
        this.f135590b = carouselId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f135589a, pVar.f135589a) && Intrinsics.f(this.f135590b, pVar.f135590b);
    }

    public final int hashCode() {
        return this.f135590b.hashCode() + (this.f135589a.hashCode() * 31);
    }
}
