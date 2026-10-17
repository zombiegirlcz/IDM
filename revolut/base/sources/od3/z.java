package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f224328c;

    public z(Data proCashbackRateData, Data upgradeAvailableData, Data transactionsData) {
        Intrinsics.checkNotNullParameter(proCashbackRateData, "proCashbackRateData");
        Intrinsics.checkNotNullParameter(upgradeAvailableData, "upgradeAvailableData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224326a = proCashbackRateData;
        this.f224327b = upgradeAvailableData;
        this.f224328c = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f224326a, zVar.f224326a) && Intrinsics.f(this.f224327b, zVar.f224327b) && Intrinsics.f(this.f224328c, zVar.f224328c);
    }

    public final int hashCode() {
        return this.f224328c.hashCode() + kii.e.c(this.f224327b, this.f224326a.hashCode() * 31, 31);
    }
}
