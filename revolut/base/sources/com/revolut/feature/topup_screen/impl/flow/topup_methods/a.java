package com.revolut.feature.topup_screen.impl.flow.topup_methods;

import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step;
import e0f.v0;
import e31.j;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pfm.n;
import pfm.r;
import te0.w;
import yhm.o;
import yki.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopupMethodsFlowContract$Step f90653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f90654x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, TopupMethodsFlowContract$Step topupMethodsFlowContract$Step, l lVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f90653w = topupMethodsFlowContract$Step;
        this.f90654x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f90653w, this.f90654x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j jVar = (j) ((v0) dVar.z).f121695c;
            jVar.getClass();
            n nVar = new n(new a31.l(jVar, 14), 1);
            Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
            r rVarG0 = w.g0(nVar);
            this.u = 1;
            if (nim.a.a(rVarG0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        TopupMethodsFlowContract$Step.UaRestrictionDialog uaRestrictionDialog = (TopupMethodsFlowContract$Step.UaRestrictionDialog) this.f90653w;
        dVar.C2(new hwe.i(uaRestrictionDialog.f90651a, uaRestrictionDialog.f90652b));
        h.D2(this.f90654x);
        return Unit.f186387a;
    }
}
