package rk7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import raf.o;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f254764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CFACClaimDetailsScreenContract$InputData f254765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final si7.a f254766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f254767s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, whf.b transactionsContentProvider, CFACClaimDetailsScreenContract$InputData inputData, si7.a insuranceInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.f254764p = transactionsContentProvider;
        this.f254765q = inputData;
        this.f254766r = insuranceInteractor;
        this.f254767s = new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), dl7.a.TRIP_CANCELLATION);
    }

    @Override // yji.l
    public final void I1() {
        CFACClaimDetailsScreenContract$InputData cFACClaimDetailsScreenContract$InputData = this.f254765q;
        String str = cFACClaimDetailsScreenContract$InputData.f75130a;
        si7.a aVar = this.f254766r;
        yji.l.a1(this, rd0.e.b(si7.a.b(aVar, str)), null, null, new k(this, null, 0), 3);
        yji.l.a1(this, rd0.e.b(pd.b.r(si7.a.b(aVar, cFACClaimDetailsScreenContract$InputData.f75130a), new o(this, 27))), null, null, new k(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f254767s;
    }
}
