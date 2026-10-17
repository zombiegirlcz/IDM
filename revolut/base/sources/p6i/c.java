package p6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f233319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233320b;

    public c(dj0.d topUpLimitOfTargetProduct, String nameOfBestSavingsProductAvailable) {
        Intrinsics.checkNotNullParameter(topUpLimitOfTargetProduct, "topUpLimitOfTargetProduct");
        Intrinsics.checkNotNullParameter(nameOfBestSavingsProductAvailable, "nameOfBestSavingsProductAvailable");
        this.f233319a = topUpLimitOfTargetProduct;
        this.f233320b = nameOfBestSavingsProductAvailable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f233319a, cVar.f233319a) && Intrinsics.f(this.f233320b, cVar.f233320b);
    }

    public final int hashCode() {
        return this.f233320b.hashCode() + (this.f233319a.hashCode() * 31);
    }
}
