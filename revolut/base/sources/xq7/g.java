package xq7;

import aii.r;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;
import xq7.d;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TelematicsDeviceUnpluggedScreenContract$InputData f308124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f308125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f308126r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, TelematicsDeviceUnpluggedScreenContract$InputData inputData, v policyRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.f308124p = inputData;
        this.f308125q = policyRepository;
        this.f308126r = new c(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        String policyId = this.f308124p.f75681a;
        e0 e0Var = (e0) this.f308125q;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, e0Var.f196619q.b(policyId, loadingStrategy), null, null, new xjl.g(this, (Continuation) null, 16), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f308126r;
    }

    public final void y2(String listId) {
        r rVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SHOW_POLICY_DOCUMENTATION_ID")) {
            rVar = d.b.f308120a;
        } else if (!Intrinsics.f(listId, "HOW_TO_ACTIVATE_DEVICE_LIST_ID")) {
            return;
        } else {
            rVar = d.a.f308119a;
        }
        v2(rVar);
    }
}
