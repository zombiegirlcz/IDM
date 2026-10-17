package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224270b;

    public e0(Data staysCashbackRateData, Data transactionsData) {
        Intrinsics.checkNotNullParameter(staysCashbackRateData, "staysCashbackRateData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224269a = staysCashbackRateData;
        this.f224270b = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f224269a, e0Var.f224269a) && Intrinsics.f(this.f224270b, e0Var.f224270b);
    }

    public final int hashCode() {
        return this.f224270b.hashCode() + (this.f224269a.hashCode() * 31);
    }
}
