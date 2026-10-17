package com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.JapanEasyBankAuthorizationFlowContract$Step;
import dve.d;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g0;
import nii.y0;
import oki.h;
import wte.c;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        b bVar = this.v;
        JapanEasyBankAuthorizationFlowContract$InputData japanEasyBankAuthorizationFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            wve.a aVar2 = bVar.f72950p;
            String str = japanEasyBankAuthorizationFlowContract$InputData.f72945a;
            String str2 = japanEasyBankAuthorizationFlowContract$InputData.f72946b;
            this.u = 1;
            objA = ((d) aVar2.f300315a).a(str, str2, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objA = obj2;
        }
        c cVar = (c) objA;
        if (cVar instanceof wte.b) {
            wte.b bVar2 = (wte.b) cVar;
            h.u2(bVar, bVar.f72951q, new JapanEasyBankAuthorizationFlowContract$Step.AuthorizationWebView(bVar2.f299932a, bVar2.f299933b), null, 6);
            return Unit.f186387a;
        }
        if (cVar instanceof wte.a) {
            return l.b1(bVar, bVar.X1(new y0(null, new g0(new TextLocalisedClause(R$string.external_institutions_out_of_process_linking_title, u.c(bVar.o.f72947c), null, 12), new TextLocalisedClause(R$string.external_institutions_out_of_process_linking_description, u.c(japanEasyBankAuthorizationFlowContract$InputData.f72947c), null, 12), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, new uf0.d(bVar, (wte.a) cVar, null, 15), 3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
