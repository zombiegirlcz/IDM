package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$ModalStep;
import cv3.t;
import cv3.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OfferContentScreenContract$ModalStep f68138w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Number f68139x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, OfferContentScreenContract$ModalStep offerContentScreenContract$ModalStep, Number number, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f68138w = offerContentScreenContract$ModalStep;
        this.f68139x = number;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f68138w, this.f68139x, continuation);
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
            j2 j2Var = this.v.f68142r;
            t tVar = u.Companion;
            String str = ((OfferContentScreenContract$ModalStep.VariantSelection) this.f68138w).f68137a.f120755a;
            tVar.getClass();
            u uVarB = t.b(this.f68139x, str);
            this.u = 1;
            j2Var.getClass();
            j2Var.g(null, uVarB);
            if (Unit.f186387a == aVar) {
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
