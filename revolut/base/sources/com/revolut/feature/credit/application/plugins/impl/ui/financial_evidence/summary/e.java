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
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SummaryScreenContract$ModalStep.TransactionManagement f67745w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, SummaryScreenContract$ModalStep.TransactionManagement transactionManagement, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f67745w = transactionManagement;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f67745w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            sb4.c cVar = this.v.f67748p;
            String str = this.f67745w.f67741b.f272581b;
            this.u = 1;
            hx3.a aVar = cVar.f261499a;
            h1 h1VarC = cVar.c();
            j34.g gVar = ((hx3.g) aVar).f156379a;
            gVar.getClass();
            im9.h hVar = new im9.h(gVar, h1VarC, str, (Continuation) null, 2);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, hVar, this);
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
