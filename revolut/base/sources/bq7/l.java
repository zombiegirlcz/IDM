package bq7;

import bq5.o0;
import bq7.g;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CancellationRefundScreenContract$InputData f17786p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f17787q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f17788r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, CancellationRefundScreenContract$InputData inputData, v policyRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.f17786p = inputData;
        this.f17787q = policyRepository;
        this.f17788r = new f(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        x2(new o0(5));
        l2(new aza.g(this, null, 25), new j(this, 0));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f17788r;
    }

    public final void y2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "POLICY_WORDING")) {
            v2(g.b.f17780a);
        } else if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            x2(new o0(5));
            l2(new aza.g(this, null, 25), new j(this, 0));
        }
    }
}
