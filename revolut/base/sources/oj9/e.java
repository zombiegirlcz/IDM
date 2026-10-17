package oj9;

import ai9.h;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.g;
import ft3.q0;
import ft3.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oh4.i;
import ui9.z;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends n implements di9.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z f225750l;

    public e(z payLaterCrossSellInteractor) {
        Intrinsics.checkNotNullParameter(payLaterCrossSellInteractor, "payLaterCrossSellInteractor");
        this.f225750l = payLaterCrossSellInteractor;
    }

    @Override // di9.a
    public final Flow Y0(h slot) {
        Intrinsics.checkNotNullParameter(slot, "slot");
        return this.f225750l.b(slot);
    }

    @Override // di9.a
    public final void f1(ai9.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        V2(new i(this, payload, (Continuation) null, 5), new yi5.b(29));
    }

    @Override // di9.a
    public final void p(ai9.b payload) {
        q0 gVar;
        Intrinsics.checkNotNullParameter(payload, "payload");
        int i = d.f225749a[payload.f5214a.ordinal()];
        if (i == 1) {
            gVar = new g(null, null, 3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = w.INSTANCE;
        }
        A2(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(payload.f5216c, gVar, null, null, null, null, 16378))));
    }
}
