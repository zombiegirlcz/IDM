package com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen;

import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f65428w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, f0 f0Var, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f65428w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f65428w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = g.I2(gVar, this.f65428w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ReissuedPhysicalCardDialogContract$InputData reissuedPhysicalCardDialogContract$InputData = (ReissuedPhysicalCardDialogContract$InputData) obj2;
        h.v2(gVar.f65435k0, new CardsCarouselScreenContract$ModalStep.ShowReissuedPhysicalCardDialog(reissuedPhysicalCardDialogContract$InputData.f65387a, reissuedPhysicalCardDialogContract$InputData.f65388b, reissuedPhysicalCardDialogContract$InputData.f65389c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
