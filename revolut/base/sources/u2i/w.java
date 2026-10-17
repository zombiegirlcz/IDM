package u2i;

import com.revolut.data.model.Data;
import ip0.s7;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import tx0.p4;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f276697b;

    public /* synthetic */ w(y yVar, int i) {
        this.f276696a = i;
        this.f276697b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarX2;
        b2i.b orderSummary = (b2i.b) obj2;
        switch (this.f276696a) {
            case 0:
                Intrinsics.checkNotNullParameter(orderSummary, "orderSummary");
                wd6.h hVar = orderSummary.f11942a;
                if (hVar == wd6.h.STOP || hVar == wd6.h.LIMIT) {
                    rVarX2 = this.f276697b.f276701a.x2(orderSummary.f11943b);
                } else {
                    rVarX2 = efm.r.just(new Data(null, null, false, 7, null));
                    Intrinsics.h(rVarX2);
                }
                return rVarX2.map(new u21.a(23, new p4(orderSummary, 21)));
            default:
                Intrinsics.checkNotNullParameter(orderSummary, "it");
                t tVar = this.f276697b.f276702b;
                wd6.h orderType = orderSummary.f11942a;
                ((b0) tVar).getClass();
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                IntRange intRange = new IntRange(1, orderType == wd6.h.MARKET ? 5 : 4, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(new s7(a0.d.n("LOADING_CRYPTO_DETAILS_", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
        }
    }
}
