package com.revolut.feature.credit.application.plugins.impl.ui.home_insurance;

import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.y0;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            kx3.a aVar2 = eVar.f67782p;
            h1 h1VarA9 = eVar.f67783q.a9();
            this.u = 1;
            m34.c cVar = aVar2.f190377a;
            cVar.getClass();
            m34.a aVar3 = new m34.a(cVar, h1VarA9, continuation, 2);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, aVar3, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        uy3.f fVar = (uy3.f) obj2;
        if (fVar instanceof uy3.c) {
            uy3.c cVar2 = (uy3.c) fVar;
            return l.a1(eVar, eVar.X1(new y0(null, e.P2(eVar, cVar2.f284058a), false, 5)), null, null, new chf.a(eVar, cVar2, continuation, 10), 3);
        }
        if (!(fVar instanceof uy3.e)) {
            throw new NoWhenBranchMatchedException();
        }
        uy3.e eVar2 = (uy3.e) fVar;
        eVar.H2(eVar.f67786t, new d34.b(eVar2, 27));
        String str = eVar2.f284062a;
        uy3.d dVar = eVar2.f284063b;
        if (dVar == null) {
            eVar.T2(str);
        } else {
            h.w2(eVar.u, new HomeInsuranceFlowContract$Step.ContinueWebViewPopup(dVar, str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
