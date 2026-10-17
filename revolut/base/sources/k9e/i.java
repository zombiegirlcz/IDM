package k9e;

import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xua.a f182326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f182327q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, AcceptConditionsScreenContract$InputData inputData, xua.a recurringPaymentInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.f182326p = recurringPaymentInteractor;
        this.f182327q = new c(inputData.f89167a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f182327q;
    }
}
