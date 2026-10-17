package com.revolut.feature.profile.impl.ui.details.address.flow;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.profile.impl.ui.details.address.flow.ProfileAddressFlowContract$Step;
import do3.q;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ AddressFlowContract$OutputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProfileAddressFlowContract$Step.AddressStep f81370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f81371x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AddressFlowContract$OutputData addressFlowContract$OutputData, ProfileAddressFlowContract$Step.AddressStep addressStep, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = addressFlowContract$OutputData;
        this.f81370w = addressStep;
        this.f81371x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f81370w, this.f81371x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            AddressFlowContract$OutputData addressFlowContract$OutputData = this.v;
            boolean zF = Intrinsics.f(addressFlowContract$OutputData.f60940a, this.f81370w.f81368a);
            c cVar = this.f81371x;
            if (zF) {
                h.D2(cVar.v);
            } else {
                qma.c cVar2 = new qma.c(addressFlowContract$OutputData, cVar, null);
                this.u = 1;
                if (q.t(cVar, cVar2, this) == aVar) {
                    return aVar;
                }
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
