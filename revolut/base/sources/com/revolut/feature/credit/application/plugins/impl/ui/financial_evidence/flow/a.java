package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step;
import ft3.h1;
import gim.i;
import ht3.l0;
import im9.h;
import j34.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qb4.f;
import skm.e0;
import skm.p0;
import xu3.o0;
import yhm.o;
import yki.l;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public o0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f67722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f67723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f67724y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, e eVar, l lVar, Continuation continuation) {
        super(1, continuation);
        this.f67722w = fVar;
        this.f67723x = eVar;
        this.f67724y = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f67722w, this.f67723x, this.f67724y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        o0 o0Var;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        f fVar = this.f67722w;
        e eVar = this.f67723x;
        if (i == 0) {
            o.b(obj2);
            o0 o0Var2 = ((qb4.e) fVar).f244112a;
            sb4.c cVar = eVar.f67730p;
            this.u = o0Var2;
            this.v = 1;
            hx3.a aVar = cVar.f261499a;
            h1 h1VarC = cVar.c();
            g gVar = ((hx3.g) aVar).f156379a;
            gVar.getClass();
            h hVar = new h(gVar, h1VarC, o0Var2, (Continuation) null, 3);
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
            o0Var = o0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0Var = this.u;
            o.b(obj2);
        }
        int i2 = sb4.f.f261505a[((qb4.e) fVar).f244112a.ordinal()];
        if (i2 == 1) {
            oki.h.t2(eVar, eVar.f67733s, new FinancialEvidenceFlowContract$Step.Summary(eVar.Q2().e, o0Var), false, null, false, 12);
        } else if (i2 == 2) {
            l0 l0Var = eVar.Q2().f308934b;
            if (l0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            oki.h.t2(eVar, this.f67724y, new FinancialEvidenceFlowContract$Step.CoApplicantConfirmation(l0Var), true, null, false, 12);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            oki.h.t2(eVar, eVar.f67733s, new FinancialEvidenceFlowContract$Step.Summary(eVar.Q2().e, o0Var), false, null, false, 12);
        }
        return Unit.f186387a;
    }
}
