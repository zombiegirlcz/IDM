package fi6;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f135298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f135299c;
    public final List d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f135300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f135301h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f135302j;
    public final Data k;

    public d(Data currentPocketsData, Data merchantPocketsData, Data jointPocketsData, List creditCards, Data data, Data data2, Data data3, Data subaccountsData, Data cashbackData, Data juniorPocketsData, Data data4) {
        Intrinsics.checkNotNullParameter(currentPocketsData, "currentPocketsData");
        Intrinsics.checkNotNullParameter(merchantPocketsData, "merchantPocketsData");
        Intrinsics.checkNotNullParameter(jointPocketsData, "jointPocketsData");
        Intrinsics.checkNotNullParameter(creditCards, "creditCards");
        Intrinsics.checkNotNullParameter(subaccountsData, "subaccountsData");
        Intrinsics.checkNotNullParameter(cashbackData, "cashbackData");
        Intrinsics.checkNotNullParameter(juniorPocketsData, "juniorPocketsData");
        this.f135297a = currentPocketsData;
        this.f135298b = merchantPocketsData;
        this.f135299c = jointPocketsData;
        this.d = creditCards;
        this.e = data;
        this.f = data2;
        this.f135300g = data3;
        this.f135301h = subaccountsData;
        this.i = cashbackData;
        this.f135302j = juniorPocketsData;
        this.k = data4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f135297a, dVar.f135297a) && Intrinsics.f(this.f135298b, dVar.f135298b) && Intrinsics.f(this.f135299c, dVar.f135299c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f135300g, dVar.f135300g) && Intrinsics.f(this.f135301h, dVar.f135301h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f135302j, dVar.f135302j) && Intrinsics.f(this.k, dVar.k);
    }

    public final int hashCode() {
        int iD = p.a.d(kii.e.c(this.f135299c, kii.e.c(this.f135298b, this.f135297a.hashCode() * 31, 31), 31), 31, this.d);
        Data data = this.e;
        int iHashCode = (iD + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f135300g;
        int iC = kii.e.c(this.f135302j, kii.e.c(this.i, kii.e.c(this.f135301h, (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31, 31), 31), 31);
        Data data4 = this.k;
        return iC + (data4 != null ? data4.hashCode() : 0);
    }
}
