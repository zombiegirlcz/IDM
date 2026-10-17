package ef5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f125270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f125271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we5.a f125272c;
    public final Data d;
    public final Data e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f125273g;

    public b() {
        this(0);
    }

    public static b a(b bVar, Data data, Data data2, we5.a aVar, Data data3, Data data4, Clause clause, Clause clause2, int i) {
        if ((i & 1) != 0) {
            data = bVar.f125270a;
        }
        Data assetsListData = data;
        if ((i & 2) != 0) {
            data2 = bVar.f125271b;
        }
        Data cryptoCommodityPositionsData = data2;
        if ((i & 4) != 0) {
            aVar = bVar.f125272c;
        }
        we5.a aVar2 = aVar;
        if ((i & 8) != 0) {
            data3 = bVar.d;
        }
        Data allStakingProducts = data3;
        if ((i & 16) != 0) {
            data4 = bVar.e;
        }
        Data data5 = data4;
        if ((i & 32) != 0) {
            clause = bVar.f;
        }
        Clause clause3 = clause;
        if ((i & 64) != 0) {
            clause2 = bVar.f125273g;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(assetsListData, "assetsListData");
        Intrinsics.checkNotNullParameter(cryptoCommodityPositionsData, "cryptoCommodityPositionsData");
        Intrinsics.checkNotNullParameter(allStakingProducts, "allStakingProducts");
        return new b(assetsListData, cryptoCommodityPositionsData, aVar2, allStakingProducts, data5, clause3, clause2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f125270a, bVar.f125270a) && Intrinsics.f(this.f125271b, bVar.f125271b) && Intrinsics.f(this.f125272c, bVar.f125272c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f125273g, bVar.f125273g);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f125271b, this.f125270a.hashCode() * 31, 31);
        we5.a aVar = this.f125272c;
        int iC2 = kii.e.c(this.d, (iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        Data data = this.e;
        int iHashCode = (iC2 + (data == null ? 0 : data.hashCode())) * 31;
        Clause clause = this.f;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f125273g;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    public b(Data assetsListData, Data cryptoCommodityPositionsData, we5.a aVar, Data allStakingProducts, Data data, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(assetsListData, "assetsListData");
        Intrinsics.checkNotNullParameter(cryptoCommodityPositionsData, "cryptoCommodityPositionsData");
        Intrinsics.checkNotNullParameter(allStakingProducts, "allStakingProducts");
        this.f125270a = assetsListData;
        this.f125271b = cryptoCommodityPositionsData;
        this.f125272c = aVar;
        this.d = allStakingProducts;
        this.e = data;
        this.f = clause;
        this.f125273g = clause2;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, new Data(null, null, false, 7, null), null, null, null);
    }
}
