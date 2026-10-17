package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f71260w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, xi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f71260w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f71260w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        vrc.e eVar = vrc.e.f291574a;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            zrc.d dVar = jVar.f71283x;
            this.u = 1;
            dVar.getClass();
            obj2 = cp5.d.A(this.f71260w) ? dVar.c(this) : eVar;
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        vrc.g gVar = (vrc.g) obj2;
        if (Intrinsics.f(gVar, eVar)) {
            jVar.M2();
        } else {
            if (!(gVar instanceof vrc.f)) {
                throw new NoWhenBranchMatchedException();
            }
            oki.h.v2(jVar.G, new CryptoSendAmountInputScreenContract$ModalStep.ScaValidation(((vrc.f) gVar).f291575a), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
