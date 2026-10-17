package ox5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ny5.g f230577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ny5.c f230578b;

    public i(ny5.g rateTilesPresentationModel, ny5.c cryptoCommodityPartiallyPredefinedOrderSorter, ny5.u cryptoSorter) {
        Intrinsics.checkNotNullParameter(rateTilesPresentationModel, "rateTilesPresentationModel");
        Intrinsics.checkNotNullParameter(cryptoCommodityPartiallyPredefinedOrderSorter, "cryptoCommodityPartiallyPredefinedOrderSorter");
        Intrinsics.checkNotNullParameter(cryptoSorter, "cryptoSorter");
        this.f230577a = rateTilesPresentationModel;
        this.f230578b = cryptoCommodityPartiallyPredefinedOrderSorter;
    }

    public final akg.n a(List currenciesData, ny5.v cryptoSorting) {
        List listA;
        Intrinsics.checkNotNullParameter(currenciesData, "currenciesData");
        Intrinsics.checkNotNullParameter(cryptoSorting, "cryptoSorting");
        if (cryptoSorting.f220678b.isEmpty()) {
            ny5.a aVar = ny5.c.Companion;
            listA = this.f230578b.a(currenciesData, zhm.f0.f322471a);
        } else {
            listA = ny5.u.b(cryptoSorting.f220678b, currenciesData);
        }
        ny5.g gVar = this.f230577a;
        return nim.a.v(zh9.u0.m(rd0.e.b(gVar.a(listA)), rd0.e.b(gVar.b(listA, tzg.j.ONE_DAY))), new njf.e(listA, 10));
    }
}
