package fvl;

import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import fv6.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f138498b;

    public /* synthetic */ i(k kVar, int i) {
        this.f138497a = i;
        this.f138498b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        CombinedBuyingPowerConverted combinedBuyingPowerConverted;
        switch (this.f138497a) {
            case 0:
                List sections = (List) obj2;
                Intrinsics.checkNotNullParameter(sections, "sections");
                return r0.v(y.z(y.t(d0.Q(sections), new n(19)), new i(this.f138498b, 1)));
            default:
                xdf.h group = (xdf.h) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                List list = group.f304436c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
                        arrayList.add(obj3);
                    }
                }
                SourcePocket.InvestAccountCombinedBuyingPower investAccountCombinedBuyingPower = (SourcePocket.InvestAccountCombinedBuyingPower) d0.d0(arrayList);
                CombinedBuyingPowerConverted.MarginBorrowingLimit marginBorrowingLimit = (investAccountCombinedBuyingPower == null || (combinedBuyingPowerConverted = investAccountCombinedBuyingPower.f91782c) == null) ? null : combinedBuyingPowerConverted.f95658a;
                boolean z = marginBorrowingLimit instanceof CombinedBuyingPowerConverted.MarginBorrowingLimit.InstrumentMarginBorrowingLimit;
                k kVar = this.f138498b;
                if (z) {
                    udh.a aVar = ((CombinedBuyingPowerConverted.MarginBorrowingLimit.InstrumentMarginBorrowingLimit) marginBorrowingLimit).f95666b;
                    kVar.getClass();
                    return k.a(group, aVar);
                }
                if (marginBorrowingLimit instanceof CombinedBuyingPowerConverted.MarginBorrowingLimit.AccountMarginBorrowingLimit) {
                    hx7.e.n(new IllegalStateException("Account borrowing limit in order flow."));
                    kVar.getClass();
                    return k.a(group, null);
                }
                if (marginBorrowingLimit == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
