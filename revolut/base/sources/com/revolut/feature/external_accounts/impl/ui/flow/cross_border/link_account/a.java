package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account;

import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CrossBorderLinkAccountFlowContract$Step f72887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, CrossBorderLinkAccountFlowContract$Step crossBorderLinkAccountFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f72887w = crossBorderLinkAccountFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f72887w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution = ((CrossBorderLinkAccountFlowContract$Step.ConsentForPreselectedInstitution) this.f72887w).f72873a;
            this.u = 1;
            if (d.I2(this.v, preselectedInstitution, this) == aVar) {
                return aVar;
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
