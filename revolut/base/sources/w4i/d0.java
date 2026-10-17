package w4i;

import com.revolut.data.model.Data;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l5i.i;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends oki.h implements b0 {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f294571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f294572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f294573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f294574s;

    public d0(TransactionBreakdownScreenContract$InputData inputData, c delegate, d payloadMapper, ang.f userInteractor, bof.r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(payloadMapper, "payloadMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = delegate;
        this.f294571p = payloadMapper;
        this.f294572q = userInteractor;
        Breakdown.Transaction transaction = inputData.f97175a;
        this.f294573r = new vii.b();
        OrderQuote orderQuote = transaction.f97050a;
        this.f294574s = mra.d.b(this, new m(new Data(orderQuote != null ? new l(orderQuote, null, f0.f322471a, null) : null, null, transaction.f97050a == null, 2, null)), stateMapper, null, false, 12);
    }

    public final void I2(Object obj2) {
        aii.r nVar;
        String str;
        this.f294571p.getClass();
        if (obj2 instanceof l5i.k) {
            l5i.k kVar = (l5i.k) obj2;
            nVar = new s(kVar.f192285a, kVar.f192286b);
        } else if (obj2 instanceof l5i.o) {
            nVar = new y(((l5i.o) obj2).f192294a);
        } else if (obj2 instanceof l5i.m) {
            l5i.m mVar = (l5i.m) obj2;
            nVar = new v(mVar.f192289a, mVar.f192290b);
        } else if (obj2 instanceof l5i.n) {
            l5i.n nVar2 = (l5i.n) obj2;
            nVar = new w(nVar2.f192291a, nVar2.f192292b, nVar2.f192293c, nVar2.d);
        } else if (obj2 instanceof l5i.l) {
            l5i.l lVar = (l5i.l) obj2;
            nVar = new u(lVar.f192287a, lVar.f192288b);
        } else if (obj2 instanceof l5i.j) {
            l5i.j jVar = (l5i.j) obj2;
            nVar = new r(jVar.f192284b, jVar.f192283a);
        } else if (obj2 instanceof i.a) {
            nVar = o.f294582a;
        } else if (obj2 instanceof i.b) {
            nVar = q.f294584a;
        } else {
            n nVar3 = null;
            if (obj2 instanceof g5i.b) {
                ChargeEntry chargeEntry = ((g5i.b) obj2).f140792a;
                ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
                if (chargeEntryDetails != null && (str = chargeEntryDetails.f104730b) != null) {
                    String str2 = str.length() > 0 ? str : null;
                    if (str2 != null) {
                        nVar = new p(str2);
                    }
                }
                nVar3 = new n(chargeEntry);
            } else {
                nVar = obj2 instanceof r5i.b ? new n(((r5i.b) obj2).f251595a) : nVar3;
            }
        }
        if (nVar == null) {
            hx7.e.h(new IllegalArgumentException(a0.d.m(obj2, "Unknown parcel ")));
        } else {
            C2(nVar);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f294573r, new w2a.q(continuation, this, 3)), null, new vrl.d(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f294574s;
    }
}
