package com.revolut.feature.devicemanagement.impl.ui.flow;

import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        yki.a aVar = bVar.f71943t;
        n1 n1Var = (n1) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            h.t2(bVar, bVar.f71943t, DeviceManagementFlowContract$Step.PasscodeChange.f71938a, !(aVar.d() instanceof DeviceManagementFlowContract$Step.DeviceDetails), null, false, 12);
        } else if (aVar.d() instanceof DeviceManagementFlowContract$Step.DeviceDetails) {
            bVar.B2();
        }
        return Unit.f186387a;
    }
}
