package qsi;

import com.revolut.data.model.Data;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f248857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f248858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f248859c;
    public final Data d;
    public final Data e;
    public final q f;

    public d(Data transactionsData, Data moneyRequestsData, Data checkoutOrdersData, Data juniorTransferRequestsData, Data juniorMigrationAssetData, q extraData) {
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(moneyRequestsData, "moneyRequestsData");
        Intrinsics.checkNotNullParameter(checkoutOrdersData, "checkoutOrdersData");
        Intrinsics.checkNotNullParameter(juniorTransferRequestsData, "juniorTransferRequestsData");
        Intrinsics.checkNotNullParameter(juniorMigrationAssetData, "juniorMigrationAssetData");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f248857a = transactionsData;
        this.f248858b = moneyRequestsData;
        this.f248859c = checkoutOrdersData;
        this.d = juniorTransferRequestsData;
        this.e = juniorMigrationAssetData;
        this.f = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f248857a, dVar.f248857a) && Intrinsics.f(this.f248858b, dVar.f248858b) && Intrinsics.f(this.f248859c, dVar.f248859c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f248859c, kii.e.c(this.f248858b, this.f248857a.hashCode() * 31, 31), 31), 31), 31);
    }
}
