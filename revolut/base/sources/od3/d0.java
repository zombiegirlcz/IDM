package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f224268c;

    public d0(Data staysCashbackRateData, Data upgradeAvailableData, Data transactionsData) {
        Intrinsics.checkNotNullParameter(staysCashbackRateData, "staysCashbackRateData");
        Intrinsics.checkNotNullParameter(upgradeAvailableData, "upgradeAvailableData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224266a = staysCashbackRateData;
        this.f224267b = upgradeAvailableData;
        this.f224268c = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f224266a, d0Var.f224266a) && Intrinsics.f(this.f224267b, d0Var.f224267b) && Intrinsics.f(this.f224268c, d0Var.f224268c);
    }

    public final int hashCode() {
        return this.f224268c.hashCode() + kii.e.c(this.f224267b, this.f224266a.hashCode() * 31, 31);
    }
}
