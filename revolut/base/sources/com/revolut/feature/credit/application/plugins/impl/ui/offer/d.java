package com.revolut.feature.credit.application.plugins.impl.ui.offer;

import ack.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import ff4.p;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import nii.c0;
import nii.g;
import nii.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f68082w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, p pVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f68082w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f68082w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objT;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        p pVar = this.f68082w;
        if (i == 0) {
            o.b(obj2);
            c0 c0Var = new c0(new TextLocalisedClause(R$string.credit_application_offer_document_loading_progress_title, null, null, 14), null, null, false, null, false, false, null, 2046);
            al6.c cVar = new al6.c(1);
            n nVar = new n(3);
            c64.d dVar = new c64.d(eVar, pVar, null, 6);
            this.u = 1;
            objT = k.T(this.v, c0Var, cVar, nVar, dVar, this);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objT = obj2;
        }
        h hVar = (h) objT;
        if (hVar instanceof g) {
            oki.h.t2(eVar, eVar.f68088w, new OfferFlowContract$Step.DocumentViewer(pVar.f134736a, pVar.f134737b, pVar.f134738c, (String) ((g) hVar).f216152a), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
