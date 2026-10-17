package g32;

import ag1.k;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import et6.u1;
import hrf.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l12.c;
import l12.d;
import l12.g;
import yji.n;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f140185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f140186m;

    public b(g transferErrorStateMapper, c transferAmountBalanceValidator) {
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(transferAmountBalanceValidator, "transferAmountBalanceValidator");
        this.f140185l = transferErrorStateMapper;
        this.f140186m = transferAmountBalanceValidator;
    }

    public final u1 Z2(z22.a transferData, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        d dVar = new d(transferData.f318942a.getF92243g().f115082a, transferData.f318943b, transferData.f318944c, transferData.f318942a.f92241b, apmQuote, f.OUTGOING);
        this.f140186m.getClass();
        return new u1(new k((Flow[]) d0.d1(u.c(new go.g(c.a(dVar).f316033b, 2))).toArray(new Flow[0]), 21), this, 20);
    }
}
