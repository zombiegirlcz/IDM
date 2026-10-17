package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$Step;
import cv3.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mf4.e0;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f68147w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f68147w = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f68147w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e0 e0Var = new e0(gVar, null, 3);
            this.u = 1;
            obj2 = gVar.p2(this, e0Var);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(gVar, gVar.v, new OfferV2FlowContract$Step.CreditToRefinance((d0) obj2), this.f68147w, null, false, 12);
        return Unit.f186387a;
    }
}
