package com.revolut.feature.onboarding.impl.qes_terms;

import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$Mode;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ QesTermsFlowContract$Step.Passcode v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f78554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(QesTermsFlowContract$Step.Passcode passcode, h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = passcode;
        this.f78554w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f78554w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = (String) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        WaitingForQesResultScreenContract$Mode.InitProcessAndPollResult initProcessAndPollResult = new WaitingForQesResultScreenContract$Mode.InitProcessAndPollResult(str);
        this.f78554w.U2(this.v.f78542a, initProcessAndPollResult);
        return Unit.f186387a;
    }
}
