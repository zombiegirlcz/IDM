package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f85569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f85569w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, this.f85569w, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            m mVar = this.v;
            oki.h.t2(mVar, mVar.N, new SecurityHubFlowContract$Step.StreetMode(new StreetModeFlowContract$Step.SetTrustedWifiLocation(this.f85569w)), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
