package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection;

import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails f68399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails partnerSolicitorDetails, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f68399w = partnerSolicitorDetails;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f68399w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails partnerSolicitorDetails = this.f68399w;
        h hVar = this.v;
        e eVar = new e(hVar, partnerSolicitorDetails, null);
        this.u = 1;
        Object objB = pu7.a.B(hVar.k, "selectPartner", eVar, this);
        return objB == aVar ? aVar : objB;
    }
}
