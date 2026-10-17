package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment;

import com.revolut.kompot.common.ModalDestination;
import ds6.m;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
        m mVar = (m) pair.f186386b;
        if (zBooleanValue) {
            f fVar = this.v;
            h.v2(fVar.f74248w, f.I2(fVar, mVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
