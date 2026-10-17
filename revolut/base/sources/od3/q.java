package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224291b;

    public q(Data cashbackData, Data transactionsData) {
        Intrinsics.checkNotNullParameter(cashbackData, "cashbackData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224290a = cashbackData;
        this.f224291b = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f224290a, qVar.f224290a) && Intrinsics.f(this.f224291b, qVar.f224291b);
    }

    public final int hashCode() {
        return this.f224291b.hashCode() + (this.f224290a.hashCode() * 31);
    }
}
