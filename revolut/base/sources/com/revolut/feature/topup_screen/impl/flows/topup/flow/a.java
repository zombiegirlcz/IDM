package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import dp4.y0;
import e0f.r1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopupWithNewCardFlowDescriptor$InputData f90896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopupFlowContract$Step f90897x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, TopupWithNewCardFlowDescriptor$InputData topupWithNewCardFlowDescriptor$InputData, TopupFlowContract$Step topupFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f90896w = topupWithNewCardFlowDescriptor$InputData;
        this.f90897x = topupFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f90896w, this.f90897x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        TopupFlowContract$Step topupFlowContract$Step = this.f90897x;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            u51.a aVar2 = iVar.v;
            CardDetails cardDetails = this.f90896w.f90499a;
            String str = ((TopupFlowContract$Step.TopupWithNewCard) topupFlowContract$Step).f90891b.f115083b.f306286a;
            uye.g gVar = iVar.o;
            n nVarK = pw5.a.K(gVar.f284276b, gVar.f284275a);
            this.u = 1;
            if (((r1) aVar2).m(cardDetails, str, nVarK, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        iVar.l2(new y0(iVar, ((TopupFlowContract$Step.TopupWithNewCard) topupFlowContract$Step).f90891b, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
        return Unit.f186387a;
    }
}
