package pd3;

import com.revolut.data.model.Data;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od3.a0;
import od3.b0;
import od3.c0;
import od3.f0;
import od3.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd3.d f235054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.b f235055c;

    public c(nd3.d cashbackTransactionsFilterProvider, whf.b transactionsContentProvider, int i) {
        this.f235053a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
                Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
                this.f235054b = cashbackTransactionsFilterProvider;
                this.f235055c = transactionsContentProvider;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
                Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
                this.f235054b = cashbackTransactionsFilterProvider;
                this.f235055c = transactionsContentProvider;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
                Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
                this.f235054b = cashbackTransactionsFilterProvider;
                this.f235055c = transactionsContentProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
                Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
                this.f235054b = cashbackTransactionsFilterProvider;
                this.f235055c = transactionsContentProvider;
                break;
        }
    }

    @Override // pd3.a
    public final f0 a() {
        switch (this.f235053a) {
            case 0:
                return new w(new Data(null, null, true, 3, null));
            case 1:
                return new a0(new Data(null, null, true, 3, null));
            case 2:
                return new b0(new Data(null, null, true, 3, null));
            default:
                return new c0(new Data(null, null, true, 3, null));
        }
    }

    @Override // pd3.a
    public final Flow b() {
        switch (this.f235053a) {
            case 0:
                r map = whf.b.a(this.f235055c, this.f235054b.b(uc3.d.GIFTS), null, null, null, 14).map(new p8k.b(20, new pb2.a(10)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return rd0.e.b(map);
            case 1:
                r map2 = whf.b.a(this.f235055c, this.f235054b.b(uc3.d.REWARDS), null, null, null, 14).map(new p8k.b(24, new pb2.a(22)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return rd0.e.b(map2);
            case 2:
                r map3 = whf.b.a(this.f235055c, this.f235054b.b(uc3.d.SHOPPING), null, null, null, 14).map(new p8k.b(25, new pb2.a(23)));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                return rd0.e.b(map3);
            default:
                r map4 = whf.b.a(this.f235055c, this.f235054b.b(uc3.d.SHOPS), null, null, null, 14).map(new p8k.b(26, new pb2.a(24)));
                Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
                return rd0.e.b(map4);
        }
    }
}
