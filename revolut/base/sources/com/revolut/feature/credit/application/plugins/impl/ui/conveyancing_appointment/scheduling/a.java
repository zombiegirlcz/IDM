package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling;

import c64.d;
import gim.i;
import iuf.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import nii.h;
import nii.k1;
import o74.l;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ConveyancingAppointmentSchedulingFlowContract$Step f67317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f67318x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ConveyancingAppointmentSchedulingFlowContract$Step conveyancingAppointmentSchedulingFlowContract$Step, l lVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f67317w = conveyancingAppointmentSchedulingFlowContract$Step;
        this.f67318x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f67317w, this.f67318x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            y yVar = new y(this.f67317w, 7);
            d dVar = new d(cVar, this.f67318x, continuation, 12);
            this.u = 1;
            obj2 = k.V(cVar, null, null, yVar, dVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((h) obj2).a() instanceof k1) {
            cVar.K2(null);
        }
        return Unit.f186387a;
    }
}
