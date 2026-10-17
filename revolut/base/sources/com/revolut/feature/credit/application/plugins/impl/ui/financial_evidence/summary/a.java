package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary;

import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$ModalStep;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SummaryScreenContract$ModalStep.RemoveDocumentConfirmation f67742w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, SummaryScreenContract$ModalStep.RemoveDocumentConfirmation removeDocumentConfirmation, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f67742w = removeDocumentConfirmation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f67742w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            sb4.c cVar = this.v.f67748p;
            ry3.a aVar = this.f67742w.f67736a;
            this.u = 1;
            hx3.a aVar2 = cVar.f261499a;
            h1 h1VarC = cVar.c();
            j34.g gVar = ((hx3.g) aVar2).f156379a;
            gVar.getClass();
            j34.a aVar3 = new j34.a(gVar, h1VarC, aVar, null, 1);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, aVar3, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
