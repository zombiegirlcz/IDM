package com.revolut.feature.credit.card.impl.ui.direct_debit;

import al6.c;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import gim.i;
import ir4.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ku1.v;
import n14.k;
import nii.c0;
import nii.d;
import oki.h;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f69270w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f69270w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f69270w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        String str = this.f69270w;
        if (i == 0) {
            o.b(obj2);
            v vVar = new v(0);
            c cVar = new c(22);
            c0 c0Var = new c0(new TextLocalisedClause(R$string.credit_common_loading_title, null, null, 14), null, null, false, null, false, false, null, 1918);
            e eVar = new e(bVar, str, null);
            this.u = 1;
            objP = k.P(bVar.X(), c0Var, cVar, vVar, eVar, this);
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objP = obj2;
        }
        nii.e eVar2 = (nii.e) objP;
        if (eVar2 instanceof d) {
            bVar.H2(bVar.f69273r, new ik3.a(str, 6));
            h.t2(bVar, bVar.f69274s, new CreditCardDirectDebitV3FlowContract$Step.Confirm(str, (String) ((d) eVar2).f216133a), true, null, false, 12);
        } else {
            if (!(eVar2 instanceof nii.c)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable th10 = ((nii.c) eVar2).f216123a;
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        }
        return Unit.f186387a;
    }
}
