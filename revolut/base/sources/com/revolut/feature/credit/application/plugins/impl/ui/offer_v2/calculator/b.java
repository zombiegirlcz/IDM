package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$ModalStep;
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
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CalculatorScreenContract$ModalStep f68126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Number f68127x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, CalculatorScreenContract$ModalStep calculatorScreenContract$ModalStep, Number number, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f68126w = calculatorScreenContract$ModalStep;
        this.f68127x = number;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f68126w, this.f68127x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            j2 j2Var = this.v.f68131s;
            t tVar = u.Companion;
            String str = ((CalculatorScreenContract$ModalStep.VariantSelection) this.f68126w).f68123a.f120755a;
            tVar.getClass();
            u uVarB = t.b(this.f68127x, str);
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
