package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SolicitorSelectionFlowContract$Step.CustomSolicitorAddress f68393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f68394x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, SolicitorSelectionFlowContract$Step.CustomSolicitorAddress customSolicitorAddress, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f68393w = customSolicitorAddress;
        this.f68394x = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f68393w, this.f68394x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
        AddressFlowContract$OutputData addressFlowContract$OutputData = this.f68394x;
        h hVar = this.v;
        b bVar = new b(hVar, this.f68393w, addressFlowContract$OutputData, null);
        this.u = 1;
        Object objB = pu7.a.B(hVar.k, "selectCustom", bVar, this);
        return objB == aVar ? aVar : objB;
    }
}
