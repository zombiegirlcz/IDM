package eul;

import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class p implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129649a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cul.v f129650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f129651c;

    public /* synthetic */ p(cul.v vVar, r rVar) {
        this.f129650b = vVar;
        this.f129651c = rVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        od0.i iVarA;
        int i = this.f129649a;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ExtendedHoursStatus extendedHoursStatus = (ExtendedHoursStatus) pair.f186385a;
                OrderExpiry orderExpiry = (OrderExpiry) pair.f186386b;
                r rVar = this.f129651c;
                boolean zO = io3.h.o(rVar.f129653a.f106880a.f214597c);
                cul.v vVar = this.f129650b;
                boolean z = !zO;
                return rVar.f129654b.a(new qvl.d(vVar.f109176b, vVar.f109181l, z, orderExpiry, z, extendedHoursStatus, null, null, 192));
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                FrequencySettings frequencySettings = (FrequencySettings) pair.f186385a;
                AutoTopUpStatus autoTopUpStatus = (AutoTopUpStatus) pair.f186386b;
                if (Intrinsics.f(autoTopUpStatus, AutoTopUpStatus.Unavailable.f91772a)) {
                    iVarA = null;
                } else {
                    if (!(autoTopUpStatus instanceof AutoTopUpStatus.Available)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    od0.h hVar = od0.i.Companion;
                    AutoTopUpSource autoTopUpSource = ((AutoTopUpStatus.Available) autoTopUpStatus).f91771a;
                    hVar.getClass();
                    iVarA = od0.h.a(autoTopUpSource);
                }
                return this.f129651c.f129654b.a(new qvl.d(this.f129650b.f109176b, null, false, null, false, null, frequencySettings, iVarA, 62));
        }
    }

    public /* synthetic */ p(r rVar, cul.v vVar) {
        this.f129651c = rVar;
        this.f129650b = vVar;
    }
}
