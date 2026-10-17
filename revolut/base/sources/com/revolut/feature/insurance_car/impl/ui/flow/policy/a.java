package com.revolut.feature.insurance_car.impl.ui.flow.policy;

import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ll7.h;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f75488w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f75488w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f75488w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            dVar.X1(vl7.a.c(null, null));
            h hVar = (h) dVar.u;
            hVar.getClass();
            String applicationFormId = this.f75488w;
            Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            jhi.b bVarG = mo3.a.g(zi0.c.w(hVar.i.b(applicationFormId, loadingStrategy)), null, null, 3);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        dVar.s1();
        dVar.O2(new CarPolicyFlowContract$Step.RenewPolicy((ApplicationForm) obj2));
        return Unit.f186387a;
    }
}
