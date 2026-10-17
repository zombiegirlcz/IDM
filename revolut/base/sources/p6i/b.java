package p6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f233316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f233318c;

    public b(dj0.d topUpLimitOfTargetProduct, dj0.d limitOfBestSavingsProductAvailable, String nameOfBestSavingsProductAvailable) {
        Intrinsics.checkNotNullParameter(topUpLimitOfTargetProduct, "topUpLimitOfTargetProduct");
        Intrinsics.checkNotNullParameter(nameOfBestSavingsProductAvailable, "nameOfBestSavingsProductAvailable");
        Intrinsics.checkNotNullParameter(limitOfBestSavingsProductAvailable, "limitOfBestSavingsProductAvailable");
        this.f233316a = topUpLimitOfTargetProduct;
        this.f233317b = nameOfBestSavingsProductAvailable;
        this.f233318c = limitOfBestSavingsProductAvailable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f233316a, bVar.f233316a) && Intrinsics.f(this.f233317b, bVar.f233317b) && Intrinsics.f(this.f233318c, bVar.f233318c);
    }

    public final int hashCode() {
        return this.f233318c.hashCode() + p.a.c(this.f233316a.hashCode() * 31, 31, this.f233317b);
    }
}
