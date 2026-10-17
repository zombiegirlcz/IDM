package com.revolut.feature.store.impl.ui.brand_detail.flow;

import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$ModalStep;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import jwb.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f88661w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ StoreBrandDetailFlowContract$ModalStep f88662x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, StoreBrandDetailFlowContract$ModalStep storeBrandDetailFlowContract$ModalStep, Continuation continuation) {
        super(2, continuation);
        this.f88661w = cVar;
        this.f88662x = storeBrandDetailFlowContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f88661w, this.f88662x, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.f88661w;
        try {
            if (i == 0) {
                o.b(obj2);
                StoreBrandDetailFlowContract$ModalStep storeBrandDetailFlowContract$ModalStep = this.f88662x;
                m.Companion companion = m.INSTANCE;
                e eVar = cVar.f88666s;
                String str = ((StoreBrandDetailFlowContract$ModalStep.Checkout) storeBrandDetailFlowContract$ModalStep).f88654a;
                this.v = null;
                this.u = 1;
                if (eVar.g(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = Unit.f186387a;
            m.Companion companion2 = m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
        }
        cVar.H2(cVar.T, new q2a.a(8));
        cVar.D.a();
        return Unit.f186387a;
    }
}
