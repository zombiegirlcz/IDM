package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import ft3.h1;
import gim.i;
import ix6.l0;
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
    public final /* synthetic */ SolicitorSelectionFlowContract$Step.CustomSolicitorAddress f68389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f68390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, SolicitorSelectionFlowContract$Step.CustomSolicitorAddress customSolicitorAddress, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f68389w = customSolicitorAddress;
        this.f68390x = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f68389w, this.f68390x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
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
        h hVar = this.v;
        fy3.a aVar2 = hVar.f68402q;
        h1 h1VarA9 = hVar.f68401p.a9();
        SolicitorSelectionFlowContract$Step.CustomSolicitorAddress customSolicitorAddress = this.f68389w;
        ez3.o oVar = new ez3.o(customSolicitorAddress.f68382c, customSolicitorAddress.d, customSolicitorAddress.e, customSolicitorAddress.f, this.f68390x.f60940a);
        this.u = 1;
        j44.a aVar3 = aVar2.f138888a;
        aVar3.getClass();
        l0 l0Var = new l0(aVar3, oVar, h1VarA9, (Continuation) null, 6);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, l0Var, this);
        return objJ == aVar ? aVar : objJ;
    }
}
