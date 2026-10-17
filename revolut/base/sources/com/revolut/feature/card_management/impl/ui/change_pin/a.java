package com.revolut.feature.card_management.impl.ui.change_pin;

import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$Step;
import gim.i;
import ha1.s;
import ha3.q;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f64844w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f64844w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f64844w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = bVar.f64846t;
            String cardId = ((ChangePinFlowContract$State) bVar.A2().f98429a).f64838a;
            x xVar = (x) fVar;
            xVar.getClass();
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            String newPin = this.f64844w;
            Intrinsics.checkNotNullParameter(newPin, "newPin");
            pfm.a aVar2 = new pfm.a(((am0.b) xVar.f150434c).a(newPin), new s(19, new q(xVar, cardId, 0)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            this.u = 1;
            if (nim.a.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.r2();
        bVar.E2(new ChangePinFlowContract$Step.Activation(((ChangePinFlowContract$State) bVar.A2().f98429a).f64838a), false, null, false);
        return Unit.f186387a;
    }
}
